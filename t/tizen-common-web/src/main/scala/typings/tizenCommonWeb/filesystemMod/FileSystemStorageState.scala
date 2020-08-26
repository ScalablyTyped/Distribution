package typings.tizenCommonWeb.filesystemMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileSystemStorageState extends js.Object

@JSImport("tizen-common-web/filesystem", "FileSystemStorageState")
@js.native
object FileSystemStorageState extends js.Object {
  @js.native
  sealed trait MOUNTED extends FileSystemStorageState
  
  @js.native
  sealed trait REMOVED extends FileSystemStorageState
  
  @js.native
  sealed trait UNMOUNTABLE extends FileSystemStorageState
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FileSystemStorageState with String] = js.native
  /* "MOUNTED" */ @js.native
  object MOUNTED extends TopLevel[MOUNTED with String]
  
  /* "REMOVED" */ @js.native
  object REMOVED extends TopLevel[REMOVED with String]
  
  /* "UNMOUNTABLE" */ @js.native
  object UNMOUNTABLE extends TopLevel[UNMOUNTABLE with String]
  
}

