package typings.xrm.Xrm.Controls

import typings.xrm.Xrm.LookupValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a view selector item. This object contains data that identifies a view. Use this as a parameter to
  * the ViewSelector.setCurrentView method.
  */
@js.native
trait ViewSelectorItem extends js.Object {
  /**
    * Returns a LookupValue that references this view.
    * @returns The entity reference.
    */
  def getEntityReference(): LookupValue = js.native
}

object ViewSelectorItem {
  @scala.inline
  def apply(getEntityReference: () => LookupValue): ViewSelectorItem = {
    val __obj = js.Dynamic.literal(getEntityReference = js.Any.fromFunction0(getEntityReference))
    __obj.asInstanceOf[ViewSelectorItem]
  }
  @scala.inline
  implicit class ViewSelectorItemOps[Self <: ViewSelectorItem] (val x: Self) extends AnyVal {
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
    def setGetEntityReference(value: () => LookupValue): Self = this.set("getEntityReference", js.Any.fromFunction0(value))
  }
  
}

