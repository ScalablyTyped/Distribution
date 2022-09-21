package typings.webIe11

import typings.std.Node
import typings.std.NodeFilter
import typings.std.TreeWalker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Document extends StObject {
  
  def createTreeWalker(root: Node, whatToShow: Double, filter: Null, entityReferenceExpansion: Boolean): TreeWalker = js.native
  /**
    * Creates a TreeWalker object that you can use to traverse filtered lists of nodes or elements in a document.
    * @param root The root element or node to start traversing on.
    * @param whatToShow The type of nodes or elements to appear in the node list. For more information, see whatToShow.
    * @param filter A custom NodeFilter function to use.
    * @param entityReferenceExpansion A flag that specifies whether entity reference nodes are expanded. Required on IE11 and ignored on other browsers.
    */
  def createTreeWalker(root: Node, whatToShow: Double, filter: NodeFilter, entityReferenceExpansion: Boolean): TreeWalker = js.native
}
