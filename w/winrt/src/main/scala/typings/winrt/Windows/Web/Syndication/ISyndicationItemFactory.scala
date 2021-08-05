package typings.winrt.Windows.Web.Syndication

import typings.winrt.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISyndicationItemFactory extends StObject {
  
  def createSyndicationItem(title: String, content: SyndicationContent, uri: Uri): SyndicationItem
}
object ISyndicationItemFactory {
  
  inline def apply(createSyndicationItem: (String, SyndicationContent, Uri) => SyndicationItem): ISyndicationItemFactory = {
    val __obj = js.Dynamic.literal(createSyndicationItem = js.Any.fromFunction3(createSyndicationItem))
    __obj.asInstanceOf[ISyndicationItemFactory]
  }
  
  extension [Self <: ISyndicationItemFactory](x: Self) {
    
    inline def setCreateSyndicationItem(value: (String, SyndicationContent, Uri) => SyndicationItem): Self = StObject.set(x, "createSyndicationItem", js.Any.fromFunction3(value))
  }
}
