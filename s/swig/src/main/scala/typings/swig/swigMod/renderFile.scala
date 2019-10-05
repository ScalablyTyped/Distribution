package typings.swig.swigMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swig", "renderFile")
@js.native
object renderFile extends js.Object {
  def apply(pathName: String): String = js.native
  def apply(pathName: String, locals: js.Any): String = js.native
  def apply(pathName: String, locals: js.Any, cb: js.Function2[/* err */ Error, /* output */ String, Unit]): Unit = js.native
}

