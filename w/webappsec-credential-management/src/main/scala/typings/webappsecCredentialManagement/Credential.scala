package typings.webappsecCredentialManagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A generic and extensible Credential interface from which all credentials
  * will inherit.
  * @see {@link https://www.w3.org/TR/credential-management-1/#credential}
  */
@js.native
trait Credential extends StObject {
  
  /**
    * The credential’s identifier. This might be a GUID, username, or email
    * address, for instance.
    */
  val id: String = js.native
  
  /**
    * The credential’s type.
    */
  val `type`: String = js.native
}
object Credential {
  
  @scala.inline
  def apply(id: String, `type`: String): Credential = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credential]
  }
  
  @scala.inline
  implicit class CredentialMutableBuilder[Self <: Credential] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
