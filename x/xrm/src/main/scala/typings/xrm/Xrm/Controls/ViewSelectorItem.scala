package typings.xrm.Xrm.Controls

import typings.xrm.Xrm.LookupValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a view selector item. This object contains data that identifies a view. Use this as a parameter to
  * the ViewSelector.setCurrentView method.
  */
trait ViewSelectorItem extends js.Object {
  /**
    * Returns a LookupValue that references this view.
    * @returns The entity reference.
    */
  def getEntityReference(): LookupValue
}

object ViewSelectorItem {
  @scala.inline
  def apply(getEntityReference: () => LookupValue): ViewSelectorItem = {
    val __obj = js.Dynamic.literal(getEntityReference = js.Any.fromFunction0(getEntityReference))
    __obj.asInstanceOf[ViewSelectorItem]
  }
}

