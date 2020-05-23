package typings.v8ToIstanbul.anon

import typings.v8ToIstanbul.mod.Sources
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source extends Sources {
  var source: String
}

object Source {
  @scala.inline
  def apply(source: String): Source = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
}

