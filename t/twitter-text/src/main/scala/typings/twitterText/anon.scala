package typings.twitterText

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait End extends StObject {
    
    var end: Double
    
    var start: Double
    
    var weight: Double
  }
  object End {
    
    inline def apply(end: Double, start: Double, weight: Double): End = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: End] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExtractUrlsWithoutProtocol extends StObject {
    
    var extractUrlsWithoutProtocol: Boolean
  }
  object ExtractUrlsWithoutProtocol {
    
    inline def apply(extractUrlsWithoutProtocol: Boolean): ExtractUrlsWithoutProtocol = {
      val __obj = js.Dynamic.literal(extractUrlsWithoutProtocol = extractUrlsWithoutProtocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtractUrlsWithoutProtocol]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExtractUrlsWithoutProtocol] (val x: Self) extends AnyVal {
      
      inline def setExtractUrlsWithoutProtocol(value: Boolean): Self = StObject.set(x, "extractUrlsWithoutProtocol", value.asInstanceOf[js.Any])
    }
  }
  
  trait Tag extends StObject {
    
    var tag: String
  }
  object Tag {
    
    inline def apply(tag: String): Tag = {
      val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tag]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Tag] (val x: Self) extends AnyVal {
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
}
