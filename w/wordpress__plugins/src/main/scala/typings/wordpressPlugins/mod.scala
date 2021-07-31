package typings.wordpressPlugins

import typings.react.mod.ComponentType
import typings.wordpressComponents.dashiconMod.Dashicon.Icon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/plugins", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@wordpress/plugins", "PluginArea")
  @js.native
  val PluginArea: ComponentType[js.Object] = js.native
  
  @scala.inline
  def getPlugin(name: String): js.UndefOr[Plugin] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Plugin]]
  
  @scala.inline
  def getPlugins(): js.Array[Plugin] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugins")().asInstanceOf[js.Array[Plugin]]
  
  @scala.inline
  def registerPlugin(name: String, settings: PluginSettings): PluginSettings = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPlugin")(name.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[PluginSettings]
  
  @scala.inline
  def unregisterPlugin(name: String): js.UndefOr[Plugin] = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterPlugin")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Plugin]]
  
  @scala.inline
  def withPluginContext[CP, OP](mapContextToProps: js.Function2[/* context */ PluginContext, /* props */ OP, CP]): js.Function1[/* Component */ ComponentType[CP & OP], ComponentType[OP]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withPluginContext")(mapContextToProps.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* Component */ ComponentType[CP & OP], ComponentType[OP]]]
  
  trait Plugin
    extends StObject
       with PluginSettings {
    
    /**
      * A string identifying the plugin. Must be unique across all registered
      * plugins.
      */
    var name: String
  }
  object Plugin {
    
    @scala.inline
    def apply(icon: Icon | ComponentType[js.Object], name: String, render: ComponentType[js.Object]): Plugin = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any])
      __obj.asInstanceOf[Plugin]
    }
    
    @scala.inline
    implicit class PluginMutableBuilder[Self <: Plugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Omit<@wordpress/plugins.@wordpress/plugins.Plugin, 'render'> */
  trait PluginContext extends StObject {
    
    var icon: Icon | ComponentType[js.Object]
    
    var name: String
  }
  object PluginContext {
    
    @scala.inline
    def apply(icon: Icon | ComponentType[js.Object], name: String): PluginContext = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluginContext]
    }
    
    @scala.inline
    implicit class PluginContextMutableBuilder[Self <: PluginContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIcon(value: Icon | ComponentType[js.Object]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait PluginSettings extends StObject {
    
    /**
      * An icon to be shown in the UI. It can be a slug of the Dashicon, or an
      * element (or function returning an element) if you choose to render your
      * own SVG.
      */
    var icon: Icon | ComponentType[js.Object]
    
    /**
      * A component containing the UI elements to be rendered.
      */
    var render: ComponentType[js.Object]
  }
  object PluginSettings {
    
    @scala.inline
    def apply(icon: Icon | ComponentType[js.Object], render: ComponentType[js.Object]): PluginSettings = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluginSettings]
    }
    
    @scala.inline
    implicit class PluginSettingsMutableBuilder[Self <: PluginSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIcon(value: Icon | ComponentType[js.Object]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRender(value: ComponentType[js.Object]): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    }
  }
}
