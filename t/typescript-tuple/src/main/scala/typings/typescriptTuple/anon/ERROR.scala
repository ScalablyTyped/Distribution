package typings.typescriptTuple.anon

import typings.typescriptTuple.typescriptTupleStrings.InfiniteLeft
import typings.typescriptTuple.typescriptTupleStrings.`Left is not finite`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ERROR extends js.Object {
  var CODENAME: InfiniteLeft with typings.typescriptTuple.typescriptTupleStrings.Infinite
  var ERROR: `Left is not finite`
}

object ERROR {
  @scala.inline
  def apply(
    CODENAME: InfiniteLeft with typings.typescriptTuple.typescriptTupleStrings.Infinite,
    ERROR: `Left is not finite`
  ): ERROR = {
    val __obj = js.Dynamic.literal(CODENAME = CODENAME.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any])
    __obj.asInstanceOf[ERROR]
  }
}

