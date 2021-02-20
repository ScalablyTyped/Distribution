package typings.twineSugarcube.anon

import org.scalablytyped.runtime.StringDictionary
import typings.twineSugarcube.configMod.DescriptionHandler
import typings.twineSugarcube.passageMod.PassageBase
import typings.twineSugarcube.twineSugarcubeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Descriptions extends StObject {
  
  /**
    * Determines whether alternate passage descriptions are used by the Saves and Jump To menus—by default an excerpt
    * from the passage is used. Valid values are boolean true, which simply causes the passages' titles to be used, an
    * object, which maps passages' titles to their descriptions, or a function, which should return the passages'
    * description.
    *
    * NOTE:
    * * As boolean: You should ensure that all encounterable passage titles are meaningful.
    * * As object: If the mapping object does not contain an entry for the passage in question, then the passage's
    *   excerpt is used instead.
    * * As function: The function is called with the passage in question as its this value. If the function returns falsy,
    *   then the passage's excerpt is used instead.
    * @default null
    * @since 2.0.0
    * @example
    * // Uses passages' titles
    * Config.passages.descriptions = true;
    *
    * // Uses the description mapped by the title
    * Config.passages.descriptions = {
    *     "title" : "description"
    * };
    *
    * // Returns the description to be used
    * Config.passages.descriptions = function () {
    *     if (this.title === "title") {
    *         return "description";
    *     }
    * };
    */
  var descriptions: `true` | StringDictionary[String] | DescriptionHandler | Null = js.native
  
  /**
    * Determines whether passage titles are combined with the story title, within the browser's/tab's titlebar, when
    * passages are displayed.
    * @default false
    * @since 2.0.0
    * @example
    * Config.passages.displayTitles = true;
    */
  var displayTitles: Boolean = js.native
  
  /**
    * Determines whether rendering passages have their leading/trailing newlines removed and all remaining sequences of
    * newlines replaced with single spaces before they're rendered. Equivalent to including the nobr special tag on
    * every passage.
    * @default false
    * @since 2.19.0
    * @example
    * Config.passages.nobr = true;
    */
  var nobr: Boolean = js.native
  
  /**
    * Allows custom processing of passage text. The function is invoked each time the <Passage>.processText()
    * method is called. It is passed an abbreviated version of the associated passage's Passage instance —
    * containing only the tags, text, and title properties. Its return value should be the post-processed text.
    * @since 2.30.0
    *
    * **NOTE**: Does not affect script or stylesheet tagged passages, for Twine 1/Twee, or the Story JavaScript or
    * Story Stylesheet sections, for Twine 2.
    *
    * **NOTE**: The function will be called just before the built-in no-break passage processing if you're also using
    * that—see the Config.passages.nobr setting and nobr special tag.
    *
    * @since 2.30.0
    * @example
    * // Change instances of "cat" to "dog".
    * Config.passages.onProcess = function (p) {
    *         return p.text.replace(/\bcat(s?)\b/g, 'dog$1');
    * };
    */
  def onProcess(passage: PassageBase): String = js.native
  
  /**
    * Sets the title of the initial passage, the very first passage which will be displayed.
    *
    * @default Twine 2: none; Twine 1/Twee: "Start"
    * @example
    * Config.passages.start = "That Other Starting Passage";
    */
  var start: String = js.native
  
  /**
    * Determines whether outgoing passage transitions are enabled. Valid values are the name of the property being
    * animated, which causes the outgoing passage elements to be removed once that transition animation is complete,
    * or an integer delay (in milliseconds), which causes the outgoing passage elements to be removed once the delay
    * has expired.
    *
    * **NOTE**: If using an integer delay, ideally, it should probably be slightly longer than the outgoing transition
    * delay that you intend to use — e.g., an additional 10ms or so should be sufficient.
    *
    * @since 2.0.0
    * @example
    * // Remove outgoing elements when their opacity animation ends
    * Config.passages.transitionOut = "opacity";
    *
    * // Remove outgoing elements after 1010ms (1.01s)
    * Config.passages.transitionOut = 1010;
    *
    * // CSS styles:
    * // At the very least you will need to specify a .passage-out style that defines the transition's end state. For example:
    *
    * .passage-out {
    *     opacity: 0;
    * }
    * // That probably won't be very pleasing to the eye, however, so you will likely need several styles to make something
    * // that looks half-decent. For example, the following will give you a basic crossfade:
    *
    * #passages {
    *     position: relative;
    * }
    * .passage {
    *     left: 0;
    *     position: absolute;
    *     top: 0;
    *     transition: opacity 1s ease;
    * }
    * .passage-out {
    *     opacity: 0;
    * }
    */
  var transitionOut: String | Double = js.native
}
object Descriptions {
  
  @scala.inline
  def apply(
    displayTitles: Boolean,
    nobr: Boolean,
    onProcess: PassageBase => String,
    start: String,
    transitionOut: String | Double
  ): Descriptions = {
    val __obj = js.Dynamic.literal(displayTitles = displayTitles.asInstanceOf[js.Any], nobr = nobr.asInstanceOf[js.Any], onProcess = js.Any.fromFunction1(onProcess), start = start.asInstanceOf[js.Any], transitionOut = transitionOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[Descriptions]
  }
  
  @scala.inline
  implicit class DescriptionsMutableBuilder[Self <: Descriptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescriptions(value: `true` | StringDictionary[String] | DescriptionHandler): Self = StObject.set(x, "descriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionsNull: Self = StObject.set(x, "descriptions", null)
    
    @scala.inline
    def setDisplayTitles(value: Boolean): Self = StObject.set(x, "displayTitles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNobr(value: Boolean): Self = StObject.set(x, "nobr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnProcess(value: PassageBase => String): Self = StObject.set(x, "onProcess", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionOut(value: String | Double): Self = StObject.set(x, "transitionOut", value.asInstanceOf[js.Any])
  }
}
