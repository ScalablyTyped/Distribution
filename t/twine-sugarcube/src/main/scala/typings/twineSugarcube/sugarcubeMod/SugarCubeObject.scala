package typings.twineSugarcube.sugarcubeMod

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SugarCubeObject extends js.Object {
  
  val Browser: IeVersion = js.native
  
  val Config: ConfigAPI = js.native
  
  val Dialog: DialogAPI = js.native
  
  val Engine: EngineAPI = js.native
  
  val Fullscreen: FullscreenAPI = js.native
  
  val Has: Audio = js.native
  
  val Macro: MacroAPI = js.native
  
  val Save: SaveAPI = js.native
  
  val Scripting: ScriptingAPI = js.native
  
  val Setting: SettingsAPI = js.native
  
  val SimpleAudio: SimpleAudioAPI = js.native
  
  val State: StateAPI = js.native
  
  val Story: StoryAPI = js.native
  
  val UI: UIAPI = js.native
  
  val UIBar: UIBarAPI = js.native
  
  val Wikifier: WikifierAPI = js.native
  
  val session: js.Any = js.native
  
  /**
    * Player settings object, set up by the author/developer. See Setting API for more information.
    * @since 2.0.0
    */
  val settings: SugarCubeSettingVariables = js.native
  
  /**
    * Object that authors/developers may use to set up various bits of static data.
    *
    * Generally, you would use this for data that does not change and should not be stored
    * within story variables, which would make it part of the history.
    * @since 2.0.0
    */
  val setup: SugarCubeSetupObject = js.native
  
  val storage: js.Any = js.native
  
  val version: Build = js.native
}
object SugarCubeObject {
  
  @scala.inline
  def apply(
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
    session: js.Any,
    settings: SugarCubeSettingVariables,
    setup: SugarCubeSetupObject,
    storage: js.Any,
    version: Build
  ): SugarCubeObject = {
    val __obj = js.Dynamic.literal(Browser = Browser.asInstanceOf[js.Any], Config = Config.asInstanceOf[js.Any], Dialog = Dialog.asInstanceOf[js.Any], Engine = Engine.asInstanceOf[js.Any], Fullscreen = Fullscreen.asInstanceOf[js.Any], Has = Has.asInstanceOf[js.Any], Macro = Macro.asInstanceOf[js.Any], Save = Save.asInstanceOf[js.Any], Scripting = Scripting.asInstanceOf[js.Any], Setting = Setting.asInstanceOf[js.Any], SimpleAudio = SimpleAudio.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], Story = Story.asInstanceOf[js.Any], UI = UI.asInstanceOf[js.Any], UIBar = UIBar.asInstanceOf[js.Any], Wikifier = Wikifier.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], setup = setup.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SugarCubeObject]
  }
  
  @scala.inline
  implicit class SugarCubeObjectOps[Self <: SugarCubeObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBrowser(value: IeVersion): Self = this.set("Browser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfig(value: ConfigAPI): Self = this.set("Config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialog(value: DialogAPI): Self = this.set("Dialog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngine(value: EngineAPI): Self = this.set("Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullscreen(value: FullscreenAPI): Self = this.set("Fullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas(value: Audio): Self = this.set("Has", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacro(value: MacroAPI): Self = this.set("Macro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSave(value: SaveAPI): Self = this.set("Save", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScripting(value: ScriptingAPI): Self = this.set("Scripting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetting(value: SettingsAPI): Self = this.set("Setting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimpleAudio(value: SimpleAudioAPI): Self = this.set("SimpleAudio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: StateAPI): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStory(value: StoryAPI): Self = this.set("Story", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUI(value: UIAPI): Self = this.set("UI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUIBar(value: UIBarAPI): Self = this.set("UIBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWikifier(value: WikifierAPI): Self = this.set("Wikifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: js.Any): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettings(value: SugarCubeSettingVariables): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetup(value: SugarCubeSetupObject): Self = this.set("setup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorage(value: js.Any): Self = this.set("storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Build): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
