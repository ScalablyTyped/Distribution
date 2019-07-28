package typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod

import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.ExtensionFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstalledExtension extends ExtensionManifest {
  /**
    * The friendly extension id for this extension - unique for a given publisher.
    */
  var extensionId: String
  /**
    * The display name of the extension.
    */
  var extensionName: String
  /**
    * This is the set of files available from the extension.
    */
  var files: js.Array[ExtensionFile]
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
  var lastPublished: Date
  /**
    * Unique id of the publisher of this extension
    */
  var publisherId: String
  /**
    * The display name of the publisher
    */
  var publisherName: String
  /**
    * Unique id for this extension (the same id is used for all versions of a single extension)
    */
  var registrationId: String
  /**
    * Version of this extension
    */
  var version: String
}

object InstalledExtension {
  @scala.inline
  def apply(
    baseUri: String,
    constraints: js.Array[ContributionConstraint],
    contributionTypes: js.Array[ContributionType],
    contributions: js.Array[Contribution],
    demands: js.Array[String],
    eventCallbacks: ExtensionEventCallbackCollection,
    extensionId: String,
    extensionName: String,
    fallbackBaseUri: String,
    files: js.Array[ExtensionFile],
    flags: ExtensionFlags,
    installState: InstalledExtensionState,
    language: String,
    lastPublished: Date,
    licensing: ExtensionLicensing,
    manifestVersion: Double,
    publisherId: String,
    publisherName: String,
    registrationId: String,
    restrictedTo: js.Array[String],
    scopes: js.Array[String],
    serviceInstanceType: String,
    version: String
  ): InstalledExtension = {
    val __obj = js.Dynamic.literal(baseUri = baseUri, constraints = constraints, contributionTypes = contributionTypes, contributions = contributions, demands = demands, eventCallbacks = eventCallbacks, extensionId = extensionId, extensionName = extensionName, fallbackBaseUri = fallbackBaseUri, files = files, flags = flags, installState = installState, language = language, lastPublished = lastPublished, licensing = licensing, manifestVersion = manifestVersion, publisherId = publisherId, publisherName = publisherName, registrationId = registrationId, restrictedTo = restrictedTo, scopes = scopes, serviceInstanceType = serviceInstanceType, version = version)
  
    __obj.asInstanceOf[InstalledExtension]
  }
}

