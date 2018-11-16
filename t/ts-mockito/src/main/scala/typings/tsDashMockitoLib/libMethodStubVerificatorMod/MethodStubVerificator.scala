package typings
package tsDashMockitoLib.libMethodStubVerificatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-mockito/lib/MethodStubVerificator", "MethodStubVerificator")
@js.native
class MethodStubVerificator[T] protected () extends js.Object {
  def this(methodToVerify: tsDashMockitoLib.libMethodToStubMod.MethodToStub) = this()
  var methodCallToStringConverter: js.Any = js.native
  var methodToVerify: js.Any = js.native
  def atLeast(value: scala.Double): scala.Unit = js.native
  def atMost(value: scala.Double): scala.Unit = js.native
  def called(): scala.Unit = js.native
  def calledAfter(method: js.Any): scala.Unit = js.native
  def calledBefore(method: js.Any): scala.Unit = js.native
  def never(): scala.Unit = js.native
  def once(): scala.Unit = js.native
  def thrice(): scala.Unit = js.native
  def times(value: scala.Double): scala.Unit = js.native
  def twice(): scala.Unit = js.native
}

