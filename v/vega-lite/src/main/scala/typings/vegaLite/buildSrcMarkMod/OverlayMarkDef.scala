package typings.vegaLite.buildSrcMarkMod

import typings.vegaLite.buildSrcExprMod.ExprRef
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverlayMarkDef[ES /* <: ExprRef | SignalRef */]
  extends StObject
     with MarkConfig[ES]
     with MarkDefMixins[ES]
object OverlayMarkDef {
  
  inline def apply[ES /* <: ExprRef | SignalRef */](): OverlayMarkDef[ES] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverlayMarkDef[ES]]
  }
}
