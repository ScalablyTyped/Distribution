package typings
package tsDashMockitoLib.libMethodStubCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-mockito/lib/MethodStubCollection", "MethodStubCollection")
@js.native
class MethodStubCollection () extends js.Object {
  var items: js.Any = js.native
  def add(item: tsDashMockitoLib.libStubMethodStubMod.MethodStub): scala.Unit = js.native
  /* private */ def getFirstMatchingFromGroup(groupIndex: js.Any, args: js.Any): js.Any = js.native
  def getFirstMatchingFromGroupAndRemoveIfNotLast(groupIndex: scala.Double, args: js.Array[_]): tsDashMockitoLib.libStubMethodStubMod.MethodStub = js.native
  /* private */ def getFirstMatchingIndexFromGroup(groupIndex: js.Any, args: js.Any): js.Any = js.native
  /* private */ def getItemsCountInGroup(groupIndex: js.Any): js.Any = js.native
  def getLastMatchingGroupIndex(args: js.Any): scala.Double = js.native
  def hasMatchingInAnyGroup(args: js.Array[_]): scala.Boolean = js.native
  /* private */ def removeIfNotLast(groupIndex: js.Any, args: js.Any): js.Any = js.native
}

