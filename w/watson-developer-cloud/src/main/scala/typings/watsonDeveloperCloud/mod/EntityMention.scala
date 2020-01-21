package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object describing a contextual entity mention. */
trait EntityMention extends js.Object {
  /** The name of the intent. */
  var intent: String
  /** An array of zero-based character offsets that indicate where the entity mentions begin and end in the input text. */
  var location: js.Array[Double]
  /** The text of the user input example. */
  var text: String
}

object EntityMention {
  @scala.inline
  def apply(intent: String, location: js.Array[Double], text: String): EntityMention = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EntityMention]
  }
}

