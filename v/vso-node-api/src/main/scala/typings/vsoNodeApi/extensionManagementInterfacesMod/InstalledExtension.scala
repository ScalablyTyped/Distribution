package typings.vsoNodeApi.extensionManagementInterfacesMod

import typings.vsoNodeApi.galleryInterfacesMod.ExtensionFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstalledExtension
  extends StObject
     with ExtensionManifest {
  
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
  var lastPublished: js.Date
  
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
  
  inline def apply(
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
    lastPublished: js.Date,
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
    val __obj = js.Dynamic.literal(baseUri = baseUri.asInstanceOf[js.Any], constraints = constraints.asInstanceOf[js.Any], contributionTypes = contributionTypes.asInstanceOf[js.Any], contributions = contributions.asInstanceOf[js.Any], demands = demands.asInstanceOf[js.Any], eventCallbacks = eventCallbacks.asInstanceOf[js.Any], extensionId = extensionId.asInstanceOf[js.Any], extensionName = extensionName.asInstanceOf[js.Any], fallbackBaseUri = fallbackBaseUri.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], installState = installState.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], lastPublished = lastPublished.asInstanceOf[js.Any], licensing = licensing.asInstanceOf[js.Any], manifestVersion = manifestVersion.asInstanceOf[js.Any], publisherId = publisherId.asInstanceOf[js.Any], publisherName = publisherName.asInstanceOf[js.Any], registrationId = registrationId.asInstanceOf[js.Any], restrictedTo = restrictedTo.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], serviceInstanceType = serviceInstanceType.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstalledExtension]
  }
  
  extension [Self <: InstalledExtension](x: Self) {
    
    inline def setExtensionId(value: String): Self = StObject.set(x, "extensionId", value.asInstanceOf[js.Any])
    
    inline def setExtensionName(value: String): Self = StObject.set(x, "extensionName", value.asInstanceOf[js.Any])
    
    inline def setFiles(value: js.Array[ExtensionFile]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesVarargs(value: ExtensionFile*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setFlags(value: ExtensionFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setInstallState(value: InstalledExtensionState): Self = StObject.set(x, "installState", value.asInstanceOf[js.Any])
    
    inline def setLastPublished(value: js.Date): Self = StObject.set(x, "lastPublished", value.asInstanceOf[js.Any])
    
    inline def setPublisherId(value: String): Self = StObject.set(x, "publisherId", value.asInstanceOf[js.Any])
    
    inline def setPublisherName(value: String): Self = StObject.set(x, "publisherName", value.asInstanceOf[js.Any])
    
    inline def setRegistrationId(value: String): Self = StObject.set(x, "registrationId", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
