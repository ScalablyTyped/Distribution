package typings.tsDashMockito.libMethodToStubMod

import typings.tsDashMockito.libMatcherTypeMatcherMod.Matcher
import typings.tsDashMockito.libMethodStubCollectionMod.MethodStubCollection
import typings.tsDashMockito.libMockMod.Mocker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-mockito/lib/MethodToStub", "MethodToStub")
@js.native
class MethodToStub protected () extends js.Object {
  def this(
    methodStubCollection: MethodStubCollection,
    matchers: js.Array[Matcher],
    mocker: Mocker,
    name: String
  ) = this()
  var matchers: js.Array[Matcher] = js.native
  var methodStubCollection: MethodStubCollection = js.native
  var mocker: Mocker = js.native
  var name: String = js.native
}

