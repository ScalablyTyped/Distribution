package typings.tablesorter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlOptionsMod {
  
  @js.native
  trait ControlOptions extends StObject {
    
    /**
      * The label of the control.
      */
    var cellText: js.UndefOr[String] = js.native
  }
  object ControlOptions {
    
    @scala.inline
    def apply(): ControlOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ControlOptions]
    }
    
    @scala.inline
    implicit class ControlOptionsMutableBuilder[Self <: ControlOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCellText(value: String): Self = StObject.set(x, "cellText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellTextUndefined: Self = StObject.set(x, "cellText", js.undefined)
    }
  }
}
