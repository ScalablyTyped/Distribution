package typings.xstream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Aggregator[T, U]
  extends InternalProducer[U]
     with OutSender[U] {
  
  def _start(out: Stream[U]): Unit = js.native
  
  var insArr: js.Array[Stream[T]] = js.native
  
  var `type`: String = js.native
}
object Aggregator {
  
  @scala.inline
  def apply[T, U](
    _start: Stream[U] => Unit,
    _stop: () => Unit,
    insArr: js.Array[Stream[T]],
    out: Stream[U],
    `type`: String
  ): Aggregator[T, U] = {
    val __obj = js.Dynamic.literal(_start = js.Any.fromFunction1(_start), _stop = js.Any.fromFunction0(_stop), insArr = insArr.asInstanceOf[js.Any], out = out.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aggregator[T, U]]
  }
  
  @scala.inline
  implicit class AggregatorOps[Self <: Aggregator[_, _], T, U] (val x: Self with (Aggregator[T, U])) extends AnyVal {
    
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
    def set_start(value: Stream[U] => Unit): Self = this.set("_start", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInsArrVarargs(value: Stream[T]*): Self = this.set("insArr", js.Array(value :_*))
    
    @scala.inline
    def setInsArr(value: js.Array[Stream[T]]): Self = this.set("insArr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
