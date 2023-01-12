package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClassicEditorGeneralDistComponentsAlertCircleBoldSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/AlertCircleBoldSmall", JSImport.Default)
  @js.native
  val default: FC[AlertCircleBoldSmallProps] = js.native
  
  trait AlertCircleBoldSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object AlertCircleBoldSmallProps {
    
    inline def apply(): AlertCircleBoldSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlertCircleBoldSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AlertCircleBoldSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[AlertCircleBoldSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcClassicEditorGeneralDistComponentsAlertCircleBoldSmallMod.foo` */
  override def _to: FC[AlertCircleBoldSmallProps] = default
}
