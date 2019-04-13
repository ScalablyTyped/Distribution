package typings
package swaggerDashSchemaDashOfficialLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object swaggerDashSchemaDashOfficialMod {
  type BasicAuthenticationSecurity = BaseSecurity
  type OAuthScope = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /* Rewritten from type alias, can be one of: 
    - BasicAuthenticationSecurity
    - OAuth2AccessCodeSecurity
    - OAuth2ApplicationSecurity
    - OAuth2ImplicitSecurity
    - OAuth2PasswordSecurity
    - ApiKeySecurity
  */
  type Security = _Security | BasicAuthenticationSecurity
}
