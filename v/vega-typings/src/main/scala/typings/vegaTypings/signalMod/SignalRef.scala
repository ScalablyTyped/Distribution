package typings.vegaTypings.signalMod

import typings.vegaTypings.axisMod._TickCount
import typings.vegaTypings.encodeMod.BaseValueRef
import typings.vegaTypings.encodeMod._Field
import typings.vegaTypings.layoutMod.Layout
import typings.vegaTypings.layoutMod.LayoutBounds
import typings.vegaTypings.layoutMod._LayoutOffset
import typings.vegaTypings.onEventsMod._EventListener
import typings.vegaTypings.onEventsMod._Update
import typings.vegaTypings.scaleMod.ScaleInterpolate
import typings.vegaTypings.scaleMod.SortOrder
import typings.vegaTypings.scaleMod._RangeScheme
import typings.vegaTypings.scaleMod._ScaleBins
import typings.vegaTypings.transformMod.TransformField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignalRef
  extends BaseValueRef[js.Any]
     with Layout
     with LayoutBounds
     with ScaleInterpolate
     with SortOrder
     with TransformField
     with _EventListener
     with _Field
     with _LayoutOffset
     with _RangeScheme
     with _ScaleBins
     with _TickCount
     with _Update {
  
  var signal: String = js.native
}
object SignalRef {
  
  @scala.inline
  def apply(signal: String): SignalRef = {
    val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignalRef]
  }
  
  @scala.inline
  implicit class SignalRefOps[Self <: SignalRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSignal(value: String): Self = this.set("signal", value.asInstanceOf[js.Any])
  }
}
