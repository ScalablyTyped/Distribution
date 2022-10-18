package typings.vegaLite.buildSrcChanneldefMod

import typings.vegaLite.buildSrcExprMod.ExprRef
import typings.vegaTypings.typesSpecSignalMod.SignalRef
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
