package typings.winrt.Windows.Web.Syndication

import typings.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISyndicationFeedFactory extends js.Object {
  
  def createSyndicationFeed(title: String, subtitle: String, uri: Uri): SyndicationFeed = js.native
}
object ISyndicationFeedFactory {
  
  @scala.inline
  def apply(createSyndicationFeed: (String, String, Uri) => SyndicationFeed): ISyndicationFeedFactory = {
    val __obj = js.Dynamic.literal(createSyndicationFeed = js.Any.fromFunction3(createSyndicationFeed))
    __obj.asInstanceOf[ISyndicationFeedFactory]
  }
  
  @scala.inline
  implicit class ISyndicationFeedFactoryOps[Self <: ISyndicationFeedFactory] (val x: Self) extends AnyVal {
    
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
    def setCreateSyndicationFeed(value: (String, String, Uri) => SyndicationFeed): Self = this.set("createSyndicationFeed", js.Any.fromFunction3(value))
  }
}
