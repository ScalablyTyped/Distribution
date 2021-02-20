package typings.vegaLite.srcMarkMod

import typings.vegaLite.exprMod.ExprRef
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TickConfig[ES /* <: ExprRef | SignalRef */]
  extends MarkConfig[ES]
     with TickThicknessMixins
     with _AnyMarkConfig[ES] {
  
  /**
    * The width of the ticks.
    *
    * __Default value:__  3/4 of step (width step for horizontal ticks and height step for vertical ticks).
    * @minimum 0
    */
  var bandSize: js.UndefOr[Double] = js.native
}
object TickConfig {
  
  @scala.inline
  def apply[ES /* <: ExprRef | SignalRef */](): TickConfig[ES] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TickConfig[ES]]
  }
  
  @scala.inline
  implicit class TickConfigMutableBuilder[Self <: TickConfig[_], ES /* <: ExprRef | SignalRef */] (val x: Self with TickConfig[ES]) extends AnyVal {
    
    @scala.inline
    def setBandSize(value: Double): Self = StObject.set(x, "bandSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandSizeUndefined: Self = StObject.set(x, "bandSize", js.undefined)
  }
}
