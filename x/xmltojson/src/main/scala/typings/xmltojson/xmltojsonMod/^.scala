package typings.xmltojson.xmltojsonMod

import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmltojson", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def grokType(sValue: js.Any): js.Any = js.native
  def parseString(xmlString: String, opt: Options): js.Object = js.native
  def parseXml(oXMLParent: Document, opt: Options): js.Object = js.native
  def stringToXml(xmlString: String): Document = js.native
  def xmlToString(xmlDoc: Document): String = js.native
}

