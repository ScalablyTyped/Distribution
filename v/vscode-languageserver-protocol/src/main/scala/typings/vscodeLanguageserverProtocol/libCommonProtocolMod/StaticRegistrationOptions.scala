package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaticRegistrationOptions extends StObject {
  
  /**
    * The id used to register the request. The id can be used to deregister
    * the request again. See also Registration#id.
    */
  var id: js.UndefOr[String] = js.undefined
}
object StaticRegistrationOptions {
  
  inline def apply(): StaticRegistrationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaticRegistrationOptions]
  }
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "StaticRegistrationOptions")
  @js.native
  val ^ : js.Any = js.native
  
  inline def hasId(value: js.Object): /* is vscode-languageserver-protocol.anon.Id */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasId")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-protocol.anon.Id */ Boolean]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StaticRegistrationOptions] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
