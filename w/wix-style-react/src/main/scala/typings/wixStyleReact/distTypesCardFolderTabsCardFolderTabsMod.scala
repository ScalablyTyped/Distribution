package typings.wixStyleReact

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCardFolderTabsCardFolderTabsMod {
  
  @JSImport("wix-style-react/dist/types/CardFolderTabs/CardFolderTabs", JSImport.Default)
  @js.native
  open class default protected () extends CardFolderTabs {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/CardFolderTabs/CardFolderTabs", "default.defaultProps.ellipsis_1")
      @js.native
      val ellipsis1: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/CardFolderTabs/CardFolderTabs", "default.defaultProps.fluid_1")
      @js.native
      val fluid1: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/CardFolderTabs/CardFolderTabs", "default.defaultProps.maxTabWidth_1")
      @js.native
      val maxTabWidth1: String = js.native
      
      @JSImport("wix-style-react/dist/types/CardFolderTabs/CardFolderTabs", "default.defaultProps.size_1")
      @js.native
      val size1: String = js.native
    }
    
    @JSImport("wix-style-react/dist/types/CardFolderTabs/CardFolderTabs", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/CardFolderTabs/CardFolderTabs", "default.propTypes.activeId")
      @js.native
      val activeId: Validator[String] = js.native
      
      @JSImport("wix-style-react/dist/types/CardFolderTabs/CardFolderTabs", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/CardFolderTabs/CardFolderTabs", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/CardFolderTabs/CardFolderTabs", "default.propTypes.ellipsis")
      @js.native
      val ellipsis: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/CardFolderTabs/CardFolderTabs", "default.propTypes.fluid")
      @js.native
      val fluid: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/CardFolderTabs/CardFolderTabs", "default.propTypes.maxTabWidth")
      @js.native
      val maxTabWidth: Requireable[String | Double] = js.native
      
      @JSImport("wix-style-react/dist/types/CardFolderTabs/CardFolderTabs", "default.propTypes.onTabChange")
      @js.native
      val onTabChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/CardFolderTabs/CardFolderTabs", "default.propTypes.size")
      @js.native
      val size: Requireable[String] = js.native
    }
  }
  
  @js.native
  trait CardFolderTabs extends PureComponent[Any, Any, Any]
}
