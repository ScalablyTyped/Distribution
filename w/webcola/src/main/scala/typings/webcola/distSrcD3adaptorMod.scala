package typings.webcola

import typings.webcola.distSrcD3v4adaptorMod.D3Context
import typings.webcola.distSrcLayoutMod.Event
import typings.webcola.distSrcLayoutMod.EventType
import typings.webcola.distSrcLayoutMod.Layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcD3adaptorMod {
  
  @JSImport("webcola/dist/src/d3adaptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def d3adaptor(): Layout & ID3StyleLayoutAdaptor = ^.asInstanceOf[js.Dynamic].applyDynamic("d3adaptor")().asInstanceOf[Layout & ID3StyleLayoutAdaptor]
  inline def d3adaptor(d3Context: D3v3Context): Layout & ID3StyleLayoutAdaptor = ^.asInstanceOf[js.Dynamic].applyDynamic("d3adaptor")(d3Context.asInstanceOf[js.Any]).asInstanceOf[Layout & ID3StyleLayoutAdaptor]
  inline def d3adaptor(d3Context: D3Context): Layout & ID3StyleLayoutAdaptor = ^.asInstanceOf[js.Dynamic].applyDynamic("d3adaptor")(d3Context.asInstanceOf[js.Any]).asInstanceOf[Layout & ID3StyleLayoutAdaptor]
  
  trait D3v3Context extends StObject {
    
    var version: String
  }
  object D3v3Context {
    
    inline def apply(version: String): D3v3Context = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[D3v3Context]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: D3v3Context] (val x: Self) extends AnyVal {
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ID3StyleLayoutAdaptor extends StObject {
    
    def drag(): Any = js.native
    
    def kick(): Unit = js.native
    
    def on(eventType: String, listener: js.Function0[Unit]): ID3StyleLayoutAdaptor = js.native
    def on(eventType: EventType, listener: js.Function0[Unit]): ID3StyleLayoutAdaptor = js.native
    
    def trigger(e: Event): Unit = js.native
  }
}
