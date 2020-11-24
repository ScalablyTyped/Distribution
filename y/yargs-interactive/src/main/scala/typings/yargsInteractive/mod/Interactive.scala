package typings.yargsInteractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Argv * / any */ @js.native
trait Interactive extends js.Object {
  
  def interactive(options: Option): Interactive = js.native
  
  def `then`(callback: js.Function1[/* result */ js.Any, _]): Interactive = js.native
  
  def usage(usage: String): Interactive = js.native
}
object Interactive {
  
  @scala.inline
  def apply(
    interactive: Option => Interactive,
    `then`: js.Function1[/* result */ js.Any, _] => Interactive,
    usage: String => Interactive
  ): Interactive = {
    val __obj = js.Dynamic.literal(interactive = js.Any.fromFunction1(interactive), usage = js.Any.fromFunction1(usage))
    __obj.updateDynamic("then")(js.Any.fromFunction1(`then`))
    __obj.asInstanceOf[Interactive]
  }
  
  @scala.inline
  implicit class InteractiveOps[Self <: Interactive] (val x: Self) extends AnyVal {
    
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
    def setInteractive(value: Option => Interactive): Self = this.set("interactive", js.Any.fromFunction1(value))
    
    @scala.inline
    def setThen(value: js.Function1[/* result */ js.Any, _] => Interactive): Self = this.set("then", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUsage(value: String => Interactive): Self = this.set("usage", js.Any.fromFunction1(value))
  }
}
