package typings.webgme.Gme

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChildCreationParams extends StObject {
  
  var baseId: String = js.native
  
  var parentId: String = js.native
}
object ChildCreationParams {
  
  @scala.inline
  def apply(baseId: String, parentId: String): ChildCreationParams = {
    val __obj = js.Dynamic.literal(baseId = baseId.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildCreationParams]
  }
  
  @scala.inline
  implicit class ChildCreationParamsMutableBuilder[Self <: ChildCreationParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseId(value: String): Self = StObject.set(x, "baseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
  }
}
