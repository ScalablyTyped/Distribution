package typings.tokenIntrospection

import typings.tokenIntrospection.configurationErrorMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
  @JSImport("token-introspection/errors", "ConfigurationError")
  @js.native
  open class ConfigurationError () extends ^
  
  @JSImport("token-introspection/errors", "IntrospectionError")
  @js.native
  open class IntrospectionError ()
    extends typings.tokenIntrospection.introspectionErrorMod.^
  
  @JSImport("token-introspection/errors", "MalformedTokenError")
  @js.native
  open class MalformedTokenError ()
    extends typings.tokenIntrospection.malformedTokenErrorMod.^
  
  @JSImport("token-introspection/errors", "NotBeforeError")
  @js.native
  open class NotBeforeError ()
    extends typings.tokenIntrospection.notBeforeErrorMod.^
  
  @JSImport("token-introspection/errors", "TokenExpiredError")
  @js.native
  open class TokenExpiredError ()
    extends typings.tokenIntrospection.tokenExpiredErrorMod.^
  
  @JSImport("token-introspection/errors", "TokenNotActiveError")
  @js.native
  open class TokenNotActiveError ()
    extends typings.tokenIntrospection.tokenNotActiveErrorMod.^
}
