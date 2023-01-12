package typings.tablesorter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filteringFormatterOptionsControlOptionsMod {
  
  trait ControlOptions extends StObject {
    
    /**
      * The label of the control.
      */
    var cellText: js.UndefOr[String] = js.undefined
  }
  object ControlOptions {
    
    inline def apply(): ControlOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ControlOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ControlOptions] (val x: Self) extends AnyVal {
      
      inline def setCellText(value: String): Self = StObject.set(x, "cellText", value.asInstanceOf[js.Any])
      
      inline def setCellTextUndefined: Self = StObject.set(x, "cellText", js.undefined)
    }
  }
}
