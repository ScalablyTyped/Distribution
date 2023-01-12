package typings.victoryCore

import typings.react.mod.Context
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVictoryPortalPortalContextMod {
  
  @JSImport("victory-core/lib/victory-portal/portal-context", "PortalContext")
  @js.native
  val PortalContext: Context[PortalContextValue] = js.native
  
  trait PortalContextValue extends StObject {
    
    def portalDeregister(key: Double): Unit
    
    def portalRegister(): Double
    
    def portalUpdate(key: Double, element: ReactElement): Unit
  }
  object PortalContextValue {
    
    inline def apply(
      portalDeregister: Double => Unit,
      portalRegister: () => Double,
      portalUpdate: (Double, ReactElement) => Unit
    ): PortalContextValue = {
      val __obj = js.Dynamic.literal(portalDeregister = js.Any.fromFunction1(portalDeregister), portalRegister = js.Any.fromFunction0(portalRegister), portalUpdate = js.Any.fromFunction2(portalUpdate))
      __obj.asInstanceOf[PortalContextValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PortalContextValue] (val x: Self) extends AnyVal {
      
      inline def setPortalDeregister(value: Double => Unit): Self = StObject.set(x, "portalDeregister", js.Any.fromFunction1(value))
      
      inline def setPortalRegister(value: () => Double): Self = StObject.set(x, "portalRegister", js.Any.fromFunction0(value))
      
      inline def setPortalUpdate(value: (Double, ReactElement) => Unit): Self = StObject.set(x, "portalUpdate", js.Any.fromFunction2(value))
    }
  }
}
