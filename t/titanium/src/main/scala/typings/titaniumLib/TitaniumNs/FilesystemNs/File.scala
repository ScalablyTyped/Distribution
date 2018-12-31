package typings
package titaniumLib.TitaniumNs.FilesystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Object representing a path to a file or directory in the device's persistent storage.
		 */
@js.native
trait File
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * `true` if the file is executable.
  			 */
  val executable: scala.Boolean = js.native
  /**
  			 * Set to `true` if the file is hidden.
  			 */
  var hidden: scala.Boolean = js.native
  /**
  			 * Name of the file.
  			 */
  val name: java.lang.String = js.native
  /**
  			 * Native path associated with this file object, as a file URL.
  			 */
  val nativePath: java.lang.String = js.native
  /**
  			 * A `File` object representing the parent directory of the file identified by this object.
  			 */
  val parent: File = js.native
  /**
  			 * `true` if the file identified by this object is read-only.
  			 */
  val readonly: scala.Boolean = js.native
  /**
  			 * Value indicating whether or not to back up to a cloud service.
  			 */
  var remoteBackup: scala.Boolean = js.native
  /**
  			 * Size, in bytes, of the file identified by this object.
  			 */
  val size: scala.Double = js.native
  /**
  			 * `true` if the file identified by this object is a symbolic link.
  			 */
  val symbolicLink: scala.Boolean = js.native
  /**
  			 * `true` if the file identified by this object is writable.
  			 */
  val writable: scala.Boolean = js.native
  /**
  			 * `true` if the file identified by this object is writable.
  			 */
  val writeable: scala.Boolean = js.native
  /**
  			 * Appends data to the file identified by this file object.
  			 */
  def append(data: java.lang.String): scala.Boolean = js.native
  /**
  			 * Appends data to the file identified by this file object.
  			 */
  def append(data: titaniumLib.TitaniumNs.Blob): scala.Boolean = js.native
  /**
  			 * Appends data to the file identified by this file object.
  			 */
  def append(data: File): scala.Boolean = js.native
  /**
  			 * Copies the file identified by this file object to a new path.
  			 */
  def copy(destinationPath: java.lang.String): scala.Boolean = js.native
  /**
  			 * Creates a directory at the path identified by this file object.
  			 */
  def createDirectory(): scala.Boolean = js.native
  def createDirectory(recursive: scala.Boolean): scala.Boolean = js.native
  /**
  			 * Creates a file at the path identified by this file object.
  			 */
  def createFile(): scala.Boolean = js.native
  /**
  			 * Returns the creation timestamp for the file identified by this file object.
  			 */
  def createTimestamp(): scala.Double = js.native
  /**
  			 * Returns the creation Date for the file identified by this file object.
  			 */
  def createdAt(): stdLib.Date = js.native
  /**
  			 * Deletes the directory identified by this file object.
  			 */
  def deleteDirectory(): scala.Boolean = js.native
  def deleteDirectory(recursive: scala.Boolean): scala.Boolean = js.native
  /**
  			 * Deletes the file identified by this file object.
  			 */
  def deleteFile(): scala.Boolean = js.native
  /**
  			 * Returns `true` if the file or directory identified by this file object exists on the device.
  			 */
  def exists(): scala.Boolean = js.native
  /**
  			 * Returns the extension for the file identified by this file object.
  			 */
  def extension(): java.lang.String = js.native
  /**
  			 * Returns a listing of the directory identified by this file object, or `null`
  			 * if this object doesn't identify a directory.
  			 */
  def getDirectoryListing(): js.Array[java.lang.String] = js.native
  /**
  			 * Gets the value of the <Titanium.Filesystem.File.executable> property.
  			 */
  def getExecutable(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Filesystem.File.hidden> property.
  			 */
  def getHidden(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Filesystem.File.name> property.
  			 */
  def getName(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.Filesystem.File.nativePath> property.
  			 */
  def getNativePath(): java.lang.String = js.native
  /**
  			 * Returns the path of the parent directory holding the file identified by this
  			 * file object, as a String (deprecated) **or** as a `File` object.
  			 */
  def getParent(): java.lang.String | File = js.native
  /**
  			 * Gets the value of the <Titanium.Filesystem.File.parent> property.
  			 */
  @JSName("getParent")
  def getParent_File(): File = js.native
  /**
  			 * Returns the protection key value of this file object.
  			 * Returns `null` if there's an error.
  			 */
  def getProtectionKey(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.Filesystem.File.readonly> property.
  			 */
  def getReadonly(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Filesystem.File.remoteBackup> property.
  			 */
  def getRemoteBackup(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Filesystem.File.size> property.
  			 */
  def getSize(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.Filesystem.File.symbolicLink> property.
  			 */
  def getSymbolicLink(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Filesystem.File.writable> property.
  			 */
  def getWritable(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.Filesystem.File.writeable> property.
  			 */
  def getWriteable(): scala.Boolean = js.native
  /**
  			 * Returns `true` if this file object represents a directory.
  			 */
  def isDirectory(): scala.Boolean = js.native
  /**
  			 * Returns `true` if this file object represents an ordinary file.
  			 */
  def isFile(): scala.Boolean = js.native
  /**
  			 * Returns the last modification time for this file.
  			 */
  def modificationTimestamp(): scala.Double = js.native
  /**
  			 * Returns the last modification Date for the file identified by this file object.
  			 */
  def modifiedAt(): stdLib.Date = js.native
  /**
  			 * Moves the file identified by this file object to another path.
  			 */
  def move(newpath: java.lang.String): scala.Boolean = js.native
  /**
  			 * Opens the file identified by this file object for random access.
  			 */
  def open(mode: scala.Double): FileStream = js.native
  /**
  			 * Returns the contents of the file identified by this file object as a `Blob`.
  			 */
  def read(): titaniumLib.TitaniumNs.Blob = js.native
  /**
  			 * Renames the file identified by this file object.
  			 */
  def rename(newname: java.lang.String): scala.Boolean = js.native
  /**
  			 * Returns the fully-resolved native path associated with this file object.
  			 */
  def resolve(): java.lang.String = js.native
  /**
  			 * Sets the value of the <Titanium.Filesystem.File.hidden> property.
  			 */
  def setHidden(hidden: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the protection key as an attribute to the file identified by this file object.
  			 */
  def setProtectionKey(fileProtectionType: java.lang.String): scala.Boolean = js.native
  /**
  			 * Sets the value of the <Titanium.Filesystem.File.remoteBackup> property.
  			 */
  def setRemoteBackup(remoteBackup: scala.Boolean): scala.Unit = js.native
  /**
  			 * Returns the amount of free space available on the device where the file identified by this file object is stored.
  			 */
  def spaceAvailable(): scala.Double = js.native
  /**
  			 * Writes the specified data to the file identified by this file object.
  			 */
  def write(data: java.lang.String): scala.Boolean = js.native
  def write(data: java.lang.String, append: scala.Boolean): scala.Boolean = js.native
  /**
  			 * Writes the specified data to the file identified by this file object.
  			 */
  def write(data: titaniumLib.TitaniumNs.Blob): scala.Boolean = js.native
  def write(data: titaniumLib.TitaniumNs.Blob, append: scala.Boolean): scala.Boolean = js.native
  /**
  			 * Writes the specified data to the file identified by this file object.
  			 */
  def write(data: File): scala.Boolean = js.native
  def write(data: File, append: scala.Boolean): scala.Boolean = js.native
}

