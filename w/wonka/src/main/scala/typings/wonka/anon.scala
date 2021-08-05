package typings.wonka

import typings.wonka.wonkaNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var tag: `1`
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal(tag = 1)
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setTag(value: `1`): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  trait Tag extends StObject {
    
    var tag: typings.wonka.wonkaNumbers.`0`
  }
  object Tag {
    
    inline def apply(): Tag = {
      val __obj = js.Dynamic.literal(tag = 0)
      __obj.asInstanceOf[Tag]
    }
    
    extension [Self <: Tag](x: Self) {
      
      inline def setTag(value: typings.wonka.wonkaNumbers.`0`): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
}
