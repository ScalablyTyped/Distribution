package typings.vueScrollto

import typings.vueScrollto.mod.ElementDescriptor
import typings.vueScrollto.mod.ScrollOptions
import typings.vueScrollto.mod.ScrollToFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ScrollTo extends StObject {
    
    def scrollTo(element: ElementDescriptor): js.Function0[Unit]
    def scrollTo(element: ElementDescriptor, duration: Double): js.Function0[Unit]
    def scrollTo(element: ElementDescriptor, duration: Double, options: ScrollOptions): js.Function0[Unit]
    def scrollTo(element: ElementDescriptor, options: ScrollOptions): js.Function0[Unit]
    def scrollTo(options: ScrollOptions): js.Function0[Unit]
    @JSName("scrollTo")
    var scrollTo_Original: ScrollToFunction
    
    def setDefaults(element: ElementDescriptor): js.Function0[Unit]
    def setDefaults(element: ElementDescriptor, duration: Double): js.Function0[Unit]
    def setDefaults(element: ElementDescriptor, duration: Double, options: ScrollOptions): js.Function0[Unit]
    def setDefaults(element: ElementDescriptor, options: ScrollOptions): js.Function0[Unit]
    def setDefaults(options: ScrollOptions): js.Function0[Unit]
    @JSName("setDefaults")
    var setDefaults_Original: ScrollToFunction
  }
  object ScrollTo {
    
    inline def apply(scrollTo: ScrollToFunction, setDefaults: ScrollToFunction): ScrollTo = {
      val __obj = js.Dynamic.literal(scrollTo = scrollTo.asInstanceOf[js.Any], setDefaults = setDefaults.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollTo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollTo] (val x: Self) extends AnyVal {
      
      inline def setScrollTo(value: ScrollToFunction): Self = StObject.set(x, "scrollTo", value.asInstanceOf[js.Any])
      
      inline def setSetDefaults(value: ScrollToFunction): Self = StObject.set(x, "setDefaults", value.asInstanceOf[js.Any])
    }
  }
}
