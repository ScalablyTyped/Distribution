package typings.transducersJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reduced_[TResult] extends js.Object {
  @JSName("@@transducer/reduced")
  var `@@transducerSlashreduced`: Boolean = js.native
  @JSName("@@transducer/value")
  var `@@transducerSlashvalue`: TResult = js.native
}

object Reduced_ {
  @scala.inline
  def apply[TResult](`@@transducerSlashreduced`: Boolean, `@@transducerSlashvalue`: TResult): Reduced_[TResult] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("@@transducer/reduced")(`@@transducerSlashreduced`.asInstanceOf[js.Any])
    __obj.updateDynamic("@@transducer/value")(`@@transducerSlashvalue`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reduced_[TResult]]
  }
  @scala.inline
  implicit class Reduced_Ops[Self <: Reduced_[_], TResult] (val x: Self with Reduced_[TResult]) extends AnyVal {
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
    def `set@@transducerSlashreduced`(value: Boolean): Self = this.set("@@transducer/reduced", value.asInstanceOf[js.Any])
    @scala.inline
    def `set@@transducerSlashvalue`(value: TResult): Self = this.set("@@transducer/value", value.asInstanceOf[js.Any])
  }
  
}

