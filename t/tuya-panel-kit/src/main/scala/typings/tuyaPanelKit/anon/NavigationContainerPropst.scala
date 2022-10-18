package typings.tuyaPanelKit.anon

import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.tuyaPanelKit.`@reactNavigationCoreTypesMod`.NavigationContainerRef
import typings.tuyaPanelKit.`@reactNavigationNativeTypesMod`.DocumentTitleOptions
import typings.tuyaPanelKit.`@reactNavigationNativeTypesMod`.LinkingOptions
import typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.InitialState
import typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.NavigationAction
import typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.NavigationState
import typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined tuya-panel-kit.tuya-panel-kit/@react-navigation/core.NavigationContainerProps & {  theme :tuya-panel-kit.tuya-panel-kit/@react-navigation/native/types.Theme | undefined,   linking :tuya-panel-kit.tuya-panel-kit/@react-navigation/native/types.LinkingOptions | undefined,   fallback :react.react.ReactNode | undefined,   documentTitle :tuya-panel-kit.tuya-panel-kit/@react-navigation/native/types.DocumentTitleOptions | undefined,   onReady :(): void | undefined} & react.react.RefAttributes<tuya-panel-kit.tuya-panel-kit/@react-navigation/core.NavigationContainerRef> */
trait NavigationContainerPropst extends StObject {
  
  /**
    * Children elements to render.
    */
  var children: ReactNode
  
  // tslint:disable-next-line no-redundant-undefined
  var documentTitle: js.UndefOr[DocumentTitleOptions] = js.undefined
  
  var fallback: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * Whether this navigation container should be independent of parent containers.
    * If this is not set to `true`, this container cannot be nested inside another container.
    * Setting it to `true` disconnects any children navigators from parent container.
    */
  var independent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Initial navigation state for the child navigators.
    */
  var initialState: js.UndefOr[InitialState] = js.undefined
  
  var key: js.UndefOr[typings.react.mod.Key | Null] = js.undefined
  
  // tslint:disable-next-line no-redundant-undefined
  var linking: js.UndefOr[LinkingOptions] = js.undefined
  
  // tslint:disable-next-line no-redundant-undefined
  var onReady: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Callback which is called with the latest navigation state when it changes.
    */
  var onStateChange: js.UndefOr[js.Function1[/* state */ js.UndefOr[NavigationState[ParamListBase]], Unit]] = js.undefined
  
  /**
    * Callback which is called when an action is not handled.
    */
  var onUnhandledAction: js.UndefOr[js.Function1[/* action */ NavigationAction, Unit]] = js.undefined
  
  var ref: js.UndefOr[Ref[NavigationContainerRef]] = js.undefined
  
  // tslint:disable-next-line no-redundant-undefined
  var theme: js.UndefOr[typings.tuyaPanelKit.`@reactNavigationNativeTypesMod`.Theme] = js.undefined
}
object NavigationContainerPropst {
  
  inline def apply(): NavigationContainerPropst = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationContainerPropst]
  }
  
  extension [Self <: NavigationContainerPropst](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDocumentTitle(value: DocumentTitleOptions): Self = StObject.set(x, "documentTitle", value.asInstanceOf[js.Any])
    
    inline def setDocumentTitleUndefined: Self = StObject.set(x, "documentTitle", js.undefined)
    
    inline def setFallback(value: ReactNode): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    
    inline def setIndependent(value: Boolean): Self = StObject.set(x, "independent", value.asInstanceOf[js.Any])
    
    inline def setIndependentUndefined: Self = StObject.set(x, "independent", js.undefined)
    
    inline def setInitialState(value: InitialState): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    
    inline def setKey(value: typings.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLinking(value: LinkingOptions): Self = StObject.set(x, "linking", value.asInstanceOf[js.Any])
    
    inline def setLinkingUndefined: Self = StObject.set(x, "linking", js.undefined)
    
    inline def setOnReady(value: () => Unit): Self = StObject.set(x, "onReady", js.Any.fromFunction0(value))
    
    inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
    
    inline def setOnStateChange(value: /* state */ js.UndefOr[NavigationState[ParamListBase]] => Unit): Self = StObject.set(x, "onStateChange", js.Any.fromFunction1(value))
    
    inline def setOnStateChangeUndefined: Self = StObject.set(x, "onStateChange", js.undefined)
    
    inline def setOnUnhandledAction(value: /* action */ NavigationAction => Unit): Self = StObject.set(x, "onUnhandledAction", js.Any.fromFunction1(value))
    
    inline def setOnUnhandledActionUndefined: Self = StObject.set(x, "onUnhandledAction", js.undefined)
    
    inline def setRef(value: Ref[NavigationContainerRef]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ NavigationContainerRef | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setTheme(value: typings.tuyaPanelKit.`@reactNavigationNativeTypesMod`.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
