package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.wixStyleReact.anon.FireKeyDown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCommonFocusableFocusableDotdriverMod {
  
  @JSImport("wix-style-react/dist/types/common/Focusable/Focusable.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-style-react/dist/types/common/Focusable/Focusable.driver", "PureChildComponent")
  @js.native
  open class PureChildComponent protected () extends PureComponent[Any, Any, Any] {
    def this(props: Any) = this()
    
    def boundMethod(): Any = js.native
    
    var id: Any = js.native
    
    def unboundMethod(): String = js.native
  }
  /* static members */
  object PureChildComponent {
    
    @JSImport("wix-style-react/dist/types/common/Focusable/Focusable.driver", "PureChildComponent")
    @js.native
    val ^ : js.Any = js.native
    
    inline def staticMethod(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("staticMethod")().asInstanceOf[String]
    
    @JSImport("wix-style-react/dist/types/common/Focusable/Focusable.driver", "PureChildComponent.staticVariable")
    @js.native
    def staticVariable: String = js.native
    inline def staticVariable_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("staticVariable")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("wix-style-react/dist/types/common/Focusable/Focusable.driver", "WithFocusablePureComponent")
  @js.native
  val WithFocusablePureComponent: Any = js.native
  
  inline def createDriver(Component: Any): FireKeyDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createDriver")(Component.asInstanceOf[js.Any]).asInstanceOf[FireKeyDown]
}
