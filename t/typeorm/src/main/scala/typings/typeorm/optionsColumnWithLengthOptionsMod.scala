package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsColumnWithLengthOptionsMod {
  
  @js.native
  trait ColumnWithLengthOptions extends StObject {
    
    /**
      * Column type's length.
      * For example type = "varchar" and length = "100" means ORM will create a column with type varchar(100).
      */
    var length: js.UndefOr[String | Double] = js.native
  }
  object ColumnWithLengthOptions {
    
    @scala.inline
    def apply(): ColumnWithLengthOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnWithLengthOptions]
    }
    
    @scala.inline
    implicit class ColumnWithLengthOptionsMutableBuilder[Self <: ColumnWithLengthOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLength(value: String | Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    }
  }
}
