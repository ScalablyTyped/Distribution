package typings.victoryCore

import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.ContextType
import typings.react.mod.ReactElement
import typings.victoryCore.anon.Animate
import typings.victoryCore.anon.AnimationTimer
import typings.victoryCore.anon.ReadonlyVictoryTransition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object victoryTransitionMod {
  
  @JSImport("victory-core/lib/victory-transition/victory-transition", "VictoryTransition")
  @js.native
  open class VictoryTransition protected () extends Component[VictoryTransitionProps, VictoryTransitionState, Any] {
    def this(props: Any, context: Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MVictoryTransition(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MVictoryTransition(): Unit = js.native
    
    @JSName("context")
    var context_VictoryTransition: ContextType[Context[AnimationTimer]] = js.native
    
    /* private */ var continuous: Any = js.native
    
    def getClipWidth(props: Any, child: Any): Any = js.native
    
    /* private */ var getDomainFromChildren: Any = js.native
    
    /* private */ var getTransitionState: Any = js.native
    
    /* private */ var pickDomainProps: Any = js.native
    
    def pickProps(): ReadonlyVictoryTransition = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MVictoryTransition(nextProps: VictoryTransitionProps): Boolean = js.native
    
    /* private */ var timer: Any = js.native
    
    /* private */ var transitionProps: Any = js.native
  }
  /* static members */
  object VictoryTransition {
    
    @JSImport("victory-core/lib/victory-transition/victory-transition", "VictoryTransition")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("victory-core/lib/victory-transition/victory-transition", "VictoryTransition.contextType")
    @js.native
    def contextType: Context[AnimationTimer] = js.native
    inline def contextType_=(x: Context[AnimationTimer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/lib/victory-transition/victory-transition", "VictoryTransition.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/lib/victory-transition/victory-transition", "VictoryTransition.propTypes")
    @js.native
    def propTypes: Animate = js.native
    inline def propTypes_=(x: Animate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  type VictoryTransitionChild = ReactElement
  
  trait VictoryTransitionProps extends StObject {
    
    var animate: js.UndefOr[Boolean | Any] = js.undefined
    
    var animationWhitelist: js.UndefOr[js.Array[String]] = js.undefined
    
    var children: VictoryTransitionChild
  }
  object VictoryTransitionProps {
    
    inline def apply(children: VictoryTransitionChild): VictoryTransitionProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[VictoryTransitionProps]
    }
    
    extension [Self <: VictoryTransitionProps](x: Self) {
      
      inline def setAnimate(value: Boolean | Any): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setAnimationWhitelist(value: js.Array[String]): Self = StObject.set(x, "animationWhitelist", value.asInstanceOf[js.Any])
      
      inline def setAnimationWhitelistUndefined: Self = StObject.set(x, "animationWhitelist", js.undefined)
      
      inline def setAnimationWhitelistVarargs(value: String*): Self = StObject.set(x, "animationWhitelist", js.Array(value*))
      
      inline def setChildren(value: VictoryTransitionChild): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    }
  }
  
  trait VictoryTransitionState extends StObject {
    
    var childrenTransitions: js.UndefOr[Any] = js.undefined
    
    var nextProps: js.UndefOr[VictoryTransitionProps] = js.undefined
    
    var nodesDoneLoad: js.UndefOr[Boolean] = js.undefined
    
    var nodesShouldEnter: js.UndefOr[Boolean] = js.undefined
    
    var nodesShouldLoad: js.UndefOr[Boolean] = js.undefined
    
    var nodesWillEnter: js.UndefOr[Boolean] = js.undefined
    
    var nodesWillExit: js.UndefOr[Boolean] = js.undefined
    
    var oldProps: js.UndefOr[VictoryTransitionProps | Null] = js.undefined
  }
  object VictoryTransitionState {
    
    inline def apply(): VictoryTransitionState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictoryTransitionState]
    }
    
    extension [Self <: VictoryTransitionState](x: Self) {
      
      inline def setChildrenTransitions(value: Any): Self = StObject.set(x, "childrenTransitions", value.asInstanceOf[js.Any])
      
      inline def setChildrenTransitionsUndefined: Self = StObject.set(x, "childrenTransitions", js.undefined)
      
      inline def setNextProps(value: VictoryTransitionProps): Self = StObject.set(x, "nextProps", value.asInstanceOf[js.Any])
      
      inline def setNextPropsUndefined: Self = StObject.set(x, "nextProps", js.undefined)
      
      inline def setNodesDoneLoad(value: Boolean): Self = StObject.set(x, "nodesDoneLoad", value.asInstanceOf[js.Any])
      
      inline def setNodesDoneLoadUndefined: Self = StObject.set(x, "nodesDoneLoad", js.undefined)
      
      inline def setNodesShouldEnter(value: Boolean): Self = StObject.set(x, "nodesShouldEnter", value.asInstanceOf[js.Any])
      
      inline def setNodesShouldEnterUndefined: Self = StObject.set(x, "nodesShouldEnter", js.undefined)
      
      inline def setNodesShouldLoad(value: Boolean): Self = StObject.set(x, "nodesShouldLoad", value.asInstanceOf[js.Any])
      
      inline def setNodesShouldLoadUndefined: Self = StObject.set(x, "nodesShouldLoad", js.undefined)
      
      inline def setNodesWillEnter(value: Boolean): Self = StObject.set(x, "nodesWillEnter", value.asInstanceOf[js.Any])
      
      inline def setNodesWillEnterUndefined: Self = StObject.set(x, "nodesWillEnter", js.undefined)
      
      inline def setNodesWillExit(value: Boolean): Self = StObject.set(x, "nodesWillExit", value.asInstanceOf[js.Any])
      
      inline def setNodesWillExitUndefined: Self = StObject.set(x, "nodesWillExit", js.undefined)
      
      inline def setOldProps(value: VictoryTransitionProps): Self = StObject.set(x, "oldProps", value.asInstanceOf[js.Any])
      
      inline def setOldPropsNull: Self = StObject.set(x, "oldProps", null)
      
      inline def setOldPropsUndefined: Self = StObject.set(x, "oldProps", js.undefined)
    }
  }
}
