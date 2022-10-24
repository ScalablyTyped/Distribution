package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.BelowNode
import typings.wixStyleReact.anon.CheckIndeterminate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSelectorListContentContentMod {
  
  object default {
    
    inline def apply(param0: CheckIndeterminate): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/SelectorList/Content/Content", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/SelectorList/Content/Content", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/SelectorList/Content/Content", "default.defaultProps.dataHook_1")
      @js.native
      val dataHook1: String = js.native
      
      inline def renderNoResults1(searchValue: Any): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("renderNoResults_1")(searchValue.asInstanceOf[js.Any]).asInstanceOf[Element]
    }
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/SelectorList/Content/Content", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/SelectorList/Content/Content", "default.propTypes.checkIndeterminate")
      @js.native
      val checkIndeterminate: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/SelectorList/Content/Content", "default.propTypes.checkIsSelected")
      @js.native
      val checkIsSelected: Validator[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/SelectorList/Content/Content", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/SelectorList/Content/Content", "default.propTypes.emptyState")
      @js.native
      val emptyState: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/SelectorList/Content/Content", "default.propTypes.hasMore")
      @js.native
      val hasMore: Requireable[Boolean] = js.native
      
      inline def imageShape(props: Any, propName: Any, componentName: Any): js.UndefOr[js.Error] = (^.asInstanceOf[js.Dynamic].applyDynamic("imageShape")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Error]]
      
      @JSImport("wix-style-react/dist/types/SelectorList/Content/Content", "default.propTypes.imageSize")
      @js.native
      val imageSize: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/SelectorList/Content/Content", "default.propTypes.isEmpty")
      @js.native
      val isEmpty: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/SelectorList/Content/Content", "default.propTypes.isLoading")
      @js.native
      val isLoading: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/SelectorList/Content/Content", "default.propTypes.items")
      @js.native
      val items: Requireable[js.Array[js.UndefOr[InferProps[BelowNode] | Null]]] = js.native
      
      @JSImport("wix-style-react/dist/types/SelectorList/Content/Content", "default.propTypes.loadMore")
      @js.native
      val loadMore: Validator[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/SelectorList/Content/Content", "default.propTypes.multiple")
      @js.native
      val multiple: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/SelectorList/Content/Content", "default.propTypes.noResultsFound")
      @js.native
      val noResultsFound: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/SelectorList/Content/Content", "default.propTypes.onToggle")
      @js.native
      val onToggle: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/SelectorList/Content/Content", "default.propTypes.renderNoResults")
      @js.native
      val renderNoResults: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/SelectorList/Content/Content", "default.propTypes.searchValue")
      @js.native
      val searchValue: Validator[String] = js.native
      
      @JSImport("wix-style-react/dist/types/SelectorList/Content/Content", "default.propTypes.topScrollableContent")
      @js.native
      val topScrollableContent: Requireable[ReactNodeLike] = js.native
    }
  }
}
