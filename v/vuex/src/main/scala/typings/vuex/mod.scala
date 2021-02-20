package typings.vuex

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.std.Error
import typings.std.Record
import typings.vue.optionsMod.WatchOptions
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import typings.vuex.anon.Actions
import typings.vuex.anon.FnCall
import typings.vuex.helpersMod.ActionMethod
import typings.vuex.helpersMod.Computed
import typings.vuex.helpersMod.CustomVue
import typings.vuex.helpersMod.Mapper
import typings.vuex.helpersMod.MapperForAction
import typings.vuex.helpersMod.MapperForActionWithNamespace
import typings.vuex.helpersMod.MapperForMutation
import typings.vuex.helpersMod.MapperForMutationWithNamespace
import typings.vuex.helpersMod.MapperForState
import typings.vuex.helpersMod.MapperForStateWithNamespace
import typings.vuex.helpersMod.MapperWithNamespace
import typings.vuex.helpersMod.MutationMethod
import typings.vuex.helpersMod.NamespacedMappers
import typings.vuex.loggerMod.LoggerOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("vuex", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vuex", "default.Store")
    @js.native
    def Store: Instantiable1[
        /* options */ StoreOptions[/* import warning: RewrittenClass.unapply cls was tparam S */ js.Any], 
        typings.vuex.mod.Store[js.Object]
      ] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("vuex", "default.Store")
    @js.native
    class StoreCls[S] protected () extends Store[S] {
      def this(options: StoreOptions[/* import warning: RewrittenClass.unapply cls was tparam S */ _]) = this()
    }
    
    @scala.inline
    def Store_=(
      x: Instantiable1[
          /* options */ StoreOptions[/* import warning: RewrittenClass.unapply cls was tparam S */ js.Any], 
          Store[js.Object]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Store")(x.asInstanceOf[js.Any])
    
    @JSImport("vuex", "default.createLogger")
    @js.native
    def createLogger[S](): Plugin[S] = js.native
    @JSImport("vuex", "default.createLogger")
    @js.native
    def createLogger[S](option: LoggerOption[S]): Plugin[S] = js.native
    @JSImport("vuex", "default.createLogger")
    @js.native
    def createLogger_Fdefault: FnCall = js.native
    
    @scala.inline
    def createLogger_Fdefault_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createLogger")(x.asInstanceOf[js.Any])
    
    @JSImport("vuex", "default.createNamespacedHelpers")
    @js.native
    def createNamespacedHelpers: js.Function1[/* namespace */ String, NamespacedMappers] = js.native
    @JSImport("vuex", "default.createNamespacedHelpers")
    @js.native
    def createNamespacedHelpers(namespace: String): NamespacedMappers = js.native
    @scala.inline
    def createNamespacedHelpers_=(x: js.Function1[/* namespace */ String, NamespacedMappers]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createNamespacedHelpers")(x.asInstanceOf[js.Any])
    
    @JSImport("vuex", "default.install")
    @js.native
    def install: js.Function1[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof _Vue */ /* Vue */ js.Any, 
        Unit
      ] = js.native
    @JSImport("vuex", "default.install")
    @js.native
    def install(Vue: /* import warning: importer.ImportType#apply Failed type conversion: typeof _Vue */ js.Any): Unit = js.native
    @scala.inline
    def install_=(
      x: js.Function1[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof _Vue */ /* Vue */ js.Any, 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("install")(x.asInstanceOf[js.Any])
    
    @JSImport("vuex", "default.mapActions")
    @js.native
    def mapActions: Mapper[ActionMethod] with MapperWithNamespace[ActionMethod] with MapperForAction with MapperForActionWithNamespace = js.native
    @JSImport("vuex", "default.mapActions")
    @js.native
    def mapActions[Map /* <: Record[String, String] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Map ]: vuex.vuex/types/helpers.ActionMethod}
      */ typings.vuex.vuexStrings.mapActions with TopLevel[js.Any] = js.native
    @JSImport("vuex", "default.mapActions")
    @js.native
    def mapActions[Key /* <: String */](map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in Key ]: vuex.vuex/types/helpers.ActionMethod}
      */ typings.vuex.vuexStrings.mapActions with TopLevel[js.Any] = js.native
    @JSImport("vuex", "default.mapActions")
    @js.native
    def mapActions[Map /* <: Record[String, String] */](namespace: String, map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Map ]: vuex.vuex/types/helpers.ActionMethod}
      */ typings.vuex.vuexStrings.mapActions with TopLevel[js.Any] = js.native
    @JSImport("vuex", "default.mapActions")
    @js.native
    def mapActions[Key /* <: String */](namespace: String, map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in Key ]: vuex.vuex/types/helpers.ActionMethod}
      */ typings.vuex.vuexStrings.mapActions with TopLevel[js.Any] = js.native
    @scala.inline
    def mapActions_=(
      x: Mapper[ActionMethod] with MapperWithNamespace[ActionMethod] with MapperForAction with MapperForActionWithNamespace
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mapActions")(x.asInstanceOf[js.Any])
    @JSImport("vuex", "default.mapActions")
    @js.native
    def mapActions_Map_RecordStringThisFunction2CustomVueDispatchWildcardWildcard[Map /* <: Record[
        String, 
        js.ThisFunction2[/* this */ CustomVue, /* dispatch */ Dispatch, /* repeated */ _, _]
      ] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Map ]: vuex.vuex/types/helpers.InlineMethod<Map[K]>}
      */ typings.vuex.vuexStrings.mapActions with TopLevel[Map] = js.native
    @JSImport("vuex", "default.mapActions")
    @js.native
    def mapActions_Map_RecordStringThisFunction2CustomVueDispatchWildcardWildcard[Map /* <: Record[
        String, 
        js.ThisFunction2[/* this */ CustomVue, /* dispatch */ Dispatch, /* repeated */ _, _]
      ] */](namespace: String, map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Map ]: vuex.vuex/types/helpers.InlineMethod<Map[K]>}
      */ typings.vuex.vuexStrings.mapActions with TopLevel[Map] = js.native
    
    @JSImport("vuex", "default.mapGetters")
    @js.native
    def mapGetters: Mapper[Computed] with MapperWithNamespace[Computed] = js.native
    @JSImport("vuex", "default.mapGetters")
    @js.native
    def mapGetters[Map /* <: Record[String, String] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Map ]: vuex.vuex/types/helpers.Computed}
      */ typings.vuex.vuexStrings.mapGetters with TopLevel[js.Any] = js.native
    @JSImport("vuex", "default.mapGetters")
    @js.native
    def mapGetters[Key /* <: String */](map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in Key ]: vuex.vuex/types/helpers.Computed}
      */ typings.vuex.vuexStrings.mapGetters with TopLevel[js.Any] = js.native
    @JSImport("vuex", "default.mapGetters")
    @js.native
    def mapGetters[Map /* <: Record[String, String] */](namespace: String, map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Map ]: vuex.vuex/types/helpers.Computed}
      */ typings.vuex.vuexStrings.mapGetters with TopLevel[js.Any] = js.native
    @JSImport("vuex", "default.mapGetters")
    @js.native
    def mapGetters[Key /* <: String */](namespace: String, map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in Key ]: vuex.vuex/types/helpers.Computed}
      */ typings.vuex.vuexStrings.mapGetters with TopLevel[js.Any] = js.native
    @scala.inline
    def mapGetters_=(x: Mapper[Computed] with MapperWithNamespace[Computed]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mapGetters")(x.asInstanceOf[js.Any])
    
    @JSImport("vuex", "default.mapMutations")
    @js.native
    def mapMutations: Mapper[MutationMethod] with MapperWithNamespace[MutationMethod] with MapperForMutation with MapperForMutationWithNamespace = js.native
    @JSImport("vuex", "default.mapMutations")
    @js.native
    def mapMutations[Map /* <: Record[
        String, 
        js.ThisFunction2[/* this */ CustomVue, /* commit */ Commit, /* repeated */ _, _]
      ] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Map ]: vuex.vuex/types/helpers.InlineMethod<Map[K]>}
      */ typings.vuex.vuexStrings.mapMutations with TopLevel[Map] = js.native
    @JSImport("vuex", "default.mapMutations")
    @js.native
    def mapMutations[Key /* <: String */](map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in Key ]: vuex.vuex/types/helpers.MutationMethod}
      */ typings.vuex.vuexStrings.mapMutations with TopLevel[js.Any] = js.native
    @JSImport("vuex", "default.mapMutations")
    @js.native
    def mapMutations[Map /* <: Record[
        String, 
        js.ThisFunction2[/* this */ CustomVue, /* commit */ Commit, /* repeated */ _, _]
      ] */](namespace: String, map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Map ]: vuex.vuex/types/helpers.InlineMethod<Map[K]>}
      */ typings.vuex.vuexStrings.mapMutations with TopLevel[Map] = js.native
    @JSImport("vuex", "default.mapMutations")
    @js.native
    def mapMutations[Key /* <: String */](namespace: String, map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in Key ]: vuex.vuex/types/helpers.MutationMethod}
      */ typings.vuex.vuexStrings.mapMutations with TopLevel[js.Any] = js.native
    @scala.inline
    def mapMutations_=(
      x: Mapper[MutationMethod] with MapperWithNamespace[MutationMethod] with MapperForMutation with MapperForMutationWithNamespace
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mapMutations")(x.asInstanceOf[js.Any])
    @JSImport("vuex", "default.mapMutations")
    @js.native
    def mapMutations_Map_RecordStringString[Map /* <: Record[String, String] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Map ]: vuex.vuex/types/helpers.MutationMethod}
      */ typings.vuex.vuexStrings.mapMutations with TopLevel[js.Any] = js.native
    @JSImport("vuex", "default.mapMutations")
    @js.native
    def mapMutations_Map_RecordStringString[Map /* <: Record[String, String] */](namespace: String, map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Map ]: vuex.vuex/types/helpers.MutationMethod}
      */ typings.vuex.vuexStrings.mapMutations with TopLevel[js.Any] = js.native
    
    @JSImport("vuex", "default.mapState")
    @js.native
    def mapState: Mapper[Computed] with MapperWithNamespace[Computed] with MapperForState with MapperForStateWithNamespace = js.native
    @JSImport("vuex", "default.mapState")
    @js.native
    def mapState[Map /* <: Record[String, String] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Map ]: vuex.vuex/types/helpers.Computed}
      */ typings.vuex.vuexStrings.mapState with TopLevel[js.Any] = js.native
    @JSImport("vuex", "default.mapState")
    @js.native
    def mapState[Key /* <: String */](map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in Key ]: vuex.vuex/types/helpers.Computed}
      */ typings.vuex.vuexStrings.mapState with TopLevel[js.Any] = js.native
    @JSImport("vuex", "default.mapState")
    @js.native
    def mapState[Map /* <: Record[String, String] */](namespace: String, map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Map ]: vuex.vuex/types/helpers.Computed}
      */ typings.vuex.vuexStrings.mapState with TopLevel[js.Any] = js.native
    @JSImport("vuex", "default.mapState")
    @js.native
    def mapState[Key /* <: String */](namespace: String, map: js.Array[Key]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in Key ]: vuex.vuex/types/helpers.Computed}
      */ typings.vuex.vuexStrings.mapState with TopLevel[js.Any] = js.native
    @scala.inline
    def mapState_=(
      x: Mapper[Computed] with MapperWithNamespace[Computed] with MapperForState with MapperForStateWithNamespace
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mapState")(x.asInstanceOf[js.Any])
    @JSImport("vuex", "default.mapState")
    @js.native
    def mapState_SMap_RecordStringThisFunction2CustomVueSWildcardWildcard[S, Map /* <: Record[String, js.ThisFunction2[/* this */ CustomVue, /* state */ S, /* getters */ _, _]] */](map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Map ]: vuex.vuex/types/helpers.InlineComputed<Map[K]>}
      */ typings.vuex.vuexStrings.mapState with TopLevel[Map] = js.native
    @JSImport("vuex", "default.mapState")
    @js.native
    def mapState_SMap_RecordStringThisFunction2CustomVueSWildcardWildcard[S, Map /* <: Record[String, js.ThisFunction2[/* this */ CustomVue, /* state */ S, /* getters */ _, _]] */](namespace: String, map: Map): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof Map ]: vuex.vuex/types/helpers.InlineComputed<Map[K]>}
      */ typings.vuex.vuexStrings.mapState with TopLevel[Map] = js.native
  }
  
  @JSImport("vuex", "Store")
  @js.native
  class Store[S] protected () extends StObject {
    def this(options: StoreOptions[S]) = this()
    
    def commit(`type`: String): Unit = js.native
    def commit(`type`: String, payload: js.UndefOr[scala.Nothing], options: CommitOptions): Unit = js.native
    def commit(`type`: String, payload: js.Any): Unit = js.native
    def commit(`type`: String, payload: js.Any, options: CommitOptions): Unit = js.native
    def commit[P /* <: Payload */](payloadWithType: P): Unit = js.native
    def commit[P /* <: Payload */](payloadWithType: P, options: CommitOptions): Unit = js.native
    @JSName("commit")
    var commit_Original: Commit = js.native
    
    def dispatch(`type`: String): js.Promise[_] = js.native
    def dispatch(`type`: String, payload: js.UndefOr[scala.Nothing], options: DispatchOptions): js.Promise[_] = js.native
    def dispatch(`type`: String, payload: js.Any): js.Promise[_] = js.native
    def dispatch(`type`: String, payload: js.Any, options: DispatchOptions): js.Promise[_] = js.native
    def dispatch[P /* <: Payload */](payloadWithType: P): js.Promise[_] = js.native
    def dispatch[P /* <: Payload */](payloadWithType: P, options: DispatchOptions): js.Promise[_] = js.native
    @JSName("dispatch")
    var dispatch_Original: Dispatch = js.native
    
    val getters: js.Any = js.native
    
    def hasModule(path: String): Boolean = js.native
    def hasModule(path: js.Array[String]): Boolean = js.native
    
    def hotUpdate(options: Actions[S]): Unit = js.native
    
    def registerModule[T](path: String, module: Module[T, S]): Unit = js.native
    def registerModule[T](path: String, module: Module[T, S], options: ModuleOptions): Unit = js.native
    def registerModule[T](path: js.Array[String], module: Module[T, S]): Unit = js.native
    def registerModule[T](path: js.Array[String], module: Module[T, S], options: ModuleOptions): Unit = js.native
    
    def replaceState(state: S): Unit = js.native
    
    val state: S = js.native
    
    def subscribe[P /* <: MutationPayload */](fn: js.Function2[/* mutation */ P, /* state */ S, _]): js.Function0[Unit] = js.native
    def subscribe[P /* <: MutationPayload */](fn: js.Function2[/* mutation */ P, /* state */ S, _], options: SubscribeOptions): js.Function0[Unit] = js.native
    
    def subscribeAction[P /* <: ActionPayload */](fn: SubscribeActionOptions[P, S]): js.Function0[Unit] = js.native
    def subscribeAction[P /* <: ActionPayload */](fn: SubscribeActionOptions[P, S], options: SubscribeOptions): js.Function0[Unit] = js.native
    
    def unregisterModule(path: String): Unit = js.native
    def unregisterModule(path: js.Array[String]): Unit = js.native
    
    def watch[T](
      getter: js.Function2[/* state */ S, /* getters */ js.Any, T],
      cb: js.Function2[/* value */ T, /* oldValue */ T, Unit]
    ): js.Function0[Unit] = js.native
    def watch[T](
      getter: js.Function2[/* state */ S, /* getters */ js.Any, T],
      cb: js.Function2[/* value */ T, /* oldValue */ T, Unit],
      options: WatchOptions
    ): js.Function0[Unit] = js.native
  }
  
  @JSImport("vuex", "createLogger")
  @js.native
  def createLogger[S](): Plugin[S] = js.native
  @JSImport("vuex", "createLogger")
  @js.native
  def createLogger[S](option: LoggerOption[S]): Plugin[S] = js.native
  
  @JSImport("vuex", "createNamespacedHelpers")
  @js.native
  def createNamespacedHelpers(namespace: String): NamespacedMappers = js.native
  
  @JSImport("vuex", "install")
  @js.native
  def install(Vue: VueConstructor[Vue]): Unit = js.native
  
  @JSImport("vuex", "mapActions")
  @js.native
  val mapActions: Mapper[ActionMethod] with MapperWithNamespace[ActionMethod] with MapperForAction with MapperForActionWithNamespace = js.native
  
  @JSImport("vuex", "mapGetters")
  @js.native
  val mapGetters: Mapper[Computed] with MapperWithNamespace[Computed] = js.native
  
  @JSImport("vuex", "mapMutations")
  @js.native
  val mapMutations: Mapper[MutationMethod] with MapperWithNamespace[MutationMethod] with MapperForMutation with MapperForMutationWithNamespace = js.native
  
  @JSImport("vuex", "mapState")
  @js.native
  val mapState: Mapper[Computed] with MapperWithNamespace[Computed] with MapperForState with MapperForStateWithNamespace = js.native
  
  type Action[S, R] = (ActionHandler[S, R]) | (ActionObject[S, R])
  
  @js.native
  trait ActionContext[S, R] extends StObject {
    
    def commit(`type`: String): Unit = js.native
    def commit(`type`: String, payload: js.UndefOr[scala.Nothing], options: CommitOptions): Unit = js.native
    def commit(`type`: String, payload: js.Any): Unit = js.native
    def commit(`type`: String, payload: js.Any, options: CommitOptions): Unit = js.native
    def commit[P /* <: Payload */](payloadWithType: P): Unit = js.native
    def commit[P /* <: Payload */](payloadWithType: P, options: CommitOptions): Unit = js.native
    @JSName("commit")
    var commit_Original: Commit = js.native
    
    def dispatch(`type`: String): js.Promise[_] = js.native
    def dispatch(`type`: String, payload: js.UndefOr[scala.Nothing], options: DispatchOptions): js.Promise[_] = js.native
    def dispatch(`type`: String, payload: js.Any): js.Promise[_] = js.native
    def dispatch(`type`: String, payload: js.Any, options: DispatchOptions): js.Promise[_] = js.native
    def dispatch[P /* <: Payload */](payloadWithType: P): js.Promise[_] = js.native
    def dispatch[P /* <: Payload */](payloadWithType: P, options: DispatchOptions): js.Promise[_] = js.native
    @JSName("dispatch")
    var dispatch_Original: Dispatch = js.native
    
    var getters: js.Any = js.native
    
    var rootGetters: js.Any = js.native
    
    var rootState: R = js.native
    
    var state: S = js.native
  }
  
  type ActionErrorSubscriber[P, S] = js.Function3[/* action */ P, /* state */ S, /* error */ Error, js.Any]
  
  type ActionHandler[S, R] = js.ThisFunction2[
    /* this */ Store[R], 
    /* injectee */ ActionContext[S, R], 
    /* payload */ js.UndefOr[js.Any], 
    js.Any
  ]
  
  @js.native
  trait ActionObject[S, R] extends StObject {
    
    def handler(injectee: ActionContext[S, R]): js.Any = js.native
    def handler(injectee: ActionContext[S, R], payload: js.Any): js.Any = js.native
    @JSName("handler")
    var handler_Original: ActionHandler[S, R] = js.native
    
    var root: js.UndefOr[Boolean] = js.native
  }
  
  @js.native
  trait ActionPayload extends Payload {
    
    var payload: js.Any = js.native
  }
  object ActionPayload {
    
    @scala.inline
    def apply(payload: js.Any, `type`: String): ActionPayload = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionPayload]
    }
    
    @scala.inline
    implicit class ActionPayloadMutableBuilder[Self <: ActionPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: js.Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
  
  type ActionSubscriber[P, S] = js.Function2[/* action */ P, /* state */ S, js.Any]
  
  @js.native
  trait ActionSubscribersObject[P, S] extends StObject {
    
    var after: js.UndefOr[ActionSubscriber[P, S]] = js.native
    
    var before: js.UndefOr[ActionSubscriber[P, S]] = js.native
    
    var error: js.UndefOr[ActionErrorSubscriber[P, S]] = js.native
  }
  object ActionSubscribersObject {
    
    @scala.inline
    def apply[P, S](): ActionSubscribersObject[P, S] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionSubscribersObject[P, S]]
    }
    
    @scala.inline
    implicit class ActionSubscribersObjectMutableBuilder[Self <: ActionSubscribersObject[_, _], P, S] (val x: Self with (ActionSubscribersObject[P, S])) extends AnyVal {
      
      @scala.inline
      def setAfter(value: (P, S) => js.Any): Self = StObject.set(x, "after", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      @scala.inline
      def setBefore(value: (P, S) => js.Any): Self = StObject.set(x, "before", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      @scala.inline
      def setError(value: (P, S, /* error */ Error) => js.Any): Self = StObject.set(x, "error", js.Any.fromFunction3(value))
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    }
  }
  
  type ActionTree[S, R] = StringDictionary[Action[S, R]]
  
  @js.native
  trait Commit extends StObject {
    
    def apply(`type`: String): Unit = js.native
    def apply(`type`: String, payload: js.UndefOr[scala.Nothing], options: CommitOptions): Unit = js.native
    def apply(`type`: String, payload: js.Any): Unit = js.native
    def apply(`type`: String, payload: js.Any, options: CommitOptions): Unit = js.native
    def apply[P /* <: Payload */](payloadWithType: P): Unit = js.native
    def apply[P /* <: Payload */](payloadWithType: P, options: CommitOptions): Unit = js.native
  }
  
  @js.native
  trait CommitOptions extends StObject {
    
    var root: js.UndefOr[Boolean] = js.native
    
    var silent: js.UndefOr[Boolean] = js.native
  }
  object CommitOptions {
    
    @scala.inline
    def apply(): CommitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommitOptions]
    }
    
    @scala.inline
    implicit class CommitOptionsMutableBuilder[Self <: CommitOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(value: Boolean): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
  
  @js.native
  trait Dispatch extends StObject {
    
    def apply(`type`: String): js.Promise[_] = js.native
    def apply(`type`: String, payload: js.UndefOr[scala.Nothing], options: DispatchOptions): js.Promise[_] = js.native
    def apply(`type`: String, payload: js.Any): js.Promise[_] = js.native
    def apply(`type`: String, payload: js.Any, options: DispatchOptions): js.Promise[_] = js.native
    def apply[P /* <: Payload */](payloadWithType: P): js.Promise[_] = js.native
    def apply[P /* <: Payload */](payloadWithType: P, options: DispatchOptions): js.Promise[_] = js.native
  }
  
  @js.native
  trait DispatchOptions extends StObject {
    
    var root: js.UndefOr[Boolean] = js.native
  }
  object DispatchOptions {
    
    @scala.inline
    def apply(): DispatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DispatchOptions]
    }
    
    @scala.inline
    implicit class DispatchOptionsMutableBuilder[Self <: DispatchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(value: Boolean): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
  
  type Getter[S, R] = js.Function4[/* state */ S, /* getters */ js.Any, /* rootState */ R, /* rootGetters */ js.Any, js.Any]
  
  type GetterTree[S, R] = StringDictionary[Getter[S, R]]
  
  @js.native
  trait Module[S, R] extends StObject {
    
    var actions: js.UndefOr[ActionTree[S, R]] = js.native
    
    var getters: js.UndefOr[GetterTree[S, R]] = js.native
    
    var modules: js.UndefOr[ModuleTree[R]] = js.native
    
    var mutations: js.UndefOr[MutationTree[S]] = js.native
    
    var namespaced: js.UndefOr[Boolean] = js.native
    
    var state: js.UndefOr[S | js.Function0[S]] = js.native
  }
  object Module {
    
    @scala.inline
    def apply[S, R](): Module[S, R] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Module[S, R]]
    }
    
    @scala.inline
    implicit class ModuleMutableBuilder[Self <: Module[_, _], S, R] (val x: Self with (Module[S, R])) extends AnyVal {
      
      @scala.inline
      def setActions(value: ActionTree[S, R]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      @scala.inline
      def setGetters(value: GetterTree[S, R]): Self = StObject.set(x, "getters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGettersUndefined: Self = StObject.set(x, "getters", js.undefined)
      
      @scala.inline
      def setModules(value: ModuleTree[R]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      @scala.inline
      def setMutations(value: MutationTree[S]): Self = StObject.set(x, "mutations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMutationsUndefined: Self = StObject.set(x, "mutations", js.undefined)
      
      @scala.inline
      def setNamespaced(value: Boolean): Self = StObject.set(x, "namespaced", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespacedUndefined: Self = StObject.set(x, "namespaced", js.undefined)
      
      @scala.inline
      def setState(value: S | js.Function0[S]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateFunction0(value: () => S): Self = StObject.set(x, "state", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  @js.native
  trait ModuleOptions extends StObject {
    
    var preserveState: js.UndefOr[Boolean] = js.native
  }
  object ModuleOptions {
    
    @scala.inline
    def apply(): ModuleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModuleOptions]
    }
    
    @scala.inline
    implicit class ModuleOptionsMutableBuilder[Self <: ModuleOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPreserveState(value: Boolean): Self = StObject.set(x, "preserveState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveStateUndefined: Self = StObject.set(x, "preserveState", js.undefined)
    }
  }
  
  type ModuleTree[R] = StringDictionary[Module[js.Any, R]]
  
  type Mutation[S] = js.Function2[/* state */ S, /* payload */ js.UndefOr[js.Any], js.Any]
  
  @js.native
  trait MutationPayload extends Payload {
    
    var payload: js.Any = js.native
  }
  object MutationPayload {
    
    @scala.inline
    def apply(payload: js.Any, `type`: String): MutationPayload = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MutationPayload]
    }
    
    @scala.inline
    implicit class MutationPayloadMutableBuilder[Self <: MutationPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: js.Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
  
  type MutationTree[S] = StringDictionary[Mutation[S]]
  
  @js.native
  trait Payload extends StObject {
    
    var `type`: String = js.native
  }
  object Payload {
    
    @scala.inline
    def apply(`type`: String): Payload = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Payload]
    }
    
    @scala.inline
    implicit class PayloadMutableBuilder[Self <: Payload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Plugin[S] = js.Function1[/* store */ Store[S], js.Any]
  
  @js.native
  trait StoreOptions[S] extends StObject {
    
    var actions: js.UndefOr[ActionTree[S, S]] = js.native
    
    var devtools: js.UndefOr[Boolean] = js.native
    
    var getters: js.UndefOr[GetterTree[S, S]] = js.native
    
    var modules: js.UndefOr[ModuleTree[S]] = js.native
    
    var mutations: js.UndefOr[MutationTree[S]] = js.native
    
    var plugins: js.UndefOr[js.Array[Plugin[S]]] = js.native
    
    var state: js.UndefOr[S | js.Function0[S]] = js.native
    
    var strict: js.UndefOr[Boolean] = js.native
  }
  object StoreOptions {
    
    @scala.inline
    def apply[S](): StoreOptions[S] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StoreOptions[S]]
    }
    
    @scala.inline
    implicit class StoreOptionsMutableBuilder[Self <: StoreOptions[_], S] (val x: Self with StoreOptions[S]) extends AnyVal {
      
      @scala.inline
      def setActions(value: ActionTree[S, S]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      @scala.inline
      def setDevtools(value: Boolean): Self = StObject.set(x, "devtools", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevtoolsUndefined: Self = StObject.set(x, "devtools", js.undefined)
      
      @scala.inline
      def setGetters(value: GetterTree[S, S]): Self = StObject.set(x, "getters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGettersUndefined: Self = StObject.set(x, "getters", js.undefined)
      
      @scala.inline
      def setModules(value: ModuleTree[S]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      @scala.inline
      def setMutations(value: MutationTree[S]): Self = StObject.set(x, "mutations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMutationsUndefined: Self = StObject.set(x, "mutations", js.undefined)
      
      @scala.inline
      def setPlugins(value: js.Array[Plugin[S]]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setPluginsVarargs(value: Plugin[S]*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      @scala.inline
      def setState(value: S | js.Function0[S]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateFunction0(value: () => S): Self = StObject.set(x, "state", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  type SubscribeActionOptions[P, S] = (ActionSubscriber[P, S]) | (ActionSubscribersObject[P, S])
  
  @js.native
  trait SubscribeOptions extends StObject {
    
    var prepend: js.UndefOr[Boolean] = js.native
  }
  object SubscribeOptions {
    
    @scala.inline
    def apply(): SubscribeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubscribeOptions]
    }
    
    @scala.inline
    implicit class SubscribeOptionsMutableBuilder[Self <: SubscribeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrepend(value: Boolean): Self = StObject.set(x, "prepend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrependUndefined: Self = StObject.set(x, "prepend", js.undefined)
    }
  }
}
