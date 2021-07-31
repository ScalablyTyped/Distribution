package typings.uifabricUtilities

import typings.react.mod.Component
import typings.react.mod.Props
import typings.uifabricUtilities.anon.Delay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object delayedRenderMod {
  
  @JSImport("@uifabric/utilities/lib/DelayedRender", "DelayedRender")
  @js.native
  class DelayedRender protected ()
    extends Component[IDelayedRenderProps, IDelayedRenderState, js.Any] {
    def this(props: IDelayedRenderProps) = this()
    
    var _timeoutId: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MDelayedRender(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MDelayedRender(): Unit = js.native
  }
  /* static members */
  object DelayedRender {
    
    @JSImport("@uifabric/utilities/lib/DelayedRender", "DelayedRender")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@uifabric/utilities/lib/DelayedRender", "DelayedRender.defaultProps")
    @js.native
    def defaultProps: Delay = js.native
    @scala.inline
    def defaultProps_=(x: Delay): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait IDelayedRenderProps
    extends StObject
       with Props[js.Object] {
    
    /**
      * Number of milliseconds to delay rendering children.
      */
    var delay: js.UndefOr[Double] = js.undefined
  }
  object IDelayedRenderProps {
    
    @scala.inline
    def apply(): IDelayedRenderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDelayedRenderProps]
    }
    
    @scala.inline
    implicit class IDelayedRenderPropsMutableBuilder[Self <: IDelayedRenderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    }
  }
  
  trait IDelayedRenderState extends StObject {
    
    /**
      * Whether the component is rendered or not.
      */
    var isRendered: Boolean
  }
  object IDelayedRenderState {
    
    @scala.inline
    def apply(isRendered: Boolean): IDelayedRenderState = {
      val __obj = js.Dynamic.literal(isRendered = isRendered.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDelayedRenderState]
    }
    
    @scala.inline
    implicit class IDelayedRenderStateMutableBuilder[Self <: IDelayedRenderState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsRendered(value: Boolean): Self = StObject.set(x, "isRendered", value.asInstanceOf[js.Any])
    }
  }
}
