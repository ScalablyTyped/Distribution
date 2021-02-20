package typings.widestLine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call extends StObject {
    
    /**
    	Get the visual width of the widest line in a string - the number of columns required to display it.
    	@example
    	```
    	import widestLine = require('widest-line');
    	widestLine('古\n\\u001B[1m@\\u001B[22m');
    	//=> 2
    	```
    	*/
    def apply(input: String): Double = js.native
  }
}
