package typings.tablesorter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerResizeOptionsMod {
  
  @js.native
  trait HeaderResizeOptions extends StObject {
    
    /**
      * The interval to look for header-changes in miliseconds.
      */
    var timer: Double = js.native
  }
  object HeaderResizeOptions {
    
    @scala.inline
    def apply(timer: Double): HeaderResizeOptions = {
      val __obj = js.Dynamic.literal(timer = timer.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeaderResizeOptions]
    }
    
    @scala.inline
    implicit class HeaderResizeOptionsMutableBuilder[Self <: HeaderResizeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTimer(value: Double): Self = StObject.set(x, "timer", value.asInstanceOf[js.Any])
    }
  }
}
