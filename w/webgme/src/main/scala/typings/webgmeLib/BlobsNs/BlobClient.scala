package typings
package webgmeLib.BlobsNs

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
  var getArtifact_Original: webgmeLib.Anon_MetadataHash = js.native
  @JSName("getMetadata")
  var getMetadata_Original: webgmeLib.Anon_MetadataHashCallbackResultCallback = js.native
  @JSName("getObjectAsJSON")
  var getObjectAsJSON_Original: webgmeLib.Anon_MetadataHashCallback = js.native
  @JSName("getObjectAsString")
  var getObjectAsString_Original: webgmeLib.Anon_MetadataHashCallbackResultCallbackContentString = js.native
  @JSName("getObject")
  var getObject_Original: webgmeLib.Anon_MetadataHashCallbackSubpath = js.native
  @JSName("getSubObject")
  var getSubObject_Original: webgmeLib.Anon_MetadataHashSubpath = js.native
  @JSName("putFile")
  var putFile_Original: webgmeLib.Anon_Name = js.native
  @JSName("putFiles")
  var putFiles_Original: webgmeLib.Anon_O = js.native
  @JSName("putMetadata")
  var putMetadata_Original: webgmeLib.Anon_MetadataDescriptor = js.native
  @JSName("saveAllArtifacts")
  var saveAllArtifacts_Original: webgmeLib.Anon_Callback = js.native
  /**
           * Creates a new artifact 
           * and adds it to array of artifacts of the instance.
           * @param name name of artifact.
           * @return the created artifact.
           */
  def createArtifact(name: webgmeLib.GmeCommonNs.Name): webgmeLib.GmeClassesNs.Artifact = js.native
  /**
           * Retrieves the Artifact from the blob storage.
           * @param metadataHash hash associated with the artifact.
           * @return resolved with Artifact artifact.
           */
  def getArtifact(metadataHash: webgmeLib.GmeCommonNs.MetadataHash): js.Promise[webgmeLib.GmeClassesNs.Artifact] = js.native
  /**
           * Retrieves the Artifact from the blob storage.
           * @param metadataHash hash associated with the artifact.
           * @return resolved with Artifact artifact.
           */
  def getArtifact(
    metadataHash: webgmeLib.GmeCommonNs.MetadataHash,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeClassesNs.Artifact]
  ): scala.Unit = js.native
  def getCreateURL(filename: webgmeLib.GmeCommonNs.Name, isMetadata: scala.Boolean): java.lang.String = js.native
  def getDownloadURL(metadataHash: webgmeLib.GmeCommonNs.MetadataHash, subpath: java.lang.String): java.lang.String = js.native
  def getHumanSize(bytes: scala.Double, si: scala.Boolean): java.lang.String = js.native
  def getMetadata(metadataHash: webgmeLib.GmeCommonNs.MetadataHash): js.Promise[webgmeLib.GmeCommonNs.Metadata] = js.native
  def getMetadata(
    metadataHash: webgmeLib.GmeCommonNs.MetadataHash,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeCommonNs.Metadata]
  ): scala.Unit = js.native
  def getMetadataURL(metadataHash: webgmeLib.GmeCommonNs.MetadataHash): java.lang.String = js.native
  def getObject(
    metadataHash: webgmeLib.GmeCommonNs.MetadataHash,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeCommonNs.Content],
    subpath: java.lang.String
  ): scala.Unit = js.native
  def getObject(metadataHash: webgmeLib.GmeCommonNs.MetadataHash, subpath: java.lang.String): js.Promise[webgmeLib.GmeCommonNs.Content] = js.native
  def getObjectAsJSON(metadataHash: webgmeLib.GmeCommonNs.MetadataHash): js.Promise[stdLib.JSON] = js.native
  def getObjectAsJSON(
    metadataHash: webgmeLib.GmeCommonNs.MetadataHash,
    callback: webgmeLib.GmeCommonNs.ResultCallback[stdLib.JSON]
  ): scala.Unit = js.native
  def getObjectAsString(metadataHash: webgmeLib.GmeCommonNs.MetadataHash): js.Promise[webgmeLib.GmeCommonNs.ContentString] = js.native
  def getObjectAsString(
    metadataHash: webgmeLib.GmeCommonNs.MetadataHash,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeCommonNs.MetadataHash]
  ): webgmeLib.GmeCommonNs.ContentString = js.native
  def getRelativeCreateURL(filename: webgmeLib.GmeCommonNs.Name, isMetadata: scala.Boolean): java.lang.String = js.native
  def getRelativeDownloadURL(metadataHash: webgmeLib.GmeCommonNs.MetadataHash, subpath: java.lang.String): java.lang.String = js.native
  def getRelativeMetadataURL(metadataHash: webgmeLib.GmeCommonNs.MetadataHash): java.lang.String = js.native
  def getSubObject(metadataHash: webgmeLib.GmeCommonNs.MetadataHash, subpath: java.lang.String): js.Promise[webgmeLib.CoreNs.DataObject] = js.native
  def getSubObject(
    metadataHash: webgmeLib.GmeCommonNs.MetadataHash,
    subpath: java.lang.String,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.CoreNs.DataObject]
  ): scala.Unit = js.native
  def getViewURL(metadataHash: webgmeLib.GmeCommonNs.MetadataHash, subpath: java.lang.String): java.lang.String = js.native
  def putFile(name: webgmeLib.GmeCommonNs.Name, data: webgmeLib.GmeCommonNs.Payload): js.Promise[webgmeLib.GmeCommonNs.MetadataHash] = js.native
  def putFile(
    name: webgmeLib.GmeCommonNs.Name,
    data: webgmeLib.GmeCommonNs.Payload,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeCommonNs.MetadataHash]
  ): scala.Unit = js.native
  def putFiles(o: org.scalablytyped.runtime.StringDictionary[webgmeLib.GmeCommonNs.Payload]): js.Promise[js.Array[webgmeLib.GmeCommonNs.MetadataHash]] = js.native
  def putFiles(
    o: org.scalablytyped.runtime.StringDictionary[webgmeLib.GmeCommonNs.Payload],
    callback: webgmeLib.GmeCommonNs.ResultCallback[js.Array[webgmeLib.GmeCommonNs.MetadataHash]]
  ): scala.Unit = js.native
  def putMetadata(metadataDescriptor: BlobMetadataDescriptor): js.Promise[webgmeLib.GmeCommonNs.MetadataHash] = js.native
  def putMetadata(
    metadataDescriptor: BlobMetadataDescriptor,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeCommonNs.MetadataHash]
  ): scala.Unit = js.native
  def saveAllArtifacts(): js.Promise[js.Array[webgmeLib.GmeCommonNs.MetadataHash]] = js.native
  def saveAllArtifacts(callback: webgmeLib.GmeCommonNs.ResultCallback[js.Array[webgmeLib.GmeCommonNs.MetadataHash]]): scala.Unit = js.native
}

