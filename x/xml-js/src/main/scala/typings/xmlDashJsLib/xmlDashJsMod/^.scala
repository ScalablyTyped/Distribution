package typings
package xmlDashJsLib.xmlDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml-js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def js2xml(obj: Element): java.lang.String = js.native
  def js2xml(obj: ElementCompact): java.lang.String = js.native
  def js2xml(obj: ElementCompact, options: xmlDashJsLib.xmlDashJsMod.OptionsNs.JS2XML): java.lang.String = js.native
  def js2xml(obj: Element, options: xmlDashJsLib.xmlDashJsMod.OptionsNs.JS2XML): java.lang.String = js.native
  def json2xml(json: java.lang.String): java.lang.String = js.native
  def json2xml(json: java.lang.String, options: xmlDashJsLib.xmlDashJsMod.OptionsNs.JS2XML): java.lang.String = js.native
  def xml2js(xml: java.lang.String): Element | ElementCompact = js.native
  def xml2js(xml: java.lang.String, options: xmlDashJsLib.xmlDashJsMod.OptionsNs.XML2JS): Element | ElementCompact = js.native
  def xml2json(xml: java.lang.String): java.lang.String = js.native
  def xml2json(xml: java.lang.String, options: xmlDashJsLib.xmlDashJsMod.OptionsNs.XML2JSON): java.lang.String = js.native
}

