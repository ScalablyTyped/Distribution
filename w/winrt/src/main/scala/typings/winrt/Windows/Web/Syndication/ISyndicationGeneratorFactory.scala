package typings.winrt.Windows.Web.Syndication

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISyndicationGeneratorFactory extends StObject {
  
  def createSyndicationGenerator(text: String): SyndicationGenerator
}
object ISyndicationGeneratorFactory {
  
  inline def apply(createSyndicationGenerator: String => SyndicationGenerator): ISyndicationGeneratorFactory = {
    val __obj = js.Dynamic.literal(createSyndicationGenerator = js.Any.fromFunction1(createSyndicationGenerator))
    __obj.asInstanceOf[ISyndicationGeneratorFactory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISyndicationGeneratorFactory] (val x: Self) extends AnyVal {
    
    inline def setCreateSyndicationGenerator(value: String => SyndicationGenerator): Self = StObject.set(x, "createSyndicationGenerator", js.Any.fromFunction1(value))
  }
}
