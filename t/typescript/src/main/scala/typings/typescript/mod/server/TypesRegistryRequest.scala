package typings.typescript.mod.server

import typings.typescript.typescriptStrings.typesRegistry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypesRegistryRequest extends StObject {
  
  val kind: typesRegistry
}
object TypesRegistryRequest {
  
  @scala.inline
  def apply(): TypesRegistryRequest = {
    val __obj = js.Dynamic.literal(kind = "typesRegistry")
    __obj.asInstanceOf[TypesRegistryRequest]
  }
  
  @scala.inline
  implicit class TypesRegistryRequestMutableBuilder[Self <: TypesRegistryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: typesRegistry): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
