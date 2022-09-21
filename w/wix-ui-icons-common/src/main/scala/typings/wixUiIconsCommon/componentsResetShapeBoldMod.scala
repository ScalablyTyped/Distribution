package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsResetShapeBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/ResetShapeBold", JSImport.Default)
  @js.native
  val default: FC[ResetShapeBoldProps] = js.native
  
  trait ResetShapeBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ResetShapeBoldProps {
    
    inline def apply(): ResetShapeBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResetShapeBoldProps]
    }
    
    extension [Self <: ResetShapeBoldProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ResetShapeBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsResetShapeBoldMod.foo` */
  override def _to: FC[ResetShapeBoldProps] = default
}
