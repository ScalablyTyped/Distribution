package typings.twig.twigMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twig", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def __express(
    path: String,
    options: CompileOptions,
    fn: js.Function2[/* err */ Error, /* result */ js.Any, Unit]
  ): Unit = js.native
  def cache(value: Boolean): Unit = js.native
  def compile(markup: String, options: CompileOptions): js.Function1[/* context */ js.Any, _] = js.native
  def extendFilter(name: String, definition: js.Function2[/* left */ js.Any, /* repeated */ js.Any, String]): Unit = js.native
  def extendFunction(name: String, definition: js.Function1[/* repeated */ js.Any, String]): Unit = js.native
  def extendTag(definition: js.Any): Unit = js.native
  def extendTest(name: String, definition: js.Function1[/* value */ js.Any, Boolean]): Unit = js.native
  def renderFile(
    path: String,
    options: CompileOptions,
    fn: js.Function2[/* err */ Error, /* result */ js.Any, Unit]
  ): Unit = js.native
  def twig(params: Parameters): Template = js.native
}

