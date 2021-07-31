package typings.winrt.Windows.ApplicationModel.Search

import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Storage.Streams.IRandomAccessStreamReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISearchSuggestionCollection extends StObject {
  
  def appendQuerySuggestion(text: String): Unit
  
  def appendQuerySuggestions(suggestions: IIterable[String]): Unit
  
  def appendResultSuggestion(
    text: String,
    detailText: String,
    tag: String,
    image: IRandomAccessStreamReference,
    imageAlternateText: String
  ): Unit
  
  def appendSearchSeparator(label: String): Unit
  
  var size: Double
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
  implicit class ISearchSuggestionCollectionMutableBuilder[Self <: ISearchSuggestionCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppendQuerySuggestion(value: String => Unit): Self = StObject.set(x, "appendQuerySuggestion", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAppendQuerySuggestions(value: IIterable[String] => Unit): Self = StObject.set(x, "appendQuerySuggestions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAppendResultSuggestion(value: (String, String, String, IRandomAccessStreamReference, String) => Unit): Self = StObject.set(x, "appendResultSuggestion", js.Any.fromFunction5(value))
    
    @scala.inline
    def setAppendSearchSeparator(value: String => Unit): Self = StObject.set(x, "appendSearchSeparator", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
