package typings.vegaLite.anon

import typings.vegaLite.buildSrcBinMod.BinParams
import typings.vegaLite.buildSrcChanneldefMod.Conditional
import typings.vegaLite.buildSrcChanneldefMod.TypedFieldDef
import typings.vegaLite.vegaLiteStrings.binned
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionConditional[F /* <: typings.vegaLite.buildSrcChanneldefMod.Field */] extends StObject {
  
  var condition: Conditional[TypedFieldDef[F, Any, Boolean | BinParams | binned | Null]]
}
object ConditionConditional {
  
  inline def apply[F /* <: typings.vegaLite.buildSrcChanneldefMod.Field */](condition: Conditional[TypedFieldDef[F, Any, Boolean | BinParams | binned | Null]]): ConditionConditional[F] = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionConditional[F]]
  }
  
  extension [Self <: ConditionConditional[?], F /* <: typings.vegaLite.buildSrcChanneldefMod.Field */](x: Self & ConditionConditional[F]) {
    
    inline def setCondition(value: Conditional[TypedFieldDef[F, Any, Boolean | BinParams | binned | Null]]): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
  }
}
