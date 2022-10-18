package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import typings.wechatMiniprogram.WechatMiniprogram.Component.RelationOption
import typings.wechatMiniprogram.anon.PartialPageLifetimes
import typings.wechatMiniprogram.anon.Partialcreatedvoidattache
import typings.wechatMiniprogram.wechatMiniprogramBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Behavior {
  
  type BehaviorIdentifier = String
  
  type Constructor = js.Function1[
    /* options */ Options[DataOption, PropertyOption, MethodOption, Record[String, scala.Nothing]], 
    BehaviorIdentifier
  ]
  
  type Data[D /* <: DataOption */] = typings.wechatMiniprogram.WechatMiniprogram.Component.Data[D]
  
  type DataOption = typings.wechatMiniprogram.WechatMiniprogram.Component.DataOption
  
  type DefinitionFilter = typings.wechatMiniprogram.WechatMiniprogram.Component.DefinitionFilter
  
  type Instance[TData /* <: DataOption */, TProperty /* <: PropertyOption */, TMethod /* <: MethodOption */, TCustomInstanceProperty /* <: IAnyObject */] = typings.wechatMiniprogram.WechatMiniprogram.Component.Instance[TData, TProperty, TMethod, TCustomInstanceProperty, `false`]
  
  type Lifetimes = typings.wechatMiniprogram.WechatMiniprogram.Component.Lifetimes
  
  type Method[M /* <: MethodOption */] = typings.wechatMiniprogram.WechatMiniprogram.Component.Method[M, `false`]
  
  type MethodOption = typings.wechatMiniprogram.WechatMiniprogram.Component.MethodOption
  
  /* Inlined std.Partial<wechat-miniprogram.WechatMiniprogram.Behavior.Data<TData>> & std.Partial<wechat-miniprogram.WechatMiniprogram.Behavior.Property<TProperty>> & std.Partial<wechat-miniprogram.WechatMiniprogram.Behavior.Method<TMethod>> & std.Partial<wechat-miniprogram.WechatMiniprogram.Behavior.OtherOption> & std.Partial<wechat-miniprogram.WechatMiniprogram.Behavior.Lifetimes> & std.ThisType<wechat-miniprogram.WechatMiniprogram.Behavior.Instance<TData, TProperty, TMethod, TCustomInstanceProperty>> */
  trait Options[TData /* <: DataOption */, TProperty /* <: PropertyOption */, TMethod /* <: MethodOption */, TCustomInstanceProperty /* <: IAnyObject */] extends StObject {
    
    var attached: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var behaviors: js.UndefOr[js.Array[BehaviorIdentifier]] = js.undefined
    
    var created: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var data: js.UndefOr[TData] = js.undefined
    
    var definitionFilter: js.UndefOr[typings.wechatMiniprogram.WechatMiniprogram.Component.DefinitionFilter] = js.undefined
    
    var detached: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var error: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.undefined
    
    var `export`: js.UndefOr[js.Function0[IAnyObject]] = js.undefined
    
    var externalClasses: js.UndefOr[js.Array[String]] = js.undefined
    
    var lifetimes: js.UndefOr[Partialcreatedvoidattache] = js.undefined
    
    var methods: js.UndefOr[
        TMethod & (/* import warning: importer.ImportType#apply Failed type conversion: false extends true ? / * Inlined std.Partial<wechat-miniprogram.WechatMiniprogram.Page.ILifetime> * /
    {  onHide :(): void | std.Promise<void> | undefined,   onPullDownRefresh :(): void | std.Promise<void> | undefined,   onShareTimeline :(): wechat-miniprogram.WechatMiniprogram.Page.ICustomTimelineContent | void | undefined,   onReady :(): void | std.Promise<void> | undefined,   onShareAppMessage :(options : wechat-miniprogram.WechatMiniprogram.Page.IShareAppMessageOption): wechat-miniprogram.WechatMiniprogram.Page.ICustomShareContent | void | undefined,   onLoad :(query : std.Record<string, string | undefined>): void | std.Promise<void> | undefined,   onReachBottom :(): void | std.Promise<void> | undefined,   onUnload :(): void | std.Promise<void> | undefined,   onShow :(): void | std.Promise<void> | undefined,   onPageScroll :(options : wechat-miniprogram.WechatMiniprogram.Page.IPageScrollOption): void | std.Promise<void> | undefined,   onTabItemTap :(options : wechat-miniprogram.WechatMiniprogram.Page.ITabItemTapOption): void | std.Promise<void> | undefined,   onResize :(options : wechat-miniprogram.WechatMiniprogram.Page.IResizeOption): void | std.Promise<void> | undefined,   onAddToFavorites :(options : wechat-miniprogram.WechatMiniprogram.Page.IAddToFavoritesOption): wechat-miniprogram.WechatMiniprogram.Page.IAddToFavoritesContent | undefined} : {} */ js.Any)
      ] = js.undefined
    
    var moved: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var observers: js.UndefOr[Record[String, js.Function1[/* repeated */ Any, Any]]] = js.undefined
    
    var pageLifetimes: js.UndefOr[PartialPageLifetimes] = js.undefined
    
    var properties: js.UndefOr[TProperty] = js.undefined
    
    var ready: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var relations: js.UndefOr[StringDictionary[RelationOption]] = js.undefined
  }
  object Options {
    
    inline def apply[TData /* <: DataOption */, TProperty /* <: PropertyOption */, TMethod /* <: MethodOption */, TCustomInstanceProperty /* <: IAnyObject */](): Options[TData, TProperty, TMethod, TCustomInstanceProperty] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[TData, TProperty, TMethod, TCustomInstanceProperty]]
    }
    
    extension [Self <: Options[?, ?, ?, ?], TData /* <: DataOption */, TProperty /* <: PropertyOption */, TMethod /* <: MethodOption */, TCustomInstanceProperty /* <: IAnyObject */](x: Self & (Options[TData, TProperty, TMethod, TCustomInstanceProperty])) {
      
      inline def setAttached(value: () => Unit): Self = StObject.set(x, "attached", js.Any.fromFunction0(value))
      
      inline def setAttachedUndefined: Self = StObject.set(x, "attached", js.undefined)
      
      inline def setBehaviors(value: js.Array[BehaviorIdentifier]): Self = StObject.set(x, "behaviors", value.asInstanceOf[js.Any])
      
      inline def setBehaviorsUndefined: Self = StObject.set(x, "behaviors", js.undefined)
      
      inline def setBehaviorsVarargs(value: BehaviorIdentifier*): Self = StObject.set(x, "behaviors", js.Array(value*))
      
      inline def setCreated(value: () => Unit): Self = StObject.set(x, "created", js.Any.fromFunction0(value))
      
      inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
      
      inline def setData(value: TData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDefinitionFilter(value: typings.wechatMiniprogram.WechatMiniprogram.Component.DefinitionFilter): Self = StObject.set(x, "definitionFilter", value.asInstanceOf[js.Any])
      
      inline def setDefinitionFilterUndefined: Self = StObject.set(x, "definitionFilter", js.undefined)
      
      inline def setDetached(value: () => Unit): Self = StObject.set(x, "detached", js.Any.fromFunction0(value))
      
      inline def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
      
      inline def setError(value: /* err */ js.Error => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setExport(value: () => IAnyObject): Self = StObject.set(x, "export", js.Any.fromFunction0(value))
      
      inline def setExportUndefined: Self = StObject.set(x, "export", js.undefined)
      
      inline def setExternalClasses(value: js.Array[String]): Self = StObject.set(x, "externalClasses", value.asInstanceOf[js.Any])
      
      inline def setExternalClassesUndefined: Self = StObject.set(x, "externalClasses", js.undefined)
      
      inline def setExternalClassesVarargs(value: String*): Self = StObject.set(x, "externalClasses", js.Array(value*))
      
      inline def setLifetimes(value: Partialcreatedvoidattache): Self = StObject.set(x, "lifetimes", value.asInstanceOf[js.Any])
      
      inline def setLifetimesUndefined: Self = StObject.set(x, "lifetimes", js.undefined)
      
      inline def setMethods(
        value: TMethod & (/* import warning: importer.ImportType#apply Failed type conversion: false extends true ? / * Inlined std.Partial<wechat-miniprogram.WechatMiniprogram.Page.ILifetime> * /
      {  onHide :(): void | std.Promise<void> | undefined,   onPullDownRefresh :(): void | std.Promise<void> | undefined,   onShareTimeline :(): wechat-miniprogram.WechatMiniprogram.Page.ICustomTimelineContent | void | undefined,   onReady :(): void | std.Promise<void> | undefined,   onShareAppMessage :(options : wechat-miniprogram.WechatMiniprogram.Page.IShareAppMessageOption): wechat-miniprogram.WechatMiniprogram.Page.ICustomShareContent | void | undefined,   onLoad :(query : std.Record<string, string | undefined>): void | std.Promise<void> | undefined,   onReachBottom :(): void | std.Promise<void> | undefined,   onUnload :(): void | std.Promise<void> | undefined,   onShow :(): void | std.Promise<void> | undefined,   onPageScroll :(options : wechat-miniprogram.WechatMiniprogram.Page.IPageScrollOption): void | std.Promise<void> | undefined,   onTabItemTap :(options : wechat-miniprogram.WechatMiniprogram.Page.ITabItemTapOption): void | std.Promise<void> | undefined,   onResize :(options : wechat-miniprogram.WechatMiniprogram.Page.IResizeOption): void | std.Promise<void> | undefined,   onAddToFavorites :(options : wechat-miniprogram.WechatMiniprogram.Page.IAddToFavoritesOption): wechat-miniprogram.WechatMiniprogram.Page.IAddToFavoritesContent | undefined} : {} */ js.Any)
      ): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      inline def setMoved(value: () => Unit): Self = StObject.set(x, "moved", js.Any.fromFunction0(value))
      
      inline def setMovedUndefined: Self = StObject.set(x, "moved", js.undefined)
      
      inline def setObservers(value: Record[String, js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "observers", value.asInstanceOf[js.Any])
      
      inline def setObserversUndefined: Self = StObject.set(x, "observers", js.undefined)
      
      inline def setPageLifetimes(value: PartialPageLifetimes): Self = StObject.set(x, "pageLifetimes", value.asInstanceOf[js.Any])
      
      inline def setPageLifetimesUndefined: Self = StObject.set(x, "pageLifetimes", js.undefined)
      
      inline def setProperties(value: TProperty): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setReady(value: () => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction0(value))
      
      inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
      
      inline def setRelations(value: StringDictionary[RelationOption]): Self = StObject.set(x, "relations", value.asInstanceOf[js.Any])
      
      inline def setRelationsUndefined: Self = StObject.set(x, "relations", js.undefined)
    }
  }
  
  /* Inlined std.Omit<wechat-miniprogram.WechatMiniprogram.Component.OtherOption, 'options'> */
  trait OtherOption extends StObject {
    
    var behaviors: js.Array[BehaviorIdentifier]
    
    var definitionFilter: js.UndefOr[typings.wechatMiniprogram.WechatMiniprogram.Component.DefinitionFilter] = js.undefined
    
    def `export`(): IAnyObject
    @JSName("export")
    var export_Original: js.Function0[IAnyObject]
    
    var externalClasses: js.UndefOr[js.Array[String]] = js.undefined
    
    var observers: Record[String, js.Function1[/* repeated */ Any, Any]]
    
    var pageLifetimes: js.UndefOr[PartialPageLifetimes] = js.undefined
    
    var relations: StringDictionary[RelationOption]
  }
  object OtherOption {
    
    inline def apply(
      behaviors: js.Array[BehaviorIdentifier],
      `export`: () => IAnyObject,
      observers: Record[String, js.Function1[/* repeated */ Any, Any]],
      relations: StringDictionary[RelationOption]
    ): OtherOption = {
      val __obj = js.Dynamic.literal(behaviors = behaviors.asInstanceOf[js.Any], observers = observers.asInstanceOf[js.Any], relations = relations.asInstanceOf[js.Any])
      __obj.updateDynamic("export")(js.Any.fromFunction0(`export`))
      __obj.asInstanceOf[OtherOption]
    }
    
    extension [Self <: OtherOption](x: Self) {
      
      inline def setBehaviors(value: js.Array[BehaviorIdentifier]): Self = StObject.set(x, "behaviors", value.asInstanceOf[js.Any])
      
      inline def setBehaviorsVarargs(value: BehaviorIdentifier*): Self = StObject.set(x, "behaviors", js.Array(value*))
      
      inline def setDefinitionFilter(value: typings.wechatMiniprogram.WechatMiniprogram.Component.DefinitionFilter): Self = StObject.set(x, "definitionFilter", value.asInstanceOf[js.Any])
      
      inline def setDefinitionFilterUndefined: Self = StObject.set(x, "definitionFilter", js.undefined)
      
      inline def setExport(value: () => IAnyObject): Self = StObject.set(x, "export", js.Any.fromFunction0(value))
      
      inline def setExternalClasses(value: js.Array[String]): Self = StObject.set(x, "externalClasses", value.asInstanceOf[js.Any])
      
      inline def setExternalClassesUndefined: Self = StObject.set(x, "externalClasses", js.undefined)
      
      inline def setExternalClassesVarargs(value: String*): Self = StObject.set(x, "externalClasses", js.Array(value*))
      
      inline def setObservers(value: Record[String, js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "observers", value.asInstanceOf[js.Any])
      
      inline def setPageLifetimes(value: PartialPageLifetimes): Self = StObject.set(x, "pageLifetimes", value.asInstanceOf[js.Any])
      
      inline def setPageLifetimesUndefined: Self = StObject.set(x, "pageLifetimes", js.undefined)
      
      inline def setRelations(value: StringDictionary[RelationOption]): Self = StObject.set(x, "relations", value.asInstanceOf[js.Any])
    }
  }
  
  type Property[P /* <: PropertyOption */] = typings.wechatMiniprogram.WechatMiniprogram.Component.Property[P]
  
  type PropertyOption = typings.wechatMiniprogram.WechatMiniprogram.Component.PropertyOption
  
  type TrivialInstance = Instance[IAnyObject, IAnyObject, IAnyObject, Record[String, scala.Nothing]]
  
  /* Inlined wechat-miniprogram.WechatMiniprogram.Behavior.Options<wechat-miniprogram.WechatMiniprogram.IAnyObject, wechat-miniprogram.WechatMiniprogram.IAnyObject, wechat-miniprogram.WechatMiniprogram.IAnyObject, std.Record<string, never>> */
  trait TrivialOption extends StObject {
    
    var attached: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var behaviors: js.UndefOr[js.Array[BehaviorIdentifier]] = js.undefined
    
    var created: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var data: js.UndefOr[IAnyObject] = js.undefined
    
    var definitionFilter: js.UndefOr[typings.wechatMiniprogram.WechatMiniprogram.Component.DefinitionFilter] = js.undefined
    
    var detached: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var error: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.undefined
    
    var `export`: js.UndefOr[js.Function0[IAnyObject]] = js.undefined
    
    var externalClasses: js.UndefOr[js.Array[String]] = js.undefined
    
    var lifetimes: js.UndefOr[Partialcreatedvoidattache] = js.undefined
    
    var methods: js.UndefOr[
        IAnyObject & (/* import warning: importer.ImportType#apply Failed type conversion: false extends true ? / * Inlined std.Partial<wechat-miniprogram.WechatMiniprogram.Page.ILifetime> * /
    {  onHide :(): void | std.Promise<void> | undefined,   onPullDownRefresh :(): void | std.Promise<void> | undefined,   onShareTimeline :(): wechat-miniprogram.WechatMiniprogram.Page.ICustomTimelineContent | void | undefined,   onReady :(): void | std.Promise<void> | undefined,   onShareAppMessage :(options : wechat-miniprogram.WechatMiniprogram.Page.IShareAppMessageOption): wechat-miniprogram.WechatMiniprogram.Page.ICustomShareContent | void | undefined,   onLoad :(query : std.Record<string, string | undefined>): void | std.Promise<void> | undefined,   onReachBottom :(): void | std.Promise<void> | undefined,   onUnload :(): void | std.Promise<void> | undefined,   onShow :(): void | std.Promise<void> | undefined,   onPageScroll :(options : wechat-miniprogram.WechatMiniprogram.Page.IPageScrollOption): void | std.Promise<void> | undefined,   onTabItemTap :(options : wechat-miniprogram.WechatMiniprogram.Page.ITabItemTapOption): void | std.Promise<void> | undefined,   onResize :(options : wechat-miniprogram.WechatMiniprogram.Page.IResizeOption): void | std.Promise<void> | undefined,   onAddToFavorites :(options : wechat-miniprogram.WechatMiniprogram.Page.IAddToFavoritesOption): wechat-miniprogram.WechatMiniprogram.Page.IAddToFavoritesContent | undefined} : {} */ js.Any)
      ] = js.undefined
    
    var moved: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var observers: js.UndefOr[Record[String, js.Function1[/* repeated */ Any, Any]]] = js.undefined
    
    var pageLifetimes: js.UndefOr[PartialPageLifetimes] = js.undefined
    
    var properties: js.UndefOr[IAnyObject] = js.undefined
    
    var ready: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var relations: js.UndefOr[StringDictionary[RelationOption]] = js.undefined
  }
  object TrivialOption {
    
    inline def apply(): TrivialOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrivialOption]
    }
    
    extension [Self <: TrivialOption](x: Self) {
      
      inline def setAttached(value: () => Unit): Self = StObject.set(x, "attached", js.Any.fromFunction0(value))
      
      inline def setAttachedUndefined: Self = StObject.set(x, "attached", js.undefined)
      
      inline def setBehaviors(value: js.Array[BehaviorIdentifier]): Self = StObject.set(x, "behaviors", value.asInstanceOf[js.Any])
      
      inline def setBehaviorsUndefined: Self = StObject.set(x, "behaviors", js.undefined)
      
      inline def setBehaviorsVarargs(value: BehaviorIdentifier*): Self = StObject.set(x, "behaviors", js.Array(value*))
      
      inline def setCreated(value: () => Unit): Self = StObject.set(x, "created", js.Any.fromFunction0(value))
      
      inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
      
      inline def setData(value: IAnyObject): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDefinitionFilter(value: typings.wechatMiniprogram.WechatMiniprogram.Component.DefinitionFilter): Self = StObject.set(x, "definitionFilter", value.asInstanceOf[js.Any])
      
      inline def setDefinitionFilterUndefined: Self = StObject.set(x, "definitionFilter", js.undefined)
      
      inline def setDetached(value: () => Unit): Self = StObject.set(x, "detached", js.Any.fromFunction0(value))
      
      inline def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
      
      inline def setError(value: /* err */ js.Error => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setExport(value: () => IAnyObject): Self = StObject.set(x, "export", js.Any.fromFunction0(value))
      
      inline def setExportUndefined: Self = StObject.set(x, "export", js.undefined)
      
      inline def setExternalClasses(value: js.Array[String]): Self = StObject.set(x, "externalClasses", value.asInstanceOf[js.Any])
      
      inline def setExternalClassesUndefined: Self = StObject.set(x, "externalClasses", js.undefined)
      
      inline def setExternalClassesVarargs(value: String*): Self = StObject.set(x, "externalClasses", js.Array(value*))
      
      inline def setLifetimes(value: Partialcreatedvoidattache): Self = StObject.set(x, "lifetimes", value.asInstanceOf[js.Any])
      
      inline def setLifetimesUndefined: Self = StObject.set(x, "lifetimes", js.undefined)
      
      inline def setMethods(
        value: IAnyObject & (/* import warning: importer.ImportType#apply Failed type conversion: false extends true ? / * Inlined std.Partial<wechat-miniprogram.WechatMiniprogram.Page.ILifetime> * /
      {  onHide :(): void | std.Promise<void> | undefined,   onPullDownRefresh :(): void | std.Promise<void> | undefined,   onShareTimeline :(): wechat-miniprogram.WechatMiniprogram.Page.ICustomTimelineContent | void | undefined,   onReady :(): void | std.Promise<void> | undefined,   onShareAppMessage :(options : wechat-miniprogram.WechatMiniprogram.Page.IShareAppMessageOption): wechat-miniprogram.WechatMiniprogram.Page.ICustomShareContent | void | undefined,   onLoad :(query : std.Record<string, string | undefined>): void | std.Promise<void> | undefined,   onReachBottom :(): void | std.Promise<void> | undefined,   onUnload :(): void | std.Promise<void> | undefined,   onShow :(): void | std.Promise<void> | undefined,   onPageScroll :(options : wechat-miniprogram.WechatMiniprogram.Page.IPageScrollOption): void | std.Promise<void> | undefined,   onTabItemTap :(options : wechat-miniprogram.WechatMiniprogram.Page.ITabItemTapOption): void | std.Promise<void> | undefined,   onResize :(options : wechat-miniprogram.WechatMiniprogram.Page.IResizeOption): void | std.Promise<void> | undefined,   onAddToFavorites :(options : wechat-miniprogram.WechatMiniprogram.Page.IAddToFavoritesOption): wechat-miniprogram.WechatMiniprogram.Page.IAddToFavoritesContent | undefined} : {} */ js.Any)
      ): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      inline def setMoved(value: () => Unit): Self = StObject.set(x, "moved", js.Any.fromFunction0(value))
      
      inline def setMovedUndefined: Self = StObject.set(x, "moved", js.undefined)
      
      inline def setObservers(value: Record[String, js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "observers", value.asInstanceOf[js.Any])
      
      inline def setObserversUndefined: Self = StObject.set(x, "observers", js.undefined)
      
      inline def setPageLifetimes(value: PartialPageLifetimes): Self = StObject.set(x, "pageLifetimes", value.asInstanceOf[js.Any])
      
      inline def setPageLifetimesUndefined: Self = StObject.set(x, "pageLifetimes", js.undefined)
      
      inline def setProperties(value: IAnyObject): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setReady(value: () => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction0(value))
      
      inline def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
      
      inline def setRelations(value: StringDictionary[RelationOption]): Self = StObject.set(x, "relations", value.asInstanceOf[js.Any])
      
      inline def setRelationsUndefined: Self = StObject.set(x, "relations", js.undefined)
    }
  }
}
