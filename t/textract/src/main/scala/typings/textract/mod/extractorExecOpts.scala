package typings.textract.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait extractorExecOpts extends js.Object {
  var exec: StringDictionary[String]
}

object extractorExecOpts {
  @scala.inline
  def apply(exec: StringDictionary[String]): extractorExecOpts = {
    val __obj = js.Dynamic.literal(exec = exec.asInstanceOf[js.Any])
    __obj.asInstanceOf[extractorExecOpts]
  }
}

