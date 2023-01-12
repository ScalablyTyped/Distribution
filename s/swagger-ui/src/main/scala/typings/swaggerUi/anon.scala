package typings.swaggerUi

import org.scalablytyped.runtime.StringDictionary
import typings.swaggerUi.mod.Indexable
import typings.swaggerUi.swaggerUiStrings.`tomorrow-night`
import typings.swaggerUi.swaggerUiStrings.agate
import typings.swaggerUi.swaggerUiStrings.arta
import typings.swaggerUi.swaggerUiStrings.monokai
import typings.swaggerUi.swaggerUiStrings.nord
import typings.swaggerUi.swaggerUiStrings.obsidian
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Actions extends StObject {
    
    var actions: js.UndefOr[Indexable] = js.undefined
    
    var reducers: js.UndefOr[Indexable] = js.undefined
    
    var selectors: js.UndefOr[Indexable] = js.undefined
    
    var wrapActions: js.UndefOr[Indexable] = js.undefined
    
    var wrapSelectors: js.UndefOr[Indexable] = js.undefined
  }
  object Actions {
    
    inline def apply(): Actions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Actions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Actions] (val x: Self) extends AnyVal {
      
      inline def setActions(value: Indexable): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setReducers(value: Indexable): Self = StObject.set(x, "reducers", value.asInstanceOf[js.Any])
      
      inline def setReducersUndefined: Self = StObject.set(x, "reducers", js.undefined)
      
      inline def setSelectors(value: Indexable): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
      
      inline def setSelectorsUndefined: Self = StObject.set(x, "selectors", js.undefined)
      
      inline def setWrapActions(value: Indexable): Self = StObject.set(x, "wrapActions", value.asInstanceOf[js.Any])
      
      inline def setWrapActionsUndefined: Self = StObject.set(x, "wrapActions", js.undefined)
      
      inline def setWrapSelectors(value: Indexable): Self = StObject.set(x, "wrapSelectors", value.asInstanceOf[js.Any])
      
      inline def setWrapSelectorsUndefined: Self = StObject.set(x, "wrapSelectors", js.undefined)
    }
  }
  
  trait Activate extends StObject {
    
    /**
      * Whether syntax highlighting should be activated or not.
      */
    var activate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Highlight.js syntax coloring theme to use. (Only these 6 styles are available.)
      */
    var theme: js.UndefOr[agate | arta | monokai | nord | obsidian | `tomorrow-night`] = js.undefined
  }
  object Activate {
    
    inline def apply(): Activate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Activate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Activate] (val x: Self) extends AnyVal {
      
      inline def setActivate(value: Boolean): Self = StObject.set(x, "activate", value.asInstanceOf[js.Any])
      
      inline def setActivateUndefined: Self = StObject.set(x, "activate", js.undefined)
      
      inline def setTheme(value: agate | arta | monokai | nord | obsidian | `tomorrow-night`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait AfterLoad extends StObject {
    
    var afterLoad: js.UndefOr[js.Function1[/* system */ Any, Any]] = js.undefined
    
    var components: js.UndefOr[Indexable] = js.undefined
    
    var fn: js.UndefOr[Indexable] = js.undefined
    
    var rootInjects: js.UndefOr[Indexable] = js.undefined
    
    var statePlugins: js.UndefOr[StringDictionary[Actions]] = js.undefined
    
    var wrapComponents: js.UndefOr[Indexable] = js.undefined
  }
  object AfterLoad {
    
    inline def apply(): AfterLoad = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AfterLoad]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AfterLoad] (val x: Self) extends AnyVal {
      
      inline def setAfterLoad(value: /* system */ Any => Any): Self = StObject.set(x, "afterLoad", js.Any.fromFunction1(value))
      
      inline def setAfterLoadUndefined: Self = StObject.set(x, "afterLoad", js.undefined)
      
      inline def setComponents(value: Indexable): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setFn(value: Indexable): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
      
      inline def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
      
      inline def setRootInjects(value: Indexable): Self = StObject.set(x, "rootInjects", value.asInstanceOf[js.Any])
      
      inline def setRootInjectsUndefined: Self = StObject.set(x, "rootInjects", js.undefined)
      
      inline def setStatePlugins(value: StringDictionary[Actions]): Self = StObject.set(x, "statePlugins", value.asInstanceOf[js.Any])
      
      inline def setStatePluginsUndefined: Self = StObject.set(x, "statePlugins", js.undefined)
      
      inline def setWrapComponents(value: Indexable): Self = StObject.set(x, "wrapComponents", value.asInstanceOf[js.Any])
      
      inline def setWrapComponentsUndefined: Self = StObject.set(x, "wrapComponents", js.undefined)
    }
  }
  
  trait DefaultExpanded extends StObject {
    
    var defaultExpanded: js.UndefOr[Boolean] = js.undefined
    
    var generators: js.UndefOr[StringDictionary[Syntax]] = js.undefined
    
    /**
      * e.g. only show curl bash = ["curl_bash"]
      */
    var languagesMask: js.UndefOr[js.Array[String]] = js.undefined
  }
  object DefaultExpanded {
    
    inline def apply(): DefaultExpanded = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultExpanded]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultExpanded] (val x: Self) extends AnyVal {
      
      inline def setDefaultExpanded(value: Boolean): Self = StObject.set(x, "defaultExpanded", value.asInstanceOf[js.Any])
      
      inline def setDefaultExpandedUndefined: Self = StObject.set(x, "defaultExpanded", js.undefined)
      
      inline def setGenerators(value: StringDictionary[Syntax]): Self = StObject.set(x, "generators", value.asInstanceOf[js.Any])
      
      inline def setGeneratorsUndefined: Self = StObject.set(x, "generators", js.undefined)
      
      inline def setLanguagesMask(value: js.Array[String]): Self = StObject.set(x, "languagesMask", value.asInstanceOf[js.Any])
      
      inline def setLanguagesMaskUndefined: Self = StObject.set(x, "languagesMask", js.undefined)
      
      inline def setLanguagesMaskVarargs(value: String*): Self = StObject.set(x, "languagesMask", js.Array(value*))
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var url: String
  }
  object Name {
    
    inline def apply(name: String, url: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Syntax extends StObject {
    
    var syntax: String
    
    var title: String
  }
  object Syntax {
    
    inline def apply(syntax: String, title: String): Syntax = {
      val __obj = js.Dynamic.literal(syntax = syntax.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Syntax]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Syntax] (val x: Self) extends AnyVal {
      
      inline def setSyntax(value: String): Self = StObject.set(x, "syntax", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
