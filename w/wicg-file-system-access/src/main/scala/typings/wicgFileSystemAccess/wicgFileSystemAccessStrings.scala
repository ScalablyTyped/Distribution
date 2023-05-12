package typings.wicgFileSystemAccess

import typings.wicgFileSystemAccess.mod.global.FileSystemPermissionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wicgFileSystemAccessStrings {
  
  @js.native
  sealed trait directory extends StObject
  inline def directory: directory = "directory".asInstanceOf[directory]
  
  @js.native
  sealed trait file extends StObject
  inline def file: file = "file".asInstanceOf[file]
  
  @js.native
  sealed trait `open-directory` extends StObject
  inline def `open-directory`: `open-directory` = "open-directory".asInstanceOf[`open-directory`]
  
  @js.native
  sealed trait `open-file` extends StObject
  inline def `open-file`: `open-file` = "open-file".asInstanceOf[`open-file`]
  
  @js.native
  sealed trait read
    extends StObject
       with FileSystemPermissionMode
  inline def read: read = "read".asInstanceOf[read]
  
  @js.native
  sealed trait readwrite
    extends StObject
       with FileSystemPermissionMode
  inline def readwrite: readwrite = "readwrite".asInstanceOf[readwrite]
  
  @js.native
  sealed trait sandbox extends StObject
  inline def sandbox: sandbox = "sandbox".asInstanceOf[sandbox]
  
  @js.native
  sealed trait `save-file` extends StObject
  inline def `save-file`: `save-file` = "save-file".asInstanceOf[`save-file`]
}
