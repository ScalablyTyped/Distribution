package typings.xrm.Xrm.Controls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for an entity's form selector item.
  */
@js.native
trait FormItem extends js.Object {
  /**
    * Gets the unique identifier of the form.
    * @returns The identifier, in Guid format.
    */
  def getId(): String = js.native
  /**
    * Gets the label for the form.
    * @returns The label.
    */
  def getLabel(): String = js.native
  /**
    * Navigates the user to this form.
    */
  def navigate(): Unit = js.native
}

object FormItem {
  @scala.inline
  def apply(getId: () => String, getLabel: () => String, navigate: () => Unit): FormItem = {
    val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId), getLabel = js.Any.fromFunction0(getLabel), navigate = js.Any.fromFunction0(navigate))
    __obj.asInstanceOf[FormItem]
  }
  @scala.inline
  implicit class FormItemOps[Self <: FormItem] (val x: Self) extends AnyVal {
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
    def setGetId(value: () => String): Self = this.set("getId", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLabel(value: () => String): Self = this.set("getLabel", js.Any.fromFunction0(value))
    @scala.inline
    def setNavigate(value: () => Unit): Self = this.set("navigate", js.Any.fromFunction0(value))
  }
  
}

