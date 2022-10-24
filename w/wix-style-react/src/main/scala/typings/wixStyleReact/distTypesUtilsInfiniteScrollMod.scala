package typings.wixStyleReact

import typings.react.mod.Component
import typings.wixStyleReact.anon.HasMore
import typings.wixStyleReact.anon.InitialLoad
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsInfiniteScrollMod {
  
  @JSImport("wix-style-react/dist/types/utils/InfiniteScroll", JSImport.Default)
  @js.native
  open class default protected () extends InfiniteScroll {
    def this(props: Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/types/utils/InfiniteScroll", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/utils/InfiniteScroll", "default.defaultProps")
    @js.native
    def defaultProps: InitialLoad = js.native
    inline def defaultProps_=(x: InitialLoad): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/utils/InfiniteScroll", "default.propTypes")
    @js.native
    def propTypes: HasMore = js.native
    inline def propTypes_=(x: HasMore): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait InfiniteScroll extends Component[Any, Any, Any] {
    
    var _defaultLoader: Any = js.native
    
    def attachScrollListener(): Unit = js.native
    
    def calculateTopPosition(el: Any): Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MInfiniteScroll(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MInfiniteScroll(prevProps: Any): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MInfiniteScroll(): Unit = js.native
    
    def detachScrollListener(): Unit = js.native
    
    var pageLoaded: Any = js.native
    
    var scrollComponent: Any = js.native
    
    def scrollListener(): Unit = js.native
    
    def setDefaultLoader(loader: Any): Unit = js.native
  }
}
