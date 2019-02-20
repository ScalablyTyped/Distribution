package typings
package xml2jsonLib.xml2jsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml2json", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def toJson(xml: java.lang.String): js.Object = js.native
  def toJson(xml: java.lang.String, options: xml2jsonLib.Anon_Object with xml2jsonLib.xml2jsonMod.JsonOptions): js.Object = js.native
  def toJson(xml: java.lang.String, options: xml2jsonLib.Anon_False with xml2jsonLib.xml2jsonMod.JsonOptions): java.lang.String = js.native
  @JSName("toJson")
  def toJson_String(xml: java.lang.String): java.lang.String = js.native
  def toXml(json: java.lang.String): java.lang.String = js.native
  def toXml(json: java.lang.String, options: xml2jsonLib.xml2jsonMod.XmlOptions): java.lang.String = js.native
  def toXml(json: js.Object): java.lang.String = js.native
  def toXml(json: js.Object, options: xml2jsonLib.xml2jsonMod.XmlOptions): java.lang.String = js.native
}

