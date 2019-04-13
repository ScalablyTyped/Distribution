package typings
package xmltojsonLib.xmltojsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmltojson", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def grokType(sValue: js.Any): js.Any = js.native
  def parseString(xmlString: java.lang.String, opt: Options): js.Object = js.native
  def parseXml(oXMLParent: stdLib.Document, opt: Options): js.Object = js.native
  def stringToXml(xmlString: java.lang.String): stdLib.Document = js.native
  def xmlToString(xmlDoc: stdLib.Document): java.lang.String = js.native
}

