package typings.xlsx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Properties extends StObject {
  
  /** Summary tab "Author" */
  var Author: js.UndefOr[String] = js.undefined
  
  /** Summary tab "Category" */
  var Category: js.UndefOr[String] = js.undefined
  
  /** Summary tab "Comments" */
  var Comments: js.UndefOr[String] = js.undefined
  
  /** Summary tab "Company" */
  var Company: js.UndefOr[String] = js.undefined
  
  /** Statistics tab "Created" */
  var CreatedDate: js.UndefOr[js.Date] = js.undefined
  
  /** Summary tab "Keywords" */
  var Keywords: js.UndefOr[String] = js.undefined
  
  /** Statistics tab "Last saved by" */
  var LastAuthor: js.UndefOr[String] = js.undefined
  
  /** Summary tab "Manager" */
  var Manager: js.UndefOr[String] = js.undefined
  
  /** Summary tab "Subject" */
  var Subject: js.UndefOr[String] = js.undefined
  
  /** Summary tab "Title" */
  var Title: js.UndefOr[String] = js.undefined
}
object Properties {
  
  inline def apply(): Properties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Properties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Properties] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: String): Self = StObject.set(x, "Author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "Author", js.undefined)
    
    inline def setCategory(value: String): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "Category", js.undefined)
    
    inline def setComments(value: String): Self = StObject.set(x, "Comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsUndefined: Self = StObject.set(x, "Comments", js.undefined)
    
    inline def setCompany(value: String): Self = StObject.set(x, "Company", value.asInstanceOf[js.Any])
    
    inline def setCompanyUndefined: Self = StObject.set(x, "Company", js.undefined)
    
    inline def setCreatedDate(value: js.Date): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    inline def setKeywords(value: String): Self = StObject.set(x, "Keywords", value.asInstanceOf[js.Any])
    
    inline def setKeywordsUndefined: Self = StObject.set(x, "Keywords", js.undefined)
    
    inline def setLastAuthor(value: String): Self = StObject.set(x, "LastAuthor", value.asInstanceOf[js.Any])
    
    inline def setLastAuthorUndefined: Self = StObject.set(x, "LastAuthor", js.undefined)
    
    inline def setManager(value: String): Self = StObject.set(x, "Manager", value.asInstanceOf[js.Any])
    
    inline def setManagerUndefined: Self = StObject.set(x, "Manager", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "Subject", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
  }
}
