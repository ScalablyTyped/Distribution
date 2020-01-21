package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A mention of a contextual entity. */
trait Mention extends js.Object {
  /** The name of the entity. */
  var entity: String
  /** An array of zero-based character offsets that indicate where the entity mentions begin and end in the input text. */
  var location: js.Array[Double]
}

object Mention {
  @scala.inline
  def apply(entity: String, location: js.Array[Double]): Mention = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Mention]
  }
}

