package typings
package ternLib.libTernMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefsQueryResult extends js.Object {
  /** The name of the variable or property */
  var name: java.lang.String
  var refs: js.Array[ternLib.Anon_End]
  /** for variables: a type property holding either "global" or "local". */
  var `type`: js.UndefOr[ternLib.ternLibStrings.global | ternLib.ternLibStrings.local] = js.undefined
}

object RefsQueryResult {
  @scala.inline
  def apply(
    name: java.lang.String,
    refs: js.Array[ternLib.Anon_End],
    `type`: ternLib.ternLibStrings.global | ternLib.ternLibStrings.local = null
  ): RefsQueryResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("refs")(refs)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefsQueryResult]
  }
}

