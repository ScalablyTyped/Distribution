package typings
package tsDashNodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FromString extends js.Object {
  def fromString(text: java.lang.String): typescriptLib.typescriptMod.tsNs.IScriptSnapshot
}

object Anon_FromString {
  @scala.inline
  def apply(fromString: js.Function1[java.lang.String, typescriptLib.typescriptMod.tsNs.IScriptSnapshot]): Anon_FromString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromString")(fromString)
    __obj.asInstanceOf[Anon_FromString]
  }
}

