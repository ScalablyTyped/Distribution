package typings
package ternLib.libTernMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  var ast: estreeLib.estreeMod.Program
  var name: java.lang.String
  var scope: ternLib.libInferMod.Scope
  var text: java.lang.String
  var `type`: js.UndefOr[
    ternLib.ternLibStrings.full | ternLib.ternLibStrings.part | ternLib.ternLibStrings.delete
  ] = js.undefined
}

