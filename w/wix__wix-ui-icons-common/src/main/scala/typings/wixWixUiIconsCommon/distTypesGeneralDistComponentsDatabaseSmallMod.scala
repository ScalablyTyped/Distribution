package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsDatabaseSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/DatabaseSmall", JSImport.Default)
  @js.native
  val default: FC[DatabaseSmallProps] = js.native
  
  trait DatabaseSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DatabaseSmallProps {
    
    inline def apply(): DatabaseSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatabaseSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DatabaseSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DatabaseSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsDatabaseSmallMod.foo` */
  override def _to: FC[DatabaseSmallProps] = default
}
