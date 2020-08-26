package typings.tizenCommonWeb.filesystemMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileSystemStorageType extends js.Object

@JSImport("tizen-common-web/filesystem", "FileSystemStorageType")
@js.native
object FileSystemStorageType extends js.Object {
  @js.native
  sealed trait EXTERNAL extends FileSystemStorageType
  
  @js.native
  sealed trait INTERNAL extends FileSystemStorageType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FileSystemStorageType with String] = js.native
  /* "EXTERNAL" */ @js.native
  object EXTERNAL extends TopLevel[EXTERNAL with String]
  
  /* "INTERNAL" */ @js.native
  object INTERNAL extends TopLevel[INTERNAL with String]
  
}

