package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOnStageSystemDistComponentsDeleteLargeMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/system/dist/components/DeleteLarge", JSImport.Default)
  @js.native
  val default: FC[DeleteLargeProps] = js.native
  
  trait DeleteLargeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DeleteLargeProps {
    
    inline def apply(): DeleteLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteLargeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeleteLargeProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DeleteLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesOnStageSystemDistComponentsDeleteLargeMod.foo` */
  override def _to: FC[DeleteLargeProps] = default
}
