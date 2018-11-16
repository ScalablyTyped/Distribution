package typings
package xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamespaceManager extends Collection[XmlNamespace] {
  def GetNamespace(namespaceUrl: java.lang.String): XmlNamespace | scala.Null = js.native
  def GetNamespace(namespaceUrl: java.lang.String, start: scala.Double): XmlNamespace | scala.Null = js.native
  def GetPrefix(prefix: java.lang.String): XmlNamespace | scala.Null = js.native
  def GetPrefix(prefix: java.lang.String, start: scala.Double): XmlNamespace | scala.Null = js.native
}

