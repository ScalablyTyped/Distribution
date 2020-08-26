package typings.wordpressTokenList

import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/token-list", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait TokenList extends js.Object {
    /** @type {string} */
    var _currentValue: String = js.native
    /** @type {string[]} */
    var _valueAsArray: js.Array[String] = js.native
    /**
      * Returns an iterator for the TokenList, iterating items of the set.
      *
      * @see https://dom.spec.whatwg.org/#domtokenlist
      *
      * @return {IterableIterator<string>} TokenList iterator.
      */
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[String]] = js.native
    /**
      * Adds all arguments passed, except those already present.
      *
      * @see https://dom.spec.whatwg.org/#dom-domtokenlist-add
      *
      * @param {...string} items Items to add.
      */
    def add(items: String*): Unit = js.native
    /**
      * Returns true if `token` is present, and false otherwise.
      *
      * @see https://dom.spec.whatwg.org/#dom-domtokenlist-contains
      *
      * @param {string} item Token to test.
      *
      * @return {boolean} Whether token is present.
      */
    def contains(item: String): Boolean = js.native
    /**
      * @param {Parameters<Array<string>['entries']>} args
      */
    def entries(): IterableIterator[js.Tuple2[Double, String]] = js.native
    /**
      * @param {Parameters<Array<string>['forEach']>} args
      */
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit]
    ): Unit = js.native
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit],
      thisArg: js.Any
    ): Unit = js.native
    /**
      * Returns the token with index `index`.
      *
      * @see https://dom.spec.whatwg.org/#dom-domtokenlist-item
      *
      * @param {number} index Index at which to return token.
      *
      * @return {string|undefined} Token at index.
      */
    def item(index: Double): js.UndefOr[String] = js.native
    /**
      * @param {Parameters<Array<string>['keys']>} args
      */
    def keys(): IterableIterator[Double] = js.native
    /**
      * Returns the number of tokens.
      *
      * @see https://dom.spec.whatwg.org/#dom-domtokenlist-length
      *
      * @return {number} Number of tokens.
      */
    def length: Double = js.native
    /**
      * Removes arguments passed, if they are present.
      *
      * @see https://dom.spec.whatwg.org/#dom-domtokenlist-remove
      *
      * @param {...string} items Items to remove.
      */
    def remove(items: String*): Unit = js.native
    /**
      * Replaces `token` with `newToken`. Returns true if `token` was replaced
      * with `newToken`, and false otherwise.
      *
      * @see https://dom.spec.whatwg.org/#dom-domtokenlist-replace
      *
      * @param {string} token    Token to replace with `newToken`.
      * @param {string} newToken Token to use in place of `token`.
      *
      * @return {boolean} Whether replacement occurred.
      */
    def replace(token: String, newToken: String): Boolean = js.native
    /**
      * Returns true if `token` is in the associated attribute’s supported
      * tokens. Returns false otherwise.
      *
      * Always returns `true` in this implementation.
      *
      * @see https://dom.spec.whatwg.org/#dom-domtokenlist-supports
      *
      * @return {boolean} Whether token is supported.
      */
    def supports(): Boolean = js.native
    /**
      * If `force` is not given, "toggles" `token`, removing it if it’s present
      * and adding it if it’s not present. If `force` is true, adds token (same
      * as add()). If force is false, removes token (same as remove()). Returns
      * true if `token` is now present, and false otherwise.
      *
      * @see https://dom.spec.whatwg.org/#dom-domtokenlist-toggle
      *
      * @param {string}  token   Token to toggle.
      * @param {boolean} [force] Presence to force.
      *
      * @return {boolean} Whether token is present after toggle.
      */
    def toggle(token: String): Boolean = js.native
    def toggle(token: String, force: Boolean): Boolean = js.native
    /**
      * Returns the associated set as string.
      *
      * @see https://dom.spec.whatwg.org/#dom-domtokenlist-value
      *
      * @return {string} Token set as string.
      */
    def value: String = js.native
    /**
      * Replaces the associated set with a new string value.
      *
      * @see https://dom.spec.whatwg.org/#dom-domtokenlist-value
      *
      * @param {string} value New token set as string.
      */
    def value_=(arg: String): Unit = js.native
    /**
      * @param {Parameters<Array<string>['values']>} args
      */
    def values(): IterableIterator[String] = js.native
  }
  
  @js.native
  /**
    * Constructs a new instance of TokenList.
    *
    * @param {string} initialValue Initial value to assign.
    */
  class default () extends TokenList {
    def this(initialValue: String) = this()
  }
  
}

