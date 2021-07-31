package typings.webicon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sizeableMod {
  
  trait Sizeable extends StObject {
    
    /**
      * The default size of the icon.
      */
    var iconSize: js.UndefOr[Double] = js.undefined
  }
  object Sizeable {
    
    @scala.inline
    def apply(): Sizeable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Sizeable]
    }
    
    @scala.inline
    implicit class SizeableMutableBuilder[Self <: Sizeable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIconSize(value: Double): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconSizeUndefined: Self = StObject.set(x, "iconSize", js.undefined)
    }
  }
}
