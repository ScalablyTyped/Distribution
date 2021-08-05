package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object databaseSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DatabaseSmall", JSImport.Default)
  @js.native
  val default: SFC[DatabaseSmallProps] = js.native
  
  trait DatabaseSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object DatabaseSmallProps {
    
    inline def apply(): DatabaseSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatabaseSmallProps]
    }
    
    extension [Self <: DatabaseSmallProps](x: Self) {
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[DatabaseSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `databaseSmallMod.foo` */
  override def _to: SFC[DatabaseSmallProps] = default
}
