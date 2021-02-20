package typings.wordpressIsShallowEqual

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @typedef {Record<string, any>} ComparableObject
    */
  /**
    * Returns true if the two arrays or objects are shallow equal, or false
    * otherwise.
    *
    * @param {any[]|ComparableObject} a First object or array to compare.
    * @param {any[]|ComparableObject} b Second object or array to compare.
    *
    * @return {boolean} Whether the two values are shallow equal.
    */
  @JSImport("@wordpress/is-shallow-equal", JSImport.Namespace)
  @js.native
  def apply(a: js.Array[_], b: js.Array[_]): Boolean = js.native
  @JSImport("@wordpress/is-shallow-equal", JSImport.Namespace)
  @js.native
  def apply(a: js.Array[_], b: Record[String, _]): Boolean = js.native
  @JSImport("@wordpress/is-shallow-equal", JSImport.Namespace)
  @js.native
  def apply(a: Record[String, _], b: js.Array[_]): Boolean = js.native
  @JSImport("@wordpress/is-shallow-equal", JSImport.Namespace)
  @js.native
  def apply(a: Record[String, _], b: Record[String, _]): Boolean = js.native
  
  /**
    * Returns true if the two arrays are shallow equal, or false otherwise.
    *
    * @param {any[]} a First array to compare.
    * @param {any[]} b Second array to compare.
    *
    * @return {boolean} Whether the two arrays are shallow equal.
    */
  /* was `typeof imported_arrays` */
  @JSImport("@wordpress/is-shallow-equal", "isShallowEqualArrays")
  @js.native
  def isShallowEqualArrays(a: js.Array[_], b: js.Array[_]): Boolean = js.native
  
  /**
    * Returns true if the two objects are shallow equal, or false otherwise.
    *
    * @param {import('.').ComparableObject} a First object to compare.
    * @param {import('.').ComparableObject} b Second object to compare.
    *
    * @return {boolean} Whether the two objects are shallow equal.
    */
  /* was `typeof imported_objects` */
  @JSImport("@wordpress/is-shallow-equal", "isShallowEqualObjects")
  @js.native
  def isShallowEqualObjects(a: Record[String, _], b: Record[String, _]): Boolean = js.native
  
  type ComparableObject = StringDictionary[js.Any]
}
