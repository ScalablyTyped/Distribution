package typings.wicgFileSystemAccess

import typings.wicgFileSystemAccess.mod.global.FileSystemHandleKind
import typings.wicgFileSystemAccess.mod.global.FileSystemPermissionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wicgFileSystemAccessStrings {
  
  @scala.inline
  def directory: directory = "directory".asInstanceOf[directory]
  
  @scala.inline
  def file: file = "file".asInstanceOf[file]
  
  @scala.inline
  def `open-directory`: `open-directory` = "open-directory".asInstanceOf[`open-directory`]
  
  @scala.inline
  def `open-file`: `open-file` = "open-file".asInstanceOf[`open-file`]
  
  @scala.inline
  def read: read = "read".asInstanceOf[read]
  
  @scala.inline
  def readwrite: readwrite = "readwrite".asInstanceOf[readwrite]
  
  @scala.inline
  def sandbox: sandbox = "sandbox".asInstanceOf[sandbox]
  
  @scala.inline
  def `save-file`: `save-file` = "save-file".asInstanceOf[`save-file`]
  
  @scala.inline
  def seek: seek = "seek".asInstanceOf[seek]
  
  @scala.inline
  def truncate: truncate = "truncate".asInstanceOf[truncate]
  
  @scala.inline
  def write: write = "write".asInstanceOf[write]
  
  @js.native
  sealed trait directory extends FileSystemHandleKind
  
  @js.native
  sealed trait file extends FileSystemHandleKind
  
  @js.native
  sealed trait `open-directory` extends js.Object
  
  @js.native
  sealed trait `open-file` extends js.Object
  
  @js.native
  sealed trait read extends FileSystemPermissionMode
  
  @js.native
  sealed trait readwrite extends FileSystemPermissionMode
  
  @js.native
  sealed trait sandbox extends js.Object
  
  @js.native
  sealed trait `save-file` extends js.Object
  
  @js.native
  sealed trait seek extends js.Object
  
  @js.native
  sealed trait truncate extends js.Object
  
  @js.native
  sealed trait write extends js.Object
}
