package typings
package yesqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yesql", JSImport.Namespace)
@js.native
object yesqlMod extends js.Object {
  def apply(dir: java.lang.String): java.lang.String = js.native
  def apply(dir: java.lang.String, options: yesqlLib.Anon_Type): java.lang.String = js.native
  def mysql(query: java.lang.String): js.Function1[/* data */ js.Object, yesqlLib.Anon_Values] = js.native
  def pg(query: java.lang.String): js.Function1[/* data */ js.Object, yesqlLib.Anon_Text] = js.native
}

