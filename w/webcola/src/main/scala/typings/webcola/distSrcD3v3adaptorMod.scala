package typings.webcola

import typings.webcola.distSrcD3adaptorMod.ID3StyleLayoutAdaptor
import typings.webcola.distSrcLayoutMod.Event
import typings.webcola.distSrcLayoutMod.Layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcD3v3adaptorMod {
  
  @JSImport("webcola/dist/src/d3v3adaptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("webcola/dist/src/d3v3adaptor", "D3StyleLayoutAdaptor")
  @js.native
  open class D3StyleLayoutAdaptor ()
    extends Layout
       with ID3StyleLayoutAdaptor {
    
    /* protected */ /* InferMemberOverrides */
    override def kick(): Unit = js.native
    
    /* protected */ /* InferMemberOverrides */
    override def trigger(e: Event): Unit = js.native
  }
  
  inline def d3adaptor(): D3StyleLayoutAdaptor = ^.asInstanceOf[js.Dynamic].applyDynamic("d3adaptor")().asInstanceOf[D3StyleLayoutAdaptor]
}
