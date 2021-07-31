package typings.wordpressIsShallowEqual

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  @scala.inline
  def apply(a: js.Array[js.Any], b: js.Array[js.Any]): Boolean = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def apply(a: js.Array[js.Any], b: Record[String, js.Any]): Boolean = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def apply(a: Record[String, js.Any], b: js.Array[js.Any]): Boolean = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def apply(a: Record[String, js.Any], b: Record[String, js.Any]): Boolean = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@wordpress/is-shallow-equal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns true if the two arrays are shallow equal, or false otherwise.
    *
    * @param {any[]} a First array to compare.
    * @param {any[]} b Second array to compare.
    *
    * @return {boolean} Whether the two arrays are shallow equal.
    */
  /* was `typeof imported_arrays` */
  @scala.inline
  def isShallowEqualArrays(a: js.Array[js.Any], b: js.Array[js.Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isShallowEqualArrays")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Returns true if the two objects are shallow equal, or false otherwise.
    *
    * @param {import('.').ComparableObject} a First object to compare.
    * @param {import('.').ComparableObject} b Second object to compare.
    *
    * @return {boolean} Whether the two objects are shallow equal.
    */
  /* was `typeof imported_objects` */
  @scala.inline
  def isShallowEqualObjects(a: Record[String, js.Any], b: Record[String, js.Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isShallowEqualObjects")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type ComparableObject = StringDictionary[js.Any]
}
