package typings.useGlobalHook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("use-global-hook", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[S, A](React: ReactInterface, inititalState: S, actions: js.Object): UseGlobal[S, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(React.asInstanceOf[js.Any], inititalState.asInstanceOf[js.Any], actions.asInstanceOf[js.Any])).asInstanceOf[UseGlobal[S, A]]
  @scala.inline
  def default[S, A](React: ReactInterface, inititalState: S, actions: js.Object, options: InitializerFunction[S, A]): UseGlobal[S, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(React.asInstanceOf[js.Any], inititalState.asInstanceOf[js.Any], actions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UseGlobal[S, A]]
  @scala.inline
  def default[S, A](React: ReactInterface, inititalState: S, actions: js.Object, options: Options[S, A]): UseGlobal[S, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(React.asInstanceOf[js.Any], inititalState.asInstanceOf[js.Any], actions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UseGlobal[S, A]]
  
  type IProduce = typings.immer.mod.IProduce
  
  type InitializerFunction[S, A] = js.Function1[/* store */ Store[S, A], Unit]
  
  trait Options[S, A] extends StObject {
    
    var Immer: js.UndefOr[IProduce] = js.undefined
    
    var initializer: js.UndefOr[InitializerFunction[S, A]] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply[S, A](): Options[S, A] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[S, A]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[?, ?], S, A] (val x: Self & (Options[S, A])) extends AnyVal {
      
      @scala.inline
      def setImmer(value: IProduce): Self = StObject.set(x, "Immer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImmerUndefined: Self = StObject.set(x, "Immer", js.undefined)
      
      @scala.inline
      def setInitializer(value: /* store */ Store[S, A] => Unit): Self = StObject.set(x, "initializer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInitializerUndefined: Self = StObject.set(x, "initializer", js.undefined)
    }
  }
  
  // Use an interface so that different versions of React can be used
  trait ReactInterface extends StObject {
    
    def useEffect(args: js.Any*): js.Any
    
    def useMemo(args: js.Any*): js.Any
    
    def useState(args: js.Any*): js.Any
  }
  object ReactInterface {
    
    @scala.inline
    def apply(
      useEffect: /* repeated */ js.Any => js.Any,
      useMemo: /* repeated */ js.Any => js.Any,
      useState: /* repeated */ js.Any => js.Any
    ): ReactInterface = {
      val __obj = js.Dynamic.literal(useEffect = js.Any.fromFunction1(useEffect), useMemo = js.Any.fromFunction1(useMemo), useState = js.Any.fromFunction1(useState))
      __obj.asInstanceOf[ReactInterface]
    }
    
    @scala.inline
    implicit class ReactInterfaceMutableBuilder[Self <: ReactInterface] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUseEffect(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "useEffect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUseMemo(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "useMemo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUseState(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "useState", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Store[S, A] extends StObject {
    
    var actions: A = js.native
    
    def setState(state: S): Unit = js.native
    def setState(state: S, afterUpdateCallback: js.Function0[Unit]): Unit = js.native
    
    var state: S = js.native
  }
  
  type UseGlobal[S, A] = (js.Function0[js.Tuple2[S, A]]) & (js.Function1[/* stateFunc */ js.Function1[/* state */ S, js.Any], js.Tuple2[js.Any, A]]) & (js.Function2[
    /* stateFunc */ js.Function1[/* state */ S, js.Any], 
    /* actionsFunc */ js.Function1[/* state */ A, js.Any], 
    js.Tuple2[js.Any, js.Any]
  ]) & (js.Function2[
    /* stateFunc */ Unit, 
    /* actionsFunc */ js.Function1[/* state */ A, js.Any], 
    js.Tuple2[S, js.Any]
  ])
}
