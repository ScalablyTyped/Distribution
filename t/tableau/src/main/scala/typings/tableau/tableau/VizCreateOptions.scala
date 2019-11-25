package typings.tableau.tableau

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VizCreateOptions
  extends /**
  * Apply a filter that you specify to the view when it is first rendered.
  * For example, if you have an Academic Year filter and only want to display data for 2017,
  * you might enter "Academic Year": "2016". For more information, see Filtering.
  */
/* filter */ StringDictionary[js.Any] {
  /**
    * Specifies a device layout for a dashboard, if it exists.
    * Values can be desktop, tablet, or phone.
    * If not specified, defaults to loading a layout based on the smallest dimension of the hosting iframe element.
    */
  var device: js.UndefOr[String] = js.undefined
  /** Can be any valid CSS size specifier. If not specified, defaults to the published height of the view. */
  var height: js.UndefOr[String] = js.undefined
  /** Undoes action on sheet, defaults to a single undo unless optional parameters is specified. */
  var hideTabs: js.UndefOr[Boolean] = js.undefined
  /** Indicates whether the toolbar is hidden or shown. */
  var hideToolbar: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies the ID of an existing instance to make a copy (clone) of.
    * This is useful if the user wants to continue analysis of an existing visualization without losing the state of the original.
    * If the ID does not refer to an existing visualization, the cloned version is derived from the original visualization.
    */
  var instanceIdToClone: js.UndefOr[String] = js.undefined
  /**
    * Callback function that is invoked when the Viz object first becomes interactive.
    * This is only called once, but it’s guaranteed to be called.
    * If the Viz object is already interactive, it will be called immediately, but on a separate "thread."
    */
  var onFirstInteractive: js.UndefOr[js.Function1[/* e */ TableauEvent, Unit]] = js.undefined
  /**
    * Callback function that's invoked when the size of the Viz object is known.
    * You can use this callback to perform tasks such as resizing the elements surrounding the Viz object once the object's size has been established.
    */
  var onFirstVizSizeKnown: js.UndefOr[js.Function1[/* e */ VizResizeEvent, Unit]] = js.undefined
  /** Can be any valid CSS size specifier. If not specified, defaults to the published height of the view. */
  var width: js.UndefOr[String] = js.undefined
}

object VizCreateOptions {
  @scala.inline
  def apply(
    StringDictionary: /**
    * Apply a filter that you specify to the view when it is first rendered.
    * For example, if you have an Academic Year filter and only want to display data for 2017,
    * you might enter "Academic Year": "2016". For more information, see Filtering.
    */
  /* filter */ StringDictionary[js.Any] = null,
    device: String = null,
    height: String = null,
    hideTabs: js.UndefOr[Boolean] = js.undefined,
    hideToolbar: js.UndefOr[Boolean] = js.undefined,
    instanceIdToClone: String = null,
    onFirstInteractive: /* e */ TableauEvent => Unit = null,
    onFirstVizSizeKnown: /* e */ VizResizeEvent => Unit = null,
    width: String = null
  ): VizCreateOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hideTabs)) __obj.updateDynamic("hideTabs")(hideTabs.asInstanceOf[js.Any])
    if (!js.isUndefined(hideToolbar)) __obj.updateDynamic("hideToolbar")(hideToolbar.asInstanceOf[js.Any])
    if (instanceIdToClone != null) __obj.updateDynamic("instanceIdToClone")(instanceIdToClone.asInstanceOf[js.Any])
    if (onFirstInteractive != null) __obj.updateDynamic("onFirstInteractive")(js.Any.fromFunction1(onFirstInteractive))
    if (onFirstVizSizeKnown != null) __obj.updateDynamic("onFirstVizSizeKnown")(js.Any.fromFunction1(onFirstVizSizeKnown))
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VizCreateOptions]
  }
}

