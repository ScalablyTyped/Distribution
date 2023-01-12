package typings.xssFilters

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XSSFilters extends StObject {
  
  def inDoubleQuotedAttr(s: String): String
  
  def inHTMLComment(s: String): String
  
  def inHTMLData(s: String): String
  
  def inSingleQuotedAttr(s: String): String
  
  def inUnQuotedAttr(s: String): String
  
  def uriComponentInDoubleQuotedAttr(s: String): String
  
  def uriComponentInHTMLComment(s: String): String
  
  def uriComponentInHTMLData(s: String): String
  
  def uriComponentInSingleQuotedAttr(s: String): String
  
  def uriComponentInUnQuotedAttr(s: String): String
  
  def uriFragmentInDoubleQuotedAttr(s: String): String
  
  def uriFragmentInHTMLComment(s: String): String
  
  def uriFragmentInHTMLData(s: String): String
  
  def uriFragmentInSingleQuotedAttr(s: String): String
  
  def uriFragmentInUnQuotedAttr(s: String): String
  
  def uriInDoubleQuotedAttr(s: String): String
  
  def uriInHTMLComment(s: String): String
  
  def uriInHTMLData(s: String): String
  
  def uriInSingleQuotedAttr(s: String): String
  
  def uriInUnQuotedAttr(s: String): String
  
  def uriPathInDoubleQuotedAttr(s: String): String
  
  def uriPathInHTMLComment(s: String): String
  
  def uriPathInHTMLData(s: String): String
  
  def uriPathInSingleQuotedAttr(s: String): String
  
  def uriPathInUnQuotedAttr(s: String): String
  
  def uriQueryInDoubleQuotedAttr(s: String): String
  
  def uriQueryInHTMLComment(s: String): String
  
  def uriQueryInHTMLData(s: String): String
  
  def uriQueryInSingleQuotedAttr(s: String): String
  
  def uriQueryInUnQuotedAttr(s: String): String
}
object XSSFilters {
  
  inline def apply(
    inDoubleQuotedAttr: String => String,
    inHTMLComment: String => String,
    inHTMLData: String => String,
    inSingleQuotedAttr: String => String,
    inUnQuotedAttr: String => String,
    uriComponentInDoubleQuotedAttr: String => String,
    uriComponentInHTMLComment: String => String,
    uriComponentInHTMLData: String => String,
    uriComponentInSingleQuotedAttr: String => String,
    uriComponentInUnQuotedAttr: String => String,
    uriFragmentInDoubleQuotedAttr: String => String,
    uriFragmentInHTMLComment: String => String,
    uriFragmentInHTMLData: String => String,
    uriFragmentInSingleQuotedAttr: String => String,
    uriFragmentInUnQuotedAttr: String => String,
    uriInDoubleQuotedAttr: String => String,
    uriInHTMLComment: String => String,
    uriInHTMLData: String => String,
    uriInSingleQuotedAttr: String => String,
    uriInUnQuotedAttr: String => String,
    uriPathInDoubleQuotedAttr: String => String,
    uriPathInHTMLComment: String => String,
    uriPathInHTMLData: String => String,
    uriPathInSingleQuotedAttr: String => String,
    uriPathInUnQuotedAttr: String => String,
    uriQueryInDoubleQuotedAttr: String => String,
    uriQueryInHTMLComment: String => String,
    uriQueryInHTMLData: String => String,
    uriQueryInSingleQuotedAttr: String => String,
    uriQueryInUnQuotedAttr: String => String
  ): XSSFilters = {
    val __obj = js.Dynamic.literal(inDoubleQuotedAttr = js.Any.fromFunction1(inDoubleQuotedAttr), inHTMLComment = js.Any.fromFunction1(inHTMLComment), inHTMLData = js.Any.fromFunction1(inHTMLData), inSingleQuotedAttr = js.Any.fromFunction1(inSingleQuotedAttr), inUnQuotedAttr = js.Any.fromFunction1(inUnQuotedAttr), uriComponentInDoubleQuotedAttr = js.Any.fromFunction1(uriComponentInDoubleQuotedAttr), uriComponentInHTMLComment = js.Any.fromFunction1(uriComponentInHTMLComment), uriComponentInHTMLData = js.Any.fromFunction1(uriComponentInHTMLData), uriComponentInSingleQuotedAttr = js.Any.fromFunction1(uriComponentInSingleQuotedAttr), uriComponentInUnQuotedAttr = js.Any.fromFunction1(uriComponentInUnQuotedAttr), uriFragmentInDoubleQuotedAttr = js.Any.fromFunction1(uriFragmentInDoubleQuotedAttr), uriFragmentInHTMLComment = js.Any.fromFunction1(uriFragmentInHTMLComment), uriFragmentInHTMLData = js.Any.fromFunction1(uriFragmentInHTMLData), uriFragmentInSingleQuotedAttr = js.Any.fromFunction1(uriFragmentInSingleQuotedAttr), uriFragmentInUnQuotedAttr = js.Any.fromFunction1(uriFragmentInUnQuotedAttr), uriInDoubleQuotedAttr = js.Any.fromFunction1(uriInDoubleQuotedAttr), uriInHTMLComment = js.Any.fromFunction1(uriInHTMLComment), uriInHTMLData = js.Any.fromFunction1(uriInHTMLData), uriInSingleQuotedAttr = js.Any.fromFunction1(uriInSingleQuotedAttr), uriInUnQuotedAttr = js.Any.fromFunction1(uriInUnQuotedAttr), uriPathInDoubleQuotedAttr = js.Any.fromFunction1(uriPathInDoubleQuotedAttr), uriPathInHTMLComment = js.Any.fromFunction1(uriPathInHTMLComment), uriPathInHTMLData = js.Any.fromFunction1(uriPathInHTMLData), uriPathInSingleQuotedAttr = js.Any.fromFunction1(uriPathInSingleQuotedAttr), uriPathInUnQuotedAttr = js.Any.fromFunction1(uriPathInUnQuotedAttr), uriQueryInDoubleQuotedAttr = js.Any.fromFunction1(uriQueryInDoubleQuotedAttr), uriQueryInHTMLComment = js.Any.fromFunction1(uriQueryInHTMLComment), uriQueryInHTMLData = js.Any.fromFunction1(uriQueryInHTMLData), uriQueryInSingleQuotedAttr = js.Any.fromFunction1(uriQueryInSingleQuotedAttr), uriQueryInUnQuotedAttr = js.Any.fromFunction1(uriQueryInUnQuotedAttr))
    __obj.asInstanceOf[XSSFilters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XSSFilters] (val x: Self) extends AnyVal {
    
    inline def setInDoubleQuotedAttr(value: String => String): Self = StObject.set(x, "inDoubleQuotedAttr", js.Any.fromFunction1(value))
    
    inline def setInHTMLComment(value: String => String): Self = StObject.set(x, "inHTMLComment", js.Any.fromFunction1(value))
    
    inline def setInHTMLData(value: String => String): Self = StObject.set(x, "inHTMLData", js.Any.fromFunction1(value))
    
    inline def setInSingleQuotedAttr(value: String => String): Self = StObject.set(x, "inSingleQuotedAttr", js.Any.fromFunction1(value))
    
    inline def setInUnQuotedAttr(value: String => String): Self = StObject.set(x, "inUnQuotedAttr", js.Any.fromFunction1(value))
    
    inline def setUriComponentInDoubleQuotedAttr(value: String => String): Self = StObject.set(x, "uriComponentInDoubleQuotedAttr", js.Any.fromFunction1(value))
    
    inline def setUriComponentInHTMLComment(value: String => String): Self = StObject.set(x, "uriComponentInHTMLComment", js.Any.fromFunction1(value))
    
    inline def setUriComponentInHTMLData(value: String => String): Self = StObject.set(x, "uriComponentInHTMLData", js.Any.fromFunction1(value))
    
    inline def setUriComponentInSingleQuotedAttr(value: String => String): Self = StObject.set(x, "uriComponentInSingleQuotedAttr", js.Any.fromFunction1(value))
    
    inline def setUriComponentInUnQuotedAttr(value: String => String): Self = StObject.set(x, "uriComponentInUnQuotedAttr", js.Any.fromFunction1(value))
    
    inline def setUriFragmentInDoubleQuotedAttr(value: String => String): Self = StObject.set(x, "uriFragmentInDoubleQuotedAttr", js.Any.fromFunction1(value))
    
    inline def setUriFragmentInHTMLComment(value: String => String): Self = StObject.set(x, "uriFragmentInHTMLComment", js.Any.fromFunction1(value))
    
    inline def setUriFragmentInHTMLData(value: String => String): Self = StObject.set(x, "uriFragmentInHTMLData", js.Any.fromFunction1(value))
    
    inline def setUriFragmentInSingleQuotedAttr(value: String => String): Self = StObject.set(x, "uriFragmentInSingleQuotedAttr", js.Any.fromFunction1(value))
    
    inline def setUriFragmentInUnQuotedAttr(value: String => String): Self = StObject.set(x, "uriFragmentInUnQuotedAttr", js.Any.fromFunction1(value))
    
    inline def setUriInDoubleQuotedAttr(value: String => String): Self = StObject.set(x, "uriInDoubleQuotedAttr", js.Any.fromFunction1(value))
    
    inline def setUriInHTMLComment(value: String => String): Self = StObject.set(x, "uriInHTMLComment", js.Any.fromFunction1(value))
    
    inline def setUriInHTMLData(value: String => String): Self = StObject.set(x, "uriInHTMLData", js.Any.fromFunction1(value))
    
    inline def setUriInSingleQuotedAttr(value: String => String): Self = StObject.set(x, "uriInSingleQuotedAttr", js.Any.fromFunction1(value))
    
    inline def setUriInUnQuotedAttr(value: String => String): Self = StObject.set(x, "uriInUnQuotedAttr", js.Any.fromFunction1(value))
    
    inline def setUriPathInDoubleQuotedAttr(value: String => String): Self = StObject.set(x, "uriPathInDoubleQuotedAttr", js.Any.fromFunction1(value))
    
    inline def setUriPathInHTMLComment(value: String => String): Self = StObject.set(x, "uriPathInHTMLComment", js.Any.fromFunction1(value))
    
    inline def setUriPathInHTMLData(value: String => String): Self = StObject.set(x, "uriPathInHTMLData", js.Any.fromFunction1(value))
    
    inline def setUriPathInSingleQuotedAttr(value: String => String): Self = StObject.set(x, "uriPathInSingleQuotedAttr", js.Any.fromFunction1(value))
    
    inline def setUriPathInUnQuotedAttr(value: String => String): Self = StObject.set(x, "uriPathInUnQuotedAttr", js.Any.fromFunction1(value))
    
    inline def setUriQueryInDoubleQuotedAttr(value: String => String): Self = StObject.set(x, "uriQueryInDoubleQuotedAttr", js.Any.fromFunction1(value))
    
    inline def setUriQueryInHTMLComment(value: String => String): Self = StObject.set(x, "uriQueryInHTMLComment", js.Any.fromFunction1(value))
    
    inline def setUriQueryInHTMLData(value: String => String): Self = StObject.set(x, "uriQueryInHTMLData", js.Any.fromFunction1(value))
    
    inline def setUriQueryInSingleQuotedAttr(value: String => String): Self = StObject.set(x, "uriQueryInSingleQuotedAttr", js.Any.fromFunction1(value))
    
    inline def setUriQueryInUnQuotedAttr(value: String => String): Self = StObject.set(x, "uriQueryInUnQuotedAttr", js.Any.fromFunction1(value))
  }
}
