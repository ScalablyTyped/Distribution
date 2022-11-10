package typings.webix.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BeginsWith extends StObject {
  
  var beginsWith: String
  
  var between: String
  
  var contains: String
  
  var endsWith: String
  
  var equal: String
  
  var greater: String
  
  var greaterOrEqual: String
  
  var less: String
  
  var lessOrEqual: String
  
  var notBeginsWith: String
  
  var notBetween: String
  
  var notContains: String
  
  var notEndsWith: String
  
  var notEqual: String
}
object BeginsWith {
  
  inline def apply(
    beginsWith: String,
    between: String,
    contains: String,
    endsWith: String,
    equal: String,
    greater: String,
    greaterOrEqual: String,
    less: String,
    lessOrEqual: String,
    notBeginsWith: String,
    notBetween: String,
    notContains: String,
    notEndsWith: String,
    notEqual: String
  ): BeginsWith = {
    val __obj = js.Dynamic.literal(beginsWith = beginsWith.asInstanceOf[js.Any], between = between.asInstanceOf[js.Any], contains = contains.asInstanceOf[js.Any], endsWith = endsWith.asInstanceOf[js.Any], equal = equal.asInstanceOf[js.Any], greater = greater.asInstanceOf[js.Any], greaterOrEqual = greaterOrEqual.asInstanceOf[js.Any], less = less.asInstanceOf[js.Any], lessOrEqual = lessOrEqual.asInstanceOf[js.Any], notBeginsWith = notBeginsWith.asInstanceOf[js.Any], notBetween = notBetween.asInstanceOf[js.Any], notContains = notContains.asInstanceOf[js.Any], notEndsWith = notEndsWith.asInstanceOf[js.Any], notEqual = notEqual.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeginsWith]
  }
  
  extension [Self <: BeginsWith](x: Self) {
    
    inline def setBeginsWith(value: String): Self = StObject.set(x, "beginsWith", value.asInstanceOf[js.Any])
    
    inline def setBetween(value: String): Self = StObject.set(x, "between", value.asInstanceOf[js.Any])
    
    inline def setContains(value: String): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
    
    inline def setEndsWith(value: String): Self = StObject.set(x, "endsWith", value.asInstanceOf[js.Any])
    
    inline def setEqual(value: String): Self = StObject.set(x, "equal", value.asInstanceOf[js.Any])
    
    inline def setGreater(value: String): Self = StObject.set(x, "greater", value.asInstanceOf[js.Any])
    
    inline def setGreaterOrEqual(value: String): Self = StObject.set(x, "greaterOrEqual", value.asInstanceOf[js.Any])
    
    inline def setLess(value: String): Self = StObject.set(x, "less", value.asInstanceOf[js.Any])
    
    inline def setLessOrEqual(value: String): Self = StObject.set(x, "lessOrEqual", value.asInstanceOf[js.Any])
    
    inline def setNotBeginsWith(value: String): Self = StObject.set(x, "notBeginsWith", value.asInstanceOf[js.Any])
    
    inline def setNotBetween(value: String): Self = StObject.set(x, "notBetween", value.asInstanceOf[js.Any])
    
    inline def setNotContains(value: String): Self = StObject.set(x, "notContains", value.asInstanceOf[js.Any])
    
    inline def setNotEndsWith(value: String): Self = StObject.set(x, "notEndsWith", value.asInstanceOf[js.Any])
    
    inline def setNotEqual(value: String): Self = StObject.set(x, "notEqual", value.asInstanceOf[js.Any])
  }
}
