package typings.xml.mod

import typings.node.NodeJS.ReadableStream
import typings.xml.anon.Indent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): String = js.native
  def apply(xmlObject: js.UndefOr[XmlObject], options: String): String = js.native
  def apply(xmlObject: js.UndefOr[XmlObject], options: Boolean): String = js.native
  def apply(xmlObject: js.UndefOr[XmlObject], options: Option): String = js.native
  def apply(xmlObject: js.Array[XmlObject]): String = js.native
  def apply(xmlObject: js.Array[XmlObject], options: String): String = js.native
  def apply(xmlObject: js.Array[XmlObject], options: Boolean): String = js.native
  def apply(xmlObject: js.Array[XmlObject], options: Indent): ReadableStream = js.native
  def apply(xmlObject: js.Array[XmlObject], options: Option): String = js.native
  def apply(xmlObject: XmlObject): String = js.native
  def apply(xmlObject: XmlObject, options: Indent): ReadableStream = js.native
}

