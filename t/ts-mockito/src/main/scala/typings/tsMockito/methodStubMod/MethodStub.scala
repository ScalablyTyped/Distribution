package typings.tsMockito.methodStubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MethodStub extends js.Object {
  def execute(args: js.Array[_]): Unit
  def getGroupIndex(): Double
  def getValue(): js.Any
  def isApplicable(args: js.Array[_]): Boolean
}

object MethodStub {
  @scala.inline
  def apply(
    execute: js.Array[_] => Unit,
    getGroupIndex: () => Double,
    getValue: () => js.Any,
    isApplicable: js.Array[_] => Boolean
  ): MethodStub = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getGroupIndex = js.Any.fromFunction0(getGroupIndex), getValue = js.Any.fromFunction0(getValue), isApplicable = js.Any.fromFunction1(isApplicable))
  
    __obj.asInstanceOf[MethodStub]
  }
}

