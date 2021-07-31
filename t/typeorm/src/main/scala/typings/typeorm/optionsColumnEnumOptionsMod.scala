package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsColumnEnumOptionsMod {
  
  trait ColumnEnumOptions extends StObject {
    
    /**
      * Array of possible enumerated values.
      */
    var `enum`: js.UndefOr[js.Array[js.Any] | js.Object] = js.undefined
    
    /**
      * Exact name of enum
      */
    var enumName: js.UndefOr[String] = js.undefined
  }
  object ColumnEnumOptions {
    
    @scala.inline
    def apply(): ColumnEnumOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnEnumOptions]
    }
    
    @scala.inline
    implicit class ColumnEnumOptionsMutableBuilder[Self <: ColumnEnumOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnum(value: js.Array[js.Any] | js.Object): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnumName(value: String): Self = StObject.set(x, "enumName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnumNameUndefined: Self = StObject.set(x, "enumName", js.undefined)
      
      @scala.inline
      def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
      
      @scala.inline
      def setEnumVarargs(value: js.Any*): Self = StObject.set(x, "enum", js.Array(value :_*))
    }
  }
}
