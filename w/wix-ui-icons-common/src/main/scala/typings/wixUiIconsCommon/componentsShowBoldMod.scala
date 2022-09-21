package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsShowBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/ShowBold", JSImport.Default)
  @js.native
  val default: FC[ShowBoldProps] = js.native
  
  trait ShowBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ShowBoldProps {
    
    inline def apply(): ShowBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShowBoldProps]
    }
    
    extension [Self <: ShowBoldProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ShowBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsShowBoldMod.foo` */
  override def _to: FC[ShowBoldProps] = default
}
