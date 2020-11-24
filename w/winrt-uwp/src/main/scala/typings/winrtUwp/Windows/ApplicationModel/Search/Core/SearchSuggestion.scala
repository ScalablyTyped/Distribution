package typings.winrtUwp.Windows.ApplicationModel.Search.Core

import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables access to the search suggestions that the SearchSuggestionManager provides. */
@js.native
trait SearchSuggestion extends js.Object {
  
  /** Gets the value that was passed to the detailText parameter of the AppendResultSuggestion method. */
  var detailText: String = js.native
  
  /** Gets the value that was passed to the image parameter of the AppendResultSuggestion method. */
  var image: IRandomAccessStreamReference = js.native
  
  /** Gets the value that was passed to the imageAlternateText parameter of the AppendResultSuggestion method. */
  var imageAlternateText: String = js.native
  
  /** Gets the type of suggestion. */
  var kind: SearchSuggestionKind = js.native
  
  /** Gets the value that was passed to the tag parameter of the AppendResultSuggestion method. */
  var tag: String = js.native
  
  /** Gets the localized text of the suggestion for display in the search suggestions UI. */
  var text: String = js.native
}
object SearchSuggestion {
  
  @scala.inline
  def apply(
    detailText: String,
    image: IRandomAccessStreamReference,
    imageAlternateText: String,
    kind: SearchSuggestionKind,
    tag: String,
    text: String
  ): SearchSuggestion = {
    val __obj = js.Dynamic.literal(detailText = detailText.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], imageAlternateText = imageAlternateText.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSuggestion]
  }
  
  @scala.inline
  implicit class SearchSuggestionOps[Self <: SearchSuggestion] (val x: Self) extends AnyVal {
    
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
    def setDetailText(value: String): Self = this.set("detailText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: IRandomAccessStreamReference): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageAlternateText(value: String): Self = this.set("imageAlternateText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: SearchSuggestionKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
}
