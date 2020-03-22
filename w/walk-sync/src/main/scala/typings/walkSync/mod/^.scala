package typings.walkSync.mod

import typings.minimatch.mod.IMinimatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("walk-sync", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(baseDir: String): js.Array[String] = js.native
  def apply(baseDir: String, inputOptions: js.Array[String | IMinimatch]): js.Array[String] = js.native
  def apply(baseDir: String, inputOptions: Options): js.Array[String] = js.native
}

