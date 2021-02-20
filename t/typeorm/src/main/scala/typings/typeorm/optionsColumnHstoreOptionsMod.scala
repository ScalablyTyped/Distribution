package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsColumnHstoreOptionsMod {
  
  @js.native
  trait ColumnHstoreOptions extends StObject {
    
    /**
      * Return type of HSTORE column.
      * Returns value as string or as object.
      */
    var hstoreType: js.UndefOr[String] = js.native
  }
  object ColumnHstoreOptions {
    
    @scala.inline
    def apply(): ColumnHstoreOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnHstoreOptions]
    }
    
    @scala.inline
    implicit class ColumnHstoreOptionsMutableBuilder[Self <: ColumnHstoreOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHstoreType(value: String): Self = StObject.set(x, "hstoreType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHstoreTypeUndefined: Self = StObject.set(x, "hstoreType", js.undefined)
    }
  }
}
