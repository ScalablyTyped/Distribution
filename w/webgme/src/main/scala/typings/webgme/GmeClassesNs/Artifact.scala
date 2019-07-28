package typings.webgme.GmeClassesNs

import org.scalablytyped.runtime.StringDictionary
import typings.webgme.BlobsNs.BlobClient
import typings.webgme.BlobsNs.BlobMetadata
import typings.webgme.BlobsNs.ObjectBlob
import typings.webgme.Fn_Callback
import typings.webgme.Fn_CallbackFiles
import typings.webgme.Fn_CallbackFilesName
import typings.webgme.Fn_CallbackMessage
import typings.webgme.Fn_CallbackMetadataHash
import typings.webgme.Fn_CallbackMetadataHashName
import typings.webgme.Fn_CallbackMetadataHashNamePromise
import typings.webgme.Fn_CallbackName
import typings.webgme.GmeCommonNs.MetadataHash
import typings.webgme.GmeCommonNs.Name
import typings.webgme.GmeCommonNs.ResultCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Artifact extends js.Object {
  /** Adds files as soft-link. */
  @JSName("addFileAsSoftLink")
  var addFileAsSoftLink_Original: Fn_Callback = js.native
  /** Adds content to the artifact as a file. */
  @JSName("addFile")
  var addFile_Original: Fn_Callback = js.native
  /** Adds multiple files as soft-links. */
  @JSName("addFilesAsSoftLinks")
  var addFilesAsSoftLinks_Original: Fn_CallbackFilesName = js.native
  /** Adds multiple files. */
  @JSName("addFiles")
  var addFiles_Original: Fn_CallbackFiles = js.native
  /** Adds a metadataHash to the artifact using the given file path. */
  @JSName("addMetadataHash")
  var addMetadataHash_Original: Fn_CallbackMetadataHash = js.native
  /** Adds metadataHashes to the artifact using the given file paths. */
  @JSName("addMetadataHashes")
  var addMetadataHashes_Original: Fn_CallbackMetadataHashName = js.native
  /** Adds a metadataHash to the artifact using the given file path. */
  @JSName("addObjectHash")
  var addObjectHash_Original: Fn_CallbackMetadataHashNamePromise = js.native
  /** Adds metadataHashes to the artifact using the given file paths. */
  @JSName("addObjectHashes")
  var addObjectHashes_Original: Fn_CallbackName = js.native
  var blobClient: BlobClient = js.native
  var descriptor: BlobMetadata = js.native
  var name: Name = js.native
  /** Saves this artifact and uploads the metadata to the server's storage. */
  @JSName("save")
  var save_Original: Fn_CallbackMessage = js.native
  /** Adds content to the artifact as a file. */
  def addFile(name: Name, content: ObjectBlob): js.Promise[MetadataHash] = js.native
  /** Adds content to the artifact as a file. */
  def addFile(name: Name, content: ObjectBlob, callback: ResultCallback[MetadataHash]): Unit = js.native
  /** Adds files as soft-link. */
  def addFileAsSoftLink(name: Name, content: ObjectBlob): js.Promise[MetadataHash] = js.native
  /** Adds files as soft-link. */
  def addFileAsSoftLink(name: Name, content: ObjectBlob, callback: ResultCallback[MetadataHash]): Unit = js.native
  /** Adds multiple files. */
  def addFiles(files: StringDictionary[ObjectBlob]): js.Promise[js.Array[MetadataHash] | String] = js.native
  /** Adds multiple files. */
  def addFiles(files: StringDictionary[ObjectBlob], callback: ResultCallback[js.Array[MetadataHash]]): Unit = js.native
  /** Adds multiple files as soft-links. */
  def addFilesAsSoftLinks(files: StringDictionary[ObjectBlob]): js.Promise[js.Array[MetadataHash]] = js.native
  /** Adds multiple files as soft-links. */
  def addFilesAsSoftLinks(files: StringDictionary[ObjectBlob], callback: ResultCallback[js.Array[MetadataHash]]): Unit = js.native
  /** Adds a metadataHash to the artifact using the given file path. */
  def addMetadataHash(name: Name, metadataHash: MetadataHash): js.Promise[MetadataHash] = js.native
  def addMetadataHash(name: Name, metadataHash: MetadataHash, size: Double): js.Promise[MetadataHash] = js.native
  /** Adds a metadataHash to the artifact using the given file path. */
  def addMetadataHash(name: Name, metadataHash: MetadataHash, size: Double, callback: ResultCallback[MetadataHash]): Unit = js.native
  /** Adds a metadataHash to the artifact using the given file path. */
  def addMetadataHash(objectHashes: StringDictionary[String]): js.Promise[MetadataHash] = js.native
  /** Adds a metadataHash to the artifact using the given file path. */
  def addMetadataHash(objectHashes: StringDictionary[String], callback: ResultCallback[MetadataHash]): Unit = js.native
  /** Adds metadataHashes to the artifact using the given file paths. */
  def addMetadataHashes(name: Name, metadataHash: MetadataHash): js.Promise[js.Array[MetadataHash]] = js.native
  def addMetadataHashes(name: Name, metadataHash: MetadataHash, size: Double): js.Promise[js.Array[MetadataHash]] = js.native
  /** Adds metadataHashes to the artifact using the given file paths. */
  def addMetadataHashes(
    name: Name,
    metadataHash: MetadataHash,
    size: Double,
    callback: ResultCallback[js.Array[MetadataHash]]
  ): Unit = js.native
  /** Adds metadataHashes to the artifact using the given file paths. */
  def addMetadataHashes(objectHashes: StringDictionary[String]): js.Promise[js.Array[MetadataHash]] = js.native
  /** Adds metadataHashes to the artifact using the given file paths. */
  def addMetadataHashes(objectHashes: StringDictionary[String], callback: ResultCallback[js.Array[MetadataHash]]): Unit = js.native
  /** Adds a metadataHash to the artifact using the given file path. */
  def addObjectHash(name: Name, metadataHash: MetadataHash): js.Promise[MetadataHash] = js.native
  /** Adds a metadataHash to the artifact using the given file path. */
  def addObjectHash(name: Name, metadataHash: MetadataHash, callback: ResultCallback[MetadataHash]): Unit = js.native
  /** Adds metadataHashes to the artifact using the given file paths. */
  def addObjectHashes(objectHashes: StringDictionary[String]): js.Promise[js.Array[MetadataHash]] = js.native
  /** Adds metadataHashes to the artifact using the given file paths. */
  def addObjectHashes(objectHashes: StringDictionary[String], callback: ResultCallback[js.Array[MetadataHash]]): Unit = js.native
  /** Saves this artifact and uploads the metadata to the server's storage. */
  def save(): js.Promise[MetadataHash] = js.native
  /** Saves this artifact and uploads the metadata to the server's storage. */
  def save(callback: ResultCallback[MetadataHash]): Unit = js.native
  def save(message: String): js.Promise[MetadataHash] = js.native
}

