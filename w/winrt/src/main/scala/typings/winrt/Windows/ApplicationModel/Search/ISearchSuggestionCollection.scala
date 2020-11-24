package typings.winrt.Windows.ApplicationModel.Search

import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISearchSuggestionCollection extends js.Object {
  
  def appendQuerySuggestion(text: String): Unit = js.native
  
  def appendQuerySuggestions(suggestions: IIterable[String]): Unit = js.native
  
  def appendResultSuggestion(
    text: String,
    detailText: String,
    tag: String,
    image: IRandomAccessStreamReference,
    imageAlternateText: String
  ): Unit = js.native
  
  def appendSearchSeparator(label: String): Unit = js.native
  
  var size: Double = js.native
}
object ISearchSuggestionCollection {
  
  @scala.inline
  def apply(
    appendQuerySuggestion: String => Unit,
    appendQuerySuggestions: IIterable[String] => Unit,
    appendResultSuggestion: (String, String, String, IRandomAccessStreamReference, String) => Unit,
    appendSearchSeparator: String => Unit,
    size: Double
  ): ISearchSuggestionCollection = {
    val __obj = js.Dynamic.literal(appendQuerySuggestion = js.Any.fromFunction1(appendQuerySuggestion), appendQuerySuggestions = js.Any.fromFunction1(appendQuerySuggestions), appendResultSuggestion = js.Any.fromFunction5(appendResultSuggestion), appendSearchSeparator = js.Any.fromFunction1(appendSearchSeparator), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchSuggestionCollection]
  }
  
  @scala.inline
  implicit class ISearchSuggestionCollectionOps[Self <: ISearchSuggestionCollection] (val x: Self) extends AnyVal {
    
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
    def setAppendQuerySuggestion(value: String => Unit): Self = this.set("appendQuerySuggestion", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAppendQuerySuggestions(value: IIterable[String] => Unit): Self = this.set("appendQuerySuggestions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAppendResultSuggestion(value: (String, String, String, IRandomAccessStreamReference, String) => Unit): Self = this.set("appendResultSuggestion", js.Any.fromFunction5(value))
    
    @scala.inline
    def setAppendSearchSeparator(value: String => Unit): Self = this.set("appendSearchSeparator", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
}
