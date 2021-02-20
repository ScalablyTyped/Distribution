package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/MergeSmall", JSImport.Default)
  @js.native
  val default: SFC[MergeSmallProps] = js.native
  
  @js.native
  trait MergeSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object MergeSmallProps {
    
    @scala.inline
    def apply(): MergeSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MergeSmallProps]
    }
    
    @scala.inline
    implicit class MergeSmallPropsMutableBuilder[Self <: MergeSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[MergeSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `mergeSmallMod.foo` */
  override def _to: SFC[MergeSmallProps] = default
}
