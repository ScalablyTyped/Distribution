package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.Component
import typings.wixStyleReact.anon.MinWidth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTabsCoreTabItemMod {
  
  @JSImport("wix-style-react/dist/types/Tabs/core/TabItem", JSImport.Default)
  @js.native
  open class default protected () extends TabItem {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Tabs/core/TabItem", "default.propTypes.dynamicProperties")
      @js.native
      val dynamicProperties: Requireable[js.Array[Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Tabs/core/TabItem", "default.propTypes.isActive")
      @js.native
      val isActive: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Tabs/core/TabItem", "default.propTypes.item")
      @js.native
      val item: Validator[InferProps[MinWidth]] = js.native
      
      @JSImport("wix-style-react/dist/types/Tabs/core/TabItem", "default.propTypes.itemMaxWidth")
      @js.native
      val itemMaxWidth: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/Tabs/core/TabItem", "default.propTypes.onItemClick")
      @js.native
      val onItemClick: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Tabs/core/TabItem", "default.propTypes.type")
      @js.native
      val `type`: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Tabs/core/TabItem", "default.propTypes.width")
      @js.native
      val width: Requireable[String | Double] = js.native
    }
  }
  
  @js.native
  trait TabItem extends Component[Any, Any, Any] {
    
    def getItemStyle(): Any = js.native
  }
}
