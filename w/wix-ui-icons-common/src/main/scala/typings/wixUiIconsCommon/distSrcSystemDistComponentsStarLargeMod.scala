package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcSystemDistComponentsStarLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/StarLarge", JSImport.Default)
  @js.native
  val default: FC[StarLargeProps] = js.native
  
  trait StarLargeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object StarLargeProps {
    
    inline def apply(): StarLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StarLargeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StarLargeProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[StarLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcSystemDistComponentsStarLargeMod.foo` */
  override def _to: FC[StarLargeProps] = default
}
