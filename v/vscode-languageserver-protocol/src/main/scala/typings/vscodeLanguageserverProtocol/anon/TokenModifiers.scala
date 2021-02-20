package typings.vscodeLanguageserverProtocol.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TokenModifiers extends StObject {
  
  /**
    * Whether implementation supports dynamic registration. If this is set to `true`
    * the client supports the new `(TextDocumentRegistrationOptions & StaticRegistrationOptions)`
    * return value for the corresponding server capability as well.
    */
  var dynamicRegistration: js.UndefOr[Boolean] = js.native
  
  /**
    * The token modifiers know by the client.
    */
  var tokenModifiers: js.Array[String] = js.native
  
  /**
    * The token types know by the client.
    */
  var tokenTypes: js.Array[String] = js.native
}
object TokenModifiers {
  
  @scala.inline
  def apply(tokenModifiers: js.Array[String], tokenTypes: js.Array[String]): TokenModifiers = {
    val __obj = js.Dynamic.literal(tokenModifiers = tokenModifiers.asInstanceOf[js.Any], tokenTypes = tokenTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenModifiers]
  }
  
  @scala.inline
  implicit class TokenModifiersMutableBuilder[Self <: TokenModifiers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
    
    @scala.inline
    def setTokenModifiers(value: js.Array[String]): Self = StObject.set(x, "tokenModifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenModifiersVarargs(value: String*): Self = StObject.set(x, "tokenModifiers", js.Array(value :_*))
    
    @scala.inline
    def setTokenTypes(value: js.Array[String]): Self = StObject.set(x, "tokenTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenTypesVarargs(value: String*): Self = StObject.set(x, "tokenTypes", js.Array(value :_*))
  }
}
