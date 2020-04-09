package typings.xmlCore

import typings.xmlCore.collectionMod.Collection
import typings.xmlCore.typesMod.XmlNamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xml-core/dist/types/namespace_manager", JSImport.Namespace)
@js.native
object namespaceManagerMod extends js.Object {
  @js.native
  class NamespaceManager () extends Collection[XmlNamespace] {
    def GetNamespace(namespaceUrl: String): XmlNamespace | Null = js.native
    def GetNamespace(namespaceUrl: String, start: Double): XmlNamespace | Null = js.native
    def GetPrefix(prefix: String): XmlNamespace | Null = js.native
    def GetPrefix(prefix: String, start: Double): XmlNamespace | Null = js.native
  }
  
}

