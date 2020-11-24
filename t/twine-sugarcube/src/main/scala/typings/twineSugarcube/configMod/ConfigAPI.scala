package typings.twineSugarcube.configMod

import typings.twineSugarcube.anon.Autoload
import typings.twineSugarcube.anon.Controls
import typings.twineSugarcube.anon.Descriptions
import typings.twineSugarcube.anon.IfAssignmentError
import typings.twineSugarcube.anon.Override
import typings.twineSugarcube.anon.PauseOnFadeToZero
import typings.twineSugarcube.anon.StowBarInitially
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigAPI extends js.Object {
  
  /**
    * Determines whether the link-visited class is added to internal passage links which go to previously visited
    * passages — i.e. the passage already exists within the story history
    *
    * **NOTE** You must provide your own styling for the `link-visited` class as none is provided by default.
    * @default false
    * @since 2.0.0
    * @example
    * Config.addVisitedLinkClass = true;
    * // An example style:
    * .link-visited {
    *      color: purple;
    * }
    */
  var addVisitedLinkClass: Boolean = js.native
  
  val audio: PauseOnFadeToZero = js.native
  
  /**
    * Determines whether the output of the Wikifier is post-processed into more sane markup — i.e. where appropriate, it
    * tries to transition the plethora of <br> elements into <p> elements.
    * @default false
    * @since 2.0.0
    * @example
    * Config.cleanupWikifierOutput = true;
    */
  var cleanupWikifierOutput: Boolean = js.native
  
  /**
    * Indicates whether SugarCube is running in test mode, which enables debug views. See Test Mode for more information.
    *
    * NOTE: This property is automatically set based on whether you're using a testing mode in a Twine compiler — i.e. Test
    * mode in Twine 2, Test Play From Here in Twine 1, or the test mode options (-t, --test) in Tweego. You may, however,
    * forcibly enable it if you need to for some reason — e.g. if you're using another compiler, which doesn't offer a way
    * to enable test mode.
    *
    * @default false
    * @since 2.2.0
    * @example
    * // Forcibly enable test mode
    *  Config.debug = true;
    *
    * @example
    * // Check if test mode is enabled in JavaScript
    * if (Config.debug) {
    *    // do something debug related
    * }
    *
    * @example
    * // Check if test mode is enabled via the <<if>> macro
    * <<if Config.debug>>
    *     // do something debug related
    * <</if>>
    */
  var debug: Boolean = js.native
  
  val history: Controls = js.native
  
  /**
    * Sets the integer delay (in milliseconds) before the loading screen is dismissed, once the document has signaled its
    * readiness. Not generally necessary, however, some browsers render slower than others and may need a little extra time
    * to get a media-heavy page done. This allows you to fine tune for those cases.
    *
    * @default 0
    * @since 2.0.0
    *
    * @example
    * // Delay the dismissal of the loading screen by 2000ms (2s)
    * Config.loadDelay = 2000;
    */
  var loadDelay: Double = js.native
  
  val macros: IfAssignmentError = js.native
  
  val navigation: Override = js.native
  
  val passages: Descriptions = js.native
  
  val saves: Autoload = js.native
  
  val ui: StowBarInitially = js.native
}
object ConfigAPI {
  
  @scala.inline
  def apply(
    addVisitedLinkClass: Boolean,
    audio: PauseOnFadeToZero,
    cleanupWikifierOutput: Boolean,
    debug: Boolean,
    history: Controls,
    loadDelay: Double,
    macros: IfAssignmentError,
    navigation: Override,
    passages: Descriptions,
    saves: Autoload,
    ui: StowBarInitially
  ): ConfigAPI = {
    val __obj = js.Dynamic.literal(addVisitedLinkClass = addVisitedLinkClass.asInstanceOf[js.Any], audio = audio.asInstanceOf[js.Any], cleanupWikifierOutput = cleanupWikifierOutput.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any], loadDelay = loadDelay.asInstanceOf[js.Any], macros = macros.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], passages = passages.asInstanceOf[js.Any], saves = saves.asInstanceOf[js.Any], ui = ui.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigAPI]
  }
  
  @scala.inline
  implicit class ConfigAPIOps[Self <: ConfigAPI] (val x: Self) extends AnyVal {
    
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
    def setAddVisitedLinkClass(value: Boolean): Self = this.set("addVisitedLinkClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudio(value: PauseOnFadeToZero): Self = this.set("audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCleanupWikifierOutput(value: Boolean): Self = this.set("cleanupWikifierOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistory(value: Controls): Self = this.set("history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadDelay(value: Double): Self = this.set("loadDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacros(value: IfAssignmentError): Self = this.set("macros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigation(value: Override): Self = this.set("navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassages(value: Descriptions): Self = this.set("passages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaves(value: Autoload): Self = this.set("saves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUi(value: StowBarInitially): Self = this.set("ui", value.asInstanceOf[js.Any])
  }
}
