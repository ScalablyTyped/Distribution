package typings.webgme.BlobsNs

import org.scalablytyped.runtime.StringDictionary
import typings.std.JSON
import typings.webgme.CoreNs.DataObject
import typings.webgme.Fn_CallbackArray
import typings.webgme.Fn_CallbackData
import typings.webgme.Fn_CallbackMetadataDescriptor
import typings.webgme.Fn_CallbackMetadataHashArtifact
import typings.webgme.Fn_CallbackMetadataHashContentString
import typings.webgme.Fn_CallbackMetadataHashJSON
import typings.webgme.Fn_CallbackMetadataHashMetadata
import typings.webgme.Fn_CallbackMetadataHashSubpath
import typings.webgme.Fn_CallbackMetadataHashSubpathContent
import typings.webgme.Fn_CallbackNameO
import typings.webgme.GmeClassesNs.Artifact
import typings.webgme.GmeCommonNs.Content
import typings.webgme.GmeCommonNs.ContentString
import typings.webgme.GmeCommonNs.Metadata
import typings.webgme.GmeCommonNs.MetadataHash
import typings.webgme.GmeCommonNs.Name
import typings.webgme.GmeCommonNs.Payload
import typings.webgme.GmeCommonNs.ResultCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Blobs.BlobClient")
@js.native
class BlobClient protected () extends js.Object {
  /**
    * @param paramters
    */
  def this(parameters: BlobClientParamters) = this()
  /**
    * Retrieves the Artifact from the blob storage.
    * @param metadataHash hash associated with the artifact.
    * @return resolved with Artifact artifact.
    */
  @JSName("getArtifact")
  var getArtifact_Original: Fn_CallbackMetadataHashArtifact = js.native
  @JSName("getMetadata")
  var getMetadata_Original: Fn_CallbackMetadataHashMetadata = js.native
  @JSName("getObjectAsJSON")
  var getObjectAsJSON_Original: Fn_CallbackMetadataHashJSON = js.native
  @JSName("getObjectAsString")
  var getObjectAsString_Original: Fn_CallbackMetadataHashContentString = js.native
  @JSName("getObject")
  var getObject_Original: Fn_CallbackMetadataHashSubpathContent = js.native
  @JSName("getSubObject")
  var getSubObject_Original: Fn_CallbackMetadataHashSubpath = js.native
  @JSName("putFile")
  var putFile_Original: Fn_CallbackData = js.native
  @JSName("putFiles")
  var putFiles_Original: Fn_CallbackNameO = js.native
  @JSName("putMetadata")
  var putMetadata_Original: Fn_CallbackMetadataDescriptor = js.native
  @JSName("saveAllArtifacts")
  var saveAllArtifacts_Original: Fn_CallbackArray = js.native
  /**
    * Creates a new artifact 
    * and adds it to array of artifacts of the instance.
    * @param name name of artifact.
    * @return the created artifact.
    */
  def createArtifact(name: Name): Artifact = js.native
  /**
    * Retrieves the Artifact from the blob storage.
    * @param metadataHash hash associated with the artifact.
    * @return resolved with Artifact artifact.
    */
  def getArtifact(metadataHash: MetadataHash): js.Promise[Artifact] = js.native
  /**
    * Retrieves the Artifact from the blob storage.
    * @param metadataHash hash associated with the artifact.
    * @return resolved with Artifact artifact.
    */
  def getArtifact(metadataHash: MetadataHash, callback: ResultCallback[Artifact]): Unit = js.native
  def getCreateURL(filename: Name, isMetadata: Boolean): String = js.native
  def getDownloadURL(metadataHash: MetadataHash, subpath: String): String = js.native
  def getHumanSize(bytes: Double, si: Boolean): String = js.native
  def getMetadata(metadataHash: MetadataHash): js.Promise[Metadata] = js.native
  def getMetadata(metadataHash: MetadataHash, callback: ResultCallback[Metadata]): Unit = js.native
  def getMetadataURL(metadataHash: MetadataHash): String = js.native
  def getObject(metadataHash: MetadataHash, callback: ResultCallback[Content], subpath: String): Unit = js.native
  def getObject(metadataHash: MetadataHash, subpath: String): js.Promise[Content] = js.native
  def getObjectAsJSON(metadataHash: MetadataHash): js.Promise[JSON] = js.native
  def getObjectAsJSON(metadataHash: MetadataHash, callback: ResultCallback[JSON]): Unit = js.native
  def getObjectAsString(metadataHash: MetadataHash): js.Promise[ContentString] = js.native
  def getObjectAsString(metadataHash: MetadataHash, callback: ResultCallback[MetadataHash]): ContentString = js.native
  def getRelativeCreateURL(filename: Name, isMetadata: Boolean): String = js.native
  def getRelativeDownloadURL(metadataHash: MetadataHash, subpath: String): String = js.native
  def getRelativeMetadataURL(metadataHash: MetadataHash): String = js.native
  def getSubObject(metadataHash: MetadataHash, subpath: String): js.Promise[DataObject] = js.native
  def getSubObject(metadataHash: MetadataHash, subpath: String, callback: ResultCallback[DataObject]): Unit = js.native
  def getViewURL(metadataHash: MetadataHash, subpath: String): String = js.native
  def putFile(name: Name, data: Payload): js.Promise[MetadataHash] = js.native
  def putFile(name: Name, data: Payload, callback: ResultCallback[MetadataHash]): Unit = js.native
  def putFiles(o: StringDictionary[Payload]): js.Promise[js.Array[MetadataHash]] = js.native
  def putFiles(o: StringDictionary[Payload], callback: ResultCallback[js.Array[MetadataHash]]): Unit = js.native
  def putMetadata(metadataDescriptor: BlobMetadataDescriptor): js.Promise[MetadataHash] = js.native
  def putMetadata(metadataDescriptor: BlobMetadataDescriptor, callback: ResultCallback[MetadataHash]): Unit = js.native
  def saveAllArtifacts(): js.Promise[js.Array[MetadataHash]] = js.native
  def saveAllArtifacts(callback: ResultCallback[js.Array[MetadataHash]]): Unit = js.native
}

