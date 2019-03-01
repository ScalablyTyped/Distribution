package typings
package winjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bottom extends js.Object {
  /**
    * The AppBar appears at the bottom of the main view
    **/
  var bottom: java.lang.String
  /**
    * The AppBar appears at the top of the main view
    **/
  var top: java.lang.String
}

object Anon_Bottom {
  @scala.inline
  def apply(bottom: java.lang.String, top: java.lang.String): Anon_Bottom = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bottom")(bottom)
    __obj.updateDynamic("top")(top)
    __obj.asInstanceOf[Anon_Bottom]
  }
}

