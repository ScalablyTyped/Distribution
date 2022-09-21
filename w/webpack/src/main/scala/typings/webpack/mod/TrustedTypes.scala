package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use a Trusted Types policy to create urls for chunks.
  */
trait TrustedTypes extends StObject {
  
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
  
  extension [Self <: TrustedTypes](x: Self) {
    
    inline def setPolicyName(value: String): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
    
    inline def setPolicyNameUndefined: Self = StObject.set(x, "policyName", js.undefined)
  }
}
