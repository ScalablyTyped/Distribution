package typings
package tsDashMockitoLib.libStubMethodStubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MethodStub extends js.Object {
  def execute(args: js.Array[_]): scala.Unit
  def getGroupIndex(): scala.Double
  def getValue(): js.Any
  def isApplicable(args: js.Array[_]): scala.Boolean
}

object MethodStub {
  @scala.inline
  def apply(
    execute: js.Function1[js.Array[_], scala.Unit],
    getGroupIndex: js.Function0[scala.Double],
    getValue: js.Function0[js.Any],
    isApplicable: js.Function1[js.Array[_], scala.Boolean]
  ): MethodStub = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("execute")(execute)
    __obj.updateDynamic("getGroupIndex")(getGroupIndex)
    __obj.updateDynamic("getValue")(getValue)
    __obj.updateDynamic("isApplicable")(isApplicable)
    __obj.asInstanceOf[MethodStub]
  }
}

