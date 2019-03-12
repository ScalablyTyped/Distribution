package typings
package winrtLib.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyndicationNodeFactory extends js.Object {
  def createSyndicationNode(nodeName: java.lang.String, nodeNamespace: java.lang.String, nodeValue: java.lang.String): SyndicationNode
}

object ISyndicationNodeFactory {
  @scala.inline
  def apply(createSyndicationNode: (java.lang.String, java.lang.String, java.lang.String) => SyndicationNode): ISyndicationNodeFactory = {
    val __obj = js.Dynamic.literal(createSyndicationNode = js.Any.fromFunction3(createSyndicationNode))
  
    __obj.asInstanceOf[ISyndicationNodeFactory]
  }
}

