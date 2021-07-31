package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The HTML converted from an input document. */
trait HTMLReturn extends StObject {
  
  /** The author of the input document, if identified. */
  var author: js.UndefOr[String] = js.undefined
  
  /** The HTML version of the input document. */
  var html: js.UndefOr[String] = js.undefined
  
  /** The number of pages in the input document. */
  var num_pages: js.UndefOr[String] = js.undefined
  
  /** The publication date of the input document, if identified. */
  var publication_date: js.UndefOr[String] = js.undefined
  
  /** The title of the input document, if identified. */
  var title: js.UndefOr[String] = js.undefined
}
object HTMLReturn {
  
  @scala.inline
  def apply(): HTMLReturn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLReturn]
  }
  
  @scala.inline
  implicit class HTMLReturnMutableBuilder[Self <: HTMLReturn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    @scala.inline
    def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    @scala.inline
    def setNum_pages(value: String): Self = StObject.set(x, "num_pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNum_pagesUndefined: Self = StObject.set(x, "num_pages", js.undefined)
    
    @scala.inline
    def setPublication_date(value: String): Self = StObject.set(x, "publication_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublication_dateUndefined: Self = StObject.set(x, "publication_date", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
