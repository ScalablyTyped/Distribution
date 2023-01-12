package typings.winrt.Windows.Web.Syndication

import typings.winrt.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISyndicationFeedFactory extends StObject {
  
  def createSyndicationFeed(title: String, subtitle: String, uri: Uri): SyndicationFeed
}
object ISyndicationFeedFactory {
  
  inline def apply(createSyndicationFeed: (String, String, Uri) => SyndicationFeed): ISyndicationFeedFactory = {
    val __obj = js.Dynamic.literal(createSyndicationFeed = js.Any.fromFunction3(createSyndicationFeed))
    __obj.asInstanceOf[ISyndicationFeedFactory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISyndicationFeedFactory] (val x: Self) extends AnyVal {
    
    inline def setCreateSyndicationFeed(value: (String, String, Uri) => SyndicationFeed): Self = StObject.set(x, "createSyndicationFeed", js.Any.fromFunction3(value))
  }
}
