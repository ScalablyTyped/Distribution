package typings.transducersJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompletingTransformer[TResult, TCompleteResult, TInput] extends js.Object {
  
  @JSName("@@transducer/init")
  def `@@transducerSlashinit`(): TResult | Unit = js.native
  
  @JSName("@@transducer/result")
  def `@@transducerSlashresult`(result: TResult): TCompleteResult = js.native
  
  @JSName("@@transducer/step")
  def `@@transducerSlashstep`(result: TResult, input: TInput): TResult | Reduced[TResult] = js.native
}
object CompletingTransformer {
  
  @scala.inline
  def apply[TResult, TCompleteResult, TInput](
    `@@transducerSlashinit`: () => TResult | Unit,
    `@@transducerSlashresult`: TResult => TCompleteResult,
    `@@transducerSlashstep`: (TResult, TInput) => TResult | Reduced[TResult]
  ): CompletingTransformer[TResult, TCompleteResult, TInput] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("@@transducer/init")(js.Any.fromFunction0(`@@transducerSlashinit`))
    __obj.updateDynamic("@@transducer/result")(js.Any.fromFunction1(`@@transducerSlashresult`))
    __obj.updateDynamic("@@transducer/step")(js.Any.fromFunction2(`@@transducerSlashstep`))
    __obj.asInstanceOf[CompletingTransformer[TResult, TCompleteResult, TInput]]
  }
  
  @scala.inline
  implicit class CompletingTransformerOps[Self <: CompletingTransformer[_, _, _], TResult, TCompleteResult, TInput] (val x: Self with (CompletingTransformer[TResult, TCompleteResult, TInput])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def `set@@transducerSlashinit`(value: () => TResult | Unit): Self = this.set("@@transducer/init", js.Any.fromFunction0(value))
    
    @scala.inline
    def `set@@transducerSlashresult`(value: TResult => TCompleteResult): Self = this.set("@@transducer/result", js.Any.fromFunction1(value))
    
    @scala.inline
    def `set@@transducerSlashstep`(value: (TResult, TInput) => TResult | Reduced[TResult]): Self = this.set("@@transducer/step", js.Any.fromFunction2(value))
  }
}
