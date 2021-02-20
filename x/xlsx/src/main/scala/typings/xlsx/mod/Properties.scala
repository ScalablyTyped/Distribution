package typings.xlsx.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Properties extends StObject {
  
  /** Summary tab "Author" */
  var Author: js.UndefOr[String] = js.native
  
  /** Summary tab "Category" */
  var Category: js.UndefOr[String] = js.native
  
  /** Summary tab "Comments" */
  var Comments: js.UndefOr[String] = js.native
  
  /** Summary tab "Company" */
  var Company: js.UndefOr[String] = js.native
  
  /** Statistics tab "Created" */
  var CreatedDate: js.UndefOr[Date] = js.native
  
  /** Summary tab "Keywords" */
  var Keywords: js.UndefOr[String] = js.native
  
  /** Statistics tab "Last saved by" */
  var LastAuthor: js.UndefOr[String] = js.native
  
  /** Summary tab "Manager" */
  var Manager: js.UndefOr[String] = js.native
  
  /** Summary tab "Subject" */
  var Subject: js.UndefOr[String] = js.native
  
  /** Summary tab "Title" */
  var Title: js.UndefOr[String] = js.native
}
object Properties {
  
  @scala.inline
  def apply(): Properties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Properties]
  }
  
  @scala.inline
  implicit class PropertiesMutableBuilder[Self <: Properties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: String): Self = StObject.set(x, "Author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorUndefined: Self = StObject.set(x, "Author", js.undefined)
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "Category", js.undefined)
    
    @scala.inline
    def setComments(value: String): Self = StObject.set(x, "Comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "Comments", js.undefined)
    
    @scala.inline
    def setCompany(value: String): Self = StObject.set(x, "Company", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanyUndefined: Self = StObject.set(x, "Company", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: Date): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    @scala.inline
    def setKeywords(value: String): Self = StObject.set(x, "Keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordsUndefined: Self = StObject.set(x, "Keywords", js.undefined)
    
    @scala.inline
    def setLastAuthor(value: String): Self = StObject.set(x, "LastAuthor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastAuthorUndefined: Self = StObject.set(x, "LastAuthor", js.undefined)
    
    @scala.inline
    def setManager(value: String): Self = StObject.set(x, "Manager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagerUndefined: Self = StObject.set(x, "Manager", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "Subject", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
  }
}
