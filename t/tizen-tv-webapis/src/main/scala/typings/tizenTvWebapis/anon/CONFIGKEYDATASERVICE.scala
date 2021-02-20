package typings.tizenTvWebapis.anon

import typings.tizenTvWebapis.tizenTvWebapisNumbers.`0`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CONFIGKEYDATASERVICE extends StObject {
  
  /**
    * Data service configuration, it can be set as string type with numbers
    * @since 2.3
    */
  var CONFIG_KEY_DATA_SERVICE: `0` = js.native
  
  /**
    * Service country, readonly
    * @since 2.3
    */
  var CONFIG_KEY_SERVICE_COUNTRY: `1` = js.native
}
object CONFIGKEYDATASERVICE {
  
  @scala.inline
  def apply(CONFIG_KEY_DATA_SERVICE: `0`, CONFIG_KEY_SERVICE_COUNTRY: `1`): CONFIGKEYDATASERVICE = {
    val __obj = js.Dynamic.literal(CONFIG_KEY_DATA_SERVICE = CONFIG_KEY_DATA_SERVICE.asInstanceOf[js.Any], CONFIG_KEY_SERVICE_COUNTRY = CONFIG_KEY_SERVICE_COUNTRY.asInstanceOf[js.Any])
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
