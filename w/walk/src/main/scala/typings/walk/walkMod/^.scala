package typings.walk.walkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("walk", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def walk(path: String): Walker = js.native
  def walk(path: String, options: WalkOptions): Walker = js.native
  def walkSync(path: String): Walker = js.native
  def walkSync(path: String, options: WalkOptions): Walker = js.native
}

