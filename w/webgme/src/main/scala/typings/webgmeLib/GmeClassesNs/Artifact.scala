package typings
package webgmeLib.GmeClassesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Artifact extends js.Object {
  /** Adds files as soft-link. */
  @JSName("addFileAsSoftLink")
  var addFileAsSoftLink_Original: webgmeLib.Anon_NameContent = js.native
  /** Adds content to the artifact as a file. */
  @JSName("addFile")
  var addFile_Original: webgmeLib.Anon_NameContent = js.native
  /** Adds multiple files as soft-links. */
  @JSName("addFilesAsSoftLinks")
  var addFilesAsSoftLinks_Original: webgmeLib.Anon_Files = js.native
  /** Adds multiple files. */
  @JSName("addFiles")
  var addFiles_Original: webgmeLib.Anon_FilesName = js.native
  /** Adds a metadataHash to the artifact using the given file path. */
  @JSName("addMetadataHash")
  var addMetadataHash_Original: webgmeLib.Anon_NameMetadataHashSize = js.native
  /** Adds metadataHashes to the artifact using the given file paths. */
  @JSName("addMetadataHashes")
  var addMetadataHashes_Original: webgmeLib.Anon_NameMetadataHash = js.native
  /** Adds a metadataHash to the artifact using the given file path. */
  @JSName("addObjectHash")
  var addObjectHash_Original: webgmeLib.Anon_NameMetadataHashCallback = js.native
  /** Adds metadataHashes to the artifact using the given file paths. */
  @JSName("addObjectHashes")
  var addObjectHashes_Original: webgmeLib.Anon_ObjectHashes = js.native
  var blobClient: webgmeLib.BlobsNs.BlobClient = js.native
  var descriptor: webgmeLib.BlobsNs.BlobMetadata = js.native
  var name: webgmeLib.GmeCommonNs.Name = js.native
  /** Saves this artifact and uploads the metadata to the server's storage. */
  @JSName("save")
  var save_Original: webgmeLib.Anon_CallbackMessage = js.native
  /** Adds content to the artifact as a file. */
  def addFile(name: webgmeLib.GmeCommonNs.Name, content: webgmeLib.BlobsNs.ObjectBlob): js.Promise[webgmeLib.GmeCommonNs.MetadataHash] = js.native
  /** Adds content to the artifact as a file. */
  def addFile(
    name: webgmeLib.GmeCommonNs.Name,
    content: webgmeLib.BlobsNs.ObjectBlob,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeCommonNs.MetadataHash]
  ): scala.Unit = js.native
  /** Adds files as soft-link. */
  def addFileAsSoftLink(name: webgmeLib.GmeCommonNs.Name, content: webgmeLib.BlobsNs.ObjectBlob): js.Promise[webgmeLib.GmeCommonNs.MetadataHash] = js.native
  /** Adds files as soft-link. */
  def addFileAsSoftLink(
    name: webgmeLib.GmeCommonNs.Name,
    content: webgmeLib.BlobsNs.ObjectBlob,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeCommonNs.MetadataHash]
  ): scala.Unit = js.native
  /** Adds multiple files. */
  def addFiles(files: ScalablyTyped.runtime.StringDictionary[webgmeLib.BlobsNs.ObjectBlob]): js.Promise[js.Array[webgmeLib.GmeCommonNs.MetadataHash]] | js.Promise[java.lang.String] = js.native
  /** Adds multiple files. */
  def addFiles(
    files: ScalablyTyped.runtime.StringDictionary[webgmeLib.BlobsNs.ObjectBlob],
    callback: webgmeLib.GmeCommonNs.ResultCallback[js.Array[webgmeLib.GmeCommonNs.MetadataHash]]
  ): scala.Unit = js.native
  /** Adds multiple files as soft-links. */
  def addFilesAsSoftLinks(files: ScalablyTyped.runtime.StringDictionary[webgmeLib.BlobsNs.ObjectBlob]): js.Promise[js.Array[webgmeLib.GmeCommonNs.MetadataHash]] = js.native
  /** Adds multiple files as soft-links. */
  def addFilesAsSoftLinks(
    files: ScalablyTyped.runtime.StringDictionary[webgmeLib.BlobsNs.ObjectBlob],
    callback: webgmeLib.GmeCommonNs.ResultCallback[js.Array[webgmeLib.GmeCommonNs.MetadataHash]]
  ): scala.Unit = js.native
  /** Adds a metadataHash to the artifact using the given file path. */
  def addMetadataHash(name: webgmeLib.GmeCommonNs.Name, metadataHash: webgmeLib.GmeCommonNs.MetadataHash): js.Promise[webgmeLib.GmeCommonNs.MetadataHash] = js.native
  /** Adds a metadataHash to the artifact using the given file path. */
  def addMetadataHash(
    name: webgmeLib.GmeCommonNs.Name,
    metadataHash: webgmeLib.GmeCommonNs.MetadataHash,
    size: scala.Double
  ): js.Promise[webgmeLib.GmeCommonNs.MetadataHash] = js.native
  /** Adds a metadataHash to the artifact using the given file path. */
  def addMetadataHash(
    name: webgmeLib.GmeCommonNs.Name,
    metadataHash: webgmeLib.GmeCommonNs.MetadataHash,
    size: scala.Double,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeCommonNs.MetadataHash]
  ): scala.Unit = js.native
  /** Adds a metadataHash to the artifact using the given file path. */
  def addMetadataHash(objectHashes: ScalablyTyped.runtime.StringDictionary[java.lang.String]): js.Promise[webgmeLib.GmeCommonNs.MetadataHash] = js.native
  /** Adds a metadataHash to the artifact using the given file path. */
  def addMetadataHash(
    objectHashes: ScalablyTyped.runtime.StringDictionary[java.lang.String],
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeCommonNs.MetadataHash]
  ): scala.Unit = js.native
  /** Adds metadataHashes to the artifact using the given file paths. */
  def addMetadataHashes(name: webgmeLib.GmeCommonNs.Name, metadataHash: webgmeLib.GmeCommonNs.MetadataHash): js.Promise[js.Array[webgmeLib.GmeCommonNs.MetadataHash]] = js.native
  /** Adds metadataHashes to the artifact using the given file paths. */
  def addMetadataHashes(
    name: webgmeLib.GmeCommonNs.Name,
    metadataHash: webgmeLib.GmeCommonNs.MetadataHash,
    size: scala.Double
  ): js.Promise[js.Array[webgmeLib.GmeCommonNs.MetadataHash]] = js.native
  /** Adds metadataHashes to the artifact using the given file paths. */
  def addMetadataHashes(
    name: webgmeLib.GmeCommonNs.Name,
    metadataHash: webgmeLib.GmeCommonNs.MetadataHash,
    size: scala.Double,
    callback: webgmeLib.GmeCommonNs.ResultCallback[js.Array[webgmeLib.GmeCommonNs.MetadataHash]]
  ): scala.Unit = js.native
  /** Adds metadataHashes to the artifact using the given file paths. */
  def addMetadataHashes(objectHashes: ScalablyTyped.runtime.StringDictionary[java.lang.String]): js.Promise[js.Array[webgmeLib.GmeCommonNs.MetadataHash]] = js.native
  /** Adds metadataHashes to the artifact using the given file paths. */
  def addMetadataHashes(
    objectHashes: ScalablyTyped.runtime.StringDictionary[java.lang.String],
    callback: webgmeLib.GmeCommonNs.ResultCallback[js.Array[webgmeLib.GmeCommonNs.MetadataHash]]
  ): scala.Unit = js.native
  /** Adds a metadataHash to the artifact using the given file path. */
  def addObjectHash(name: webgmeLib.GmeCommonNs.Name, metadataHash: webgmeLib.GmeCommonNs.MetadataHash): js.Promise[webgmeLib.GmeCommonNs.MetadataHash] = js.native
  /** Adds a metadataHash to the artifact using the given file path. */
  def addObjectHash(
    name: webgmeLib.GmeCommonNs.Name,
    metadataHash: webgmeLib.GmeCommonNs.MetadataHash,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeCommonNs.MetadataHash]
  ): scala.Unit = js.native
  /** Adds metadataHashes to the artifact using the given file paths. */
  def addObjectHashes(objectHashes: ScalablyTyped.runtime.StringDictionary[java.lang.String]): js.Promise[js.Array[webgmeLib.GmeCommonNs.MetadataHash]] = js.native
  /** Adds metadataHashes to the artifact using the given file paths. */
  def addObjectHashes(
    objectHashes: ScalablyTyped.runtime.StringDictionary[java.lang.String],
    callback: webgmeLib.GmeCommonNs.ResultCallback[js.Array[webgmeLib.GmeCommonNs.MetadataHash]]
  ): scala.Unit = js.native
  /** Saves this artifact and uploads the metadata to the server's storage. */
  def save(): js.Promise[webgmeLib.GmeCommonNs.MetadataHash] = js.native
  /** Saves this artifact and uploads the metadata to the server's storage. */
  def save(callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeCommonNs.MetadataHash]): scala.Unit = js.native
  /** Saves this artifact and uploads the metadata to the server's storage. */
  def save(message: java.lang.String): js.Promise[webgmeLib.GmeCommonNs.MetadataHash] = js.native
}

