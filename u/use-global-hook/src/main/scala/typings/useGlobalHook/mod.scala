package typings.useGlobalHook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("use-global-hook", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[S, A](React: ReactInterface, inititalState: S, actions: js.Object): UseGlobal[S, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(React.asInstanceOf[js.Any], inititalState.asInstanceOf[js.Any], actions.asInstanceOf[js.Any])).asInstanceOf[UseGlobal[S, A]]
  inline def default[S, A](React: ReactInterface, inititalState: S, actions: js.Object, options: InitializerFunction[S, A]): UseGlobal[S, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(React.asInstanceOf[js.Any], inititalState.asInstanceOf[js.Any], actions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UseGlobal[S, A]]
  inline def default[S, A](React: ReactInterface, inititalState: S, actions: js.Object, options: Options[S, A]): UseGlobal[S, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(React.asInstanceOf[js.Any], inititalState.asInstanceOf[js.Any], actions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UseGlobal[S, A]]
  
  type IProduce = typings.immer.typesExternalMod.IProduce
  
  type InitializerFunction[S, A] = js.Function1[/* store */ Store[S, A], Unit]
  
  trait Options[S, A] extends StObject {
    
    var Immer: js.UndefOr[IProduce] = js.undefined
    
    var initializer: js.UndefOr[InitializerFunction[S, A]] = js.undefined
  }
  object Options {
    
    inline def apply[S, A](): Options[S, A] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[S, A]]
    }
    
    extension [Self <: Options[?, ?], S, A](x: Self & (Options[S, A])) {
      
      inline def setImmer(value: IProduce): Self = StObject.set(x, "Immer", value.asInstanceOf[js.Any])
      
      inline def setImmerUndefined: Self = StObject.set(x, "Immer", js.undefined)
      
      inline def setInitializer(value: /* store */ Store[S, A] => Unit): Self = StObject.set(x, "initializer", js.Any.fromFunction1(value))
      
      inline def setInitializerUndefined: Self = StObject.set(x, "initializer", js.undefined)
    }
  }
  
  // Use an interface so that different versions of React can be used
  trait ReactInterface extends StObject {
    
    def useEffect(args: Any*): Any
    
    def useMemo(args: Any*): Any
    
    def useState(args: Any*): Any
  }
  object ReactInterface {
    
    inline def apply(
      useEffect: /* repeated */ Any => Any,
      useMemo: /* repeated */ Any => Any,
      useState: /* repeated */ Any => Any
    ): ReactInterface = {
      val __obj = js.Dynamic.literal(useEffect = js.Any.fromFunction1(useEffect), useMemo = js.Any.fromFunction1(useMemo), useState = js.Any.fromFunction1(useState))
      __obj.asInstanceOf[ReactInterface]
    }
    
    extension [Self <: ReactInterface](x: Self) {
      
      inline def setUseEffect(value: /* repeated */ Any => Any): Self = StObject.set(x, "useEffect", js.Any.fromFunction1(value))
      
      inline def setUseMemo(value: /* repeated */ Any => Any): Self = StObject.set(x, "useMemo", js.Any.fromFunction1(value))
      
      inline def setUseState(value: /* repeated */ Any => Any): Self = StObject.set(x, "useState", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Store[S, A] extends StObject {
    
    var actions: A = js.native
    
    def setState(state: S): Unit = js.native
    def setState(state: S, afterUpdateCallback: js.Function0[Unit]): Unit = js.native
    
    var state: S = js.native
  }
  
  type UseGlobal[S, A] = (js.Function0[js.Tuple2[S, A]]) & (js.Function1[/* stateFunc */ js.Function1[/* state */ S, Any], js.Tuple2[Any, A]]) & (js.Function2[
    /* stateFunc */ js.Function1[/* state */ S, Any], 
    /* actionsFunc */ js.Function1[/* state */ A, Any], 
    js.Tuple2[Any, Any]
  ]) & (js.Function2[
    /* stateFunc */ Unit, 
    /* actionsFunc */ js.Function1[/* state */ A, Any], 
    js.Tuple2[S, Any]
  ])
}
