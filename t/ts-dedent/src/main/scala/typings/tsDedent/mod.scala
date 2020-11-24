package typings.tsDedent

import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-dedent", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def dedent(templ: String, values: js.Any*): String = js.native
  def dedent(templ: TemplateStringsArray, values: js.Any*): String = js.native
  
  def default(templ: String, values: js.Any*): String = js.native
  def default(templ: TemplateStringsArray, values: js.Any*): String = js.native
}
