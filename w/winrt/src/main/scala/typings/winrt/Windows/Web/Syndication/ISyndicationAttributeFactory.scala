package typings.winrt.Windows.Web.Syndication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISyndicationAttributeFactory extends js.Object {
  
  def createSyndicationAttribute(attributeName: String, attributeNamespace: String, attributeValue: String): SyndicationAttribute = js.native
}
object ISyndicationAttributeFactory {
  
  @scala.inline
  def apply(createSyndicationAttribute: (String, String, String) => SyndicationAttribute): ISyndicationAttributeFactory = {
    val __obj = js.Dynamic.literal(createSyndicationAttribute = js.Any.fromFunction3(createSyndicationAttribute))
    __obj.asInstanceOf[ISyndicationAttributeFactory]
  }
  
  @scala.inline
  implicit class ISyndicationAttributeFactoryOps[Self <: ISyndicationAttributeFactory] (val x: Self) extends AnyVal {
    
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
    def setCreateSyndicationAttribute(value: (String, String, String) => SyndicationAttribute): Self = this.set("createSyndicationAttribute", js.Any.fromFunction3(value))
  }
}
