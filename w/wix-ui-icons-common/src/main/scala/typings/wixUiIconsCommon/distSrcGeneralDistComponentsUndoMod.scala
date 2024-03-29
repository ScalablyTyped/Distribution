package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsUndoMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Undo", JSImport.Default)
  @js.native
  val default: FC[UndoProps] = js.native
  
  trait UndoProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object UndoProps {
    
    inline def apply(): UndoProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UndoProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UndoProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[UndoProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsUndoMod.foo` */
  override def _to: FC[UndoProps] = default
}
