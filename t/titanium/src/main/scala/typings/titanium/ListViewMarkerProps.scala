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
  def apply(itemIndex: js.UndefOr[Double] = js.undefined, sectionIndex: js.UndefOr[Double] = js.undefined): ListViewMarkerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(itemIndex)) __obj.updateDynamic("itemIndex")(itemIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sectionIndex)) __obj.updateDynamic("sectionIndex")(sectionIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewMarkerProps]
  }
}

