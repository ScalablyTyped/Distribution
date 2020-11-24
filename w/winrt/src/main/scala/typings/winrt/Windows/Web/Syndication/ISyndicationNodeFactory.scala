package typings.winrt.Windows.Web.Syndication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISyndicationNodeFactory extends js.Object {
  
  def createSyndicationNode(nodeName: String, nodeNamespace: String, nodeValue: String): SyndicationNode = js.native
}
object ISyndicationNodeFactory {
  
  @scala.inline
  def apply(createSyndicationNode: (String, String, String) => SyndicationNode): ISyndicationNodeFactory = {
    val __obj = js.Dynamic.literal(createSyndicationNode = js.Any.fromFunction3(createSyndicationNode))
    __obj.asInstanceOf[ISyndicationNodeFactory]
  }
  
  @scala.inline
  implicit class ISyndicationNodeFactoryOps[Self <: ISyndicationNodeFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateSyndicationNode(value: (String, String, String) => SyndicationNode): Self = this.set("createSyndicationNode", js.Any.fromFunction3(value))
  }
}
