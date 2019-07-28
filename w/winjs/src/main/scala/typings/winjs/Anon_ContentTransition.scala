package typings.winjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentTransition extends js.Object {
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

object Anon_ContentTransition {
  @scala.inline
  def apply(contentTransition: String, entrance: String, insert: String, remove: String): Anon_ContentTransition = {
    val __obj = js.Dynamic.literal(contentTransition = contentTransition, entrance = entrance, insert = insert, remove = remove)
  
    __obj.asInstanceOf[Anon_ContentTransition]
  }
}

