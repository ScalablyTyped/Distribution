package typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContributionProviderDetails extends js.Object {
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
}

