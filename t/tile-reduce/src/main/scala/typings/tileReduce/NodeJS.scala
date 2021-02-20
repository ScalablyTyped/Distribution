package typings.tileReduce

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NodeJS {
  
  @js.native
  trait Global extends StObject {
    
    var mapOptions: js.Any = js.native
  }
  object Global {
    
    @scala.inline
    def apply(mapOptions: js.Any): Global = {
      val __obj = js.Dynamic.literal(mapOptions = mapOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Global]
    }
    
    @scala.inline
    implicit class GlobalMutableBuilder[Self <: Global] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMapOptions(value: js.Any): Self = StObject.set(x, "mapOptions", value.asInstanceOf[js.Any])
    }
  }
}
