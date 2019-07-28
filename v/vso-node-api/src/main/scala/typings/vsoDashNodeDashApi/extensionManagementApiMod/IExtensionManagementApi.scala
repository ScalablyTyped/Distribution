package typings.vsoDashNodeDashApi.extensionManagementApiMod

import typings.vsoDashNodeDashApi.clientApiBasesMod.ClientApiBase
import typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.AcquisitionOptions
import typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ExtensionAcquisitionRequest
import typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ExtensionAuthorization
import typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ExtensionDataCollection
import typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ExtensionDataCollectionQuery
import typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ExtensionRequestState
import typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.ExtensionState
import typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.InstalledExtension
import typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.InstalledExtensionQuery
import typings.vsoDashNodeDashApi.interfacesExtensionManagementInterfacesMod.RequestedExtension
import typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod.UserExtensionPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExtensionManagementApi extends ClientApiBase {
  def createDocumentByName(
    doc: js.Any,
    publisherName: String,
    extensionName: String,
    scopeType: String,
    scopeValue: String,
    collectionName: String
  ): js.Promise[_] = js.native
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
  def getDocumentByName(
    publisherName: String,
    extensionName: String,
    scopeType: String,
    scopeValue: String,
    collectionName: String,
    documentId: String
  ): js.Promise[_] = js.native
  def getDocumentsByName(
    publisherName: String,
    extensionName: String,
    scopeType: String,
    scopeValue: String,
    collectionName: String
  ): js.Promise[js.Array[_]] = js.native
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
  def getPolicies(userId: String): js.Promise[UserExtensionPolicy] = js.native
  def getRequests(): js.Promise[js.Array[RequestedExtension]] = js.native
  def getStates(): js.Promise[js.Array[ExtensionState]] = js.native
  def getStates(includeDisabled: Boolean): js.Promise[js.Array[ExtensionState]] = js.native
  def getStates(includeDisabled: Boolean, includeErrors: Boolean): js.Promise[js.Array[ExtensionState]] = js.native
  def getStates(includeDisabled: Boolean, includeErrors: Boolean, includeInstallationIssues: Boolean): js.Promise[js.Array[ExtensionState]] = js.native
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
    doc: js.Any,
    publisherName: String,
    extensionName: String,
    scopeType: String,
    scopeValue: String,
    collectionName: String
  ): js.Promise[_] = js.native
  def uninstallExtensionByName(publisherName: String, extensionName: String): js.Promise[Unit] = js.native
  def uninstallExtensionByName(publisherName: String, extensionName: String, reason: String): js.Promise[Unit] = js.native
  def uninstallExtensionByName(publisherName: String, extensionName: String, reason: String, reasonCode: String): js.Promise[Unit] = js.native
  def updateDocumentByName(
    doc: js.Any,
    publisherName: String,
    extensionName: String,
    scopeType: String,
    scopeValue: String,
    collectionName: String
  ): js.Promise[_] = js.native
  def updateInstalledExtension(extension: InstalledExtension): js.Promise[InstalledExtension] = js.native
}

