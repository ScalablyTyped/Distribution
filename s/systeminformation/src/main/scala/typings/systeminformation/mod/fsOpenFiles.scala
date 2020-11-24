package typings.systeminformation.mod

import typings.systeminformation.mod.Systeminformation.FsOpenFilesData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("systeminformation", "fsOpenFiles")
@js.native
object fsOpenFiles extends js.Object {
  
  def apply(): js.Promise[js.Array[FsOpenFilesData]] = js.native
  def apply(cb: js.Function1[/* data */ js.Array[FsOpenFilesData], _]): js.Promise[js.Array[FsOpenFilesData]] = js.native
}
