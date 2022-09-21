package typings.vegaLite.channeldefMod

import typings.vegaLite.exprMod.ExprRef
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderValueDef
  extends StObject
     with ConditionValueDefMixins[Double]
     with ValueDef[Double | ExprRef | SignalRef]
     with _ChannelDef[Any]
object OrderValueDef {
  
  inline def apply(value: Double | ExprRef | SignalRef): OrderValueDef = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderValueDef]
  }
}
