package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsRedoMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/Redo", JSImport.Default)
  @js.native
  val default: FC[RedoProps] = js.native
  
  trait RedoProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object RedoProps {
    
    inline def apply(): RedoProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RedoProps]
    }
    
    extension [Self <: RedoProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[RedoProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsRedoMod.foo` */
  override def _to: FC[RedoProps] = default
}
