package typings.vueDevtoolsApi

import org.scalablytyped.runtime.TopLevel
import typings.std.Record
import typings.vueDevtoolsApi.anon.Label
import typings.vueDevtoolsApi.appMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginMod {
  
  type ExtractSettingsTypes[O /* <: Record[String, PluginSettingsItem] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof O ]: @vue/devtools-api.@vue/devtools-api/lib/esm/plugin.InferSettingsType<O[K]>}
    */ typings.vueDevtoolsApi.vueDevtoolsApiStrings.ExtractSettingsTypes & TopLevel[O]
  
  type InferSettingsType[T /* <: PluginSettingsItem */] = Any | String | (/* import warning: importer.ImportType#apply Failed type conversion: T['options'][number]['value'] */ js.Any) | Boolean
  
  trait PluginDescriptor extends StObject {
    
    var app: App
    
    var componentStateTypes: js.UndefOr[js.Array[String]] = js.undefined
    
    var disableAppScope: js.UndefOr[Boolean] = js.undefined
    
    var disablePluginScope: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Run the plugin setup and expose the api even if the devtools is not opened yet.
      * Useful to record timeline events early.
      */
    var enableEarlyProxy: js.UndefOr[Boolean] = js.undefined
    
    var homepage: js.UndefOr[String] = js.undefined
    
    var id: String
    
    var label: String
    
    var logo: js.UndefOr[String] = js.undefined
    
    var packageName: js.UndefOr[String] = js.undefined
    
    var settings: js.UndefOr[Record[String, PluginSettingsItem]] = js.undefined
  }
  object PluginDescriptor {
    
    inline def apply(app: App, id: String, label: String): PluginDescriptor = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluginDescriptor]
    }
    
    extension [Self <: PluginDescriptor](x: Self) {
      
      inline def setApp(value: App): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setComponentStateTypes(value: js.Array[String]): Self = StObject.set(x, "componentStateTypes", value.asInstanceOf[js.Any])
      
      inline def setComponentStateTypesUndefined: Self = StObject.set(x, "componentStateTypes", js.undefined)
      
      inline def setComponentStateTypesVarargs(value: String*): Self = StObject.set(x, "componentStateTypes", js.Array(value*))
      
      inline def setDisableAppScope(value: Boolean): Self = StObject.set(x, "disableAppScope", value.asInstanceOf[js.Any])
      
      inline def setDisableAppScopeUndefined: Self = StObject.set(x, "disableAppScope", js.undefined)
      
      inline def setDisablePluginScope(value: Boolean): Self = StObject.set(x, "disablePluginScope", value.asInstanceOf[js.Any])
      
      inline def setDisablePluginScopeUndefined: Self = StObject.set(x, "disablePluginScope", js.undefined)
      
      inline def setEnableEarlyProxy(value: Boolean): Self = StObject.set(x, "enableEarlyProxy", value.asInstanceOf[js.Any])
      
      inline def setEnableEarlyProxyUndefined: Self = StObject.set(x, "enableEarlyProxy", js.undefined)
      
      inline def setHomepage(value: String): Self = StObject.set(x, "homepage", value.asInstanceOf[js.Any])
      
      inline def setHomepageUndefined: Self = StObject.set(x, "homepage", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLogo(value: String): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
      
      inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
      
      inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
      
      inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
      
      inline def setSettings(value: Record[String, PluginSettingsItem]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vueDevtoolsApi.anon.typebooleandefaultValuebo
    - typings.vueDevtoolsApi.anon.typechoicedefaultValuestr
    - typings.vueDevtoolsApi.anon.typetextdefaultValuestrin
  */
  trait PluginSettingsItem extends StObject
  object PluginSettingsItem {
    
    inline def typebooleandefaultValuebo(defaultValue: Boolean, label: String): typings.vueDevtoolsApi.anon.typebooleandefaultValuebo = {
      val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("boolean")
      __obj.asInstanceOf[typings.vueDevtoolsApi.anon.typebooleandefaultValuebo]
    }
    
    inline def typechoicedefaultValuestr(defaultValue: String | Double, label: String, options: js.Array[Label]): typings.vueDevtoolsApi.anon.typechoicedefaultValuestr = {
      val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("choice")
      __obj.asInstanceOf[typings.vueDevtoolsApi.anon.typechoicedefaultValuestr]
    }
    
    inline def typetextdefaultValuestrin(defaultValue: String, label: String): typings.vueDevtoolsApi.anon.typetextdefaultValuestrin = {
      val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("text")
      __obj.asInstanceOf[typings.vueDevtoolsApi.anon.typetextdefaultValuestrin]
    }
  }
}
