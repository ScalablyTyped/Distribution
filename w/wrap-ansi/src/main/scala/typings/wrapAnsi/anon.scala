package typings.wrapAnsi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Hard extends StObject {
    
    var hard: js.UndefOr[Boolean] = js.native
    
    var trim: js.UndefOr[Boolean] = js.native
    
    var wordWrap: js.UndefOr[Boolean] = js.native
  }
  object Hard {
    
    @scala.inline
    def apply(): Hard = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Hard]
    }
    
    @scala.inline
    implicit class HardMutableBuilder[Self <: Hard] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHard(value: Boolean): Self = StObject.set(x, "hard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHardUndefined: Self = StObject.set(x, "hard", js.undefined)
      
      @scala.inline
      def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
      
      @scala.inline
      def setWordWrap(value: Boolean): Self = StObject.set(x, "wordWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWordWrapUndefined: Self = StObject.set(x, "wordWrap", js.undefined)
    }
  }
}
