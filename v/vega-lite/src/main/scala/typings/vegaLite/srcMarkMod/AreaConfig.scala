package typings.vegaLite.srcMarkMod

import typings.vegaLite.exprMod.ExprRef
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.vegaLite.srcMarkMod.AnyMarkConfig because Already inherited */ trait AreaConfig[ES /* <: ExprRef | SignalRef */]
  extends StObject
     with MarkConfig[ES]
     with PointOverlayMixins[ES]
     with LineOverlayMixins[ES]
object AreaConfig {
  
  inline def apply[ES /* <: ExprRef | SignalRef */](): AreaConfig[ES] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreaConfig[ES]]
  }
}
