package typings.webgme.GmeNs.ConceptsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionCollectionPair extends js.Object {
  var destinations: js.Array[ComposeChain]
  var sources: js.Array[ComposeChain]
}

object ConnectionCollectionPair {
  @scala.inline
  def apply(destinations: js.Array[ComposeChain], sources: js.Array[ComposeChain]): ConnectionCollectionPair = {
    val __obj = js.Dynamic.literal(destinations = destinations, sources = sources)
  
    __obj.asInstanceOf[ConnectionCollectionPair]
  }
}

