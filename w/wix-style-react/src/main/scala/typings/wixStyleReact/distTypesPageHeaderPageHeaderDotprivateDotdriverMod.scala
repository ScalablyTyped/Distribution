package typings.wixStyleReact

import typings.wixStyleReact.anon.EventTrigger
import typings.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPageHeaderPageHeaderDotprivateDotdriverMod {
  
  @JSImport("wix-style-react/dist/types/PageHeader/PageHeader.private.driver", "PageHeaderPrivateDriver")
  @js.native
  open class PageHeaderPrivateDriver protected () extends StObject {
    def this(param0: EventTrigger) = this()
    
    def byDataHook(dataHook: Any): Any = js.native
    
    var element: Any = js.native
    
    var eventTrigger: Any = js.native
    
    def existsByDataHook(dataHook: Any): Boolean = js.native
    
    def propExists(dataHook: Any, prop: Any): Boolean = js.native
  }
  /* static members */
  object PageHeaderPrivateDriver {
    
    @JSImport("wix-style-react/dist/types/PageHeader/PageHeader.private.driver", "PageHeaderPrivateDriver")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJsxElement(jsxElement: Any): BaseDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsxElement")(jsxElement.asInstanceOf[js.Any]).asInstanceOf[BaseDriver]
  }
}
