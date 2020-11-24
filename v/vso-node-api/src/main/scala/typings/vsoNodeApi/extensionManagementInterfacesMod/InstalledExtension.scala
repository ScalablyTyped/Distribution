package typings.vsoNodeApi.extensionManagementInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.galleryInterfacesMod.ExtensionFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstalledExtension extends ExtensionManifest {
  
  /**
    * The friendly extension id for this extension - unique for a given publisher.
    */
  var extensionId: String = js.native
  
  /**
    * The display name of the extension.
    */
  var extensionName: String = js.native
  
  /**
    * This is the set of files available from the extension.
    */
  var files: js.Array[ExtensionFile] = js.native
  
  /**
    * Extension flags relevant to contribution consumers
    */
  var flags: ExtensionFlags = js.native
  
  /**
    * Information about this particular installation of the extension
    */
  var installState: InstalledExtensionState = js.native
  
  /**
    * This represents the date/time the extensions was last updated in the gallery. This doesnt mean this version was updated the value represents changes to any and all versions of the extension.
    */
  var lastPublished: Date = js.native
  
  /**
    * Unique id of the publisher of this extension
    */
  var publisherId: String = js.native
  
  /**
    * The display name of the publisher
    */
  var publisherName: String = js.native
  
  /**
    * Unique id for this extension (the same id is used for all versions of a single extension)
    */
  var registrationId: String = js.native
  
  /**
    * Version of this extension
    */
  var version: String = js.native
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
    val __obj = js.Dynamic.literal(baseUri = baseUri.asInstanceOf[js.Any], constraints = constraints.asInstanceOf[js.Any], contributionTypes = contributionTypes.asInstanceOf[js.Any], contributions = contributions.asInstanceOf[js.Any], demands = demands.asInstanceOf[js.Any], eventCallbacks = eventCallbacks.asInstanceOf[js.Any], extensionId = extensionId.asInstanceOf[js.Any], extensionName = extensionName.asInstanceOf[js.Any], fallbackBaseUri = fallbackBaseUri.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], installState = installState.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], lastPublished = lastPublished.asInstanceOf[js.Any], licensing = licensing.asInstanceOf[js.Any], manifestVersion = manifestVersion.asInstanceOf[js.Any], publisherId = publisherId.asInstanceOf[js.Any], publisherName = publisherName.asInstanceOf[js.Any], registrationId = registrationId.asInstanceOf[js.Any], restrictedTo = restrictedTo.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], serviceInstanceType = serviceInstanceType.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstalledExtension]
  }
  
  @scala.inline
  implicit class InstalledExtensionOps[Self <: InstalledExtension] (val x: Self) extends AnyVal {
    
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
    def setExtensionId(value: String): Self = this.set("extensionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionName(value: String): Self = this.set("extensionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesVarargs(value: ExtensionFile*): Self = this.set("files", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: js.Array[ExtensionFile]): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: ExtensionFlags): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallState(value: InstalledExtensionState): Self = this.set("installState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastPublished(value: Date): Self = this.set("lastPublished", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherId(value: String): Self = this.set("publisherId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherName(value: String): Self = this.set("publisherName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistrationId(value: String): Self = this.set("registrationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
