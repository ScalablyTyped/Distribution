package typings
package ternLib.libTernMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefsQueryResult extends js.Object {
  /** The name of the variable or property */
  var name: java.lang.String
  var refs: js.Array[ternLib.Anon_File]
  /** for variables: a type property holding either "global" or "local". */
  var `type`: js.UndefOr[ternLib.ternLibStrings.global | ternLib.ternLibStrings.local] = js.undefined
}

