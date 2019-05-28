package typings
package tsDashNodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofScriptSnapshot extends js.Object {
  def fromString(text: java.lang.String): typescriptLib.typescriptMod.IScriptSnapshot
}

object TypeofScriptSnapshot {
  @scala.inline
  def apply(fromString: java.lang.String => typescriptLib.typescriptMod.IScriptSnapshot): TypeofScriptSnapshot = {
    val __obj = js.Dynamic.literal(fromString = js.Any.fromFunction1(fromString))
  
    __obj.asInstanceOf[TypeofScriptSnapshot]
  }
}

