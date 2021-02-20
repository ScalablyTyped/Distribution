package typings.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceOperation extends StObject {
  
  var kind: String = js.native
}
object ResourceOperation {
  
  @scala.inline
  def apply(kind: String): ResourceOperation = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceOperation]
  }
  
  @scala.inline
  implicit class ResourceOperationMutableBuilder[Self <: ResourceOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
