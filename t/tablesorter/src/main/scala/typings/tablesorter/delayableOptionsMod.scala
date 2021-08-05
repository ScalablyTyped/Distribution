package typings.tablesorter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object delayableOptionsMod {
  
  trait DelayableOptions extends StObject {
    
    /**
      * A value indicating whether the value of the filter should be set delayed.
      */
    var delayed: js.UndefOr[Boolean] = js.undefined
  }
  object DelayableOptions {
    
    inline def apply(): DelayableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DelayableOptions]
    }
    
    extension [Self <: DelayableOptions](x: Self) {
      
      inline def setDelayed(value: Boolean): Self = StObject.set(x, "delayed", value.asInstanceOf[js.Any])
      
      inline def setDelayedUndefined: Self = StObject.set(x, "delayed", js.undefined)
    }
  }
}
