package typings.wixStyleReact

import typings.wixUiTestUtils.createDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object genericModalLayoutDriverMod {
  
  trait GenericModalLayoutDriver
    extends StObject
       with BaseDriver {
    
    def isFullscreen(): Boolean
  }
  object GenericModalLayoutDriver {
    
    @scala.inline
    def apply(exists: () => Boolean, isFullscreen: () => Boolean): GenericModalLayoutDriver = {
      val __obj = js.Dynamic.literal(exists = js.Any.fromFunction0(exists), isFullscreen = js.Any.fromFunction0(isFullscreen))
      __obj.asInstanceOf[GenericModalLayoutDriver]
    }
    
    @scala.inline
    implicit class GenericModalLayoutDriverMutableBuilder[Self <: GenericModalLayoutDriver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsFullscreen(value: () => Boolean): Self = StObject.set(x, "isFullscreen", js.Any.fromFunction0(value))
    }
  }
}
