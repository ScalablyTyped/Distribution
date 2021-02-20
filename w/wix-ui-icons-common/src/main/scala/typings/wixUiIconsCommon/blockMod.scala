package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blockMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Block", JSImport.Default)
  @js.native
  val default: SFC[BlockProps] = js.native
  
  @js.native
  trait BlockProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object BlockProps {
    
    @scala.inline
    def apply(): BlockProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlockProps]
    }
    
    @scala.inline
    implicit class BlockPropsMutableBuilder[Self <: BlockProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[BlockProps]
  
  /* This means you don't have to write `default`, but can instead just say `blockMod.foo` */
  override def _to: SFC[BlockProps] = default
}
