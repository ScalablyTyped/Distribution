package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The object returned to the <Titanium.UI.WebView.backForwardList> method.
  */
trait BackForwardList extends js.Object {
  /**
  	 * The item immediately preceding the current item.
  	 */
  var backItem: js.UndefOr[BackForwardListItem] = js.undefined
  /**
  	 * The portion of the list preceding the current item.
  	 */
  var backList: js.UndefOr[js.Array[BackForwardListItem]] = js.undefined
  /**
  	 * The current item.
  	 */
  var currentItem: js.UndefOr[BackForwardListItem] = js.undefined
  /**
  	 * The item immediately following the current item.
  	 */
  var forwardItem: js.UndefOr[BackForwardListItem] = js.undefined
  /**
  	 * The portion of the list following the current item.
  	 */
  var forwardList: js.UndefOr[js.Array[BackForwardListItem]] = js.undefined
}

object BackForwardList {
  @scala.inline
  def apply(
    backItem: BackForwardListItem = null,
    backList: js.Array[BackForwardListItem] = null,
    currentItem: BackForwardListItem = null,
    forwardItem: BackForwardListItem = null,
    forwardList: js.Array[BackForwardListItem] = null
  ): BackForwardList = {
    val __obj = js.Dynamic.literal()
    if (backItem != null) __obj.updateDynamic("backItem")(backItem)
    if (backList != null) __obj.updateDynamic("backList")(backList)
    if (currentItem != null) __obj.updateDynamic("currentItem")(currentItem)
    if (forwardItem != null) __obj.updateDynamic("forwardItem")(forwardItem)
    if (forwardList != null) __obj.updateDynamic("forwardList")(forwardList)
    __obj.asInstanceOf[BackForwardList]
  }
}

