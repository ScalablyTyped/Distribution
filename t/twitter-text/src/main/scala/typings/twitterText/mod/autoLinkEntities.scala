package typings.twitterText.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twitter-text", "autoLinkEntities")
@js.native
object autoLinkEntities extends js.Object {
  def apply(text: String, entities: js.Array[EntityWithIndices]): String = js.native
  def apply(text: String, entities: js.Array[EntityWithIndices], options: AutoLinkOptions): String = js.native
}

