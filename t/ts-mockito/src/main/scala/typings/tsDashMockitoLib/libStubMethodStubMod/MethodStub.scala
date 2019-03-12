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
    execute: js.Array[_] => scala.Unit,
    getGroupIndex: () => scala.Double,
    getValue: () => js.Any,
    isApplicable: js.Array[_] => scala.Boolean
  ): MethodStub = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getGroupIndex = js.Any.fromFunction0(getGroupIndex), getValue = js.Any.fromFunction0(getValue), isApplicable = js.Any.fromFunction1(isApplicable))
  
    __obj.asInstanceOf[MethodStub]
  }
}

