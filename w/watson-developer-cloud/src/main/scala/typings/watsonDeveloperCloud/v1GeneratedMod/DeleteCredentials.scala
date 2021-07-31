package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Object returned after credentials are deleted. */
trait DeleteCredentials extends StObject {
  
  /** The unique identifier of the credentials that have been deleted. */
  var credential_id: js.UndefOr[String] = js.undefined
  
  /** The status of the deletion request. */
  var status: js.UndefOr[String] = js.undefined
}
object DeleteCredentials {
  
  @scala.inline
  def apply(): DeleteCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteCredentials]
  }
  
  @scala.inline
  implicit class DeleteCredentialsMutableBuilder[Self <: DeleteCredentials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredential_id(value: String): Self = StObject.set(x, "credential_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredential_idUndefined: Self = StObject.set(x, "credential_id", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
