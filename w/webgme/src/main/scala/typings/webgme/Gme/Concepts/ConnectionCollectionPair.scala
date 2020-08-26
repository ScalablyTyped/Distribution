package typings.webgme.Gme.Concepts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionCollectionPair extends js.Object {
  var destinations: js.Array[ComposeChain] = js.native
  var sources: js.Array[ComposeChain] = js.native
}

object ConnectionCollectionPair {
  @scala.inline
  def apply(destinations: js.Array[ComposeChain], sources: js.Array[ComposeChain]): ConnectionCollectionPair = {
    val __obj = js.Dynamic.literal(destinations = destinations.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionCollectionPair]
  }
  @scala.inline
  implicit class ConnectionCollectionPairOps[Self <: ConnectionCollectionPair] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDestinationsVarargs(value: ComposeChain*): Self = this.set("destinations", js.Array(value :_*))
    @scala.inline
    def setDestinations(value: js.Array[ComposeChain]): Self = this.set("destinations", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourcesVarargs(value: ComposeChain*): Self = this.set("sources", js.Array(value :_*))
    @scala.inline
    def setSources(value: js.Array[ComposeChain]): Self = this.set("sources", value.asInstanceOf[js.Any])
  }
  
}

