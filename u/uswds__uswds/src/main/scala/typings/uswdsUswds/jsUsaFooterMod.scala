package typings.uswdsUswds

import org.scalablytyped.runtime.Shortcut
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsUsaFooterMod extends Shortcut {
  
  @JSImport("@uswds/uswds/js/usa-footer", JSImport.Default)
  @js.native
  val default: Footer = js.native
  
  trait Footer extends StObject {
    
    var HIDE_MAX_WIDTH: Double
    
    def init(): Unit
    
    def off(el: HTMLElement): Unit
    
    def on(el: HTMLElement): Unit
    
    def teardown(): Unit
  }
  object Footer {
    
    inline def apply(
      HIDE_MAX_WIDTH: Double,
      init: () => Unit,
      off: HTMLElement => Unit,
      on: HTMLElement => Unit,
      teardown: () => Unit
    ): Footer = {
      val __obj = js.Dynamic.literal(HIDE_MAX_WIDTH = HIDE_MAX_WIDTH.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), off = js.Any.fromFunction1(off), on = js.Any.fromFunction1(on), teardown = js.Any.fromFunction0(teardown))
      __obj.asInstanceOf[Footer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Footer] (val x: Self) extends AnyVal {
      
      inline def setHIDE_MAX_WIDTH(value: Double): Self = StObject.set(x, "HIDE_MAX_WIDTH", value.asInstanceOf[js.Any])
      
      inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
      
      inline def setOff(value: HTMLElement => Unit): Self = StObject.set(x, "off", js.Any.fromFunction1(value))
      
      inline def setOn(value: HTMLElement => Unit): Self = StObject.set(x, "on", js.Any.fromFunction1(value))
      
      inline def setTeardown(value: () => Unit): Self = StObject.set(x, "teardown", js.Any.fromFunction0(value))
    }
  }
  
  type _To = Footer
  
  /* This means you don't have to write `default`, but can instead just say `jsUsaFooterMod.foo` */
  override def _to: Footer = default
}
