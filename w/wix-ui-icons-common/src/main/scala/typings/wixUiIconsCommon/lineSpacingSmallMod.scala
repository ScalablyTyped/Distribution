package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineSpacingSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/general/dist/components/LineSpacingSmall", JSImport.Default)
  @js.native
  val default: FC[LineSpacingSmallProps] = js.native
  
  trait LineSpacingSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object LineSpacingSmallProps {
    
    inline def apply(): LineSpacingSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LineSpacingSmallProps]
    }
    
    extension [Self <: LineSpacingSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[LineSpacingSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `lineSpacingSmallMod.foo` */
  override def _to: FC[LineSpacingSmallProps] = default
}
