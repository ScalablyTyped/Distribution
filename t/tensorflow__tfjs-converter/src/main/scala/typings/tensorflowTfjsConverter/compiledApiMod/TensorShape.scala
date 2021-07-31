package typings.tensorflowTfjsConverter.compiledApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TensorShape {
  
  /** Properties of a Dim. */
  trait IDim extends StObject {
    
    /** Dim name */
    var name: js.UndefOr[String | Null] = js.undefined
    
    /** Dim size */
    var size: js.UndefOr[Double | String | Null] = js.undefined
  }
  object IDim {
    
    @scala.inline
    def apply(): IDim = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDim]
    }
    
    @scala.inline
    implicit class IDimMutableBuilder[Self <: IDim] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameNull: Self = StObject.set(x, "name", null)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeNull: Self = StObject.set(x, "size", null)
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
