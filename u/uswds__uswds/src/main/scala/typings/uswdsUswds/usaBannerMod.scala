package typings.uswdsUswds

import org.scalablytyped.runtime.Shortcut
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usaBannerMod extends Shortcut {
  
  @JSImport("@uswds/uswds/js/usa-banner", JSImport.Default)
  @js.native
  val default: Banner = js.native
  
  trait Banner extends StObject {
    
    def off(el: HTMLElement): Unit
    
    def on(el: HTMLElement): Unit
  }
  object Banner {
    
    inline def apply(off: HTMLElement => Unit, on: HTMLElement => Unit): Banner = {
      val __obj = js.Dynamic.literal(off = js.Any.fromFunction1(off), on = js.Any.fromFunction1(on))
      __obj.asInstanceOf[Banner]
    }
    
    extension [Self <: Banner](x: Self) {
      
      inline def setOff(value: HTMLElement => Unit): Self = StObject.set(x, "off", js.Any.fromFunction1(value))
      
      inline def setOn(value: HTMLElement => Unit): Self = StObject.set(x, "on", js.Any.fromFunction1(value))
    }
  }
  
  type _To = Banner
  
  /* This means you don't have to write `default`, but can instead just say `usaBannerMod.foo` */
  override def _to: Banner = default
}
