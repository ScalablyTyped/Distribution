package typings.winrt.Windows.Web.Syndication

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISyndicationNodeFactory extends StObject {
  
  def createSyndicationNode(nodeName: String, nodeNamespace: String, nodeValue: String): SyndicationNode
}
object ISyndicationNodeFactory {
  
  inline def apply(createSyndicationNode: (String, String, String) => SyndicationNode): ISyndicationNodeFactory = {
    val __obj = js.Dynamic.literal(createSyndicationNode = js.Any.fromFunction3(createSyndicationNode))
    __obj.asInstanceOf[ISyndicationNodeFactory]
  }
  
  extension [Self <: ISyndicationNodeFactory](x: Self) {
    
    inline def setCreateSyndicationNode(value: (String, String, String) => SyndicationNode): Self = StObject.set(x, "createSyndicationNode", js.Any.fromFunction3(value))
  }
}
