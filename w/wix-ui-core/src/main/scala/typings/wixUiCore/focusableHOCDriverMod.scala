package typings.wixUiCore

import typings.react.mod.PureComponent
import typings.wixUiCore.anon.FireKeyDown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object focusableHOCDriverMod {
  
  @JSImport("wix-ui-core/dist/src/hocs/Focusable/FocusableHOC.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-ui-core/dist/src/hocs/Focusable/FocusableHOC.driver", "PureChildComponent")
  @js.native
  class PureChildComponent protected ()
    extends PureComponent[IPureChildComponentProps, js.Object, js.Any] {
    def this(props: js.Any) = this()
    
    def boundMethod(): String = js.native
    
    /* private */ val id: js.Any = js.native
    
    def unboundMethod(): String = js.native
  }
  /* static members */
  object PureChildComponent {
    
    @JSImport("wix-ui-core/dist/src/hocs/Focusable/FocusableHOC.driver", "PureChildComponent")
    @js.native
    val ^ : js.Any = js.native
    
    inline def staticMethod(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("staticMethod")().asInstanceOf[String]
    
    @JSImport("wix-ui-core/dist/src/hocs/Focusable/FocusableHOC.driver", "PureChildComponent.staticVariable")
    @js.native
    def staticVariable: String = js.native
    inline def staticVariable_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("staticVariable")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("wix-ui-core/dist/src/hocs/Focusable/FocusableHOC.driver", "WithFocusableComp")
  @js.native
  val WithFocusableComp: js.Any = js.native
  
  inline def createDriver(Component: js.Any): FireKeyDown = ^.asInstanceOf[js.Dynamic].applyDynamic("createDriver")(Component.asInstanceOf[js.Any]).asInstanceOf[FireKeyDown]
  
  trait IPureChildComponentProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    /** hook for testing purposes */
    var `data-hook`: js.UndefOr[String] = js.undefined
    
    var focusableOnBlur: js.Any
    
    var focusableOnFocus: js.Any
    
    var id: String
  }
  object IPureChildComponentProps {
    
    inline def apply(focusableOnBlur: js.Any, focusableOnFocus: js.Any, id: String): IPureChildComponentProps = {
      val __obj = js.Dynamic.literal(focusableOnBlur = focusableOnBlur.asInstanceOf[js.Any], focusableOnFocus = focusableOnFocus.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPureChildComponentProps]
    }
    
    extension [Self <: IPureChildComponentProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
      
      inline def `setData-hookUndefined`: Self = StObject.set(x, "data-hook", js.undefined)
      
      inline def setFocusableOnBlur(value: js.Any): Self = StObject.set(x, "focusableOnBlur", value.asInstanceOf[js.Any])
      
      inline def setFocusableOnFocus(value: js.Any): Self = StObject.set(x, "focusableOnFocus", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  object global {
    
    trait Window extends StObject {
      
      var Event: js.Any
    }
    object Window {
      
      inline def apply(Event: js.Any): Window = {
        val __obj = js.Dynamic.literal(Event = Event.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def setEvent(value: js.Any): Self = StObject.set(x, "Event", value.asInstanceOf[js.Any])
      }
    }
  }
}
