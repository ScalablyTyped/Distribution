package typings.tern.ternMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertiesQueryResult extends js.Object {
  /** The property names. */
  var completions: js.Array[String]
}

object PropertiesQueryResult {
  @scala.inline
  def apply(completions: js.Array[String]): PropertiesQueryResult = {
    val __obj = js.Dynamic.literal(completions = completions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PropertiesQueryResult]
  }
}

