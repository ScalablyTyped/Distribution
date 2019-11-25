package typings.vegaDashTypings.typesSpecSignalMod

import typings.vegaDashTypings.typesSpecAxisMod._TickCount
import typings.vegaDashTypings.typesSpecEncodeMod.BaseValueRef
import typings.vegaDashTypings.typesSpecEncodeMod._Field
import typings.vegaDashTypings.typesSpecLayoutMod.Layout
import typings.vegaDashTypings.typesSpecLayoutMod.LayoutBounds
import typings.vegaDashTypings.typesSpecLayoutMod._LayoutOffset
import typings.vegaDashTypings.typesSpecOnDashEventsMod._EventListener
import typings.vegaDashTypings.typesSpecOnDashEventsMod._Update
import typings.vegaDashTypings.typesSpecScaleMod.ScaleInterpolate
import typings.vegaDashTypings.typesSpecScaleMod.SortOrder
import typings.vegaDashTypings.typesSpecScaleMod._RangeScheme
import typings.vegaDashTypings.typesSpecScaleMod._ScaleBins
import typings.vegaDashTypings.typesSpecTransformMod.TransformField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var signal: String
}

object SignalRef {
  @scala.inline
  def apply(signal: String): SignalRef = {
    val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SignalRef]
  }
}

