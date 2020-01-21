package typings.xmlJs.mod

import typings.xmlJs.mod.Options.JS2XML
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml-js", "js2xml")
@js.native
object js2xml extends js.Object {
  def apply(obj: Element): String = js.native
  def apply(obj: ElementCompact): String = js.native
  def apply(obj: ElementCompact, options: JS2XML): String = js.native
  def apply(obj: Element, options: JS2XML): String = js.native
}

