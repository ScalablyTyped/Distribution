package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClassicEditorSystemDistComponentsShoutoutMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/classic-editor/system/dist/components/Shoutout", JSImport.Default)
  @js.native
  val default: FC[ShoutoutProps] = js.native
  
  trait ShoutoutProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ShoutoutProps {
    
    inline def apply(): ShoutoutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShoutoutProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShoutoutProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ShoutoutProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesClassicEditorSystemDistComponentsShoutoutMod.foo` */
  override def _to: FC[ShoutoutProps] = default
}
