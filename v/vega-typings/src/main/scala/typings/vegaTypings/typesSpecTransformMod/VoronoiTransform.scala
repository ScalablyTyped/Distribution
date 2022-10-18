package typings.vegaTypings.typesSpecTransformMod

import typings.vegaTypings.typesSpecSignalMod.SignalRef
import typings.vegaTypings.typesSpecUtilMod.Vector2
import typings.vegaTypings.vegaTypingsStrings.voronoi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoronoiTransform
  extends StObject
     with Transforms {
  
  var as: js.UndefOr[String | SignalRef] = js.undefined
  
  var extent: js.UndefOr[(Vector2[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef] = js.undefined
  
  var size: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.undefined
  
  var `type`: voronoi
  
  var x: FieldRef
  
  var y: FieldRef
}
object VoronoiTransform {
  
  inline def apply(x: FieldRef, y: FieldRef): VoronoiTransform = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("voronoi")
    __obj.asInstanceOf[VoronoiTransform]
  }
  
  extension [Self <: VoronoiTransform](x: Self) {
    
    inline def setAs(value: String | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setExtent(value: (Vector2[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    inline def setSize(value: (Vector2[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setType(value: voronoi): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setX(value: FieldRef): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: FieldRef): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
