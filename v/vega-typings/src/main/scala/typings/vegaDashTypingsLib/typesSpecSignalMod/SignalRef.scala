package typings
package vegaDashTypingsLib.typesSpecSignalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignalRef
  extends vegaDashTypingsLib.typesSpecEncodeMod.BaseValueRef[js.Any]
     with vegaDashTypingsLib.typesSpecLayoutMod.Layout
     with vegaDashTypingsLib.typesSpecLayoutMod.LayoutBounds
     with vegaDashTypingsLib.typesSpecScaleMod.ScaleInterpolate
     with vegaDashTypingsLib.typesSpecScaleMod.SortOrder
     with vegaDashTypingsLib.typesSpecTransformMod.TransformField
     with vegaDashTypingsLib.typesSpecOnDashEventsMod._EventListener
     with vegaDashTypingsLib.typesSpecEncodeMod._Field
     with vegaDashTypingsLib.typesSpecLayoutMod._LayoutOffset
     with vegaDashTypingsLib.typesSpecScaleMod._RangeScheme
     with vegaDashTypingsLib.typesSpecScaleMod._ScaleBins
     with vegaDashTypingsLib.typesSpecAxisMod._TickCount
     with vegaDashTypingsLib.typesSpecOnDashEventsMod._Update {
  var signal: java.lang.String
}

object SignalRef {
  @scala.inline
  def apply(signal: java.lang.String): SignalRef = {
    val __obj = js.Dynamic.literal(signal = signal)
  
    __obj.asInstanceOf[SignalRef]
  }
}

