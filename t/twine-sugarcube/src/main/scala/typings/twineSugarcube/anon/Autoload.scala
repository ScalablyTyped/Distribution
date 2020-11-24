package typings.twineSugarcube.anon

import typings.twineSugarcube.configMod.SaveDetails
import typings.twineSugarcube.configMod.SaveObjectHander
import typings.twineSugarcube.extensionsMod.global.Array
import typings.twineSugarcube.saveMod.SaveObject
import typings.twineSugarcube.twineSugarcubeBooleans.`true`
import typings.twineSugarcube.twineSugarcubeStrings.prompt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Autoload extends js.Object {
  
  /**
    * Determines whether the autosave, if it exists, is automatically loaded upon story startup. Valid values are
    * boolean true, which simply causes the autosave to be loaded, the string "prompt", which prompts the player via a
    * dialog to load the autosave, or a function, which causes the autosave to be loaded if its return value is truthy.
    *
    * **NOTE**: If the autosave cannot be loaded, for any reason, then the start passage is loaded instead.
    * @since 2.0.0
    * @example
    * // Automatically loads the autosave
    * Config.saves.autoload = true;
    *
    * // Prompts the player about loading the autosave
    * Config.saves.autoload = "prompt";
    *
    * // Loads the autosave if it returns a truthy value
    * Config.saves.autoload = function () {
    *     // code
    * };
    */
  var autoload: Boolean | prompt | js.Function0[Boolean] | Null = js.native
  
  /**
    * Determines whether the autosave is created/updated when passages are displayed. Valid values are boolean true,
    * which causes the autosave to be updated with every passage, an array of strings, which causes the autosave to
    * be updated for each passage with at least one matching tag, or a function, which causes the autosave to be
    * updated for each passage where its return value is truthy.
    *
    * **WARNING**: When setting the value to boolean true, you will likely also need to use the Config.saves.isAllowed
    * property to disallow saving on the start passage. Or, if you use the start passage as real part of your story and
    * allow the player to reenter it, rather than just as the initial landing/cover page, then you might wish to only
    * disallow saving on the start passage the very first time it's displayed (at story startup).
    * @since 2.0.0
    * @since 2.30.0: Added function values and deprecated string values.
    * @example
    * // Autosaves every passage
    * Config.saves.autosave = true;
    *
    * // Autosaves on passages tagged with any of "bookmark" or "autosave"
    * Config.saves.autosave = ["bookmark", "autosave"];
    *
    * // Autosaves on passages if it returns a truthy value
    * Config.saves.autosave = function () {
    *     // code
    * };
    */
  var autosave: `true` | String | Array[String] | js.Function0[Boolean] | Null = js.native
  
  /**
    * Sets the story ID associated with saves.
    * @default slugified story title
    * @since 2.0.0
    * @example
    *  Config.saves.id = "a-big-huge-story-part-1";
    */
  var id: String = js.native
  
  /**
    * Determines whether saving is allowed within the current context. The callback is invoked each time a save is
    * requested. If its return value is false, the save is disallowed. If its return value is truthy, the save is
    * allowed to continue unperturbed.
    * @default undefined
    * @since 2.0.0
    * @example
    * Config.saves.isAllowed = function () {
    *     // code
    * };
    */
  var isAllowed: js.Function0[Boolean] | Null = js.native
  
  /**
    * Performs any required pre-processing before the save data is loaded. The callback is passed one parameter, the
    * save object to be processed. If it encounters an unrecoverable problem during its processing, it may throw an
    * exception containing an error message; the message will be displayed to the player and loading of the save will
    * be terminated.
    *
    * @see SaveObject
    * @default undefined
    * @since 2.0.0
    * @example
    * Config.saves.onLoad = function (save) {
    * // code
    * };
    */
  var onLoad: SaveObjectHander | Null = js.native
  
  /**
    * Performs any required post-processing before the save data is saved. The callback is passed one parameter, the
    * save object to be processed.
    *
    * NOTE: See the save objects section of the Save API for information on the format of a save.
    * @default undefined
    * @since 2.0.0
    * @since 2.33.0: Added save operation details object parameter to the callback function.
    * @example
    * Config.saves.onSave = function (save) {
    * // code
    * };
    */
  var onSave: SaveObjectHander | Null = js.native
  
  /**
    * Sets the maximum number of available save slots.
    *
    * @default 8
    * @since 2.0.0
    * @example
    * Config.saves.slots = 4;
    */
  var slots: Double = js.native
  
  /**
    * Sets the version property of saves.
    *
    * **NOTE**: This setting is only used to set the version property of saves. Thus, it is only truly useful if you plan
    * to upgrade out-of-date saves via a Config.saves.onLoad callback.
    *
    * @since 2.0.0
    * @example
    * // As an integer
    * Config.saves.version = 3;
    * @example
    * // As a string
    * Config.saves.version = "v3";
    */
  var version: js.Any = js.native
}
object Autoload {
  
  @scala.inline
  def apply(id: String, slots: Double, version: js.Any): Autoload = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Autoload]
  }
  
  @scala.inline
  implicit class AutoloadOps[Self <: Autoload] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlots(value: Double): Self = this.set("slots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: js.Any): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoloadFunction0(value: () => Boolean): Self = this.set("autoload", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAutoload(value: Boolean | prompt | js.Function0[Boolean]): Self = this.set("autoload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoloadNull: Self = this.set("autoload", null)
    
    @scala.inline
    def setAutosaveFunction0(value: () => Boolean): Self = this.set("autosave", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAutosave(value: `true` | String | Array[String] | js.Function0[Boolean]): Self = this.set("autosave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutosaveNull: Self = this.set("autosave", null)
    
    @scala.inline
    def setIsAllowed(value: () => Boolean): Self = this.set("isAllowed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsAllowedNull: Self = this.set("isAllowed", null)
    
    @scala.inline
    def setOnLoad(value: (/* save */ SaveObject, /* details */ SaveDetails) => Unit): Self = this.set("onLoad", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnLoadNull: Self = this.set("onLoad", null)
    
    @scala.inline
    def setOnSave(value: (/* save */ SaveObject, /* details */ SaveDetails) => Unit): Self = this.set("onSave", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnSaveNull: Self = this.set("onSave", null)
  }
}
