package typings.winjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContentTransition extends js.Object {
  /**
    * The animation plays when the Hub is changing its content.
    **/
  var contentTransition: String
  /**
    * The animation plays when the Hub is first displayed.
    **/
  var entrance: String
  /**
    * The animation plays when a section is inserted into the Hub.
    **/
  var insert: String
  /**
    * The animation plays when a section is removed into the Hub.
    **/
  var remove: String
}

object AnonContentTransition {
  @scala.inline
  def apply(contentTransition: String, entrance: String, insert: String, remove: String): AnonContentTransition = {
    val __obj = js.Dynamic.literal(contentTransition = contentTransition.asInstanceOf[js.Any], entrance = entrance.asInstanceOf[js.Any], insert = insert.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContentTransition]
  }
}

