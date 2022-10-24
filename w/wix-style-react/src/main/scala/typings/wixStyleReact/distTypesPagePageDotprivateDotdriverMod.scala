package typings.wixStyleReact

import typings.wixStyleReact.anon.EventTrigger
import typings.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPagePageDotprivateDotdriverMod {
  
  @JSImport("wix-style-react/dist/types/Page/Page.private.driver", "PagePrivateDriver")
  @js.native
  open class PagePrivateDriver protected () extends StObject {
    def this(param0: EventTrigger) = this()
    
    def byDataHook(dataHook: Any): Any = js.native
    
    var element: Any = js.native
    
    var eventTrigger: Any = js.native
    
    def fixedContainer: Any = js.native
    
    def getScrollAmount(): Any = js.native
    
    def getStyle(): Any = js.native
    
    def scrollableContainer: Any = js.native
    
    def setScrollAmount(amount: Any): Unit = js.native
    
    def wheelOnFixedContainer(amount: Any): Unit = js.native
  }
  /* static members */
  object PagePrivateDriver {
    
    @JSImport("wix-style-react/dist/types/Page/Page.private.driver", "PagePrivateDriver")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJsxElement(jsxElement: Any): BaseDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJsxElement")(jsxElement.asInstanceOf[js.Any]).asInstanceOf[BaseDriver]
  }
}
