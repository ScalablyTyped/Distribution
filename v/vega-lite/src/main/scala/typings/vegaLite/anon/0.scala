package typings.vegaLite.anon

import typings.vegaLite.binMod.BinParams
import typings.vegaLite.channeldefMod.Conditional
import typings.vegaLite.channeldefMod.TypedFieldDef
import typings.vegaLite.vegaLiteStrings.binned
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`[F /* <: typings.vegaLite.channeldefMod.Field */] extends StObject {
  
  var condition: Conditional[TypedFieldDef[F, Any, Boolean | BinParams | binned | Null]]
}
object `0` {
  
  inline def apply[F /* <: typings.vegaLite.channeldefMod.Field */](condition: Conditional[TypedFieldDef[F, Any, Boolean | BinParams | binned | Null]]): `0`[F] = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`[F]]
  }
  
  extension [Self <: `0`[?], F /* <: typings.vegaLite.channeldefMod.Field */](x: Self & `0`[F]) {
    
    inline def setCondition(value: Conditional[TypedFieldDef[F, Any, Boolean | BinParams | binned | Null]]): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
  }
}
