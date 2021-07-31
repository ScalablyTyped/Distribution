package typings.winrt.Windows.Web.Syndication

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISyndicationAttributeFactory extends StObject {
  
  def createSyndicationAttribute(attributeName: String, attributeNamespace: String, attributeValue: String): SyndicationAttribute
}
object ISyndicationAttributeFactory {
  
  @scala.inline
  def apply(createSyndicationAttribute: (String, String, String) => SyndicationAttribute): ISyndicationAttributeFactory = {
    val __obj = js.Dynamic.literal(createSyndicationAttribute = js.Any.fromFunction3(createSyndicationAttribute))
    __obj.asInstanceOf[ISyndicationAttributeFactory]
  }
  
  @scala.inline
  implicit class ISyndicationAttributeFactoryMutableBuilder[Self <: ISyndicationAttributeFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateSyndicationAttribute(value: (String, String, String) => SyndicationAttribute): Self = StObject.set(x, "createSyndicationAttribute", js.Any.fromFunction3(value))
  }
}
