package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsHorizontalImageBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/HorizontalImageBold", JSImport.Default)
  @js.native
  val default: FC[HorizontalImageBoldProps] = js.native
  
  trait HorizontalImageBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object HorizontalImageBoldProps {
    
    inline def apply(): HorizontalImageBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HorizontalImageBoldProps]
    }
    
    extension [Self <: HorizontalImageBoldProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[HorizontalImageBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsHorizontalImageBoldMod.foo` */
  override def _to: FC[HorizontalImageBoldProps] = default
}
