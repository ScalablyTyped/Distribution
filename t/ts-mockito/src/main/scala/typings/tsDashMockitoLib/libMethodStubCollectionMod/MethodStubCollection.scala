package typings
package tsDashMockitoLib.libMethodStubCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-mockito/lib/MethodStubCollection", "MethodStubCollection")
@js.native
class MethodStubCollection () extends js.Object {
  var getFirstMatchingFromGroup: js.Any = js.native
  var getFirstMatchingIndexFromGroup: js.Any = js.native
  var getItemsCountInGroup: js.Any = js.native
  var items: js.Any = js.native
  var removeIfNotLast: js.Any = js.native
  def add(item: tsDashMockitoLib.libStubMethodStubMod.MethodStub): scala.Unit = js.native
  def getFirstMatchingFromGroupAndRemoveIfNotLast(groupIndex: scala.Double, args: js.Array[_]): tsDashMockitoLib.libStubMethodStubMod.MethodStub = js.native
  def getLastMatchingGroupIndex(args: js.Any): scala.Double = js.native
  def hasMatchingInAnyGroup(args: js.Array[_]): scala.Boolean = js.native
}

