package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.IsExpanded
import typings.wixStyleReact.anon.OnClickRequireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTagListTagListMod {
  
  /** TagList */
  @JSImport("wix-style-react/dist/types/TagList/TagList", JSImport.Default)
  @js.native
  open class default protected () extends TagList {
    def this(props: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/TagList/TagList", "default.defaultProps.initiallyExpanded_1")
      @js.native
      val initiallyExpanded1: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/TagList/TagList", "default.defaultProps.maxVisibleTags_1")
      @js.native
      val maxVisibleTags1: Double = js.native
      
      @JSImport("wix-style-react/dist/types/TagList/TagList", "default.defaultProps.size_1")
      @js.native
      val size1: String = js.native
    }
    
    @JSImport("wix-style-react/dist/types/TagList/TagList", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/TagList/TagList", "default.propTypes.actionButton")
      @js.native
      val actionButton: Requireable[InferProps[OnClickRequireable]] = js.native
      
      @JSImport("wix-style-react/dist/types/TagList/TagList", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/TagList/TagList", "default.propTypes.initiallyExpanded")
      @js.native
      val initiallyExpanded: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/TagList/TagList", "default.propTypes.maxVisibleTags")
      @js.native
      val maxVisibleTags: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/TagList/TagList", "default.propTypes.onTagRemove")
      @js.native
      val onTagRemove: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/TagList/TagList", "default.propTypes.size")
      @js.native
      val size: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/TagList/TagList", "default.propTypes.tags")
      @js.native
      val tags: Requireable[js.Array[js.UndefOr[js.Object | Null]]] = js.native
      
      @JSImport("wix-style-react/dist/types/TagList/TagList", "default.propTypes.toggleMoreButton")
      @js.native
      val toggleMoreButton: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    }
  }
  
  /** TagList */
  @js.native
  trait TagList extends PureComponent[Any, Any, Any] {
    
    def _renderToggleMoreButton(): Element | Null = js.native
    
    def _toggleExpanded(): Unit = js.native
    
    @JSName("state")
    var state_TagList: IsExpanded = js.native
  }
}
