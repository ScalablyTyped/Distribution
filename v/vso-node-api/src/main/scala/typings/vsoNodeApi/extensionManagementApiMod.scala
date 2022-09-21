package typings.vsoNodeApi

import typings.vsoNodeApi.clientApiBasesMod.ClientApiBase
import typings.vsoNodeApi.extensionManagementInterfacesMod.AcquisitionOptions
import typings.vsoNodeApi.extensionManagementInterfacesMod.ExtensionAcquisitionRequest
import typings.vsoNodeApi.extensionManagementInterfacesMod.ExtensionAuthorization
import typings.vsoNodeApi.extensionManagementInterfacesMod.ExtensionDataCollection
import typings.vsoNodeApi.extensionManagementInterfacesMod.ExtensionDataCollectionQuery
import typings.vsoNodeApi.extensionManagementInterfacesMod.ExtensionRequestState
import typings.vsoNodeApi.extensionManagementInterfacesMod.ExtensionState
import typings.vsoNodeApi.extensionManagementInterfacesMod.InstalledExtension
import typings.vsoNodeApi.extensionManagementInterfacesMod.InstalledExtensionQuery
import typings.vsoNodeApi.extensionManagementInterfacesMod.RequestedExtension
import typings.vsoNodeApi.galleryInterfacesMod.UserExtensionPolicy
import typings.vsoNodeApi.vsoBaseInterfacesMod.IRequestHandler
import typings.vsoNodeApi.vsoBaseInterfacesMod.IRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extensionManagementApiMod {
  
  @JSImport("vso-node-api/ExtensionManagementApi", "ExtensionManagementApi")
  @js.native
  open class ExtensionManagementApi protected () extends IExtensionManagementApi {
    def this(baseUrl: String, handlers: js.Array[IRequestHandler]) = this()
    def this(baseUrl: String, handlers: js.Array[IRequestHandler], options: IRequestOptions) = this()
  }
  /* static members */
  object ExtensionManagementApi {
    
    @JSImport("vso-node-api/ExtensionManagementApi", "ExtensionManagementApi.RESOURCE_AREA_ID")
    @js.native
    val RESOURCE_AREA_ID: String = js.native
  }
  
  @js.native
  trait IExtensionManagementApi extends ClientApiBase {
    
    def createDocumentByName(
      doc: Any,
      publisherName: String,
      extensionName: String,
      scopeType: String,
      scopeValue: String,
      collectionName: String
    ): js.Promise[Any] = js.native
    
    def deleteDocumentByName(
      publisherName: String,
      extensionName: String,
      scopeType: String,
      scopeValue: String,
      collectionName: String,
      documentId: String
    ): js.Promise[Unit] = js.native
    
    def deleteRequest(publisherName: String, extensionName: String): js.Promise[Unit] = js.native
    
    def getAcquisitionOptions(itemId: String): js.Promise[AcquisitionOptions] = js.native
    def getAcquisitionOptions(itemId: String, testCommerce: Boolean): js.Promise[AcquisitionOptions] = js.native
    def getAcquisitionOptions(itemId: String, testCommerce: Boolean, isFreeOrTrialInstall: Boolean): js.Promise[AcquisitionOptions] = js.native
    def getAcquisitionOptions(itemId: String, testCommerce: Boolean, isFreeOrTrialInstall: Boolean, isAccountOwner: Boolean): js.Promise[AcquisitionOptions] = js.native
    def getAcquisitionOptions(itemId: String, testCommerce: Boolean, isFreeOrTrialInstall: Unit, isAccountOwner: Boolean): js.Promise[AcquisitionOptions] = js.native
    def getAcquisitionOptions(itemId: String, testCommerce: Unit, isFreeOrTrialInstall: Boolean): js.Promise[AcquisitionOptions] = js.native
    def getAcquisitionOptions(itemId: String, testCommerce: Unit, isFreeOrTrialInstall: Boolean, isAccountOwner: Boolean): js.Promise[AcquisitionOptions] = js.native
    def getAcquisitionOptions(itemId: String, testCommerce: Unit, isFreeOrTrialInstall: Unit, isAccountOwner: Boolean): js.Promise[AcquisitionOptions] = js.native
    
    def getDocumentByName(
      publisherName: String,
      extensionName: String,
      scopeType: String,
      scopeValue: String,
      collectionName: String,
      documentId: String
    ): js.Promise[Any] = js.native
    
    def getDocumentsByName(
      publisherName: String,
      extensionName: String,
      scopeType: String,
      scopeValue: String,
      collectionName: String
    ): js.Promise[js.Array[Any]] = js.native
    
    def getInstalledExtensionByName(publisherName: String, extensionName: String): js.Promise[InstalledExtension] = js.native
    def getInstalledExtensionByName(publisherName: String, extensionName: String, assetTypes: js.Array[String]): js.Promise[InstalledExtension] = js.native
    
    def getInstalledExtensions(): js.Promise[js.Array[InstalledExtension]] = js.native
    def getInstalledExtensions(includeDisabledExtensions: Boolean): js.Promise[js.Array[InstalledExtension]] = js.native
    def getInstalledExtensions(includeDisabledExtensions: Boolean, includeErrors: Boolean): js.Promise[js.Array[InstalledExtension]] = js.native
    def getInstalledExtensions(includeDisabledExtensions: Boolean, includeErrors: Boolean, assetTypes: js.Array[String]): js.Promise[js.Array[InstalledExtension]] = js.native
    def getInstalledExtensions(
      includeDisabledExtensions: Boolean,
      includeErrors: Boolean,
      assetTypes: js.Array[String],
      includeInstallationIssues: Boolean
    ): js.Promise[js.Array[InstalledExtension]] = js.native
    def getInstalledExtensions(
      includeDisabledExtensions: Boolean,
      includeErrors: Boolean,
      assetTypes: Unit,
      includeInstallationIssues: Boolean
    ): js.Promise[js.Array[InstalledExtension]] = js.native
    def getInstalledExtensions(includeDisabledExtensions: Boolean, includeErrors: Unit, assetTypes: js.Array[String]): js.Promise[js.Array[InstalledExtension]] = js.native
    def getInstalledExtensions(
      includeDisabledExtensions: Boolean,
      includeErrors: Unit,
      assetTypes: js.Array[String],
      includeInstallationIssues: Boolean
    ): js.Promise[js.Array[InstalledExtension]] = js.native
    def getInstalledExtensions(
      includeDisabledExtensions: Boolean,
      includeErrors: Unit,
      assetTypes: Unit,
      includeInstallationIssues: Boolean
    ): js.Promise[js.Array[InstalledExtension]] = js.native
    def getInstalledExtensions(includeDisabledExtensions: Unit, includeErrors: Boolean): js.Promise[js.Array[InstalledExtension]] = js.native
    def getInstalledExtensions(includeDisabledExtensions: Unit, includeErrors: Boolean, assetTypes: js.Array[String]): js.Promise[js.Array[InstalledExtension]] = js.native
    def getInstalledExtensions(
      includeDisabledExtensions: Unit,
      includeErrors: Boolean,
      assetTypes: js.Array[String],
      includeInstallationIssues: Boolean
    ): js.Promise[js.Array[InstalledExtension]] = js.native
    def getInstalledExtensions(
      includeDisabledExtensions: Unit,
      includeErrors: Boolean,
      assetTypes: Unit,
      includeInstallationIssues: Boolean
    ): js.Promise[js.Array[InstalledExtension]] = js.native
    def getInstalledExtensions(includeDisabledExtensions: Unit, includeErrors: Unit, assetTypes: js.Array[String]): js.Promise[js.Array[InstalledExtension]] = js.native
    def getInstalledExtensions(
      includeDisabledExtensions: Unit,
      includeErrors: Unit,
      assetTypes: js.Array[String],
      includeInstallationIssues: Boolean
    ): js.Promise[js.Array[InstalledExtension]] = js.native
    def getInstalledExtensions(
      includeDisabledExtensions: Unit,
      includeErrors: Unit,
      assetTypes: Unit,
      includeInstallationIssues: Boolean
    ): js.Promise[js.Array[InstalledExtension]] = js.native
    
    def getPolicies(userId: String): js.Promise[UserExtensionPolicy] = js.native
    
    def getRequests(): js.Promise[js.Array[RequestedExtension]] = js.native
    
    def getStates(): js.Promise[js.Array[ExtensionState]] = js.native
    def getStates(includeDisabled: Boolean): js.Promise[js.Array[ExtensionState]] = js.native
    def getStates(includeDisabled: Boolean, includeErrors: Boolean): js.Promise[js.Array[ExtensionState]] = js.native
    def getStates(includeDisabled: Boolean, includeErrors: Boolean, includeInstallationIssues: Boolean): js.Promise[js.Array[ExtensionState]] = js.native
    def getStates(includeDisabled: Boolean, includeErrors: Unit, includeInstallationIssues: Boolean): js.Promise[js.Array[ExtensionState]] = js.native
    def getStates(includeDisabled: Unit, includeErrors: Boolean): js.Promise[js.Array[ExtensionState]] = js.native
    def getStates(includeDisabled: Unit, includeErrors: Boolean, includeInstallationIssues: Boolean): js.Promise[js.Array[ExtensionState]] = js.native
    def getStates(includeDisabled: Unit, includeErrors: Unit, includeInstallationIssues: Boolean): js.Promise[js.Array[ExtensionState]] = js.native
    
    def getToken(): js.Promise[String] = js.native
    
    def installExtensionByName(publisherName: String, extensionName: String): js.Promise[InstalledExtension] = js.native
    def installExtensionByName(publisherName: String, extensionName: String, version: String): js.Promise[InstalledExtension] = js.native
    
    def queryCollectionsByName(collectionQuery: ExtensionDataCollectionQuery, publisherName: String, extensionName: String): js.Promise[js.Array[ExtensionDataCollection]] = js.native
    
    def queryExtensions(query: InstalledExtensionQuery): js.Promise[js.Array[InstalledExtension]] = js.native
    
    def registerAuthorization(publisherName: String, extensionName: String, registrationId: String): js.Promise[ExtensionAuthorization] = js.native
    
    def requestAcquisition(acquisitionRequest: ExtensionAcquisitionRequest): js.Promise[ExtensionAcquisitionRequest] = js.native
    
    def requestExtension(publisherName: String, extensionName: String, requestMessage: String): js.Promise[RequestedExtension] = js.native
    
    def resolveAllRequests(rejectMessage: String, publisherName: String, extensionName: String, state: ExtensionRequestState): js.Promise[Double] = js.native
    
    def resolveRequest(
      rejectMessage: String,
      publisherName: String,
      extensionName: String,
      requesterId: String,
      state: ExtensionRequestState
    ): js.Promise[Double] = js.native
    
    def setDocumentByName(
      doc: Any,
      publisherName: String,
      extensionName: String,
      scopeType: String,
      scopeValue: String,
      collectionName: String
    ): js.Promise[Any] = js.native
    
    def uninstallExtensionByName(publisherName: String, extensionName: String): js.Promise[Unit] = js.native
    def uninstallExtensionByName(publisherName: String, extensionName: String, reason: String): js.Promise[Unit] = js.native
    def uninstallExtensionByName(publisherName: String, extensionName: String, reason: String, reasonCode: String): js.Promise[Unit] = js.native
    def uninstallExtensionByName(publisherName: String, extensionName: String, reason: Unit, reasonCode: String): js.Promise[Unit] = js.native
    
    def updateDocumentByName(
      doc: Any,
      publisherName: String,
      extensionName: String,
      scopeType: String,
      scopeValue: String,
      collectionName: String
    ): js.Promise[Any] = js.native
    
    def updateInstalledExtension(`extension`: InstalledExtension): js.Promise[InstalledExtension] = js.native
  }
}
