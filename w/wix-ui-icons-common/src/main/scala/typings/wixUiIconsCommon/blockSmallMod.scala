package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blockSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/BlockSmall", JSImport.Default)
  @js.native
  val default: SFC[BlockSmallProps] = js.native
  
  @js.native
  trait BlockSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object BlockSmallProps {
    
    @scala.inline
    def apply(): BlockSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlockSmallProps]
    }
    
    @scala.inline
    implicit class BlockSmallPropsMutableBuilder[Self <: BlockSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[BlockSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `blockSmallMod.foo` */
  override def _to: SFC[BlockSmallProps] = default
}
