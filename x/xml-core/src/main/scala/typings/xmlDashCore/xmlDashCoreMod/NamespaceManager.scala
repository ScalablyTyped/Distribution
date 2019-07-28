package typings.xmlDashCore.xmlDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml-core", "NamespaceManager")
@js.native
class NamespaceManager () extends Collection[XmlNamespace] {
  def GetNamespace(namespaceUrl: String): XmlNamespace | Null = js.native
  def GetNamespace(namespaceUrl: String, start: Double): XmlNamespace | Null = js.native
  def GetPrefix(prefix: String): XmlNamespace | Null = js.native
  def GetPrefix(prefix: String, start: Double): XmlNamespace | Null = js.native
}

