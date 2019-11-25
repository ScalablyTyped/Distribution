package typings.victory

import typings.victory.victoryMod._CategoryPropType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_XYArray extends _CategoryPropType {
  var x: js.Array[String]
  var y: js.Array[String]
}

object Anon_XYArray {
  @scala.inline
  def apply(x: js.Array[String], y: js.Array[String]): Anon_XYArray = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_XYArray]
  }
}

