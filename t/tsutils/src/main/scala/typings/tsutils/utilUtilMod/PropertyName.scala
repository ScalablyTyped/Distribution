package typings.tsutils.utilUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyName extends js.Object {
  var displayName: String
  var symbolName: typings.typescript.mod.String
}

object PropertyName {
  @scala.inline
  def apply(displayName: String, symbolName: typings.typescript.mod.String): PropertyName = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], symbolName = symbolName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PropertyName]
  }
}

