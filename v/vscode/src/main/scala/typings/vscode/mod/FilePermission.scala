package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FilePermission extends StObject
@JSImport("vscode", "FilePermission")
@js.native
object FilePermission extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FilePermission & Double] = js.native
  
  /**
  		 * The file is readonly.
  		 *
  		 * *Note:* All `FileStat` from a `FileSystemProvider` that is registered with
  		 * the option `isReadonly: true` will be implicitly handled as if `FilePermission.Readonly`
  		 * is set. As a consequence, it is not possible to have a readonly file system provider
  		 * registered where some `FileStat` are not readonly.
  		 */
  @js.native
  sealed trait Readonly
    extends StObject
       with FilePermission
  /* 1 */ val Readonly: typings.vscode.mod.FilePermission.Readonly & Double = js.native
}
