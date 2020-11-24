package typings.walkSync.mod

import typings.minimatch.mod.IMinimatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("walk-sync", "entries")
@js.native
object entries extends js.Object {
  
  def apply(baseDir: String): js.Array[Entry] = js.native
  def apply(baseDir: String, inputOptions: js.Array[String | IMinimatch]): js.Array[Entry] = js.native
  def apply(baseDir: String, inputOptions: Options): js.Array[Entry] = js.native
}
