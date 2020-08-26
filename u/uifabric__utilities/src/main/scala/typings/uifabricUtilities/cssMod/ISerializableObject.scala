package typings.uifabricUtilities.cssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISerializableObject extends js.Object {
  @JSName("toString")
  var toString_FISerializableObject: js.UndefOr[js.Function0[String]] = js.native
}

object ISerializableObject {
  @scala.inline
  def apply(): ISerializableObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISerializableObject]
  }
  @scala.inline
  implicit class ISerializableObjectOps[Self <: ISerializableObject] (val x: Self) extends AnyVal {
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
    def setToString(value: () => String): Self = this.set("toString", js.Any.fromFunction0(value))
    @scala.inline
    def deleteToString: Self = this.set("toString", js.undefined)
  }
  
}

