package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsElevatorMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Elevator", JSImport.Default)
  @js.native
  val default: FC[ElevatorProps] = js.native
  
  trait ElevatorProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ElevatorProps {
    
    inline def apply(): ElevatorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElevatorProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ElevatorProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ElevatorProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsElevatorMod.foo` */
  override def _to: FC[ElevatorProps] = default
}
