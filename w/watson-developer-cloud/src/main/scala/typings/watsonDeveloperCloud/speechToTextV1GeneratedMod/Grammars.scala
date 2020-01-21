package typings.watsonDeveloperCloud.speechToTextV1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Grammars. */
trait Grammars extends js.Object {
  /** An array of `Grammar` objects that provides information about the grammars for the custom model. The array is empty if the custom model has no grammars. */
  var grammars: js.Array[Grammar]
}

object Grammars {
  @scala.inline
  def apply(grammars: js.Array[Grammar]): Grammars = {
    val __obj = js.Dynamic.literal(grammars = grammars.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Grammars]
  }
}

