package typings.webgme.GmeClasses

import org.scalablytyped.runtime.StringDictionary
import typings.webgme.Blobs.BlobClient
import typings.webgme.Blobs.BlobMetadata
import typings.webgme.Blobs.ObjectBlob
import typings.webgme.GmeCommon.MetadataHash
import typings.webgme.GmeCommon.Name
import typings.webgme.GmeCommon.ResultCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Artifact extends js.Object {
  var blobClient: BlobClient = js.native
  var descriptor: BlobMetadata = js.native
  var name: Name = js.native
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

