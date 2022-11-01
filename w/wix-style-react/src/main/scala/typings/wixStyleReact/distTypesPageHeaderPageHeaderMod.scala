package typings.wixStyleReact

import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import typings.wixStyleReact.anon.ThemedBreadcrumbs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPageHeaderPageHeaderMod {
  
  @JSImport("wix-style-react/dist/types/PageHeader/PageHeader", JSImport.Default)
  @js.native
  open class default protected () extends PageHeader {
    def this(props: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/PageHeader/PageHeader", "default.defaultProps.minimized_1")
      @js.native
      val minimized1: Boolean = js.native
    }
    
    @JSImport("wix-style-react/dist/types/PageHeader/PageHeader", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/PageHeader/PageHeader", "default.propTypes.actionsBar")
      @js.native
      val actionsBar: Requireable[
            String | Double | Boolean | (js.Function1[/* repeated */ Any, Any]) | ReactElementLike | ReactNodeArray
          ] = js.native
      
      @JSImport("wix-style-react/dist/types/PageHeader/PageHeader", "default.propTypes.breadcrumbs")
      @js.native
      val breadcrumbs: Requireable[
            String | Double | Boolean | (js.Function1[/* repeated */ Any, Any]) | ReactElementLike | ReactNodeArray
          ] = js.native
      
      @JSImport("wix-style-react/dist/types/PageHeader/PageHeader", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/PageHeader/PageHeader", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/PageHeader/PageHeader", "default.propTypes.hasBackgroundImage")
      @js.native
      val hasBackgroundImage: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/PageHeader/PageHeader", "default.propTypes.minimized")
      @js.native
      val minimized: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/PageHeader/PageHeader", "default.propTypes.onBackClicked")
      @js.native
      val onBackClicked: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/PageHeader/PageHeader", "default.propTypes.showBackButton")
      @js.native
      val showBackButton: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/PageHeader/PageHeader", "default.propTypes.skin")
      @js.native
      val skin: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/PageHeader/PageHeader", "default.propTypes.subtitle")
      @js.native
      val subtitle: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/PageHeader/PageHeader", "default.propTypes.title")
      @js.native
      val title: Requireable[
            String | Double | Boolean | (js.Function1[/* repeated */ Any, Any]) | ReactElementLike | ReactNodeArray
          ] = js.native
    }
  }
  
  @js.native
  trait PageHeader extends PureComponent[Any, Any, Any] {
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MPageHeader(nextProps: Any): Unit = js.native
    
    def _animateComponent(show: Any, useEnterDelay: Any, content: Any): Any = js.native
    
    @JSName("state")
    var state_PageHeader: ThemedBreadcrumbs = js.native
  }
}
