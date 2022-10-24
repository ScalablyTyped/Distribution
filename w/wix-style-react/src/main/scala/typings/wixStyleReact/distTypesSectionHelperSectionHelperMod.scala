package typings.wixStyleReact

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSectionHelperSectionHelperMod {
  
  /**
    * Used in pages where you need to explain or mention things about the content or actions
    */
  @JSImport("wix-style-react/dist/types/SectionHelper/SectionHelper", JSImport.Default)
  @js.native
  open class default protected () extends SectionHelper {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/SectionHelper/SectionHelper", "default.defaultProps.appearance_1")
      @js.native
      val appearance1: String = js.native
      
      @JSImport("wix-style-react/dist/types/SectionHelper/SectionHelper", "default.defaultProps.fullWidth_1")
      @js.native
      val fullWidth1: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/SectionHelper/SectionHelper", "default.defaultProps.showCloseButton_1")
      @js.native
      val showCloseButton1: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/SectionHelper/SectionHelper", "default.defaultProps.size_1")
      @js.native
      val size1: String = js.native
    }
    
    @JSImport("wix-style-react/dist/types/SectionHelper/SectionHelper", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/SectionHelper/SectionHelper", "default.propTypes.actionText")
      @js.native
      val actionText: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/SectionHelper/SectionHelper", "default.propTypes.appearance")
      @js.native
      val appearance: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/SectionHelper/SectionHelper", "default.propTypes.children")
      @js.native
      val children: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/SectionHelper/SectionHelper", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/SectionHelper/SectionHelper", "default.propTypes.fullWidth")
      @js.native
      val fullWidth: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/SectionHelper/SectionHelper", "default.propTypes.onAction")
      @js.native
      val onAction: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/SectionHelper/SectionHelper", "default.propTypes.onClose")
      @js.native
      val onClose: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/SectionHelper/SectionHelper", "default.propTypes.showCloseButton")
      @js.native
      val showCloseButton: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/SectionHelper/SectionHelper", "default.propTypes.size")
      @js.native
      val size: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/SectionHelper/SectionHelper", "default.propTypes.title")
      @js.native
      val title: Requireable[ReactNodeLike] = js.native
    }
  }
  
  /**
    * Used in pages where you need to explain or mention things about the content or actions
    */
  @js.native
  trait SectionHelper extends PureComponent[Any, Any, Any]
}
