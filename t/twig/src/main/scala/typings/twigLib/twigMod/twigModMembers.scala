package typings
package twigLib.twigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twig", JSImport.Namespace)
@js.native
object twigModMembers extends js.Object {
  def __express(
    path: java.lang.String,
    options: CompileOptions,
    fn: js.Function2[/* err */ stdLib.Error, /* result */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def cache(value: scala.Boolean): scala.Unit = js.native
  def compile(markup: java.lang.String, options: CompileOptions): js.Function1[/* context */ js.Any, _] = js.native
  def extendFilter(
    name: java.lang.String,
    definition: js.Function2[/* left */ js.Any, /* repeated */js.Any, java.lang.String]
  ): scala.Unit = js.native
  def extendFunction(name: java.lang.String, definition: js.Function1[/* repeated */js.Any, java.lang.String]): scala.Unit = js.native
  def extendTag(definition: js.Any): scala.Unit = js.native
  def extendTest(name: java.lang.String, definition: js.Function1[/* value */ js.Any, scala.Boolean]): scala.Unit = js.native
  def renderFile(
    path: java.lang.String,
    options: CompileOptions,
    fn: js.Function2[/* err */ stdLib.Error, /* result */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def twig(params: Parameters): Template = js.native
}

