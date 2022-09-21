package typings.terraActionFooter

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object centeredActionFooterMod extends Shortcut {
  
  @JSImport("terra-action-footer/lib/CenteredActionFooter", JSImport.Default)
  @js.native
  val default: FC[CenteredActionFooterProps] = js.native
  
  trait CenteredActionFooterProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    /**
      * Actions to be displayed in the center socket
      */
    var center: js.UndefOr[ReactNode] = js.undefined
  }
  object CenteredActionFooterProps {
    
    inline def apply(): CenteredActionFooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CenteredActionFooterProps]
    }
    
    extension [Self <: CenteredActionFooterProps](x: Self) {
      
      inline def setCenter(value: ReactNode): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    }
  }
  
  type _To = FC[CenteredActionFooterProps]
  
  /* This means you don't have to write `default`, but can instead just say `centeredActionFooterMod.foo` */
  override def _to: FC[CenteredActionFooterProps] = default
}
