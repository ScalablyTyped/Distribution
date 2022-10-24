package typings.wixStyleReact

import typings.react.mod.Context
import typings.wixStyleReact.anon.ComponentDidCatch
import typings.wixStyleReact.anon.ItemsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTabsCoreTabItemsMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("wix-style-react/dist/types/Tabs/core/TabItems", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ComponentDidCatch {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/Tabs/core/TabItems", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/Tabs/core/TabItems", "default.contextType")
    @js.native
    def contextType: js.UndefOr[Context[Any]] = js.native
    inline def contextType_=(x: js.UndefOr[Context[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Tabs/core/TabItems", "default.propTypes")
    @js.native
    def propTypes: ItemsType = js.native
    inline def propTypes_=(x: ItemsType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
