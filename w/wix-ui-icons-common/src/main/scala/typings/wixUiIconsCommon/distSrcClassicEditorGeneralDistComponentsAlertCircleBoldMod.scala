package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsAlertCircleBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/AlertCircleBold", JSImport.Default)
  @js.native
  val default: FC[AlertCircleBoldProps] = js.native
  
  trait AlertCircleBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object AlertCircleBoldProps {
    
    inline def apply(): AlertCircleBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlertCircleBoldProps]
    }
    
    extension [Self <: AlertCircleBoldProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[AlertCircleBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsAlertCircleBoldMod.foo` */
  override def _to: FC[AlertCircleBoldProps] = default
}
