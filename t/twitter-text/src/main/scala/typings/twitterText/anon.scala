package typings.twitterText

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait End extends StObject {
    
    var end: Double = js.native
    
    var start: Double = js.native
    
    var weight: Double = js.native
  }
  object End {
    
    @scala.inline
    def apply(end: Double, start: Double, weight: Double): End = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
      __obj.asInstanceOf[End]
    }
    
    @scala.inline
    implicit class EndMutableBuilder[Self <: End] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ExtractUrlsWithoutProtocol extends StObject {
    
    var extractUrlsWithoutProtocol: Boolean = js.native
  }
  object ExtractUrlsWithoutProtocol {
    
    @scala.inline
    def apply(extractUrlsWithoutProtocol: Boolean): ExtractUrlsWithoutProtocol = {
      val __obj = js.Dynamic.literal(extractUrlsWithoutProtocol = extractUrlsWithoutProtocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtractUrlsWithoutProtocol]
    }
    
    @scala.inline
    implicit class ExtractUrlsWithoutProtocolMutableBuilder[Self <: ExtractUrlsWithoutProtocol] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtractUrlsWithoutProtocol(value: Boolean): Self = StObject.set(x, "extractUrlsWithoutProtocol", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Tag extends StObject {
    
    var tag: String = js.native
  }
  object Tag {
    
    @scala.inline
    def apply(tag: String): Tag = {
      val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tag]
    }
    
    @scala.inline
    implicit class TagMutableBuilder[Self <: Tag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
}
