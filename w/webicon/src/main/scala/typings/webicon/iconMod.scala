package typings.webicon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconMod {
  
  trait Icon extends StObject {
    
    /**
      * Parses the input to an icon-id.
      *
      * @param id
      * The id of the icon to get.
      *
      * @param params
      * Additional parameters for getting the icon.
      *
      * @return
      * The id of the icon to get.
      */
    var iconIdParser: js.UndefOr[js.Function2[/* id */ String, /* params */ js.Array[String], String]] = js.undefined
  }
  object Icon {
    
    @scala.inline
    def apply(): Icon = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Icon]
    }
    
    @scala.inline
    implicit class IconMutableBuilder[Self <: Icon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIconIdParser(value: (/* id */ String, /* params */ js.Array[String]) => String): Self = StObject.set(x, "iconIdParser", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIconIdParserUndefined: Self = StObject.set(x, "iconIdParser", js.undefined)
    }
  }
}
