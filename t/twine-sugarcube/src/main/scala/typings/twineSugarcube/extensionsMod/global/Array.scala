package typings.twineSugarcube.extensionsMod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Array[T] extends js.Object {
  
  /**
    * Concatenates one or more unique members to the end of the base array and returns the result as a new array. Does not modify the original.
    * @param members The members to concatenate. Members which are arrays will be merged—i.e. their members will be concatenated, rather than the array itself.
    * @since SugarCube 2.21.0
    * @example
    * // Given: $fruits1 = ["Apples", "Oranges"], $fruits2 = ["Pears", "Plums"]
    * $fruits1.concatUnique($fruits2)            → Returns ["Apples", "Oranges", "Pears", "Plums"]
    * $fruits1.concatUnique($fruits2, $fruits2)  → Returns ["Apples", "Oranges", "Pears", "Plums"]
    * $fruits1.concatUnique("Pears")             → Returns ["Apples", "Oranges", "Pears"]
    * $fruits1.concatUnique("Pears", "Pears")    → Returns ["Apples", "Oranges", "Pears"]
    * $fruits1.concatUnique($fruits2, "Pears")   → Returns ["Apples", "Oranges", "Pears", "Plums"]
    */
  def concatUnique(members: js.Any*): Array[T] = js.native
  
  // deprecated members
  /**
    * @deprecated in favor of <Array>.includes().
    */
  def contains(needle: T): Boolean = js.native
  def contains(needle: T, position: Double): Boolean = js.native
  
  /**
    * @deprecated Deprecated in favor of <Array>.includesAll().
    */
  def containsAll(needle: T*): Boolean = js.native
  
  /**
    * @deprecated in favor of <Array>.includesAny().
    */
  def containsAny(needle: T*): Boolean = js.native
  
  /**
    * Returns the number of times that the given member was found within the array, starting the search at position.
    * @param needle The member to count.
    * @param position The zero-based index at which to begin searching for needle. If omitted, will default to 0.
    * @since SugarCube 2.0.0
    * @example
    * // Given: $fruits = ["Apples", "Oranges", "Plums", "Oranges"]
    * $fruits.count("Oranges")     → Returns 2
    * $fruits.count("Oranges", 2)  → Returns 1
    */
  def count(needle: T): Double = js.native
  def count(needle: T, position: Double): Double = js.native
  
  /**
    * Removes all instances of the given members from the array and returns a new array containing the removed members.
    * @param needles The members to remove. May be a list of members or an array.
    * @returns new array
    * @since SugarCube 2.5.0
    * @example
    * // Given: $fruits = ["Apples", "Oranges", "Plums", "Oranges"]
    * $fruits.delete("Oranges")          → Returns ["Oranges", "Oranges"]; $fruits ["Apples", "Plums"]
    * $fruits.delete("Apples", "Plums")  → Returns ["Apples", "Plums"]; $fruits ["Oranges", "Oranges"]
    */
  def delete(needles: T*): Array[T] = js.native
  
  /**
    * Removes all of the members at the given indices from the array and returns a new array containing the removed
    *  members.
    * @param indices The indices of the members to remove.
    * @sine SugarCube 2.5.0
    * @example
    * // Given: $fruits = ["Apples", "Oranges", "Plums", "Oranges"]
    * $fruits.deleteAt(2)     → Returns ["Plums"]; $fruits ["Apples", "Oranges", "Oranges"]
    * $fruits.deleteAt(1, 3)  → Returns ["Oranges", "Oranges"]; $fruits ["Apples", "Plums"]
    * $fruits.deleteAt(0, 2)  → Returns ["Apples", "Plums"]; $fruits ["Oranges", "Oranges"]
    */
  def deleteAt(indices: Double*): Array[T] = js.native
  
  /**
    * Removes all of the members that pass the test implemented by the given predicate function from the array and returns
    * a new array containing the removed members.
    * @param predicate The function used to test each member. It is called with three arguments:
    * value: The member being processed.
    * index: (optional, integer) The index of member being processed.
    * array: (optional, array) The array being processed.
    * @param thisArg The value to use as this when executing predicate.
    * @example
    * // Given: $fruits = ["Apples", "Apricots", "Oranges"]
    * $fruits.deleteWith(function (val) {
    *    return val === "Apricots";
    * }) // Returns ["Apricots"];
    * // and now $fruits is ["Apples", "Oranges"]
    *
    * $fruits.deleteWith(function (val) {
    *    return val.startsWith("Ap");
    * }) // Returns ["Apples", "Apricots"];
    * // and now $fruits is ["Oranges"]
    *
    * // Given: $fruits = [{ name : "Apples" }, { name : "Apricots" }, { name : "Oranges" }]
    * $fruits.deleteWith(function (val) {
    *     return val.name === "Apricots";
    * }) // Returns [{ name : "Apricots" }]; $fruits [{ name : "Apples" }, { name : "Oranges" }]
    *
    * $fruits.deleteWith(function (val) {
    *     return val.name.startsWith("Ap");
    * }) // Returns [{ name : "Apples" }, { name : "Apricots" }];
    * // and now $fruits is [{ name : "Oranges" }]
    */
  def deleteWith(predicate: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], Boolean]): Array[T] = js.native
  def deleteWith(
    predicate: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], Boolean],
    thisArg: Array[T]
  ): Array[T] = js.native
  
  /**
    * Returns the first member from the array. Does not modify the original.
    * @since SugarCube 2.2.7.0
    * @example
    * // Given: $pies = ["Blueberry", "Cherry", "Cream", "Pecan", "Pumpkin"]
    * $pies.first() // Returns "Blueberry"
    */
  def first(): js.UndefOr[T] = js.native
  
  /**
    * Returns a new array consisting of the flattened source array (i.e. flat map reduce). Does not modify the original.
    * Equivalent to ES2019 Array.prototype.flat(Infinity).
    * @since SugarCube 2.0.0
    * @example
    * // Given: $npa = [["Alfa", "Bravo"], [["Charlie", "Delta"], ["Echo"]], "Foxtrot"]
    * $npa.flatten() //  Returns ["Alfa", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot"]
    */
  def flatten(): Array[T] = js.native
  
  def includesAll(needles: T*): Boolean = js.native
  /**
    * Returns whether all of the given members were found within the array.
    * @param needles The members to find. May be a list of members or an array.
    * @since SugarCube 2.10.0
    * @example
    * // Given: $pies = ["Blueberry", "Cherry", "Cream", "Pecan", "Pumpkin"]
    * <<if $pies.includesAll("Cherry", "Pecan")>>…found Cherry and Pecan pies…<</if>>
    * @example
    * // Given: $search = ["Blueberry", "Pumpkin"]
    * <<if $pies.includesAll($search)>>…found Blueberry and Pumpkin pies…<</if>>
    */
  def includesAll(needles: Array[T]): Boolean = js.native
  
  def includesAny(needles: T*): Boolean = js.native
  /**
    * Returns whether any of the given members were found within the array.
    * @param needles The members to find. May be a list of members or an array.
    * @since SugarCube 2.10.0
    * @example
    * // Given: $pies = ["Blueberry", "Cherry", "Cream", "Pecan", "Pumpkin"]
    * <<if $pies.includesAny("Cherry", "Pecan")>>…found Cherry or Pecan pie…<</if>>
    * @example
    * // Given: $search = ["Blueberry", "Pumpkin"]
    * <<if $pies.includesAny($search)>>…found Blueberry or Pumpkin pie…<</if>>
    */
  def includesAny(needles: Array[T]): Boolean = js.native
  
  /**
    * Returns the last member from the array. Does not modify the original.
    * @since SugarCube 2.27.0
    * @example
    * // Given: $pies = ["Blueberry", "Cherry", "Cream", "Pecan", "Pumpkin"]
    * $pies.last() // Returns "Pumpkin"
    */
  def last(): js.UndefOr[T] = js.native
  
  /**
    * Removes and returns a random member from the array.
    * @since SugarCube 2.0.0
    * @example
    * // Given: $pies = ["Blueberry", "Cherry", "Cream", "Pecan", "Pumpkin"]
    * $pies.pluck() // Removes and returns a random pie from the array
    */
  def pluck(): js.UndefOr[T] = js.native
  
  /**
    * Randomly removes the given number of members from the base array and returns the removed members as a new array.
    * @param want The number of members to pluck.
    * @since SugarCube 2.20.0
    * @example
    * // Given: $pies = ["Blueberry", "Cherry", "Cream", "Pecan", "Pumpkin"]
    * $pies.pluckMany(3) // Removes three random pies from the array and returns them as a new array
    */
  def pluckMany(): Array[T] = js.native
  def pluckMany(want: Double): Array[T] = js.native
  
  /**
    * Appends one or more unique members to the end of the base array and returns its new length.
    * @param members The members to append.
    * @since 2.21.0
    * @example
    * // Given: $fruits = ["Apples", "Oranges"]
    * $fruits.pushUnique("Apples") // Returns 2; $fruits ["Apples", "Oranges"]
    * $fruits.pushUnique("Plums", "Plums") // Returns 3; $fruits ["Apples", "Oranges", "Plums"]
    */
  def pushUnique(members: T*): Double = js.native
  
  /**
    * Returns a random member from the array. Does not modify the original.
    * @since SugarCube 2.0.0
    * @example
    * // Given: $pies = ["Blueberry", "Cherry", "Cream", "Pecan", "Pumpkin"]
    * $pies.random() // Returns a random pie from the array
    */
  def random(): js.UndefOr[T] = js.native
  
  /**
    * Randomly selects the given number of unique members from the array and returns the selected members as a new array.
    * Does not modify the original.
    * @param want The number of members to select.
    * @since SugarCube 2.20.0
    * @example
    * // Given: $pies = ["Blueberry", "Cherry", "Cream", "Pecan", "Pumpkin"]
    * $pies.randomMany(3) // Returns a new array containing three unique random pies from the array
    */
  def randomMany(): Array[T] = js.native
  def randomMany(want: Double): Array[T] = js.native
  
  /**
    * Randomly shuffles the array.
    * @since SugarCube 2.0.0
    * @example
    * // Given: $pies = ["Blueberry", "Cherry", "Cream", "Pecan", "Pumpkin"]
    * $pies.shuffle() // Randomizes the order of the pies in the array
    */
  def shuffle(): Array[T] = js.native
  
  /**
    * Prepends one or more unique members to the beginning of the base array and returns its new length.
    * @param members The members to append.
    * @since SugarCube 2.21.0
    * @example
    * // Given: $fruits = ["Oranges", "Plums"]
    * $fruits.unshiftUnique("Oranges") // Returns 2; $fruits ["Oranges", "Plums"]
    * $fruits.unshiftUnique("Apples", "Apples") // Returns 3; $fruits ["Apples", "Oranges", "Plums"]
    */
  def unshiftUnique(members: T*): Double = js.native
}
