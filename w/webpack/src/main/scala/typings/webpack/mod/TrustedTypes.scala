package typings.webpack.mod

import typings.webpack.webpackStrings.continue
import typings.webpack.webpackStrings.stop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use a Trusted Types policy to create urls for chunks.
  */
trait TrustedTypes extends StObject {
  
  /**
  	 * If the call to `trustedTypes.createPolicy(...)` fails -- e.g., due to the policy name missing from the CSP `trusted-types` list, or it being a duplicate name, etc. -- controls whether to continue with loading in the hope that `require-trusted-types-for 'script'` isn't enforced yet, versus fail immediately. Default behavior is 'stop'.
  	 */
  var onPolicyCreationFailure: js.UndefOr[continue | stop] = js.undefined
  
  /**
  	 * The name of the Trusted Types policy created by webpack to serve bundle chunks.
  	 */
  var policyName: js.UndefOr[String] = js.undefined
}
object TrustedTypes {
  
  inline def apply(): TrustedTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrustedTypes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrustedTypes] (val x: Self) extends AnyVal {
    
    inline def setOnPolicyCreationFailure(value: continue | stop): Self = StObject.set(x, "onPolicyCreationFailure", value.asInstanceOf[js.Any])
    
    inline def setOnPolicyCreationFailureUndefined: Self = StObject.set(x, "onPolicyCreationFailure", js.undefined)
    
    inline def setPolicyName(value: String): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
    
    inline def setPolicyNameUndefined: Self = StObject.set(x, "policyName", js.undefined)
  }
}
