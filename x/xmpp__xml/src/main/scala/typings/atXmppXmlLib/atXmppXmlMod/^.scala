package typings
package atXmppXmlLib.atXmppXmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@xmpp/xml", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val escapeXML: js.Function1[/* s */ java.lang.String, java.lang.String] = js.native
  val escapeXMLText: js.Function1[/* s */ java.lang.String, java.lang.String] = js.native
  val unescapeXML: js.Function1[/* s */ java.lang.String, java.lang.String] = js.native
  val unescapeXMLText: js.Function1[/* s */ java.lang.String, java.lang.String] = js.native
  def apply(name: java.lang.String): Element = js.native
  def apply(
    name: java.lang.String,
    attrs: java.lang.String | org.scalablytyped.runtime.StringDictionary[js.Any],
    children: ElementChild*
  ): Element = js.native
  def x(name: java.lang.String): Element = js.native
  def x(name: java.lang.String, attrs: java.lang.String, children: ElementChild*): Element = js.native
  def x(
    name: java.lang.String,
    attrs: org.scalablytyped.runtime.StringDictionary[js.Any],
    children: ElementChild*
  ): Element = js.native
}

