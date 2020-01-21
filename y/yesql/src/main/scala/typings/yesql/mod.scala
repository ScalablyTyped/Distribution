package typings.yesql

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yesql", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(dir: String): String = js.native
  def apply(dir: String, options: AnonMysql): String = js.native
  def mysql[TParams /* <: js.Object */](query: String): js.Function1[/* params */ TParams, AnonSql[TParams]] = js.native
  def pg[TParams /* <: js.Object */](query: String): js.Function1[/* params */ TParams, AnonText[TParams]] = js.native
  type AnyParams = Record[String, js.Any]
}

