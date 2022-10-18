package typings.tablesorter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemHeaderResizeOptionsMod {
  
  trait HeaderResizeOptions extends StObject {
    
    /**
      * The interval to look for header-changes in miliseconds.
      */
    var timer: Double
  }
  object HeaderResizeOptions {
    
    inline def apply(timer: Double): HeaderResizeOptions = {
      val __obj = js.Dynamic.literal(timer = timer.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeaderResizeOptions]
    }
    
    extension [Self <: HeaderResizeOptions](x: Self) {
      
      inline def setTimer(value: Double): Self = StObject.set(x, "timer", value.asInstanceOf[js.Any])
    }
  }
}
