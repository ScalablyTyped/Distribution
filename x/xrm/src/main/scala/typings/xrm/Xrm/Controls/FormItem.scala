package typings.xrm.Xrm.Controls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for an entity's form selector item.
  */
trait FormItem extends js.Object {
  /**
    * Gets the unique identifier of the form.
    * @returns The identifier, in Guid format.
    */
  def getId(): String
  /**
    * Gets the label for the form.
    * @returns The label.
    */
  def getLabel(): String
  /**
    * Navigates the user to this form.
    */
  def navigate(): Unit
}

object FormItem {
  @scala.inline
  def apply(getId: () => String, getLabel: () => String, navigate: () => Unit): FormItem = {
    val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId), getLabel = js.Any.fromFunction0(getLabel), navigate = js.Any.fromFunction0(navigate))
    __obj.asInstanceOf[FormItem]
  }
}

