package typings.wonderJs

import typings.wonderJs.componentMod.Component
import typings.wonderJs.wonderJsNumbers.`4`
import typings.wonderJs.wonderJsNumbers.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentInitOrderTableMod {
  
  @JSImport("wonder.js/dist/es2015/component/data/ComponentInitOrderTable", "ComponentInitOrderTable")
  @js.native
  class ComponentInitOrderTable () extends StObject
  /* static members */
  object ComponentInitOrderTable {
    
    @JSImport("wonder.js/dist/es2015/component/data/ComponentInitOrderTable", "ComponentInitOrderTable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getOrder(component: Component): `4` | `5` = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrder")(component.asInstanceOf[js.Any]).asInstanceOf[`4` | `5`]
  }
}
