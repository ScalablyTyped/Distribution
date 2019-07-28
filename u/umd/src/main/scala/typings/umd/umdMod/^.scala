package typings.umd.umdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("umd", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(name: String, src: String): String = js.native
  def apply(name: String, src: String, options: Boolean | Options): String = js.native
  def postlude(moduleName: String): String = js.native
  def postlude(moduleName: String, options: Boolean): String = js.native
  def postlude(moduleName: String, options: Options): String = js.native
  def prelude(moduleName: String): String = js.native
  def prelude(moduleName: String, options: Boolean): String = js.native
  def prelude(moduleName: String, options: Options): String = js.native
}

