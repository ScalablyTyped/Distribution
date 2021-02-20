package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeormJoinOptionsMod {
  
  @js.native
  trait JoinOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.native
  }
  object JoinOptions {
    
    @scala.inline
    def apply(): JoinOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JoinOptions]
    }
    
    @scala.inline
    implicit class JoinOptionsMutableBuilder[Self <: JoinOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    }
  }
}
