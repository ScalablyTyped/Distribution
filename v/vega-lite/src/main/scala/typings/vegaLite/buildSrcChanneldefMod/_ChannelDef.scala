package typings.vegaLite.buildSrcChanneldefMod

import typings.vegaLite.buildSrcExprMod.ExprRef
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _ChannelDef[F /* <: Field */] extends StObject
object _ChannelDef {
  
  inline def OrderFieldDef[F /* <: Field */](): typings.vegaLite.buildSrcChanneldefMod.OrderFieldDef[F] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.vegaLite.buildSrcChanneldefMod.OrderFieldDef[F]]
  }
  
  inline def OrderValueDef(value: Double | ExprRef | SignalRef): typings.vegaLite.buildSrcChanneldefMod.OrderValueDef = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaLite.buildSrcChanneldefMod.OrderValueDef]
  }
}
