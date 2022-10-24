package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCardHeaderHeaderDotdriverMod {
  
  trait HeaderDriver
    extends StObject
       with BaseDriver {
    
    def subtitle(): String
    
    def title(): String
  }
  object HeaderDriver {
    
    inline def apply(exists: () => Boolean, subtitle: () => String, title: () => String): HeaderDriver = {
      val __obj = js.Dynamic.literal(exists = js.Any.fromFunction0(exists), subtitle = js.Any.fromFunction0(subtitle), title = js.Any.fromFunction0(title))
      __obj.asInstanceOf[HeaderDriver]
    }
    
    extension [Self <: HeaderDriver](x: Self) {
      
      inline def setSubtitle(value: () => String): Self = StObject.set(x, "subtitle", js.Any.fromFunction0(value))
      
      inline def setTitle(value: () => String): Self = StObject.set(x, "title", js.Any.fromFunction0(value))
    }
  }
}
