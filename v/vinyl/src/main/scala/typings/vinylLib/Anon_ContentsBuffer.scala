package typings
package vinylLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentsBuffer extends js.Object {
  var contents: nodeLib.Buffer
}

object Anon_ContentsBuffer {
  @scala.inline
  def apply(contents: nodeLib.Buffer): Anon_ContentsBuffer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contents")(contents)
    __obj.asInstanceOf[Anon_ContentsBuffer]
  }
}

