package typings.wixStyleReact

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesVerticalTabsVerticalTabsMod {
  
  @JSImport("wix-style-react/dist/types/VerticalTabs/VerticalTabs", JSImport.Default)
  @js.native
  open class default protected () extends VerticalTabs {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/VerticalTabs/VerticalTabs", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      inline def onChange1(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onChange_1")().asInstanceOf[Unit]
      
      @JSImport("wix-style-react/dist/types/VerticalTabs/VerticalTabs", "default.defaultProps.size_1")
      @js.native
      val size1: String = js.native
    }
    
    @JSImport("wix-style-react/dist/types/VerticalTabs/VerticalTabs", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/VerticalTabs/VerticalTabs", "default.propTypes.activeTabId")
      @js.native
      val activeTabId: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/VerticalTabs/VerticalTabs", "default.propTypes.children")
      @js.native
      val children: Requireable[js.Array[ReactNodeLike]] = js.native
      
      @JSImport("wix-style-react/dist/types/VerticalTabs/VerticalTabs", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/VerticalTabs/VerticalTabs", "default.propTypes.onChange")
      @js.native
      val onChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/VerticalTabs/VerticalTabs", "default.propTypes.size")
      @js.native
      val size: Requireable[String] = js.native
    }
  }
  
  @js.native
  trait VerticalTabs extends Component[Any, Any, Any]
}
