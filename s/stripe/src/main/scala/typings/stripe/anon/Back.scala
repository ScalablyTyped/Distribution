package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Back extends js.Object {
  /**
    * The back of an ID returned by a file with a purpose value of identity_document.
    * This can be unset by updating the value to null and then saving.
    */
  var back: js.UndefOr[String] = js.native
  /**
    * The front of an ID returned by a file with a purpose value of identity_document.
    * This can be unset by updating the value to null and then saving.
    */
  var front: js.UndefOr[String] = js.native
}

object Back {
  @scala.inline
  def apply(): Back = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Back]
  }
  @scala.inline
  implicit class BackOps[Self <: Back] (val x: Self) extends AnyVal {
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
    def setBack(value: String): Self = this.set("back", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBack: Self = this.set("back", js.undefined)
    @scala.inline
    def setFront(value: String): Self = this.set("front", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFront: Self = this.set("front", js.undefined)
  }
  
}

