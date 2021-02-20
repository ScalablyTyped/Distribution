package typings.wicgFileSystemAccess

import typings.wicgFileSystemAccess.mod.global.FileSystemHandleKind
import typings.wicgFileSystemAccess.mod.global.FileSystemPermissionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wicgFileSystemAccessStrings {
  
  @js.native
  sealed trait directory extends FileSystemHandleKind
  @scala.inline
  def directory: directory = "directory".asInstanceOf[directory]
  
  @js.native
  sealed trait file extends FileSystemHandleKind
  @scala.inline
  def file: file = "file".asInstanceOf[file]
  
  @js.native
  sealed trait `open-directory` extends StObject
  @scala.inline
  def `open-directory`: `open-directory` = "open-directory".asInstanceOf[`open-directory`]
  
  @js.native
  sealed trait `open-file` extends StObject
  @scala.inline
  def `open-file`: `open-file` = "open-file".asInstanceOf[`open-file`]
  
  @js.native
  sealed trait read extends FileSystemPermissionMode
  @scala.inline
  def read: read = "read".asInstanceOf[read]
  
  @js.native
  sealed trait readwrite extends FileSystemPermissionMode
  @scala.inline
  def readwrite: readwrite = "readwrite".asInstanceOf[readwrite]
  
  @js.native
  sealed trait sandbox extends StObject
  @scala.inline
  def sandbox: sandbox = "sandbox".asInstanceOf[sandbox]
  
  @js.native
  sealed trait `save-file` extends StObject
  @scala.inline
  def `save-file`: `save-file` = "save-file".asInstanceOf[`save-file`]
  
  @js.native
  sealed trait seek extends StObject
  @scala.inline
  def seek: seek = "seek".asInstanceOf[seek]
  
  @js.native
  sealed trait truncate extends StObject
  @scala.inline
  def truncate: truncate = "truncate".asInstanceOf[truncate]
  
  @js.native
  sealed trait write extends StObject
  @scala.inline
  def write: write = "write".asInstanceOf[write]
}
