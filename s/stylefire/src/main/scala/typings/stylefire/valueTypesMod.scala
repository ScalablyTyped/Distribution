package typings.stylefire

import typings.styleValueTypes.typesMod.ValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valueTypesMod {
  
  @JSImport("stylefire/lib/css/value-types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getValueAsType(value: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getValueAsType")(value.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def getValueAsType(value: js.Any, `type`: ValueType): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getValueAsType")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def getValueType(key: String): ValueType = ^.asInstanceOf[js.Dynamic].applyDynamic("getValueType")(key.asInstanceOf[js.Any]).asInstanceOf[ValueType]
}
