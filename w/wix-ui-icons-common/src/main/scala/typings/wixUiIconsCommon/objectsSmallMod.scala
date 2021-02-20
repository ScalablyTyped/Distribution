package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectsSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ObjectsSmall", JSImport.Default)
  @js.native
  val default: SFC[ObjectsSmallProps] = js.native
  
  @js.native
  trait ObjectsSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ObjectsSmallProps {
    
    @scala.inline
    def apply(): ObjectsSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObjectsSmallProps]
    }
    
    @scala.inline
    implicit class ObjectsSmallPropsMutableBuilder[Self <: ObjectsSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ObjectsSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `objectsSmallMod.foo` */
  override def _to: SFC[ObjectsSmallProps] = default
}
