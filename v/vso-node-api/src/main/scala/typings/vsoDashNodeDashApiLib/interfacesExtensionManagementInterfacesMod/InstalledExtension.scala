package typings
package vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstalledExtension extends ExtensionManifest {
  /**
    * The friendly extension id for this extension - unique for a given publisher.
    */
  var extensionId: java.lang.String
  /**
    * The display name of the extension.
    */
  var extensionName: java.lang.String
  /**
    * This is the set of files available from the extension.
    */
  var files: js.Array[vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionFile]
  /**
    * Extension flags relevant to contribution consumers
    */
  var flags: ExtensionFlags
  /**
    * Information about this particular installation of the extension
    */
  var installState: InstalledExtensionState
  /**
    * This represents the date/time the extensions was last updated in the gallery. This doesnt mean this version was updated the value represents changes to any and all versions of the extension.
    */
  var lastPublished: stdLib.Date
  /**
    * Unique id of the publisher of this extension
    */
  var publisherId: java.lang.String
  /**
    * The display name of the publisher
    */
  var publisherName: java.lang.String
  /**
    * Unique id for this extension (the same id is used for all versions of a single extension)
    */
  var registrationId: java.lang.String
  /**
    * Version of this extension
    */
  var version: java.lang.String
}

object InstalledExtension {
  @scala.inline
  def apply(
    baseUri: java.lang.String,
    constraints: js.Array[ContributionConstraint],
    contributionTypes: js.Array[ContributionType],
    contributions: js.Array[Contribution],
    demands: js.Array[java.lang.String],
    eventCallbacks: ExtensionEventCallbackCollection,
    extensionId: java.lang.String,
    extensionName: java.lang.String,
    fallbackBaseUri: java.lang.String,
    files: js.Array[vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.ExtensionFile],
    flags: ExtensionFlags,
    installState: InstalledExtensionState,
    language: java.lang.String,
    lastPublished: stdLib.Date,
    licensing: ExtensionLicensing,
    manifestVersion: scala.Double,
    publisherId: java.lang.String,
    publisherName: java.lang.String,
    registrationId: java.lang.String,
    restrictedTo: js.Array[java.lang.String],
    scopes: js.Array[java.lang.String],
    serviceInstanceType: java.lang.String,
    version: java.lang.String
  ): InstalledExtension = {
    val __obj = js.Dynamic.literal(baseUri = baseUri, constraints = constraints, contributionTypes = contributionTypes, contributions = contributions, demands = demands, eventCallbacks = eventCallbacks, extensionId = extensionId, extensionName = extensionName, fallbackBaseUri = fallbackBaseUri, files = files, flags = flags, installState = installState, language = language, lastPublished = lastPublished, licensing = licensing, manifestVersion = manifestVersion, publisherId = publisherId, publisherName = publisherName, registrationId = registrationId, restrictedTo = restrictedTo, scopes = scopes, serviceInstanceType = serviceInstanceType, version = version)
  
    __obj.asInstanceOf[InstalledExtension]
  }
}

