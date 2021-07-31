package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/TagSmall", JSImport.Default)
  @js.native
  val default: SFC[TagSmallProps] = js.native
  
  trait TagSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object TagSmallProps {
    
    @scala.inline
    def apply(): TagSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagSmallProps]
    }
    
    @scala.inline
    implicit class TagSmallPropsMutableBuilder[Self <: TagSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[TagSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `tagSmallMod.foo` */
  override def _to: SFC[TagSmallProps] = default
}
