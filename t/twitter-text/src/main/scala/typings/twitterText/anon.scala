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
    
    extension [Self <: End](x: Self) {
      
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
    
    extension [Self <: ExtractUrlsWithoutProtocol](x: Self) {
      
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
    
    extension [Self <: Tag](x: Self) {
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
}
