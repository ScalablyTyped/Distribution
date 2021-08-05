package typings.vegaLite.srcMarkMod

import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.vegaLiteStrings.transparent
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointOverlayMixins[ES /* <: ExprRef | SignalRef */] extends StObject {
  
  /**
    * A flag for overlaying points on top of line or area marks, or an object defining the properties of the overlayed points.
    *
    * - If this property is `"transparent"`, transparent points will be used (for enhancing tooltips and selections).
    *
    * - If this property is an empty object (`{}`) or `true`, filled points with default properties will be used.
    *
    * - If this property is `false`, no points would be automatically added to line or area marks.
    *
    * __Default value:__ `false`.
    */
  var point: js.UndefOr[Boolean | OverlayMarkDef[ES] | transparent] = js.undefined
}
object PointOverlayMixins {
  
  inline def apply[ES /* <: ExprRef | SignalRef */](): PointOverlayMixins[ES] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointOverlayMixins[ES]]
  }
  
  extension [Self <: PointOverlayMixins[?], ES /* <: ExprRef | SignalRef */](x: Self & PointOverlayMixins[ES]) {
    
    inline def setPoint(value: Boolean | OverlayMarkDef[ES] | transparent): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
  }
}
