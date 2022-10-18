package typings.uiRouterExtras

import org.scalablytyped.runtime.StringDictionary
import typings.angular.mod.IPromise
import typings.angular.mod.IServiceProvider
import typings.angular.mod.Injectable
import typings.uiRouterExtras.anon.Redirect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object angularMod {
  
  object ui {
    
    /*
      * Docs: http://christopherthielen.github.io/ui-router-extras/#/dsr
      */
    trait IDeepStateRedirectConfig extends StObject {
      
      /*
        * If no deep state has been recorded, DSR will instead redirect to the default substate and params that you specify.
        * If default is a string it is interpreted as the substate.
        */
      var default: js.UndefOr[String | IRedirectParams] = js.undefined
      
      /*
        * A callback function that determines whether or not the redirect should actually occur, or changes the redirect to some other state.
        * Return an object: IRedirectParams to change the redirect
        */
      var fn: js.UndefOr[js.Function1[/* $dsr$ */ Redirect, Boolean | IRedirectParams]] = js.undefined
      
      /*
        * Specify params: true if your DSR state takes parameters.
        * If only a subset of the parameters should be included in the parameter grouping for recording deep states,
        * specify an array of parameter names.
        */
      var params: js.UndefOr[Boolean | js.Array[String]] = js.undefined
    }
    object IDeepStateRedirectConfig {
      
      inline def apply(): IDeepStateRedirectConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IDeepStateRedirectConfig]
      }
      
      extension [Self <: IDeepStateRedirectConfig](x: Self) {
        
        inline def setDefault(value: String | IRedirectParams): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
        
        inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
        
        inline def setFn(value: /* $dsr$ */ Redirect => Boolean | IRedirectParams): Self = StObject.set(x, "fn", js.Any.fromFunction1(value))
        
        inline def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
        
        inline def setParams(value: Boolean | js.Array[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
        
        inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
        
        inline def setParamsVarargs(value: String*): Self = StObject.set(x, "params", js.Array(value*))
      }
    }
    
    /*
      * $deepStateRedirect
      */
    @js.native
    trait IDeepStateRedirectService extends StObject {
      
      /*
        * This method resets stored $deepStateRedirect data so following transitions will behave like there have not been previous transitions.
        * @param stateParams Can be passed in to select specific states to reset:
        *  {
        *    'paramName': 'paramvalue' | ['list', 'of', 'possible', 'paramvalues']
        *  }
        */
      def reset(stateName: String): Unit = js.native
      def reset(stateName: String, stateParams: StringDictionary[String | js.Array[String]]): Unit = js.native
    }
    
    /**
      * A `FutureState` object is a placeholder for full a UI-Router `state`
      */
    trait IFutureState
      extends StObject
         with /* key */ StringDictionary[Any] {
      
      /**
        * The placeholder state name (fully qualified).
        * Attempted transitions to this state (or any substates) will trigger a lazy load of the full UI-Router `state` represented by this FutureState.
        */
      var stateName: String
      
      /**
        * The type of FutureState. This is a used to select a registered StateFactory which is then used to build the full UI-Router `state`
        */
      var `type`: String
      
      /**
        * The placeholder url path fragment (the fragment is the URL prefix which the state will be accessed on, not the URL of the state's source code).
        * Attempted navigations to a URL starting with this fragment will trigger a lazy load of the full UI-Router `state` represented by this FutureState.
        */
      var url: String
    }
    object IFutureState {
      
      inline def apply(stateName: String, `type`: String, url: String): IFutureState = {
        val __obj = js.Dynamic.literal(stateName = stateName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[IFutureState]
      }
      
      extension [Self <: IFutureState](x: Self) {
        
        inline def setStateName(value: String): Self = StObject.set(x, "stateName", value.asInstanceOf[js.Any])
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * `StateFactory` factories convert `FutureState` into a full UI-Router `state`, or `state` tree
      */
    type IFutureStateFactory = Injectable[
        js.Function1[
          /* repeated */ Any, 
          IPromise[
            js.UndefOr[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IState */ Any
            ]
          ]
        ]
      ]
    
    trait IFutureStateProvider extends StObject {
      
      /**
        * Adds a resolve function.
        * `$futureStateProvider` won't reject any state transitions or routes until all resolveFunction promises have been resolved.
        * Resolves may be used to defer routing until the states have been loaded via $http, for instance.
        */
      def addResolve(resolveFn: IResolveFunction): Unit
      
      /**
        * Registers a `FutureState` object as a placeholder for a full UI-Router `state` or `state` tree.
        */
      def futureState(state: IFutureState): Unit
      
      /**
        * Registers a `StateFactory` function for `FutureState` of type `type`.
        */
      def stateFactory(`type`: String, stateFactory: IFutureStateFactory): Unit
    }
    object IFutureStateProvider {
      
      inline def apply(
        addResolve: IResolveFunction => Unit,
        futureState: IFutureState => Unit,
        stateFactory: (String, IFutureStateFactory) => Unit
      ): IFutureStateProvider = {
        val __obj = js.Dynamic.literal(addResolve = js.Any.fromFunction1(addResolve), futureState = js.Any.fromFunction1(futureState), stateFactory = js.Any.fromFunction2(stateFactory))
        __obj.asInstanceOf[IFutureStateProvider]
      }
      
      extension [Self <: IFutureStateProvider](x: Self) {
        
        inline def setAddResolve(value: IResolveFunction => Unit): Self = StObject.set(x, "addResolve", js.Any.fromFunction1(value))
        
        inline def setFutureState(value: IFutureState => Unit): Self = StObject.set(x, "futureState", js.Any.fromFunction1(value))
        
        inline def setStateFactory(value: (String, IFutureStateFactory) => Unit): Self = StObject.set(x, "stateFactory", js.Any.fromFunction2(value))
      }
    }
    
    trait IFutureStateService extends StObject
    
    /*
      * Previous state
      */
    trait IPreviousState extends StObject {
      
      var params: js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IStateParamsService */ Any
          ] = js.undefined
      
      var state: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IState */ Any
    }
    object IPreviousState {
      
      inline def apply(
        state: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IState */ Any
      ): IPreviousState = {
        val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
        __obj.asInstanceOf[IPreviousState]
      }
      
      extension [Self <: IPreviousState](x: Self) {
        
        inline def setParams(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IStateParamsService */ Any
        ): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
        
        inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
        
        inline def setState(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IState */ Any
        ): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Previous state service
      */
    @js.native
    trait IPreviousStateService extends StObject {
      
      /**
        * Forget a memorized name
        * @param memoName Memo name
        */
      def forget(memoName: String): Unit = js.native
      
      /**
        * Get a previous state
        * @param memoName Memo name
        * @return Previous state
        */
      def get(): IPreviousState = js.native
      def get(memoName: String): IPreviousState = js.native
      
      /**
        * Go to a state
        * @param memoName Memo name
        * @param options State options
        * @return Promise
        */
      def go(memoName: String): IPromise[Any] = js.native
      def go(
        memoName: String,
        options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IStateOptions */ Any
      ): IPromise[Any] = js.native
      
      /**
        * Memorize a state
        * @param memoName Memo name
        * @param defaultStateName Default state name
        * @param defaultStateParams Default state parameters
        */
      def memo(memoName: String): Unit = js.native
      def memo(memoName: String, defaultStateName: String): Unit = js.native
      def memo(memoName: String, defaultStateName: String, defaultStateParams: js.Object): Unit = js.native
      def memo(memoName: String, defaultStateName: Unit, defaultStateParams: js.Object): Unit = js.native
    }
    
    trait IRedirectParams extends StObject {
      
      var params: js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IStateParamsService */ Any
          ] = js.undefined
      
      var state: String
    }
    object IRedirectParams {
      
      inline def apply(state: String): IRedirectParams = {
        val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
        __obj.asInstanceOf[IRedirectParams]
      }
      
      extension [Self <: IRedirectParams](x: Self) {
        
        inline def setParams(
          value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IStateParamsService */ Any
        ): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
        
        inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
        
        inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      }
    }
    
    type IResolveFunction = Injectable[js.Function1[/* repeated */ Any, IPromise[Any]]]
    
    @js.native
    trait IStateProvider
      extends StObject
         with IServiceProvider {
      
      def state(config: IStickyState): IStateProvider = js.native
      def state(name: String, config: IStickyState): IStateProvider = js.native
    }
    
    /**
      * Sticky state
      */
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IState * / any */ trait IStickyState extends StObject {
      
      /*
        * The most-recently-activate substate of the DSR marked state is remembered.
        * When the DSR marked state is transitioned to directly, UI-Router Extras will instead redirect to the remembered state and parameters.
        * Docs: http://christopherthielen.github.io/ui-router-extras/#/dsr
        */
      var deepStateRedirect: js.UndefOr[Boolean | IDeepStateRedirectConfig] = js.undefined
      
      /*
        * Shortname deepStateRedirect prop
        */
      var dsr: js.UndefOr[Boolean | IDeepStateRedirectConfig] = js.undefined
      
      /*
        * Function (injectable). Called when a sticky state is navigated away from (inactivated).
        */
      var onInactivate: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
      
      /*
        * Function (injectable). Called when an inactive sticky state is navigated to (reactivated).
        */
      var onReactivate: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
      
      /*
        * When marking a state sticky, the state must target its own unique named ui-view.
        * Docs: http://christopherthielen.github.io/ui-router-extras/#/sticky
        */
      var sticky: js.UndefOr[Boolean] = js.undefined
      
      /*
        * Note: named views are mandatory when using sticky states!
        */
      var views: js.UndefOr[
            StringDictionary[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IState */ Any
            ]
          ] = js.undefined
    }
    object IStickyState {
      
      inline def apply(): IStickyState = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IStickyState]
      }
      
      extension [Self <: IStickyState](x: Self) {
        
        inline def setDeepStateRedirect(value: Boolean | IDeepStateRedirectConfig): Self = StObject.set(x, "deepStateRedirect", value.asInstanceOf[js.Any])
        
        inline def setDeepStateRedirectUndefined: Self = StObject.set(x, "deepStateRedirect", js.undefined)
        
        inline def setDsr(value: Boolean | IDeepStateRedirectConfig): Self = StObject.set(x, "dsr", value.asInstanceOf[js.Any])
        
        inline def setDsrUndefined: Self = StObject.set(x, "dsr", js.undefined)
        
        inline def setOnInactivate(value: /* repeated */ Any => Unit): Self = StObject.set(x, "onInactivate", js.Any.fromFunction1(value))
        
        inline def setOnInactivateUndefined: Self = StObject.set(x, "onInactivate", js.undefined)
        
        inline def setOnReactivate(value: /* repeated */ Any => Unit): Self = StObject.set(x, "onReactivate", js.Any.fromFunction1(value))
        
        inline def setOnReactivateUndefined: Self = StObject.set(x, "onReactivate", js.undefined)
        
        inline def setSticky(value: Boolean): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
        
        inline def setStickyUndefined: Self = StObject.set(x, "sticky", js.undefined)
        
        inline def setViews(
          value: StringDictionary[
                  /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IState */ Any
                ]
        ): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
        
        inline def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
      }
    }
    
    /**
      * Sticky state provider
      */
    trait IStickyStateProvider
      extends StObject
         with IServiceProvider {
      
      def debugMode(): Boolean
      
      def enableDebug(enabled: Boolean): Boolean
      
      def registerStickyState(state: IStickyState): Unit
    }
    object IStickyStateProvider {
      
      inline def apply(
        $get: Any,
        debugMode: () => Boolean,
        enableDebug: Boolean => Boolean,
        registerStickyState: IStickyState => Unit
      ): IStickyStateProvider = {
        val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], debugMode = js.Any.fromFunction0(debugMode), enableDebug = js.Any.fromFunction1(enableDebug), registerStickyState = js.Any.fromFunction1(registerStickyState))
        __obj.asInstanceOf[IStickyStateProvider]
      }
      
      extension [Self <: IStickyStateProvider](x: Self) {
        
        inline def setDebugMode(value: () => Boolean): Self = StObject.set(x, "debugMode", js.Any.fromFunction0(value))
        
        inline def setEnableDebug(value: Boolean => Boolean): Self = StObject.set(x, "enableDebug", js.Any.fromFunction1(value))
        
        inline def setRegisterStickyState(value: IStickyState => Unit): Self = StObject.set(x, "registerStickyState", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * Sticky state service
      */
    @js.native
    trait IStickyStateService extends StObject {
      
      def getInactiveStates(): js.Array[IStickyState] = js.native
      
      /*
        * If there is an inactive state named inactiveStateName, this method exits that state.
        * If stateParams is provided, then the state is only exited if the params match the inactive params.
        * If inactiveStateName === '*', then all inactive states are exited
        */
      def reset(inactiveStateName: String): Unit = js.native
      def reset(inactiveStateName: String, stateParams: StringDictionary[String | js.Array[String]]): Unit = js.native
    }
  }
}
