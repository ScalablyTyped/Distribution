package typings.winrt.Windows.Web.Syndication

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISyndicationAttributeFactory extends StObject {
  
  def createSyndicationAttribute(attributeName: String, attributeNamespace: String, attributeValue: String): SyndicationAttribute
}
object ISyndicationAttributeFactory {
  
  inline def apply(createSyndicationAttribute: (String, String, String) => SyndicationAttribute): ISyndicationAttributeFactory = {
    val __obj = js.Dynamic.literal(createSyndicationAttribute = js.Any.fromFunction3(createSyndicationAttribute))
    __obj.asInstanceOf[ISyndicationAttributeFactory]
  }
  
  extension [Self <: ISyndicationAttributeFactory](x: Self) {
    
    inline def setCreateSyndicationAttribute(value: (String, String, String) => SyndicationAttribute): Self = StObject.set(x, "createSyndicationAttribute", js.Any.fromFunction3(value))
  }
}
