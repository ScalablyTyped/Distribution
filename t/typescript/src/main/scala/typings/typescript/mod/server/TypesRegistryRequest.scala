package typings.typescript.mod.server

import typings.typescript.typescriptStrings.typesRegistry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypesRegistryRequest extends StObject {
  
  val kind: typesRegistry = js.native
}
object TypesRegistryRequest {
  
  @scala.inline
  def apply(kind: typesRegistry): TypesRegistryRequest = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypesRegistryRequest]
  }
  
  @scala.inline
  implicit class TypesRegistryRequestMutableBuilder[Self <: TypesRegistryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: typesRegistry): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
