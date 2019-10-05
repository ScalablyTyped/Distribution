package typings.swig.swigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swig", "loaders")
@js.native
object loaders extends js.Object {
  def fs(): TemplateLoader = js.native
  def fs(basepath: String): TemplateLoader = js.native
  def fs(basepath: String, encoding: String): TemplateLoader = js.native
  def memory(mapping: js.Any): TemplateLoader = js.native
  def memory(mapping: js.Any, basepath: String): TemplateLoader = js.native
}

