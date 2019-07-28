package typings.atXmppXml.atXmppXmlMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@xmpp/xml", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val escapeXML: js.Function1[/* s */ String, String] = js.native
  val escapeXMLText: js.Function1[/* s */ String, String] = js.native
  val unescapeXML: js.Function1[/* s */ String, String] = js.native
  val unescapeXMLText: js.Function1[/* s */ String, String] = js.native
  def apply(name: String): Element = js.native
  def apply(name: String, attrs: String | StringDictionary[js.Any], children: ElementChild*): Element = js.native
  def x(name: String): Element = js.native
  def x(name: String, attrs: String, children: ElementChild*): Element = js.native
  def x(name: String, attrs: StringDictionary[js.Any], children: ElementChild*): Element = js.native
}

