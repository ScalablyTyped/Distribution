package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsVectorBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/VectorBold", JSImport.Default)
  @js.native
  val default: FC[VectorBoldProps] = js.native
  
  trait VectorBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object VectorBoldProps {
    
    inline def apply(): VectorBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VectorBoldProps]
    }
    
    extension [Self <: VectorBoldProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[VectorBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsVectorBoldMod.foo` */
  override def _to: FC[VectorBoldProps] = default
}
