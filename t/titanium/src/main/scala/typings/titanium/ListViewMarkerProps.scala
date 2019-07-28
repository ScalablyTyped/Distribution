package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The parameter for [setMarker](Titanium.UI.ListView.setMarker) and [addMarker](Titanium.UI.ListView.addMarker) methods.
  */
trait ListViewMarkerProps extends js.Object {
  /**
  	 * The itemIndex of the reference item.
  	 */
  var itemIndex: js.UndefOr[Double] = js.undefined
  /**
  	 * The sectionIndex of the reference item.
  	 */
  var sectionIndex: js.UndefOr[Double] = js.undefined
}

object ListViewMarkerProps {
  @scala.inline
  def apply(itemIndex: Int | Double = null, sectionIndex: Int | Double = null): ListViewMarkerProps = {
    val __obj = js.Dynamic.literal()
    if (itemIndex != null) __obj.updateDynamic("itemIndex")(itemIndex.asInstanceOf[js.Any])
    if (sectionIndex != null) __obj.updateDynamic("sectionIndex")(sectionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewMarkerProps]
  }
}

