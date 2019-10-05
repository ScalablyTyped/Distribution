package typings.typeahead.Bloodhound

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Bloodhound")
@js.native
object ^ extends js.Object {
  /**
    * The Bloodhound suggestion engine is token-based, so how datums and queries are tokenized plays a vital role in the quality of search results.
    * Specify how you want datums and queries tokenized.
    */
  var tokenizers: Tokenizers = js.native
  /**
    * Returns a reference to Bloodhound and reverts window.Bloodhound to its
    * previous value. Can be used to avoid naming collisions.
    */
  def noConflict(): typings.typeahead.Bloodhound[_] = js.native
}

