package typings.wonka

import typings.wonka.wonkaNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0` extends StObject {
    
    var tag: `1` = js.native
  }
  object `0` {
    
    @scala.inline
    def apply(tag: `1`): `0` = {
      val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTag(value: `1`): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Tag extends StObject {
    
    var tag: typings.wonka.wonkaNumbers.`0` = js.native
  }
  object Tag {
    
    @scala.inline
    def apply(tag: typings.wonka.wonkaNumbers.`0`): Tag = {
      val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tag]
    }
    
    @scala.inline
    implicit class TagMutableBuilder[Self <: Tag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTag(value: typings.wonka.wonkaNumbers.`0`): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
}
