package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Webpage metadata, such as the author and the title of the page. */
@js.native
trait AnalysisResultsMetadata extends StObject {
  
  /** The authors of the document. */
  var authors: js.UndefOr[js.Array[Author]] = js.native
  
  /** RSS/ATOM feeds found on the webpage. */
  var feeds: js.UndefOr[js.Array[Feed]] = js.native
  
  /** URL of a prominent image on the webpage. */
  var image: js.UndefOr[String] = js.native
  
  /** The publication date in the format ISO 8601. */
  var publication_date: js.UndefOr[String] = js.native
  
  /** The title of the document. */
  var title: js.UndefOr[String] = js.native
}
object AnalysisResultsMetadata {
  
  @scala.inline
  def apply(): AnalysisResultsMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalysisResultsMetadata]
  }
  
  @scala.inline
  implicit class AnalysisResultsMetadataMutableBuilder[Self <: AnalysisResultsMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthors(value: js.Array[Author]): Self = StObject.set(x, "authors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorsUndefined: Self = StObject.set(x, "authors", js.undefined)
    
    @scala.inline
    def setAuthorsVarargs(value: Author*): Self = StObject.set(x, "authors", js.Array(value :_*))
    
    @scala.inline
    def setFeeds(value: js.Array[Feed]): Self = StObject.set(x, "feeds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedsUndefined: Self = StObject.set(x, "feeds", js.undefined)
    
    @scala.inline
    def setFeedsVarargs(value: Feed*): Self = StObject.set(x, "feeds", js.Array(value :_*))
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
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
