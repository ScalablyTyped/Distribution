package typings.xml.xmlMod

import typings.node.NodeJSNs.ReadableStream
import typings.xml.Anon_Indent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): String = js.native
  def apply(xmlObject: XmlObject | js.Array[XmlObject]): String = js.native
  def apply(xmlObject: XmlObject | js.Array[XmlObject], options: Boolean | String | Option): String = js.native
  def apply(xmlObject: XmlObject | js.Array[XmlObject], options: Anon_Indent): ReadableStream = js.native
  def Element(xmlObjects: XmlObject*): ElementObject = js.native
  def element(xmlObjects: XmlObject*): ElementObject = js.native
}

