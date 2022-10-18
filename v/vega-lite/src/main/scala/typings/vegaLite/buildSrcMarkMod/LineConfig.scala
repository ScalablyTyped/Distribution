package typings.vegaLite.buildSrcMarkMod

import typings.vegaLite.buildSrcExprMod.ExprRef
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.vegaLite.buildSrcMarkMod.AnyMarkConfig because Already inherited */ trait LineConfig[ES /* <: ExprRef | SignalRef */]
  extends StObject
     with MarkConfig[ES]
     with PointOverlayMixins[ES]
object LineConfig {
  
  inline def apply[ES /* <: ExprRef | SignalRef */](): LineConfig[ES] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineConfig[ES]]
  }
}
