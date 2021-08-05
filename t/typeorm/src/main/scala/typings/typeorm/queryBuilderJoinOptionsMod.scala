package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryBuilderJoinOptionsMod {
  
  trait JoinOptions extends StObject {
    
    var limit: js.UndefOr[Double] = js.undefined
  }
  object JoinOptions {
    
    inline def apply(): JoinOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JoinOptions]
    }
    
    extension [Self <: JoinOptions](x: Self) {
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    }
  }
}
