package typings.typescriptTuple.anon

import typings.typescriptTuple.typescriptTupleStrings.InfiniteTupleSet
import typings.typescriptTuple.typescriptTupleStrings.`TupleSet is not finite`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CODENAMEERROR extends js.Object {
  var CODENAME: InfiniteTupleSet with typings.typescriptTuple.typescriptTupleStrings.Infinite
  var ERROR: `TupleSet is not finite`
}

object CODENAMEERROR {
  @scala.inline
  def apply(
    CODENAME: InfiniteTupleSet with typings.typescriptTuple.typescriptTupleStrings.Infinite,
    ERROR: `TupleSet is not finite`
  ): CODENAMEERROR = {
    val __obj = js.Dynamic.literal(CODENAME = CODENAME.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any])
    __obj.asInstanceOf[CODENAMEERROR]
  }
}

