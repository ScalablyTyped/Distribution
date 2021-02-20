package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectsMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Objects", JSImport.Default)
  @js.native
  val default: SFC[ObjectsProps] = js.native
  
  @js.native
  trait ObjectsProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ObjectsProps {
    
    @scala.inline
    def apply(): ObjectsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObjectsProps]
    }
    
    @scala.inline
    implicit class ObjectsPropsMutableBuilder[Self <: ObjectsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ObjectsProps]
  
  /* This means you don't have to write `default`, but can instead just say `objectsMod.foo` */
  override def _to: SFC[ObjectsProps] = default
}
