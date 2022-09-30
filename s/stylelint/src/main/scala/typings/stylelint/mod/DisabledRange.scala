package typings.stylelint.mod

import typings.postcss.mod.Comment_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisabledRange extends StObject {
  
  var comment: Comment_
  
  var description: js.UndefOr[String] = js.undefined
  
  var end: js.UndefOr[Double] = js.undefined
  
  var rules: js.UndefOr[js.Array[String]] = js.undefined
  
  var start: Double
  
  var strictEnd: js.UndefOr[Boolean] = js.undefined
  
  var strictStart: Boolean
}
object DisabledRange {
  
  inline def apply(comment: Comment_, start: Double, strictStart: Boolean): DisabledRange = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], strictStart = strictStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisabledRange]
  }
  
  extension [Self <: DisabledRange](x: Self) {
    
    inline def setComment(value: Comment_): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setRules(value: js.Array[String]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: String*): Self = StObject.set(x, "rules", js.Array(value*))
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStrictEnd(value: Boolean): Self = StObject.set(x, "strictEnd", value.asInstanceOf[js.Any])
    
    inline def setStrictEndUndefined: Self = StObject.set(x, "strictEnd", js.undefined)
    
    inline def setStrictStart(value: Boolean): Self = StObject.set(x, "strictStart", value.asInstanceOf[js.Any])
  }
}
