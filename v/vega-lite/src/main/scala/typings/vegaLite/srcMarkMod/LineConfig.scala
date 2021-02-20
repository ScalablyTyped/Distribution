package typings.vegaLite.srcMarkMod

import typings.vegaLite.exprMod.ExprRef
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineConfig[ES /* <: ExprRef | SignalRef */]
  extends MarkConfig[ES]
     with PointOverlayMixins[ES]
     with _AnyMarkConfig[ES]
object LineConfig {
  
  @scala.inline
  def apply[ES /* <: ExprRef | SignalRef */](): LineConfig[ES] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineConfig[ES]]
  }
}
