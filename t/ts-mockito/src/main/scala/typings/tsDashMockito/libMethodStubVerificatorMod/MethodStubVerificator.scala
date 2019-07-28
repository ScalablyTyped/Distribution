package typings.tsDashMockito.libMethodStubVerificatorMod

import typings.tsDashMockito.libMethodToStubMod.MethodToStub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-mockito/lib/MethodStubVerificator", "MethodStubVerificator")
@js.native
class MethodStubVerificator[T] protected () extends js.Object {
  def this(methodToVerify: MethodToStub) = this()
  var methodCallToStringConverter: js.Any = js.native
  var methodToVerify: js.Any = js.native
  def atLeast(value: Double): Unit = js.native
  def atMost(value: Double): Unit = js.native
  def called(): Unit = js.native
  def calledAfter(method: js.Any): Unit = js.native
  def calledBefore(method: js.Any): Unit = js.native
  def never(): Unit = js.native
  def once(): Unit = js.native
  def thrice(): Unit = js.native
  def times(value: Double): Unit = js.native
  def twice(): Unit = js.native
}

