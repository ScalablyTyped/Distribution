package typings.wixUiCore

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsLoadableLoadableMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/loadable/Loadable", "Loadable")
  @js.native
  class Loadable[LoadableExports] protected ()
    extends Component[LoadableProps[LoadableExports], LoadableState[LoadableExports], js.Any] {
    def this(props: js.Any) = this()
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MLoadable(prevProps: js.Any): Unit = js.native
    
    val loadSyncOrAsync: js.Any = js.native
    
    val resolveModule: js.Any = js.native
  }
  
  trait LoadableProps[LoadableExports] extends StObject {
    
    def children(loaded: LoadedMap[LoadableExports]): Element
    
    /** component to show while not loading and `shouldLoadComponent` is false */
    var defaultComponent: Element
    
    /** loader for a component. `import('./Component')` */
    var loader: LoaderMap[LoadableExports]
    
    /** component to show while loading */
    var loadingComponent: js.UndefOr[Element] = js.undefined
    
    /** key to access the field inside module. `default` by default */
    var namedExports: js.UndefOr[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ Key in keyof LoadableExports ]:? string}
      */ typings.wixUiCore.wixUiCoreStrings.LoadableProps & TopLevel[js.Any]
      ] = js.undefined
    
    /** callback thats beein called when dynamic chunk is loaded */
    var onLoad: js.UndefOr[js.Function0[js.Function]] = js.undefined
    
    /** key to trigger lazy-loading */
    var shouldLoadComponent: js.UndefOr[Boolean] = js.undefined
  }
  object LoadableProps {
    
    @scala.inline
    def apply[LoadableExports](
      children: LoadedMap[LoadableExports] => Element,
      defaultComponent: Element,
      loader: LoaderMap[LoadableExports]
    ): LoadableProps[LoadableExports] = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), defaultComponent = defaultComponent.asInstanceOf[js.Any], loader = loader.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadableProps[LoadableExports]]
    }
    
    @scala.inline
    implicit class LoadablePropsMutableBuilder[Self <: LoadableProps[?], LoadableExports] (val x: Self & LoadableProps[LoadableExports]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: LoadedMap[LoadableExports] => Element): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDefaultComponent(value: Element): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoader(value: LoaderMap[LoadableExports]): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingComponent(value: Element): Self = StObject.set(x, "loadingComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingComponentUndefined: Self = StObject.set(x, "loadingComponent", js.undefined)
      
      @scala.inline
      def setNamedExports(
        value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ Key in keyof LoadableExports ]:? string}
        */ typings.wixUiCore.wixUiCoreStrings.LoadableProps & TopLevel[js.Any]
      ): Self = StObject.set(x, "namedExports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamedExportsUndefined: Self = StObject.set(x, "namedExports", js.undefined)
      
      @scala.inline
      def setOnLoad(value: () => js.Function): Self = StObject.set(x, "onLoad", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setShouldLoadComponent(value: Boolean): Self = StObject.set(x, "shouldLoadComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShouldLoadComponentUndefined: Self = StObject.set(x, "shouldLoadComponent", js.undefined)
    }
  }
  
  trait LoadableState[LoadableExports] extends StObject {
    
    var isLoading: Boolean
    
    var loaded: LoadedMap[LoadableExports]
  }
  object LoadableState {
    
    @scala.inline
    def apply[LoadableExports](isLoading: Boolean, loaded: LoadedMap[LoadableExports]): LoadableState[LoadableExports] = {
      val __obj = js.Dynamic.literal(isLoading = isLoading.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadableState[LoadableExports]]
    }
    
    @scala.inline
    implicit class LoadableStateMutableBuilder[Self <: LoadableState[?], LoadableExports] (val x: Self & LoadableState[LoadableExports]) extends AnyVal {
      
      @scala.inline
      def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoaded(value: LoadedMap[LoadableExports]): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    }
  }
  
  type LoadedMap[LoadableExports] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ Key in keyof LoadableExports ]:? LoadableExports[Key]}
    */ typings.wixUiCore.wixUiCoreStrings.LoadedMap & TopLevel[LoadableExports]
  
  type LoaderMap[LoadableExports] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ Key in keyof LoadableExports ]:? (): LoadableExports[Key] | wix-ui-core.wix-ui-core/dist/standalone/src/components/loadable/Loadable.Module<LoadableExports> | std.Promise<wix-ui-core.wix-ui-core/dist/standalone/src/components/loadable/Loadable.Module<LoadableExports>>}
    */ typings.wixUiCore.wixUiCoreStrings.LoaderMap & TopLevel[LoadableExports]
  
  type Module[LoadableExports] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ ModuleKey in keyof LoadableExports ]: LoadableExports[ModuleKey]}
    */ typings.wixUiCore.wixUiCoreStrings.Module & TopLevel[LoadableExports]
}
