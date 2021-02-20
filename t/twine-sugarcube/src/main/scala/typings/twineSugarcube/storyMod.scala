package typings.twineSugarcube

import typings.twineSugarcube.extensionsMod.global.Array
import typings.twineSugarcube.passageMod.Passage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storyMod {
  
  @js.native
  trait StoryAPI extends StObject {
    
    /**
      * The DOM ID of the story (created from the slugified story title).
      * @since 2.0.0
      */
    val domId: String = js.native
    
    /**
      * Returns the Passage object referenced by the given title, or an empty Passage object on failure.
      * @param passageTitle The title of the Passage object to return.
      * @since 2.0.0
      */
    def get(passageTitle: String): Passage = js.native
    
    /**
      * Returns whether a Passage object referenced by the given title exists.
      * @param passageTitle The title of the Passage object whose existence will be verified.
      * @since 2.0.0
      */
    def has(passageTitle: String): Boolean = js.native
    
    /**
      * Returns an array of Passage objects each of which must contain a property matching the given name,
      * whose value matches the given needle, or an empty array, if no matches are made.
      * @param propertyName The name of property whose value will be compared to the search value.
      * @param searchValue he value to search for within the matched property. The type of the property determines
      * how the search occurs; direct comparison for non-arrays, while arrays are iterated over. If the property
      * value, for non-arrays, or any of the property members' values, for arrays, match, then the Passage object
      * is added to the results array.
      * @param sortProperty The property whose value will be used to lexicographically sort the returned array.
      * If not given, the Passage object's title property is used.
      * @since 2.0.0
      * @example
      * // Returns all 'forest'-tagged Passage objects, sorted by their titles
      * Story.lookup("tags", "forest");
      */
    def lookup(propertyName: String, searchValue: String): Array[Passage] = js.native
    def lookup(propertyName: String, searchValue: String, sortProperty: String): Array[Passage] = js.native
    def lookup(propertyName: String, searchValue: Double): Array[Passage] = js.native
    def lookup(propertyName: String, searchValue: Double, sortProperty: String): Array[Passage] = js.native
    
    /**
      * Returns an array of Passage objects which passed the test implemented by the given filter function or
      * an empty array, if no objects pass.
      * @param filter The function used to test each Passage object, which is passed in as its sole parameter.
      * If the function returns true, then the Passage object is added to the results array.
      * @param sortProperty The property whose value will be used to lexicographically sort the returned array.
      * If not given, the Passage object's title property is used.
      * @since 2.11.0
      */
    def lookupWith(filter: js.Function1[/* p */ Passage, Boolean]): Array[Passage] = js.native
    def lookupWith(filter: js.Function1[/* p */ Passage, Boolean], sortProperty: String): Array[Passage] = js.native
    
    /**
      * The title of the story.
      * @since 2.0.0
      */
    val title: String = js.native
  }
}
