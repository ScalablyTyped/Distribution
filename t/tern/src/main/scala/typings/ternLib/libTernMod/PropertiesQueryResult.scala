package typings
package ternLib.libTernMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertiesQueryResult extends js.Object {
  /** The property names. */
  var completions: js.Array[java.lang.String]
}

object PropertiesQueryResult {
  @scala.inline
  def apply(completions: js.Array[java.lang.String]): PropertiesQueryResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("completions")(completions)
    __obj.asInstanceOf[PropertiesQueryResult]
  }
}

