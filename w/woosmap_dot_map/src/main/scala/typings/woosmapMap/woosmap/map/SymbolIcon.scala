package typings.woosmapMap.woosmap.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SymbolIcon extends StObject {
  
  /**
    * The position of the symbol relative to the marker or polyline.
    * The coordinates of the symbol's path are translated left and up by the anchor's x and y coordinates respectively.
    * By default, a symbol is anchored at(0, 0).
    * The position is expressed in the same coordinate system as the symbol's path.
    */
  var anchor: js.UndefOr[Point | Null] = js.undefined
  
  /**
    * The symbol's fill color. All CSS3 colors are supported except for extended named colors.
    * For symbol markers, this defaults to 'black'.
    * For symbols on polylines, this defaults to the stroke color of the corresponding polyline.
    */
  var fillColor: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The symbol's fill opacity. Defaults to 0.
    */
  var fillOpacity: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The origin of the label relative to the origin of the path, if label is supplied by the marker.
    * By default, the origin is located at(0, 0).
    * The origin is expressed in the same coordinate system as the symbol's path. `
    * This property is unused for symbols on polylines.
    */
  var labelOrigin: js.UndefOr[Point | Null] = js.undefined
  
  /**
    * The symbol's path, which is a built-in symbol path, or a custom path expressed using SVG path notation.
    */
  var path: String
  
  /**
    * The angle by which to rotate the symbol, expressed clockwise in degrees.
    * Defaults to 0.
    * A symbol in an IconSequence where fixedRotation is false is rotated relative to the angle of the edge on which it lies.
    */
  var rotation: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The amount by which the symbol is scaled in size.
    * For symbol markers, this defaults to 1; after scaling, the symbol may be of any size.
    * For symbols on a polyline, this defaults to the stroke weight of the polyline; after scaling,
    * the symbol must lie inside a square 22 pixels in size centered at the symbol's anchor.
    */
  var scale: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The symbol's stroke color.
    * All CSS3 colors are supported except for extended named colors.
    * For symbol markers, this defaults to 'black'.
    * For symbols on a polyline, this defaults to the stroke color of the polyline.
    */
  var strokeColor: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The symbol's stroke opacity. For symbol markers, this defaults to 1.
    * For symbols on a polyline, this defaults to the stroke opacity of the polyline.
    */
  var strokeOpacity: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The symbol's stroke weight. Defaults to the scale of the symbol.
    */
  var strokeWeight: js.UndefOr[Double | Null] = js.undefined
}
object SymbolIcon {
  
  inline def apply(path: String): SymbolIcon = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolIcon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SymbolIcon] (val x: Self) extends AnyVal {
    
    inline def setAnchor(value: Point): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorNull: Self = StObject.set(x, "anchor", null)
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    inline def setFillColorNull: Self = StObject.set(x, "fillColor", null)
    
    inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    inline def setFillOpacityNull: Self = StObject.set(x, "fillOpacity", null)
    
    inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    inline def setLabelOrigin(value: Point): Self = StObject.set(x, "labelOrigin", value.asInstanceOf[js.Any])
    
    inline def setLabelOriginNull: Self = StObject.set(x, "labelOrigin", null)
    
    inline def setLabelOriginUndefined: Self = StObject.set(x, "labelOrigin", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationNull: Self = StObject.set(x, "rotation", null)
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleNull: Self = StObject.set(x, "scale", null)
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    inline def setStrokeColorNull: Self = StObject.set(x, "strokeColor", null)
    
    inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    
    inline def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    inline def setStrokeOpacityNull: Self = StObject.set(x, "strokeOpacity", null)
    
    inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    
    inline def setStrokeWeight(value: Double): Self = StObject.set(x, "strokeWeight", value.asInstanceOf[js.Any])
    
    inline def setStrokeWeightNull: Self = StObject.set(x, "strokeWeight", null)
    
    inline def setStrokeWeightUndefined: Self = StObject.set(x, "strokeWeight", js.undefined)
  }
}
