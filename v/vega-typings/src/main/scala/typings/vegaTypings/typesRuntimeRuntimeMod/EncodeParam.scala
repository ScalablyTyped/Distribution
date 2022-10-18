package typings.vegaTypings.typesRuntimeRuntimeMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncodeParam
  extends StObject
     with BuiltinParameter {
  
  @JSName("$encode")
  var $encode: Record[String, EncodeValue]
}
object EncodeParam {
  
  inline def apply($encode: Record[String, EncodeValue]): EncodeParam = {
    val __obj = js.Dynamic.literal($encode = $encode.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodeParam]
  }
  
  extension [Self <: EncodeParam](x: Self) {
    
    inline def set$encode(value: Record[String, EncodeValue]): Self = StObject.set(x, "$encode", value.asInstanceOf[js.Any])
  }
}
