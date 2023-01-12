package typings.twineSugarcube

import typings.jquery.JQuery.Event
import typings.twineSugarcube.twineSugarcubeStrings.`false`
import typings.twineSugarcube.twineSugarcubeStrings.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extensionsMod {
  
  object global {
    
    @js.native
    trait Array[T] extends StObject {
      
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
      def concatUnique(members: Any*): Array[T] = js.native
      
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
      
      def countWith(predicate: ArrayPredicate[T, Unit]): Double = js.native
      /**
        * Returns the number of times that members within the array pass the test implemented by the given predicate function.
        * @param predicate The function used to test each member. It is called with three arguments:
        * value: The member being processed.
        * index: (optional, integer) The index of member being processed.
        * array: (optional, array) The array being processed.
        * @param thisArg The value to use as this when executing predicate.
        * @since SugarCube 2.36.0
        * @example
        * // Given: $fruits = ["Apples", "Oranges", "Plums", "Oranges"]
        * $fruits.countWith(function (fruit) { return fruit === "Oranges"; })  → Returns 2
        */
      def countWith[PredicateThisArg](predicate: ArrayPredicate[T, PredicateThisArg], thisArg: PredicateThisArg): Double = js.native
      
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
      
      def deleteWith(predicate: ArrayPredicate[T, Unit]): Array[T] = js.native
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
      def deleteWith[PredicateThisArg](predicate: ArrayPredicate[T, PredicateThisArg], thisArg: PredicateThisArg): Array[T] = js.native
      
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
        * @deprecated in favour of native Array.flat()
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
    
    /**
      * @param value The member being processed.
      * @param index The index of member being processed.
      * @param array The array being processed.
      */
    type ArrayPredicate[T, ThisType] = js.ThisFunction3[/* this */ ThisType, /* value */ T, /* index */ Double, /* array */ Array[T], Boolean]
    
    @js.native
    trait JQuery extends StObject {
      
      /**
        * Makes the target element(s) WAI-ARIA-compatible clickables—meaning that various accessibility attributes are set and,
        * in addition to mouse clicks, enter/return and spacebar key presses also activate them. Returns a reference to the current
        * jQuery object for chaining.
        * @param handler  The callback to invoke when the target element(s) are activated.
        * @since 2.0.0
        * @example
        * // Given an existing element: <a id="so-clicky">Click me</a>
        * $('#so-clicky').ariaClick(function (event) {
        *         // do stuff
        * });
        *
        * @example
        * // Creates a basic link and appends it to the `output` element
        * $('<a>Click me</a>')
        *         .ariaClick(function (event) {
        *             // do stuff
        *         })
        * .appendTo(output);
        *
        * @example
        * // Creates a basic button and appends it to the `output` element
        * $('<button>Click me</button>')
        *         .ariaClick(function (event) {
        *         // do stuff
        * })
        * .appendTo(output);
        */
      def ariaClick(handler: js.Function1[/* event */ Event, Unit]): this.type = js.native
      /**
        * Makes the target element(s) WAI-ARIA-compatible clickables—meaning that various accessibility attributes are set and,
        * in addition to mouse clicks, enter/return and spacebar key presses also activate them. Returns a reference to the current
        * jQuery object for chaining.
        * @param options The options to be used when creating the clickables.
        * @param handler The callback to invoke when the target element(s) are activated.
        * @example
        * // Creates a link with options and appends it to the `output` element
        * $('<a>Click me</a>')
        *         .ariaClick({
        *             one   : true,
        *             label : 'This single-use link does stuff.'
        *         }, function (event) {
        *             // do stuff
        *         })
        * .appendTo(output);
        */
      def ariaClick(options: JQueryAriaClickOptions, handler: js.Function1[/* event */ Event, Unit]): this.type = js.native
      
      /**
        * Changes the disabled state of the target WAI-ARIA-compatible clickable element(s). Returns a reference to the current
        * jQuery object for chaining.
        * NOTE: This method is meant to work with clickables created via <jQuery>.ariaClick() and may not work with clickables
        * from other sources. SugarCube uses <jQuery>.ariaClick() internally to handle all of its various link markup and macros.
        * @param state The disabled state to apply. Truthy to disable the element(s), falsy to enable them.
        * @since 2.26.0
        * @example
        * // Given an existing WAI-ARIA-compatible clickable element with the ID "so-clicky"
        * $('#so-clicky').ariaDisabled(true); // Disables the target element
        * $('#so-clicky').ariaDisabled(false); // Enables the target element
        */
      def ariaDisabled(state: Boolean): Boolean = js.native
      
      /**
        * Returns whether any of the target WAI-ARIA-compatible clickable element(s) are disabled.
        *
        * NOTE: This method is meant to work with clickables created via <jQuery>.ariaClick() and may not work with clickables
        * from other sources. SugarCube uses <jQuery>.ariaClick() internally to handle all of its various link markup and macros.
        * @since 2.26.0
        * @example
        * // Given an existing WAI-ARIA-compatible clickable element with the ID "so-clicky"
        * // If "#so-clicky" is disabled:
        * $('#so-clicky').ariaIsDisabled(); // Returns true
        *
        * // If "#so-clicky" is enabled:
        * $('#so-clicky').ariaIsDisabled(); // Returns false
        */
      def ariaIsDisabled(): Boolean = js.native
      
      /**
        * Wikifies the given content source(s) and appends the result to the target element(s). Returns a reference to the
        * current jQuery object for chaining.
        * @param sources The list of content sources.
        * @since 2.0.0
        * @example
        * // Given an element: <div id="the-box"></div>
        * $('#the-box').wiki('Who //are// you?'); // Appends "Who <em>are</em> you?" to the target element
        */
      def wiki(sources: java.lang.String*): this.type = js.native
    }
    
    trait JQueryAriaClickOptions extends StObject {
      
      /**
        * Value for the aria-controls attribute.
        */
      var controls: js.UndefOr[java.lang.String] = js.undefined
      
      /**
        * Data to be passed to the handler in event.data when an event is triggered.
        */
      var data: js.UndefOr[Any] = js.undefined
      
      /**
        * Value for the aria-label and title attributes.
        */
      var label: js.UndefOr[java.lang.String] = js.undefined
      
      /**
        * A period-separated list of event namespaces.
        */
      var namespace: js.UndefOr[java.lang.String] = js.undefined
      
      /**
        * Whether the clickables are single-use—i.e., the handler callback runs only once and then removes itself.
        * If omitted, defaults to false.
        */
      var one: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Value for the aria-pressed attribute (valid values: "true", "false").
        */
      var pressed: js.UndefOr[`true` | `false`] = js.undefined
      
      /**
        * A selector applied to the target element(s) to filter the descendants that triggered the event. If omitted or
        * null, the event is always handled when it reaches the target element(s)
        */
      var selector: js.UndefOr[java.lang.String] = js.undefined
    }
    object JQueryAriaClickOptions {
      
      inline def apply(): JQueryAriaClickOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[JQueryAriaClickOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: JQueryAriaClickOptions] (val x: Self) extends AnyVal {
        
        inline def setControls(value: java.lang.String): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
        
        inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
        
        inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
        
        inline def setLabel(value: java.lang.String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        
        inline def setNamespace(value: java.lang.String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
        
        inline def setOne(value: Boolean): Self = StObject.set(x, "one", value.asInstanceOf[js.Any])
        
        inline def setOneUndefined: Self = StObject.set(x, "one", js.undefined)
        
        inline def setPressed(value: `true` | `false`): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
        
        inline def setPressedUndefined: Self = StObject.set(x, "pressed", js.undefined)
        
        inline def setSelector(value: java.lang.String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      }
    }
    
    trait JQueryStatic extends StObject {
      
      /**
        * Wikifies the given content source(s) and discards the result. If there were errors, an exception is thrown. This is only
        * really useful when you want to invoke a macro for its side-effects and aren't interested in its output.
        * @param sources The list of content sources.
        * @since 2.17.0
        * @example
        * $.wiki('<<somemacro>>'); // Invokes the <<somemacro>> macro, discarding any output
        */
      def wiki(sources: java.lang.String*): Unit
    }
    object JQueryStatic {
      
      inline def apply(wiki: /* repeated */ java.lang.String => Unit): JQueryStatic = {
        val __obj = js.Dynamic.literal(wiki = js.Any.fromFunction1(wiki))
        __obj.asInstanceOf[JQueryStatic]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
        
        inline def setWiki(value: /* repeated */ java.lang.String => Unit): Self = StObject.set(x, "wiki", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait JSON extends StObject {
      
      /**
        * Returns the given code string, and optional data chunk, wrapped within the JSON deserialization revive wrapper.
        * Intended to allow authors to easily wrap their custom object types (a.k.a. classes) revival code and associated data
        * within the revive wrapper, which should be returned from an object instance's .toJSON() method, so that the instance
        * may be properly revived upon deserialization.
        * @param codeString The revival code string to wrap.
        * @param reviveData he data which should be made available to the evaluated revival code during deserialization via the
        * special $ReviveData$ variable. WARNING: Attempting to pass the value of an object instance's this directly as the
        * reviveData parameter will trigger out of control recursion in the serializer, so a clone of the instance's own data
        * must be passed instead.
        * @since SugarCube 2.9.0
        * @example
        * JSON.reviveWrapper( <valid JavaScript code string> ); // -> Without data chunk
        * JSON.reviveWrapper( <valid JavaScript code string> , myOwnData); // -> With data chunk
        * // E.g. Assume that you're attempting to revive an instance of a custom class named
        * // `Character`, which is assigned to a story variable named `$pc`.  The call
        * // to `JSON.reviveWrapper()` might look something like the following.
        * var ownData = {};
        * Object.keys(this).forEach(function (pn) { ownData[pn] = clone(this[pn]); }, this);
        * return JSON.reviveWrapper('new Character($ReviveData$)', ownData);
        */
      def reviveWrapper(codeString: java.lang.String): js.Array[Any] = js.native
      def reviveWrapper(codeString: java.lang.String, reviveData: Any): js.Array[Any] = js.native
    }
    
    @js.native
    trait Math extends StObject {
      
      def clamp(num: java.lang.String, min: Double, max: Double): Double = js.native
      /**
        * Returns the given number clamped to the specified bounds. Does not modify the original.
        * @param num The number to clamp. May be an actual number or a numerical string.
        * @param min The lower bound of the number.
        * @param max The upper bound of the number.
        * @since 2.0.0
        * @example
        * Math.clamp($stat, 0, 200) // Clamps $stat to the bounds 0–200 and returns the new value
        * Math.clamp($stat, 1, 6.6) // Clamps $stat to the bounds 1–6.6 and returns the new value
        */
      def clamp(num: Double, min: Double, max: Double): Double = js.native
      
      /**
        * Returns the whole(integer) part of the given number by removing its fractional part, if any. Does not modify the
        * original.
        * @param num The number to truncate to an integer.
        * @since 2.0.0
        * @example
        * Math.trunc(12.7) // Returns 12
        * Math.trunc(-12.7) // Returns -12
        */
      def trunc(num: Double): Double = js.native
    }
    
    trait Number extends StObject {
      
      /**
        * Returns the number clamped to the specified bounds. Does not modify the original.
        * @param min The lower bound of the number.
        * @param max The upper bound of the number.
        * @since 2.0.0
        * @example
        * $stat.clamp(0, 200)  → Clamps $stat to the bounds 0–200 and returns the new value
        * $stat.clamp(1, 6.6)  → Clamps $stat to the bounds 1–6.6 and returns the new value
        */
      def clamp(min: Double, max: Double): Double
    }
    object Number {
      
      inline def apply(clamp: (Double, Double) => Double): Number = {
        val __obj = js.Dynamic.literal(clamp = js.Any.fromFunction2(clamp))
        __obj.asInstanceOf[Number]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Number] (val x: Self) extends AnyVal {
        
        inline def setClamp(value: (Double, Double) => Double): Self = StObject.set(x, "clamp", js.Any.fromFunction2(value))
      }
    }
    
    @js.native
    trait ReadonlyArray[T] extends StObject {
      
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
      
      def countWith(predicate: ArrayPredicate[T, Unit]): Double = js.native
      /**
        * Returns the number of times that members within the array pass the test implemented by the given predicate function.
        * @param predicate The function used to test each member. It is called with three arguments:
        * value: The member being processed.
        * index: (optional, integer) The index of member being processed.
        * array: (optional, array) The array being processed.
        * @param thisArg The value to use as this when executing predicate.
        * @since SugarCube 2.36.0
        * @example
        * // Given: $fruits = ["Apples", "Oranges", "Plums", "Oranges"]
        * $fruits.countWith(function (fruit) { return fruit === "Oranges"; })  → Returns 2
        */
      def countWith[PredicateThisArg](predicate: ArrayPredicate[T, PredicateThisArg], thisArg: PredicateThisArg): Double = js.native
      
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
        * @deprecated in favour of native Array.flat()
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
    }
    
    trait RegExpConstructor extends StObject {
      
      /**
        * Returns the given string with all regular expression metacharacters escaped. Does not modify the original.
        * @param text The string to escape.
        * @since 2.0.0
        * @example
        * RegExp.escape('That will be $5 (cash only)') // Returns 'That will be \$5 \(cash only\)'
        */
      def escape(text: java.lang.String): java.lang.String
    }
    object RegExpConstructor {
      
      inline def apply(escape: java.lang.String => java.lang.String): RegExpConstructor = {
        val __obj = js.Dynamic.literal(escape = js.Any.fromFunction1(escape))
        __obj.asInstanceOf[RegExpConstructor]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: RegExpConstructor] (val x: Self) extends AnyVal {
        
        inline def setEscape(value: java.lang.String => java.lang.String): Self = StObject.set(x, "escape", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait String extends StObject {
      
      /**
        * Returns the number of times that the given substring was found within the string, starting the search at position.
        * @param needle The substring to count.
        * @param position The zero-based index at which to begin searching for needle. If omitted, will default to 0.
        * @since 2.0.0
        */
      def count(needle: java.lang.String): Double = js.native
      def count(needle: java.lang.String, position: Double): Double = js.native
      
      /**
        * Returns the first Unicode code point within the string. Does not modify the original.
        * @since 2.27.0
        */
      def first(): java.lang.String = js.native
      
      /**
        * Returns the last Unicode code point within the string. Does not modify the original.
        * @since 2.27.0
        */
      def last(): java.lang.String = js.native
      
      /**
        * Returns the string with its first Unicode code point converted to upper case, according to any locale-specific rules.
        * Does not modify the original.
        * @since 2.9.0
        */
      def toLocaleUpperFirst(): java.lang.String = js.native
      
      /**
        * Returns the string with its first Unicode code point converted to upper case. Does not modify the original.
        * @since 2.9.0
        */
      def toUpperFirst(): java.lang.String = js.native
    }
    
    trait StringConstructor extends StObject {
      
      /**
        * Returns a formatted string, after replacing each format item in the given format string with the text equivalent of the
        * corresponding argument's value.
        * @param format The format string, which consists of normal text and format items.
        * @param arguments Either a list of arguments, which correspond by-index to the format items within the format string, or an
        * array, whose members correspond by-index.
        *
        * A format item has the syntax {index[,alignment]}, square-brackets denoting optional elements.
        * * **index**: (integer) The (zero-based) index of the argument whose string representation will replace the format item.
        * * **alignment**: (optional, integer) The total length of the field into which the argument is inserted, and whether it's
        * right- or left-aligned (positive aligns right, negative aligns left).
        *
        * @since 2.0.0
        * @example
        * String.format("{0}, {1}!", "Hello", "World"); //List of arguments; Returns "Hello, World!"
        * String.format("{0}, {1}!", [ "Hello", "World" ]); //Array argument; Returns "Hello, World!"
        * String.format("{0,6}", "foo"); // Returns "   foo"
        * String.format("{0,-6}", "foo"); //Returns "foo   "
        */
      def format(format: java.lang.String, arguments: Any*): java.lang.String
    }
    object StringConstructor {
      
      inline def apply(format: (java.lang.String, /* repeated */ Any) => java.lang.String): StringConstructor = {
        val __obj = js.Dynamic.literal(format = js.Any.fromFunction2(format))
        __obj.asInstanceOf[StringConstructor]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: StringConstructor] (val x: Self) extends AnyVal {
        
        inline def setFormat(value: (java.lang.String, /* repeated */ Any) => java.lang.String): Self = StObject.set(x, "format", js.Any.fromFunction2(value))
      }
    }
  }
}
