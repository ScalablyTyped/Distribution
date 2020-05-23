package typings.yaml.typesMod.AST

import typings.yaml.typesMod.Scalar
import typings.yaml.utilMod.Type.PLAIN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlainValue extends Scalar {
  @JSName("cstNode")
  var cstNode_PlainValue: js.UndefOr[typings.yaml.parseCstMod.CST.PlainValue] = js.native
  @JSName("type")
  var type_PlainValue: PLAIN = js.native
}

