package typings.wixUiCore

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateFullComponentWrapMod {
  
  @JSImport("wix-ui-core/dist/src/components/ellipsis-tooltip/StateFullComponentWrap", "StateFullComponentWrap")
  @js.native
  class StateFullComponentWrap protected ()
    extends Component[StateFullComponentWrapProps, js.Object, js.Any] {
    def this(props: StateFullComponentWrapProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: StateFullComponentWrapProps, context: js.Any) = this()
  }
  
  trait StateFullComponentWrapProps
    extends StObject
       with /* otherPropName */ StringDictionary[js.Any] {
    
    var children: js.UndefOr[js.Any] = js.undefined
  }
  object StateFullComponentWrapProps {
    
    inline def apply(): StateFullComponentWrapProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StateFullComponentWrapProps]
    }
    
    extension [Self <: StateFullComponentWrapProps](x: Self) {
      
      inline def setChildren(value: js.Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
