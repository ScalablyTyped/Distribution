package typings.uifabricUtilities

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customizationsMod {
  
  @JSImport("@uifabric/utilities/lib/customizations/Customizations", "Customizations")
  @js.native
  class Customizations () extends StObject
  /* static members */
  object Customizations {
    
    @JSImport("@uifabric/utilities/lib/customizations/Customizations", "Customizations")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@uifabric/utilities/lib/customizations/Customizations", "Customizations._raiseChange")
    @js.native
    def _raiseChange: js.Any = js.native
    @scala.inline
    def _raiseChange_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_raiseChange")(x.asInstanceOf[js.Any])
    
    @JSImport("@uifabric/utilities/lib/customizations/Customizations", "Customizations._suppressUpdates")
    @js.native
    def _suppressUpdates: js.Any = js.native
    @scala.inline
    def _suppressUpdates_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_suppressUpdates")(x.asInstanceOf[js.Any])
    
    /** Used to run some code that sets Customizations without triggering an update until the end.
      * Useful for applying Customizations that don't affect anything currently rendered, or for
      * applying many customizations at once.
      * @param suppressUpdate - Do not raise the change event at the end, preventing all updates
      */
    @JSImport("@uifabric/utilities/lib/customizations/Customizations", "Customizations.applyBatchedUpdates")
    @js.native
    def applyBatchedUpdates(code: js.Function0[Unit]): Unit = js.native
    @JSImport("@uifabric/utilities/lib/customizations/Customizations", "Customizations.applyBatchedUpdates")
    @js.native
    def applyBatchedUpdates(code: js.Function0[Unit], suppressUpdate: Boolean): Unit = js.native
    
    /** Apply Customizations to a particular named scope, like a component.
      * @example Customizations.applyScopedSettings('Nav', \{ styles: () =\> \{\} \});
      */
    @JSImport("@uifabric/utilities/lib/customizations/Customizations", "Customizations.applyScopedSettings")
    @js.native
    def applyScopedSettings(scopeName: String, settings: ISettings): Unit = js.native
    
    /** Apply global Customization settings.
      * @example Customizations.applySettings(\{ theme: \{...\} \});
      */
    @JSImport("@uifabric/utilities/lib/customizations/Customizations", "Customizations.applySettings")
    @js.native
    def applySettings(settings: ISettings): Unit = js.native
    
    @JSImport("@uifabric/utilities/lib/customizations/Customizations", "Customizations.getSettings")
    @js.native
    def getSettings(properties: js.Array[String]): js.Any = js.native
    @JSImport("@uifabric/utilities/lib/customizations/Customizations", "Customizations.getSettings")
    @js.native
    def getSettings(properties: js.Array[String], scopeName: js.UndefOr[scala.Nothing], localSettings: ICustomizations): js.Any = js.native
    @JSImport("@uifabric/utilities/lib/customizations/Customizations", "Customizations.getSettings")
    @js.native
    def getSettings(properties: js.Array[String], scopeName: String): js.Any = js.native
    @JSImport("@uifabric/utilities/lib/customizations/Customizations", "Customizations.getSettings")
    @js.native
    def getSettings(properties: js.Array[String], scopeName: String, localSettings: ICustomizations): js.Any = js.native
    
    @JSImport("@uifabric/utilities/lib/customizations/Customizations", "Customizations.observe")
    @js.native
    def observe(onChange: js.Function0[Unit]): Unit = js.native
    
    @JSImport("@uifabric/utilities/lib/customizations/Customizations", "Customizations.reset")
    @js.native
    def reset(): Unit = js.native
    
    @JSImport("@uifabric/utilities/lib/customizations/Customizations", "Customizations.unobserve")
    @js.native
    def unobserve(onChange: js.Function0[Unit]): Unit = js.native
  }
  
  @js.native
  trait ICustomizations extends StObject {
    
    var inCustomizerContext: js.UndefOr[Boolean] = js.native
    
    var scopedSettings: StringDictionary[ISettings] = js.native
    
    var settings: ISettings = js.native
  }
  object ICustomizations {
    
    @scala.inline
    def apply(scopedSettings: StringDictionary[ISettings], settings: ISettings): ICustomizations = {
      val __obj = js.Dynamic.literal(scopedSettings = scopedSettings.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICustomizations]
    }
    
    @scala.inline
    implicit class ICustomizationsMutableBuilder[Self <: ICustomizations] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInCustomizerContext(value: Boolean): Self = StObject.set(x, "inCustomizerContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInCustomizerContextUndefined: Self = StObject.set(x, "inCustomizerContext", js.undefined)
      
      @scala.inline
      def setScopedSettings(value: StringDictionary[ISettings]): Self = StObject.set(x, "scopedSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSettings(value: ISettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    }
  }
  
  type ISettings = StringDictionary[js.Any]
  
  type ISettingsFunction = js.Function1[/* settings */ ISettings, ISettings]
  
  type Settings = ISettings
  
  type SettingsFunction = ISettingsFunction
}
