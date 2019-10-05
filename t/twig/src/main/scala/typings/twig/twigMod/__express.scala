package typings.twig.twigMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twig", "__express")
@js.native
object __express extends js.Object {
  def apply(
    path: String,
    options: CompileOptions,
    fn: js.Function2[/* err */ Error, /* result */ js.Any, Unit]
  ): Unit = js.native
}

