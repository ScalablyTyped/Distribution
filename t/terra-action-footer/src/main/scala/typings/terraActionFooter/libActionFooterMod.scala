package typings.terraActionFooter

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libActionFooterMod extends Shortcut {
  
  @JSImport("terra-action-footer/lib/ActionFooter", JSImport.Default)
  @js.native
  val default: FC[ActionFooterProps] = js.native
  
  trait ActionFooterProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    /**
      * Actions to be displayed in the end socket
      */
    var end: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Actions to be displayed in the start socket
      */
    var start: js.UndefOr[ReactNode] = js.undefined
  }
  object ActionFooterProps {
    
    inline def apply(): ActionFooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionFooterProps]
    }
    
    extension [Self <: ActionFooterProps](x: Self) {
      
      inline def setEnd(value: ReactNode): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setStart(value: ReactNode): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  type _To = FC[ActionFooterProps]
  
  /* This means you don't have to write `default`, but can instead just say `libActionFooterMod.foo` */
  override def _to: FC[ActionFooterProps] = default
}
