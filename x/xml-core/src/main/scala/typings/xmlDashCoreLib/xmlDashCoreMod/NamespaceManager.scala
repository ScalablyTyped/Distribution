package typings
package xmlDashCoreLib.xmlDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml-core", "NamespaceManager")
@js.native
class NamespaceManager () extends Collection[XmlNamespace] {
  def GetNamespace(namespaceUrl: java.lang.String): XmlNamespace | scala.Null = js.native
  def GetNamespace(namespaceUrl: java.lang.String, start: scala.Double): XmlNamespace | scala.Null = js.native
  def GetPrefix(prefix: java.lang.String): XmlNamespace | scala.Null = js.native
  def GetPrefix(prefix: java.lang.String, start: scala.Double): XmlNamespace | scala.Null = js.native
}

