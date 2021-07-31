package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseDefinitionUndeleteParameter extends StObject {
  
  /**
    * Gets or sets comment.
    */
  var comment: String
}
object ReleaseDefinitionUndeleteParameter {
  
  @scala.inline
  def apply(comment: String): ReleaseDefinitionUndeleteParameter = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseDefinitionUndeleteParameter]
  }
  
  @scala.inline
  implicit class ReleaseDefinitionUndeleteParameterMutableBuilder[Self <: ReleaseDefinitionUndeleteParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
  }
}
