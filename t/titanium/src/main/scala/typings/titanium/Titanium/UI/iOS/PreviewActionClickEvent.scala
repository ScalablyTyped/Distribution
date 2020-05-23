package typings.titanium.Titanium.UI.iOS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the device detects a click against a preview action.
  */
trait PreviewActionClickEvent extends PreviewActionBaseEvent {
  /**
    * The index of the clicked action.
    */
  var index: Double
  /**
    * The item ID of cell, if the `previewContext` property of the <Titanium.UI.iOS.PreviewContext>
    * is a <Titanium.UI.ListView>.
    */
  var itemId: String
  /**
    * The index of the clicked row, if the `previewContext` property of the <Titanium.UI.iOS.PreviewContext>
    * is a <Titanium.UI.ListView>.
    */
  var itemIndex: Double
  /**
    * The index of the clicked section, if the `previewContext` property of the <Titanium.UI.iOS.PreviewContext>
    * is a <Titanium.UI.ListView>.
    */
  var sectionIndex: Double
}

object PreviewActionClickEvent {
  @scala.inline
  def apply(index: Double, itemId: String, itemIndex: Double, sectionIndex: Double, source: PreviewAction): PreviewActionClickEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any], itemIndex = itemIndex.asInstanceOf[js.Any], sectionIndex = sectionIndex.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewActionClickEvent]
  }
}

