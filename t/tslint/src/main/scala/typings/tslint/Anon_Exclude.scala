package typings.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Exclude extends js.Object {
  var exclude: js.Array[String]
  var format: String
}

object Anon_Exclude {
  @scala.inline
  def apply(exclude: js.Array[String], format: String): Anon_Exclude = {
    val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Exclude]
  }
}

