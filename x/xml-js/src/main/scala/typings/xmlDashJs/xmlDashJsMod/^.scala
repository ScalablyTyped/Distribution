package typings.xmlDashJs.xmlDashJsMod

import typings.xmlDashJs.xmlDashJsMod.OptionsNs.JS2XML
import typings.xmlDashJs.xmlDashJsMod.OptionsNs.XML2JS
import typings.xmlDashJs.xmlDashJsMod.OptionsNs.XML2JSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml-js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def js2xml(obj: Element): String = js.native
  def js2xml(obj: ElementCompact): String = js.native
  def js2xml(obj: ElementCompact, options: JS2XML): String = js.native
  def js2xml(obj: Element, options: JS2XML): String = js.native
  def json2xml(json: String): String = js.native
  def json2xml(json: String, options: JS2XML): String = js.native
  def xml2js(xml: String): Element | ElementCompact = js.native
  def xml2js(xml: String, options: XML2JS): Element | ElementCompact = js.native
  def xml2json(xml: String): String = js.native
  def xml2json(xml: String, options: XML2JSON): String = js.native
}

