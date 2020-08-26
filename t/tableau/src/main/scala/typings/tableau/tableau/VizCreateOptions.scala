package typings.tableau.tableau

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var device: js.UndefOr[String] = js.native
  /** Can be any valid CSS size specifier. If not specified, defaults to the published height of the view. */
  var height: js.UndefOr[String] = js.native
  /** Undoes action on sheet, defaults to a single undo unless optional parameters is specified. */
  var hideTabs: js.UndefOr[Boolean] = js.native
  /** Indicates whether the toolbar is hidden or shown. */
  var hideToolbar: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the ID of an existing instance to make a copy (clone) of.
    * This is useful if the user wants to continue analysis of an existing visualization without losing the state of the original.
    * If the ID does not refer to an existing visualization, the cloned version is derived from the original visualization.
    */
  var instanceIdToClone: js.UndefOr[String] = js.native
  /**
    * Callback function that is invoked when the Viz object first becomes interactive.
    * This is only called once, but it’s guaranteed to be called.
    * If the Viz object is already interactive, it will be called immediately, but on a separate "thread."
    */
  var onFirstInteractive: js.UndefOr[js.Function1[/* e */ TableauEvent, Unit]] = js.native
  /**
    * Callback function that's invoked when the size of the Viz object is known.
    * You can use this callback to perform tasks such as resizing the elements surrounding the Viz object once the object's size has been established.
    */
  var onFirstVizSizeKnown: js.UndefOr[js.Function1[/* e */ VizResizeEvent, Unit]] = js.native
  /** Can be any valid CSS size specifier. If not specified, defaults to the published height of the view. */
  var width: js.UndefOr[String] = js.native
}

object VizCreateOptions {
  @scala.inline
  def apply(): VizCreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VizCreateOptions]
  }
  @scala.inline
  implicit class VizCreateOptionsOps[Self <: VizCreateOptions] (val x: Self) extends AnyVal {
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
    def setDevice(value: String): Self = this.set("device", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevice: Self = this.set("device", js.undefined)
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHideTabs(value: Boolean): Self = this.set("hideTabs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideTabs: Self = this.set("hideTabs", js.undefined)
    @scala.inline
    def setHideToolbar(value: Boolean): Self = this.set("hideToolbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideToolbar: Self = this.set("hideToolbar", js.undefined)
    @scala.inline
    def setInstanceIdToClone(value: String): Self = this.set("instanceIdToClone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceIdToClone: Self = this.set("instanceIdToClone", js.undefined)
    @scala.inline
    def setOnFirstInteractive(value: /* e */ TableauEvent => Unit): Self = this.set("onFirstInteractive", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFirstInteractive: Self = this.set("onFirstInteractive", js.undefined)
    @scala.inline
    def setOnFirstVizSizeKnown(value: /* e */ VizResizeEvent => Unit): Self = this.set("onFirstVizSizeKnown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFirstVizSizeKnown: Self = this.set("onFirstVizSizeKnown", js.undefined)
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

