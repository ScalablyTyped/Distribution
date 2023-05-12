package typings.twilio.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigurationSchema extends StObject {
  
  var configurationSchema: Any
  
  var description: String
  
  var friendlyName: String
  
  var links: Record[String, String]
  
  var pricingType: String
  
  var sid: String
  
  var url: String
}
object ConfigurationSchema {
  
  inline def apply(
    configurationSchema: Any,
    description: String,
    friendlyName: String,
    links: Record[String, String],
    pricingType: String,
    sid: String,
    url: String
  ): ConfigurationSchema = {
    val __obj = js.Dynamic.literal(configurationSchema = configurationSchema.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], pricingType = pricingType.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationSchema]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigurationSchema] (val x: Self) extends AnyVal {
    
    inline def setConfigurationSchema(value: Any): Self = StObject.set(x, "configurationSchema", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setFriendlyName(value: String): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: Record[String, String]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setPricingType(value: String): Self = StObject.set(x, "pricingType", value.asInstanceOf[js.Any])
    
    inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
