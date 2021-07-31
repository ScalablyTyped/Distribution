package typings.vegaLite.srcMarkMod

import typings.vegaLite.exprMod.ExprRef
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.vegaLite.srcMarkMod._AnyMarkConfig because Already inherited */ trait BarConfig[ES /* <: ExprRef | SignalRef */]
  extends StObject
     with RectConfig[ES]
     with BarCornerRadiusMixins[ES]
object BarConfig {
  
  @scala.inline
  def apply[ES /* <: ExprRef | SignalRef */](): BarConfig[ES] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarConfig[ES]]
  }
}
