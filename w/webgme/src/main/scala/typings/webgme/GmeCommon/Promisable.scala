package typings.webgme.GmeCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Promisable extends js.Object {
  def `catch`(callback: CatchCallback): Promisable = js.native
  def `then`(callback: ThenCallback): Promisable = js.native
}

object Promisable {
  @scala.inline
  def apply(`catch`: CatchCallback => Promisable, `then`: ThenCallback => Promisable): Promisable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction1(`catch`))
    __obj.updateDynamic("then")(js.Any.fromFunction1(`then`))
    __obj.asInstanceOf[Promisable]
  }
  @scala.inline
  implicit class PromisableOps[Self <: Promisable] (val x: Self) extends AnyVal {
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
    def setCatch(value: CatchCallback => Promisable): Self = this.set("catch", js.Any.fromFunction1(value))
    @scala.inline
    def setThen(value: ThenCallback => Promisable): Self = this.set("then", js.Any.fromFunction1(value))
  }
  
}

