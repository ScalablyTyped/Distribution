package typings.vsoNodeApi.extensionManagementInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContributionProviderDetails extends StObject {
  
  /**
    * Friendly name for the provider.
    */
  var displayName: String
  
  /**
    * Unique identifier for this provider. The provider name can be used to cache the contribution data and refer back to it when looking for changes
    */
  var name: String
  
  /**
    * Properties associated with the provider
    */
  var properties: StringDictionary[String]
  
  /**
    * Version of contributions assoicated with this contribution provider.
    */
  var version: String
}
object ContributionProviderDetails {
  
  @scala.inline
  def apply(displayName: String, name: String, properties: StringDictionary[String], version: String): ContributionProviderDetails = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContributionProviderDetails]
  }
  
  @scala.inline
  implicit class ContributionProviderDetailsMutableBuilder[Self <: ContributionProviderDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: StringDictionary[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
