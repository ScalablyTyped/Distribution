package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StaticRegistrationOptions extends StObject {
  
  /**
    * The id used to register the request. The id can be used to deregister
    * the request again. See also Registration#id.
    */
  var id: js.UndefOr[String] = js.native
}
object StaticRegistrationOptions {
  
  @scala.inline
  def apply(): StaticRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaticRegistrationOptions]
  }
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "StaticRegistrationOptions.hasId")
  @js.native
  def hasId(value: js.Object): /* is vscode-languageserver-protocol.anon.Id */ Boolean = js.native
  
  @scala.inline
  implicit class StaticRegistrationOptionsMutableBuilder[Self <: StaticRegistrationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
