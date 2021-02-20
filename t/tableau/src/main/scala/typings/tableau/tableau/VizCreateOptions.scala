package typings.tableau.tableau

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class VizCreateOptionsMutableBuilder[Self <: VizCreateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHideTabs(value: Boolean): Self = StObject.set(x, "hideTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideTabsUndefined: Self = StObject.set(x, "hideTabs", js.undefined)
    
    @scala.inline
    def setHideToolbar(value: Boolean): Self = StObject.set(x, "hideToolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideToolbarUndefined: Self = StObject.set(x, "hideToolbar", js.undefined)
    
    @scala.inline
    def setInstanceIdToClone(value: String): Self = StObject.set(x, "instanceIdToClone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdToCloneUndefined: Self = StObject.set(x, "instanceIdToClone", js.undefined)
    
    @scala.inline
    def setOnFirstInteractive(value: /* e */ TableauEvent => Unit): Self = StObject.set(x, "onFirstInteractive", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFirstInteractiveUndefined: Self = StObject.set(x, "onFirstInteractive", js.undefined)
    
    @scala.inline
    def setOnFirstVizSizeKnown(value: /* e */ VizResizeEvent => Unit): Self = StObject.set(x, "onFirstVizSizeKnown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFirstVizSizeKnownUndefined: Self = StObject.set(x, "onFirstVizSizeKnown", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
