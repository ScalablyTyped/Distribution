package typings
package v8flagsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("v8flags", JSImport.Namespace)
@js.native
object v8flagsMod extends js.Object {
  val configPath: java.lang.String = js.native
  val configfile: java.lang.String = js.native
  def apply(cb: js.Function2[/* err */ js.Any, /* flags */ js.Array[java.lang.String], scala.Unit]): scala.Unit = js.native
}

