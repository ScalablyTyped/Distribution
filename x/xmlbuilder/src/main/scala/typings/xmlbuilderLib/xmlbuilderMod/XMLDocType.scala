package typings
package xmlbuilderLib.xmlbuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmlbuilder", "XMLDocType")
@js.native
class XMLDocType () extends js.Object {
  def att(elementName: java.lang.String, attributeName: java.lang.String, attributeType: java.lang.String): XMLDocType = js.native
  def att(
    elementName: java.lang.String,
    attributeName: java.lang.String,
    attributeType: java.lang.String,
    defaultValueType: java.lang.String
  ): XMLDocType = js.native
  def att(
    elementName: java.lang.String,
    attributeName: java.lang.String,
    attributeType: java.lang.String,
    defaultValueType: java.lang.String,
    defaultValue: js.Any
  ): XMLDocType = js.native
  def attList(elementName: java.lang.String, attributeName: java.lang.String, attributeType: java.lang.String): XMLDocType = js.native
  def attList(
    elementName: java.lang.String,
    attributeName: java.lang.String,
    attributeType: java.lang.String,
    defaultValueType: java.lang.String
  ): XMLDocType = js.native
  def attList(
    elementName: java.lang.String,
    attributeName: java.lang.String,
    attributeType: java.lang.String,
    defaultValueType: java.lang.String,
    defaultValue: js.Any
  ): XMLDocType = js.native
  def cdata(value: java.lang.String): XMLDocType = js.native
  def com(value: java.lang.String): XMLDocType = js.native
  def comment(value: java.lang.String): XMLDocType = js.native
  def dat(value: java.lang.String): XMLDocType = js.native
  def doc(): js.Any = js.native
  def document(): js.Any = js.native
  def ele(name: java.lang.String): XMLDocType = js.native
  def ele(name: java.lang.String, value: js.Object): XMLDocType = js.native
  def element(name: java.lang.String): XMLDocType = js.native
  def element(name: java.lang.String, value: js.Object): XMLDocType = js.native
  def ent(name: java.lang.String, value: js.Any): XMLDocType = js.native
  def entity(name: java.lang.String, value: js.Any): XMLDocType = js.native
  def ins(target: java.lang.String, value: js.Any): XMLDocType = js.native
  def instruction(target: java.lang.String, value: js.Any): XMLDocType = js.native
  def not(name: java.lang.String, value: js.Any): XMLDocType = js.native
  def notation(name: java.lang.String, value: js.Any): XMLDocType = js.native
  def pEntity(name: java.lang.String, value: js.Any): XMLDocType = js.native
  def pent(name: java.lang.String, value: js.Any): XMLDocType = js.native
  def root(): XMLDocType = js.native
  def toString(options: XMLToStringOptions): java.lang.String = js.native
  def toString(options: XMLToStringOptions, level: stdLib.Number): java.lang.String = js.native
  def up(): XMLDocType = js.native
}

