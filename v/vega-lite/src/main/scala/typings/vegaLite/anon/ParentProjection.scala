package typings.vegaLite.anon

import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.projectionMod.Projection
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParentProjection[ES /* <: ExprRef | SignalRef */] extends StObject {
  
  var parentProjection: Projection[ES]
  
  var projection: Projection[ES]
}
object ParentProjection {
  
  inline def apply[ES /* <: ExprRef | SignalRef */](parentProjection: Projection[ES], projection: Projection[ES]): ParentProjection[ES] = {
    val __obj = js.Dynamic.literal(parentProjection = parentProjection.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentProjection[ES]]
  }
  
  extension [Self <: ParentProjection[?], ES /* <: ExprRef | SignalRef */](x: Self & ParentProjection[ES]) {
    
    inline def setParentProjection(value: Projection[ES]): Self = StObject.set(x, "parentProjection", value.asInstanceOf[js.Any])
    
    inline def setProjection(value: Projection[ES]): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
  }
}
