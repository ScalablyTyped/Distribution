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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HeaderResizeOptions] (val x: Self) extends AnyVal {
      
      inline def setTimer(value: Double): Self = StObject.set(x, "timer", value.asInstanceOf[js.Any])
    }
  }
}
