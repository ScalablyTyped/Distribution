package typings.tablesorter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object widgetsZebraOptionsMod {
  
  trait ZebraOptions extends StObject {
    
    /**
      * The classes to add to even and odd rows.
      */
    var zebra: js.UndefOr[js.Tuple2[String, String]] = js.undefined
  }
  object ZebraOptions {
    
    inline def apply(): ZebraOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZebraOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ZebraOptions] (val x: Self) extends AnyVal {
      
      inline def setZebra(value: js.Tuple2[String, String]): Self = StObject.set(x, "zebra", value.asInstanceOf[js.Any])
      
      inline def setZebraUndefined: Self = StObject.set(x, "zebra", js.undefined)
    }
  }
}
