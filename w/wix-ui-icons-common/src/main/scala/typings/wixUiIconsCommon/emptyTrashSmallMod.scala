package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emptyTrashSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/EmptyTrashSmall", JSImport.Default)
  @js.native
  val default: SFC[EmptyTrashSmallProps] = js.native
  
  trait EmptyTrashSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object EmptyTrashSmallProps {
    
    @scala.inline
    def apply(): EmptyTrashSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmptyTrashSmallProps]
    }
    
    @scala.inline
    implicit class EmptyTrashSmallPropsMutableBuilder[Self <: EmptyTrashSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[EmptyTrashSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `emptyTrashSmallMod.foo` */
  override def _to: SFC[EmptyTrashSmallProps] = default
}
