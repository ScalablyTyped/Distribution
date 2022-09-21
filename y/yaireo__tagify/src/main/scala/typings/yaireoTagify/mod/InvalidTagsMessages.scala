package typings.yaireoTagify.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Messages for reasons if tag validation fails.
  */
trait InvalidTagsMessages extends StObject {
  
  /**
    * When a tag with the same value already exists and duplicates are not allowed.
    * @default 'already exists'
    */
  var duplicate: String
  
  /**
    * When a new tag is empty.
    * @default 'empty'
    */
  var empty: String
  
  /**
    * When the new tag cannot be added, because it would exceed the maximum number of allowed tags.
    * @default 'number of tags exceeded'
    */
  var exceed: String
  
  /**
    * When the new tag is not allowed for any other reason.
    * @default 'not allowed'
    */
  var notAllowed: String
  
  /**
    * When the new tag does not conform to the specified (regex) pattern.
    * @default 'pattern mismatch'
    */
  var pattern: String
}
object InvalidTagsMessages {
  
  inline def apply(duplicate: String, empty: String, exceed: String, notAllowed: String, pattern: String): InvalidTagsMessages = {
    val __obj = js.Dynamic.literal(duplicate = duplicate.asInstanceOf[js.Any], empty = empty.asInstanceOf[js.Any], exceed = exceed.asInstanceOf[js.Any], notAllowed = notAllowed.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidTagsMessages]
  }
  
  extension [Self <: InvalidTagsMessages](x: Self) {
    
    inline def setDuplicate(value: String): Self = StObject.set(x, "duplicate", value.asInstanceOf[js.Any])
    
    inline def setEmpty(value: String): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    inline def setExceed(value: String): Self = StObject.set(x, "exceed", value.asInstanceOf[js.Any])
    
    inline def setNotAllowed(value: String): Self = StObject.set(x, "notAllowed", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
  }
}
