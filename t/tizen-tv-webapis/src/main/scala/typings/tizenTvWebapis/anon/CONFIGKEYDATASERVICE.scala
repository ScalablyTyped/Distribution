package typings.tizenTvWebapis.anon

import typings.tizenTvWebapis.tizenTvWebapisNumbers.`0`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CONFIGKEYDATASERVICE extends StObject {
  
  /**
    * Data service configuration, it can be set as string type with numbers
    * @since 2.3
    */
  var CONFIG_KEY_DATA_SERVICE: `0`
  
  /**
    * Service country, readonly
    * @since 2.3
    */
  var CONFIG_KEY_SERVICE_COUNTRY: `1`
}
object CONFIGKEYDATASERVICE {
  
  @scala.inline
  def apply(): CONFIGKEYDATASERVICE = {
    val __obj = js.Dynamic.literal(CONFIG_KEY_DATA_SERVICE = 0, CONFIG_KEY_SERVICE_COUNTRY = 1)
    __obj.asInstanceOf[CONFIGKEYDATASERVICE]
  }
  
  @scala.inline
  implicit class CONFIGKEYDATASERVICEMutableBuilder[Self <: CONFIGKEYDATASERVICE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCONFIG_KEY_DATA_SERVICE(value: `0`): Self = StObject.set(x, "CONFIG_KEY_DATA_SERVICE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCONFIG_KEY_SERVICE_COUNTRY(value: `1`): Self = StObject.set(x, "CONFIG_KEY_SERVICE_COUNTRY", value.asInstanceOf[js.Any])
  }
}
