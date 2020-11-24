package typings.tizenTvWebapis.anon

import typings.tizenTvWebapis.tizenTvWebapisNumbers.`0`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CONFIGKEYDATASERVICE extends js.Object {
  
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
  implicit class CONFIGKEYDATASERVICEOps[Self <: CONFIGKEYDATASERVICE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCONFIG_KEY_DATA_SERVICE(value: `0`): Self = this.set("CONFIG_KEY_DATA_SERVICE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCONFIG_KEY_SERVICE_COUNTRY(value: `1`): Self = this.set("CONFIG_KEY_SERVICE_COUNTRY", value.asInstanceOf[js.Any])
  }
}
