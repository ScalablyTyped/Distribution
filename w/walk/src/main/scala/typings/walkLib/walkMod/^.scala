package typings
package walkLib.walkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("walk", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def walk(path: java.lang.String): Walker = js.native
  def walk(path: java.lang.String, options: WalkOptions): Walker = js.native
  def walkSync(path: java.lang.String): Walker = js.native
  def walkSync(path: java.lang.String, options: WalkOptions): Walker = js.native
}

