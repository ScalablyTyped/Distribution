package typings
package winjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentTransition extends js.Object {
  /**
    * The animation plays when the Hub is changing its content.
    **/
  var contentTransition: java.lang.String
  /**
    * The animation plays when the Hub is first displayed.
    **/
  var entrance: java.lang.String
  /**
    * The animation plays when a section is inserted into the Hub.
    **/
  var insert: java.lang.String
  /**
    * The animation plays when a section is removed into the Hub.
    **/
  var remove: java.lang.String
}

object Anon_ContentTransition {
  @scala.inline
  def apply(
    contentTransition: java.lang.String,
    entrance: java.lang.String,
    insert: java.lang.String,
    remove: java.lang.String
  ): Anon_ContentTransition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contentTransition")(contentTransition)
    __obj.updateDynamic("entrance")(entrance)
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("remove")(remove)
    __obj.asInstanceOf[Anon_ContentTransition]
  }
}

