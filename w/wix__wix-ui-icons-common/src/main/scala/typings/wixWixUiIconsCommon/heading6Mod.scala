package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object heading6Mod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/general/dist/components/Heading6", JSImport.Default)
  @js.native
  val default: FC[Heading6Props] = js.native
  
  trait Heading6Props
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object Heading6Props {
    
    inline def apply(): Heading6Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Heading6Props]
    }
    
    extension [Self <: Heading6Props](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[Heading6Props]
  
  /* This means you don't have to write `default`, but can instead just say `heading6Mod.foo` */
  override def _to: FC[Heading6Props] = default
}
