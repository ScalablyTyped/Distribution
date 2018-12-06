package typings
package atXmppXmlLib.xmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@xmpp/xml", JSImport.Namespace)
@js.native
object xmlModMembers extends js.Object {
  val escapeXML: js.Function1[/* s */ java.lang.String, java.lang.String] = js.native
  val escapeXMLText: js.Function1[/* s */ java.lang.String, java.lang.String] = js.native
  val unescapeXML: js.Function1[/* s */ java.lang.String, java.lang.String] = js.native
  val unescapeXMLText: js.Function1[/* s */ java.lang.String, java.lang.String] = js.native
  def apply(name: java.lang.String): atXmppXmlLib.xmlMod.xmlNs.Element = js.native
  def apply(
    name: java.lang.String,
    attrs: java.lang.String | ScalablyTyped.runtime.StringDictionary[js.Any],
    children: atXmppXmlLib.xmlMod.xmlNs.ElementChild*
  ): atXmppXmlLib.xmlMod.xmlNs.Element = js.native
  def x(name: java.lang.String): atXmppXmlLib.xmlMod.xmlNs.Element = js.native
  def x(
    name: java.lang.String,
    attrs: ScalablyTyped.runtime.StringDictionary[js.Any],
    children: atXmppXmlLib.xmlMod.xmlNs.ElementChild*
  ): atXmppXmlLib.xmlMod.xmlNs.Element = js.native
  def x(name: java.lang.String, attrs: java.lang.String, children: atXmppXmlLib.xmlMod.xmlNs.ElementChild*): atXmppXmlLib.xmlMod.xmlNs.Element = js.native
}

