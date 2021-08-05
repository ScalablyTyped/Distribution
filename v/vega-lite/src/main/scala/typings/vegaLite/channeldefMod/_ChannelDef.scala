package typings.vegaLite.channeldefMod

import typings.vegaLite.exprMod.ExprRef
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _ChannelDef[F /* <: Field */] extends StObject
object _ChannelDef {
  
  inline def OrderFieldDef[F /* <: Field */](): typings.vegaLite.channeldefMod.OrderFieldDef[F] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.vegaLite.channeldefMod.OrderFieldDef[F]]
  }
  
  inline def OrderValueDef(value: Double | ExprRef | SignalRef): typings.vegaLite.channeldefMod.OrderValueDef = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.channeldefMod.OrderValueDef]
  }
}
