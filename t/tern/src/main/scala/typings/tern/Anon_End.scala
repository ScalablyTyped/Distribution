package typings.tern

import typings.tern.libTernMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_End extends js.Object {
  var end: Double | Position
  var file: String
  var start: Double | Position
}

object Anon_End {
  @scala.inline
  def apply(end: Double | Position, file: String, start: Double | Position): Anon_End = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file, start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_End]
  }
}

