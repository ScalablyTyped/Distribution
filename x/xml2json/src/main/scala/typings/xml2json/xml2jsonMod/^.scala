package typings.xml2json.xml2jsonMod

import typings.xml2json.Anon_False
import typings.xml2json.Anon_Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml2json", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def toJson(xml: String): js.Object = js.native
  def toJson(xml: String, options: Anon_Object with JsonOptions): js.Object = js.native
  def toJson(xml: String, options: Anon_False with JsonOptions): String = js.native
  @JSName("toJson")
  def toJson_String(xml: String): String = js.native
  def toXml(json: String): String = js.native
  def toXml(json: String, options: XmlOptions): String = js.native
  def toXml(json: js.Object): String = js.native
  def toXml(json: js.Object, options: XmlOptions): String = js.native
}

