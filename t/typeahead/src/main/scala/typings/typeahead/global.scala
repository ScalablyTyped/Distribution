package typings.typeahead

import typings.typeahead.Bloodhound.BloodhoundOptions
import typings.typeahead.Bloodhound.Tokenizers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  /**
    * Bloodhound is the typeahead.js suggestion engine. Bloodhound is robust,
    * flexible, and offers advanced functionalities such as prefetching,
    * intelligent caching, fast lookups, and backfilling with remote data.
    */
  @js.native
  class Bloodhound[T] protected ()
    extends typings.typeahead.Bloodhound[T] {
    /**
      * The constructor function.
      *
      * @constructor
      * @param options Options hash.
      */
    def this(options: BloodhoundOptions[T]) = this()
  }
  /* static members */
  @js.native
  object Bloodhound extends js.Object {
    
    /**
      * Returns a reference to Bloodhound and reverts window.Bloodhound to its
      * previous value. Can be used to avoid naming collisions.
      */
    def noConflict(): typings.typeahead.Bloodhound[_] = js.native
    
    /**
      * The Bloodhound suggestion engine is token-based, so how datums and queries are tokenized plays a vital role in the quality of search results.
      * Specify how you want datums and queries tokenized.
      */
    var tokenizers: Tokenizers = js.native
  }
}
