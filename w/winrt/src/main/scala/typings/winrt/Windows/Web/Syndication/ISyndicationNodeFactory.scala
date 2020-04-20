package typings.winrt.Windows.Web.Syndication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyndicationNodeFactory extends js.Object {
  def createSyndicationNode(nodeName: String, nodeNamespace: String, nodeValue: String): SyndicationNode
}

object ISyndicationNodeFactory {
  @scala.inline
  def apply(createSyndicationNode: (String, String, String) => SyndicationNode): ISyndicationNodeFactory = {
    val __obj = js.Dynamic.literal(createSyndicationNode = js.Any.fromFunction3(createSyndicationNode))
    __obj.asInstanceOf[ISyndicationNodeFactory]
  }
}

