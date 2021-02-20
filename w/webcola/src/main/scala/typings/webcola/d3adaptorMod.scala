package typings.webcola

import typings.webcola.d3v4adaptorMod.D3Context
import typings.webcola.layoutMod.Event
import typings.webcola.layoutMod.EventType
import typings.webcola.layoutMod.Layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object d3adaptorMod {
  
  @JSImport("webcola/dist/src/d3adaptor", "d3adaptor")
  @js.native
  def d3adaptor(): Layout with ID3StyleLayoutAdaptor = js.native
  @JSImport("webcola/dist/src/d3adaptor", "d3adaptor")
  @js.native
  def d3adaptor(d3Context: D3v3Context): Layout with ID3StyleLayoutAdaptor = js.native
  @JSImport("webcola/dist/src/d3adaptor", "d3adaptor")
  @js.native
  def d3adaptor(d3Context: D3Context): Layout with ID3StyleLayoutAdaptor = js.native
  
  @js.native
  trait D3v3Context extends StObject {
    
    var version: String = js.native
  }
  object D3v3Context {
    
    @scala.inline
    def apply(version: String): D3v3Context = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[D3v3Context]
    }
    
    @scala.inline
    implicit class D3v3ContextMutableBuilder[Self <: D3v3Context] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ID3StyleLayoutAdaptor extends StObject {
    
    def drag(): js.Any = js.native
    
    def kick(): Unit = js.native
    
    def on(eventType: String, listener: js.Function0[Unit]): ID3StyleLayoutAdaptor = js.native
    def on(eventType: EventType, listener: js.Function0[Unit]): ID3StyleLayoutAdaptor = js.native
    
    def trigger(e: Event): Unit = js.native
  }
}
