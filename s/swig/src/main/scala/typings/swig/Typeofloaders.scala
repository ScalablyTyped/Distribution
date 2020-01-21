package typings.swig

import typings.swig.mod.TemplateLoader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofloaders extends js.Object {
  def fs(): TemplateLoader = js.native
  def fs(basepath: String): TemplateLoader = js.native
  def fs(basepath: String, encoding: String): TemplateLoader = js.native
  def memory(mapping: js.Any): TemplateLoader = js.native
  def memory(mapping: js.Any, basepath: String): TemplateLoader = js.native
}

