package typings.twineSugarcube.globalsMod

import org.scalablytyped.runtime.StringDictionary
import typings.twineSugarcube.audioMod.SimpleAudioAPI
import typings.twineSugarcube.configMod.ConfigAPI
import typings.twineSugarcube.engineMod.EngineAPI
import typings.twineSugarcube.macroMod.MacroAPI
import typings.twineSugarcube.scriptingMod.ScriptingAPI
import typings.twineSugarcube.settingsMod.SettingsAPI
import typings.twineSugarcube.stateMod.StateAPI
import typings.twineSugarcube.storyMod.StoryAPI
import typings.twineSugarcube.sugarcubeMod.SugarCubeObject
import typings.twineSugarcube.templateMod.TemplateAPI
import typings.twineSugarcube.uiMod.DialogAPI
import typings.twineSugarcube.uiMod.FullscreenAPI
import typings.twineSugarcube.uiMod.LoadScreenAPI
import typings.twineSugarcube.uiMod.UIAPI
import typings.twineSugarcube.uiMod.UIBarAPI
import typings.twineSugarcube.userdataMod.SugarCubeSettingVariables
import typings.twineSugarcube.userdataMod.SugarCubeSetupObject
import typings.twineSugarcube.wikiMod.WikifierAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  /**
    * Configuration API.
    * @since 2.0.0
    */
  val Config: ConfigAPI = js.native
  
  /**
    * Dialog API.
    * @since 2.0.0
    */
  val Dialog: DialogAPI = js.native
  
  /**
    * Engine API.
    */
  val Engine: EngineAPI = js.native
  
  val Fullscreen: FullscreenAPI = js.native
  
  val LoadScreen: LoadScreenAPI = js.native
  
  /**
    * Macro API.
    * @since 2.0.0
    */
  val Macro: MacroAPI = js.native
  
  val Scripting: ScriptingAPI = js.native
  
  val Setting: SettingsAPI = js.native
  
  /**
    *
    * @since 2.28.0
    */
  val SimpleAudio: SimpleAudioAPI = js.native
  
  val State: StateAPI = js.native
  
  val Story: StoryAPI = js.native
  
  val SugarCube: SugarCubeObject = js.native
  
  /**
    * Template API.
    * @since 2.29.0
    */
  val Template: TemplateAPI = js.native
  
  val UI: UIAPI = js.native
  
  val UIBar: UIBarAPI = js.native
  
  val Wikifier: WikifierAPI = js.native
  
  /**
    * A prototype-less generic object whose properties and values are defined by the Setting.addToggle(),
    * Setting.addList(), and Setting.addRange() methods.
    *
    * Normally, the values of its properties are automatically managed by their associated Settings dialog
    * control. If necessary, however, you may manually change their values—n.b. you'll need to call the
    * Setting.save() after having done so.
    * @since 2.0.0
    */
  val settings: SugarCubeSettingVariables = js.native
  
  /**
    * Object that authors/developers may use to set up various bits of static data. Generally, you would use this for data that
    * does not change and should not be stored within story variables, which would make it part of the history.
    * @since 2.0.0
    */
  val setup: SugarCubeSetupObject = js.native
  
  /**
    * Strings localization object.
    * @since 2.10.0
    */
  @js.native
  object l10nStrings extends /* x */ StringDictionary[String]
}
