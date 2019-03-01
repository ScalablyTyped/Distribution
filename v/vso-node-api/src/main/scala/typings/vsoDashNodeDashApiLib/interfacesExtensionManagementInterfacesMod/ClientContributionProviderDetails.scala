package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientContributionProviderDetails extends js.Object {
  /**
    * Friendly name for the provider.
    */
  var displayName: java.lang.String
  /**
    * Unique identifier for this provider. The provider name can be used to cache the contribution data and refer back to it when looking for changes
    */
  var name: java.lang.String
  /**
    * Properties associated with the provider
    */
  var properties: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /**
    * Version of contributions assoicated with this contribution provider.
    */
  var version: java.lang.String
}

object ClientContributionProviderDetails {
  @scala.inline
  def apply(
    displayName: java.lang.String,
    name: java.lang.String,
    properties: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    version: java.lang.String
  ): ClientContributionProviderDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("displayName")(displayName)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("properties")(properties)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ClientContributionProviderDetails]
  }
}

