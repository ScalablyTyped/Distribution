package typings.winjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bottom extends js.Object {
  /**
    * The AppBar appears at the bottom of the main view
    **/
  var bottom: String
  /**
    * The AppBar appears at the top of the main view
    **/
  var top: String
}

object Anon_Bottom {
  @scala.inline
  def apply(bottom: String, top: String): Anon_Bottom = {
    val __obj = js.Dynamic.literal(bottom = bottom, top = top)
  
    __obj.asInstanceOf[Anon_Bottom]
  }
}

