package typings.xstream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Operator[T, R]
  extends InternalProducer[R]
     with InternalListener[T]
     with OutSender[R] {
  
  def _start(out: Stream[R]): Unit = js.native
  
  var ins: Stream[T] = js.native
  
  var `type`: String = js.native
}
object Operator {
  
  @scala.inline
  def apply[T, R](
    _c: () => Unit,
    _e: js.Any => Unit,
    _n: T => Unit,
    _start: Stream[R] => Unit,
    _stop: () => Unit,
    ins: Stream[T],
    out: Stream[R],
    `type`: String
  ): Operator[T, R] = {
    val __obj = js.Dynamic.literal(_c = js.Any.fromFunction0(_c), _e = js.Any.fromFunction1(_e), _n = js.Any.fromFunction1(_n), _start = js.Any.fromFunction1(_start), _stop = js.Any.fromFunction0(_stop), ins = ins.asInstanceOf[js.Any], out = out.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operator[T, R]]
  }
  
  @scala.inline
  implicit class OperatorOps[Self <: Operator[_, _], T, R] (val x: Self with (Operator[T, R])) extends AnyVal {
    
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
    def set_start(value: Stream[R] => Unit): Self = this.set("_start", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIns(value: Stream[T]): Self = this.set("ins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
