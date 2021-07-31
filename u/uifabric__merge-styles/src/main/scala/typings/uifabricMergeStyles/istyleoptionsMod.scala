package typings.uifabricMergeStyles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object istyleoptionsMod {
  
  trait IStyleOptions extends StObject {
    
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    var specificityMultiplier: js.UndefOr[Double] = js.undefined
  }
  object IStyleOptions {
    
    @scala.inline
    def apply(): IStyleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStyleOptions]
    }
    
    @scala.inline
    implicit class IStyleOptionsMutableBuilder[Self <: IStyleOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      @scala.inline
      def setSpecificityMultiplier(value: Double): Self = StObject.set(x, "specificityMultiplier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpecificityMultiplierUndefined: Self = StObject.set(x, "specificityMultiplier", js.undefined)
    }
  }
}
