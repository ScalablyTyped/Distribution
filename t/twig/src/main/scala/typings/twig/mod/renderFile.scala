package typings.twig.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twig", "renderFile")
@js.native
object renderFile extends js.Object {
  
  def apply(path: String, fn: js.Function2[/* err */ Error, /* result */ js.Any, Unit]): Unit = js.native
  def apply(path: String, options: RenderOptions, fn: js.Function2[/* err */ Error, /* result */ js.Any, Unit]): Unit = js.native
}
