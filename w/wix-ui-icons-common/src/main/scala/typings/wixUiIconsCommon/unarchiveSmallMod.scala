package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unarchiveSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/UnarchiveSmall", JSImport.Default)
  @js.native
  val default: SFC[UnarchiveSmallProps] = js.native
  
  trait UnarchiveSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object UnarchiveSmallProps {
    
    @scala.inline
    def apply(): UnarchiveSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnarchiveSmallProps]
    }
    
    @scala.inline
    implicit class UnarchiveSmallPropsMutableBuilder[Self <: UnarchiveSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[UnarchiveSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `unarchiveSmallMod.foo` */
  override def _to: SFC[UnarchiveSmallProps] = default
}
