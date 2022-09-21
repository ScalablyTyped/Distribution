package typings.twineSugarcube

import typings.twineSugarcube.anon.Audio
import typings.twineSugarcube.anon.Build
import typings.twineSugarcube.anon.IeVersion
import typings.twineSugarcube.audioMod.SimpleAudioAPI
import typings.twineSugarcube.configMod.ConfigAPI
import typings.twineSugarcube.engineMod.EngineAPI
import typings.twineSugarcube.macroMod.MacroAPI
import typings.twineSugarcube.saveMod.SaveAPI
import typings.twineSugarcube.scriptingMod.ScriptingAPI
import typings.twineSugarcube.settingsMod.SettingsAPI
import typings.twineSugarcube.stateMod.StateAPI
import typings.twineSugarcube.storyMod.StoryAPI
import typings.twineSugarcube.uiMod.DialogAPI
import typings.twineSugarcube.uiMod.FullscreenAPI
import typings.twineSugarcube.uiMod.UIAPI
import typings.twineSugarcube.uiMod.UIBarAPI
import typings.twineSugarcube.userdataMod.SugarCubeSettingVariables
import typings.twineSugarcube.userdataMod.SugarCubeSetupObject
import typings.twineSugarcube.wikiMod.WikifierAPI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sugarcubeMod {
  
  trait SugarCubeObject extends StObject {
    
    val Browser: IeVersion
    
    val Config: ConfigAPI
    
    val Dialog: DialogAPI
    
    val Engine: EngineAPI
    
    val Fullscreen: FullscreenAPI
    
    val Has: Audio
    
    val Macro: MacroAPI
    
    val Save: SaveAPI
    
    val Scripting: ScriptingAPI
    
    val Setting: SettingsAPI
    
    val SimpleAudio: SimpleAudioAPI
    
    val State: StateAPI
    
    val Story: StoryAPI
    
    val UI: UIAPI
    
    val UIBar: UIBarAPI
    
    val Wikifier: WikifierAPI
    
    val session: Any
    
    /**
      * Player settings object, set up by the author/developer. See Setting API for more information.
      * @since 2.0.0
      */
    val settings: SugarCubeSettingVariables
    
    /**
      * Object that authors/developers may use to set up various bits of static data.
      *
      * Generally, you would use this for data that does not change and should not be stored
      * within story variables, which would make it part of the history.
      * @since 2.0.0
      */
    val setup: SugarCubeSetupObject
    
    val storage: Any
    
    val version: Build
  }
  object SugarCubeObject {
    
    inline def apply(
      Browser: IeVersion,
      Config: ConfigAPI,
      Dialog: DialogAPI,
      Engine: EngineAPI,
      Fullscreen: FullscreenAPI,
      Has: Audio,
      Macro: MacroAPI,
      Save: SaveAPI,
      Scripting: ScriptingAPI,
      Setting: SettingsAPI,
      SimpleAudio: SimpleAudioAPI,
      State: StateAPI,
      Story: StoryAPI,
      UI: UIAPI,
      UIBar: UIBarAPI,
      Wikifier: WikifierAPI,
      session: Any,
      settings: SugarCubeSettingVariables,
      setup: SugarCubeSetupObject,
      storage: Any,
      version: Build
    ): SugarCubeObject = {
      val __obj = js.Dynamic.literal(Browser = Browser.asInstanceOf[js.Any], Config = Config.asInstanceOf[js.Any], Dialog = Dialog.asInstanceOf[js.Any], Engine = Engine.asInstanceOf[js.Any], Fullscreen = Fullscreen.asInstanceOf[js.Any], Has = Has.asInstanceOf[js.Any], Macro = Macro.asInstanceOf[js.Any], Save = Save.asInstanceOf[js.Any], Scripting = Scripting.asInstanceOf[js.Any], Setting = Setting.asInstanceOf[js.Any], SimpleAudio = SimpleAudio.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], Story = Story.asInstanceOf[js.Any], UI = UI.asInstanceOf[js.Any], UIBar = UIBar.asInstanceOf[js.Any], Wikifier = Wikifier.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], setup = setup.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[SugarCubeObject]
    }
    
    extension [Self <: SugarCubeObject](x: Self) {
      
      inline def setBrowser(value: IeVersion): Self = StObject.set(x, "Browser", value.asInstanceOf[js.Any])
      
      inline def setConfig(value: ConfigAPI): Self = StObject.set(x, "Config", value.asInstanceOf[js.Any])
      
      inline def setDialog(value: DialogAPI): Self = StObject.set(x, "Dialog", value.asInstanceOf[js.Any])
      
      inline def setEngine(value: EngineAPI): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
      
      inline def setFullscreen(value: FullscreenAPI): Self = StObject.set(x, "Fullscreen", value.asInstanceOf[js.Any])
      
      inline def setHas(value: Audio): Self = StObject.set(x, "Has", value.asInstanceOf[js.Any])
      
      inline def setMacro(value: MacroAPI): Self = StObject.set(x, "Macro", value.asInstanceOf[js.Any])
      
      inline def setSave(value: SaveAPI): Self = StObject.set(x, "Save", value.asInstanceOf[js.Any])
      
      inline def setScripting(value: ScriptingAPI): Self = StObject.set(x, "Scripting", value.asInstanceOf[js.Any])
      
      inline def setSession(value: Any): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setSetting(value: SettingsAPI): Self = StObject.set(x, "Setting", value.asInstanceOf[js.Any])
      
      inline def setSettings(value: SugarCubeSettingVariables): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setSetup(value: SugarCubeSetupObject): Self = StObject.set(x, "setup", value.asInstanceOf[js.Any])
      
      inline def setSimpleAudio(value: SimpleAudioAPI): Self = StObject.set(x, "SimpleAudio", value.asInstanceOf[js.Any])
      
      inline def setState(value: StateAPI): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
      
      inline def setStorage(value: Any): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      
      inline def setStory(value: StoryAPI): Self = StObject.set(x, "Story", value.asInstanceOf[js.Any])
      
      inline def setUI(value: UIAPI): Self = StObject.set(x, "UI", value.asInstanceOf[js.Any])
      
      inline def setUIBar(value: UIBarAPI): Self = StObject.set(x, "UIBar", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Build): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setWikifier(value: WikifierAPI): Self = StObject.set(x, "Wikifier", value.asInstanceOf[js.Any])
    }
  }
}
