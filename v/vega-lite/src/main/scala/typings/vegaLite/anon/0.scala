package typings.vegaLite.anon

import typings.vegaLite.buildSrcBinMod.BinParams
import typings.vegaLite.buildSrcChanneldefMod.Conditional
import typings.vegaLite.buildSrcChanneldefMod.TypedFieldDef
import typings.vegaLite.vegaLiteStrings.binned
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`[F /* <: typings.vegaLite.buildSrcChanneldefMod.Field */] extends StObject {
  
  var condition: Conditional[TypedFieldDef[F, Any, Boolean | BinParams | binned | Null]]
}
object `0` {
  
  inline def apply[F /* <: typings.vegaLite.buildSrcChanneldefMod.Field */](condition: Conditional[TypedFieldDef[F, Any, Boolean | BinParams | binned | Null]]): `0`[F] = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`[F]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0`[?], F /* <: typings.vegaLite.buildSrcChanneldefMod.Field */] (val x: Self & `0`[F]) extends AnyVal {
    
    inline def setCondition(value: Conditional[TypedFieldDef[F, Any, Boolean | BinParams | binned | Null]]): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
  }
}
