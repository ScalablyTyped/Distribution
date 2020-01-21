package typings.typescriptTuple

import typings.typescriptTuple.typescriptTupleStrings.Infinite
import typings.typescriptTuple.typescriptTupleStrings.InfiniteLeft
import typings.typescriptTuple.typescriptTupleStrings.`Left is not finite`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCODENAMEERROR extends js.Object {
  var CODENAME: InfiniteLeft with Infinite
  var ERROR: `Left is not finite`
}

object AnonCODENAMEERROR {
  @scala.inline
  def apply(CODENAME: InfiniteLeft with Infinite, ERROR: `Left is not finite`): AnonCODENAMEERROR = {
    val __obj = js.Dynamic.literal(CODENAME = CODENAME.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCODENAMEERROR]
  }
}

