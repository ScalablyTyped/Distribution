package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorSystemDistComponentsMovetoBackMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/system/dist/components/MovetoBack", JSImport.Default)
  @js.native
  val default: FC[MovetoBackProps] = js.native
  
  trait MovetoBackProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object MovetoBackProps {
    
    inline def apply(): MovetoBackProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MovetoBackProps]
    }
    
    extension [Self <: MovetoBackProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[MovetoBackProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorSystemDistComponentsMovetoBackMod.foo` */
  override def _to: FC[MovetoBackProps] = default
}
