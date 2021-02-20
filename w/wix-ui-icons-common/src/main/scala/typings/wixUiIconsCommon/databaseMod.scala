package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object databaseMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Database", JSImport.Default)
  @js.native
  val default: SFC[DatabaseProps] = js.native
  
  @js.native
  trait DatabaseProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object DatabaseProps {
    
    @scala.inline
    def apply(): DatabaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatabaseProps]
    }
    
    @scala.inline
    implicit class DatabasePropsMutableBuilder[Self <: DatabaseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[DatabaseProps]
  
  /* This means you don't have to write `default`, but can instead just say `databaseMod.foo` */
  override def _to: SFC[DatabaseProps] = default
}
