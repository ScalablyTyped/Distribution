package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object angryXSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/on-stage/reactions/dist/components/AngryXSmall", JSImport.Default)
  @js.native
  val default: FC[AngryXSmallProps] = js.native
  
  trait AngryXSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object AngryXSmallProps {
    
    inline def apply(): AngryXSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AngryXSmallProps]
    }
    
    extension [Self <: AngryXSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[AngryXSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `angryXSmallMod.foo` */
  override def _to: FC[AngryXSmallProps] = default
}
