package typings.trimblemapsTrimblemapsJs.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkerOptions extends StObject {
  
  /**
    * A string indicating the part of the Marker that should be positioned closest to the coordinate set via Marker.setLngLat.
    * Options are `'center'`, `'top'`, `'bottom'`, `'left'`, `'right'`, `'top-left'`, `'top-right'`, `'bottom-left'`, and `'bottom-right'`.
    * The default value os `'center'`
    */
  var anchor: js.UndefOr[Anchor] = js.undefined
  
  /**
    * The color to use for the default marker if options.element is not provided. The default is light blue (#3FB1CE).
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * A boolean indicating whether or not a marker is able to be dragged to a new position on the map. The default value is false
    */
  var draggable: js.UndefOr[Boolean] = js.undefined
  
  /** DOM element to use as a marker. The default is a light blue, droplet-shaped SVG marker */
  var element: js.UndefOr[HTMLElement] = js.undefined
  
  /** The offset in pixels as a PointLike object to apply relative to the element's center. Negatives indicate left and up. */
  var offset: js.UndefOr[PointLike] = js.undefined
  
  /**
    * `map` aligns the `Marker` to the plane of the map.
    * `viewport` aligns the `Marker` to the plane of the viewport.
    * `auto` automatically matches the value of `rotationAlignment`.
    * The default value is `auto`.
    */
  var pitchAlignment: js.UndefOr[Alignment] = js.undefined
  
  /**
    * The rotation angle of the marker in degrees, relative to its `rotationAlignment` setting. A positive value will rotate the marker clockwise.
    * The default value is 0.
    */
  var rotation: js.UndefOr[Double] = js.undefined
  
  /**
    * `map` aligns the `Marker`'s rotation relative to the map, maintaining a bearing as the map rotates.
    * `viewport` aligns the `Marker`'s rotation relative to the viewport, agnostic to map rotations.
    * `auto` is equivalent to `viewport`.
    * The default value is `auto`
    */
  var rotationAlignment: js.UndefOr[Alignment] = js.undefined
  
  /**
    * The scale to use for the default marker if options.element is not provided.
    * The default scale (1) corresponds to a height of `41px` and a width of `27px`.
    */
  var scale: js.UndefOr[Double] = js.undefined
}
object MarkerOptions {
  
  inline def apply(): MarkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MarkerOptions] (val x: Self) extends AnyVal {
    
    inline def setAnchor(value: Anchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setOffset(value: PointLike): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPitchAlignment(value: Alignment): Self = StObject.set(x, "pitchAlignment", value.asInstanceOf[js.Any])
    
    inline def setPitchAlignmentUndefined: Self = StObject.set(x, "pitchAlignment", js.undefined)
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationAlignment(value: Alignment): Self = StObject.set(x, "rotationAlignment", value.asInstanceOf[js.Any])
    
    inline def setRotationAlignmentUndefined: Self = StObject.set(x, "rotationAlignment", js.undefined)
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
