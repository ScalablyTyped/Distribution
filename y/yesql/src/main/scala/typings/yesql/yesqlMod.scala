package typings.yesql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yesql", JSImport.Namespace)
@js.native
object yesqlMod extends js.Object {
  def apply(dir: String): String = js.native
  def apply(dir: String, options: Anon_Mysql): String = js.native
  def mysql(query: String): js.Function1[/* data */ js.Object, Anon_Sql] = js.native
  def pg(query: String): js.Function1[/* data */ js.Object, Anon_Text] = js.native
}

