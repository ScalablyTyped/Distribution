package typings.tizenCommonWeb.filesystemMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileSystemStorageType extends js.Object
@JSImport("tizen-common-web/filesystem", "FileSystemStorageType")
@js.native
object FileSystemStorageType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FileSystemStorageType with String] = js.native
  
  @js.native
  sealed trait EXTERNAL extends FileSystemStorageType
  /* "EXTERNAL" */ @js.native
  object EXTERNAL extends TopLevel[EXTERNAL with String]
  
  @js.native
  sealed trait INTERNAL extends FileSystemStorageType
  /* "INTERNAL" */ @js.native
  object INTERNAL extends TopLevel[INTERNAL with String]
}
