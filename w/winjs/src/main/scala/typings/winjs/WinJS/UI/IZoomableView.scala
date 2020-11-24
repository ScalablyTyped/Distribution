package typings.winjs.WinJS.UI

import typings.winjs.WinJS.Promise
import typings.winjs.WinJS.Utilities.IPosition
import typings.winjs.anon.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Supports semantic zoom functionality by exposing a control as either the zoomed in or the zoomed out view of the SemanticZoom control.
  **/
@js.native
trait IZoomableView[T] extends js.Object {
  
  //#region Methods
  /**
    * Initiates semantic zoom on the custom control.
    **/
  def beginZoom(): Unit = js.native
  
  /**
    * Initializes the semantic zoom state for the custom control.
    * @param isZoomedOut True if this is the zoomed out view; otherwise false.
    * @param isCurrentView True if this is the current view; otherwise false.
    * @param triggerZoom The function that manages semantic zoom behavior. Triggers a zoom in or zoom out if the control is the visible control.
    * @param prefetchedPages The number of pages of content to pre-fetch for zooming. This value is dependent on the size of the semantic zoom container. More content can be displayed based on the zoom factor and the size of the container.
    **/
  def configureForZoom(isZoomedOut: Boolean, isCurrentView: Boolean, triggerZoom: js.Function, prefetchedPages: Double): Unit = js.native
  
  /**
    * Terminates semantic zoom on the zoomed in or zoomed out child of the custom control.
    * @param isCurrentView True if the control is the visible control; otherwise false.
    **/
  def endZoom(isCurrentView: Boolean): Unit = js.native
  
  /**
    * Retrieves the current item of the zoomed in or zoomed out child of the custom control.
    * @returns An object that represents the selected item. This return value must be a Promise for the following: item, position.
    **/
  def getCurrentItem(): Promise[Item[T]] = js.native
  
  /**
    * Retrieves the panning axis of the zoomed-in or zoomed-out child of the custom control.
    * @returns Identifies the panning axis of the child control. Implementation specific.
    **/
  def getPanAxis(): String = js.native
  
  /**
    * Manages pointer input for the custom control.
    * @param pointerId The ID of the pointer.
    **/
  def handlePointer(pointerId: String): Unit = js.native
  
  /**
    * Positions the specified item within the viewport of the child control when panning or zooming begins.
    * @param item The object to position within the viewport of the child control. item can be a number, a string, or an object with any number of properties.
    * @param position An object that contains the position data of the item relative to the child control. position must be an object with four number properties: left, top, width, and height. These values specify a rectangle that is typically the bounding box of the current item, though the details are up to the control. The units of the position must be in pixels. And the coordinates must be relative to the top-left of the control viewport (which should occupy the same area as the semantic zoom viewport), except when in RTL mode. In RTL mode, return coordinates relative to the top-right off the control viewport. The rectangle is transformed from the coordinate system of one control to that of the other.
    **/
  def positionItem(item: T, position: IPosition): Unit = js.native
  
  /**
    * Selects the item closest to the specified screen coordinates.
    * @param x The x-coordinate in DIPs relative to the upper-left corner of the SemanticZoom viewport.
    * @param y The y-coordinate in DIPs relative to the upper-left corner of the SemanticZoom viewport..
    **/
  def setCurrentItem(x: Double, y: Double): Unit = js.native
}
object IZoomableView {
  
  @scala.inline
  def apply[T](
    beginZoom: () => Unit,
    configureForZoom: (Boolean, Boolean, js.Function, Double) => Unit,
    endZoom: Boolean => Unit,
    getCurrentItem: () => Promise[Item[T]],
    getPanAxis: () => String,
    handlePointer: String => Unit,
    positionItem: (T, IPosition) => Unit,
    setCurrentItem: (Double, Double) => Unit
  ): IZoomableView[T] = {
    val __obj = js.Dynamic.literal(beginZoom = js.Any.fromFunction0(beginZoom), configureForZoom = js.Any.fromFunction4(configureForZoom), endZoom = js.Any.fromFunction1(endZoom), getCurrentItem = js.Any.fromFunction0(getCurrentItem), getPanAxis = js.Any.fromFunction0(getPanAxis), handlePointer = js.Any.fromFunction1(handlePointer), positionItem = js.Any.fromFunction2(positionItem), setCurrentItem = js.Any.fromFunction2(setCurrentItem))
    __obj.asInstanceOf[IZoomableView[T]]
  }
  
  @scala.inline
  implicit class IZoomableViewOps[Self <: IZoomableView[_], T] (val x: Self with IZoomableView[T]) extends AnyVal {
    
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
    def setBeginZoom(value: () => Unit): Self = this.set("beginZoom", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConfigureForZoom(value: (Boolean, Boolean, js.Function, Double) => Unit): Self = this.set("configureForZoom", js.Any.fromFunction4(value))
    
    @scala.inline
    def setEndZoom(value: Boolean => Unit): Self = this.set("endZoom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCurrentItem(value: () => Promise[Item[T]]): Self = this.set("getCurrentItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPanAxis(value: () => String): Self = this.set("getPanAxis", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHandlePointer(value: String => Unit): Self = this.set("handlePointer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPositionItem(value: (T, IPosition) => Unit): Self = this.set("positionItem", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetCurrentItem(value: (Double, Double) => Unit): Self = this.set("setCurrentItem", js.Any.fromFunction2(value))
  }
}
