package typings.twig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Twigoptions extends StObject {
    
    var `twig options`: js.Any
    
    var views: js.Any
  }
  object Twigoptions {
    
    @scala.inline
    def apply(`twig options`: js.Any, views: js.Any): Twigoptions = {
      val __obj = js.Dynamic.literal(views = views.asInstanceOf[js.Any])
      __obj.updateDynamic("twig options")((`twig options`).asInstanceOf[js.Any])
      __obj.asInstanceOf[Twigoptions]
    }
    
    @scala.inline
    implicit class TwigoptionsMutableBuilder[Self <: Twigoptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setTwig options`(value: js.Any): Self = StObject.set(x, "twig options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViews(value: js.Any): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    }
  }
}
