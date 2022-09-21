package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object feedMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Feed", JSImport.Default)
  @js.native
  val default: FC[FeedProps] = js.native
  
  trait FeedProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FeedProps {
    
    inline def apply(): FeedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FeedProps]
    }
    
    extension [Self <: FeedProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FeedProps]
  
  /* This means you don't have to write `default`, but can instead just say `feedMod.foo` */
  override def _to: FC[FeedProps] = default
}
