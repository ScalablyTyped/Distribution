package typings.webgme.Gme.Concepts

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
    val __obj = js.Dynamic.literal(destinations = destinations.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectionCollectionPair]
  }
}

