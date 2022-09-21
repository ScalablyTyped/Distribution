package typings.tizenTvWebapis.anon

import typings.tizenTvWebapis.tizenTvWebapisNumbers.`0`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SSOLOGIN extends StObject {
  
  /**
    * Logged in
    *
    * @since 2.3
    */
  var SSO_LOGIN: `1`
  
  /**
    * Not logged in
    *
    * @since 2.3
    */
  var SSO_NOT_LOGIN: `0`
}
object SSOLOGIN {
  
  inline def apply(): SSOLOGIN = {
    val __obj = js.Dynamic.literal(SSO_LOGIN = 1, SSO_NOT_LOGIN = 0)
    __obj.asInstanceOf[SSOLOGIN]
  }
  
  extension [Self <: SSOLOGIN](x: Self) {
    
    inline def setSSO_LOGIN(value: `1`): Self = StObject.set(x, "SSO_LOGIN", value.asInstanceOf[js.Any])
    
    inline def setSSO_NOT_LOGIN(value: `0`): Self = StObject.set(x, "SSO_NOT_LOGIN", value.asInstanceOf[js.Any])
  }
}
