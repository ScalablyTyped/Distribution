package typings.systeminformation.systeminformationMod

import typings.systeminformation.systeminformationMod.Systeminformation.FsOpenFilesData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("systeminformation", "fsOpenFiles")
@js.native
object fsOpenFiles extends js.Object {
  def apply(): js.Promise[js.Array[FsOpenFilesData]] = js.native
  def apply(cb: js.Function1[/* data */ js.Array[FsOpenFilesData], _]): js.Promise[js.Array[FsOpenFilesData]] = js.native
}

