package typings.watsonDeveloperCloud.compareComplyV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The numeric location of the identified element in the document, represented with two integers labeled `begin` and `end`. */
trait Location extends js.Object {
  /** The element's `begin` index. */
  var begin: Double
  /** The element's `end` index. */
  var end: Double
}

object Location {
  @scala.inline
  def apply(begin: Double, end: Double): Location = {
    val __obj = js.Dynamic.literal(begin = begin.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Location]
  }
}

