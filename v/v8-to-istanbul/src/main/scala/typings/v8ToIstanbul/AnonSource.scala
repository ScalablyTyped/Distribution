package typings.v8ToIstanbul

import typings.v8ToIstanbul.mod.Sources
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSource extends Sources {
  var source: String
}

object AnonSource {
  @scala.inline
  def apply(source: String): AnonSource = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSource]
  }
}

