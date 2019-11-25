package typings.uuidv4

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_V4 extends js.Object {
  var v4: RegExp
  var v5: RegExp
}

object Anon_V4 {
  @scala.inline
  def apply(v4: RegExp, v5: RegExp): Anon_V4 = {
    val __obj = js.Dynamic.literal(v4 = v4.asInstanceOf[js.Any], v5 = v5.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_V4]
  }
}

