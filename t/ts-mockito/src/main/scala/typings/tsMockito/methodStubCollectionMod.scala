package typings.tsMockito

import typings.tsMockito.methodStubMod.MethodStub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts-mockito/lib/MethodStubCollection", JSImport.Namespace)
@js.native
object methodStubCollectionMod extends js.Object {
  @js.native
  class MethodStubCollection () extends js.Object {
    var getFirstMatchingFromGroup: js.Any = js.native
    var getFirstMatchingIndexFromGroup: js.Any = js.native
    var getItemsCountInGroup: js.Any = js.native
    var items: js.Any = js.native
    var removeIfNotLast: js.Any = js.native
    def add(item: MethodStub): Unit = js.native
    def getFirstMatchingFromGroupAndRemoveIfNotLast(groupIndex: Double, args: js.Array[_]): MethodStub = js.native
    def getLastMatchingGroupIndex(args: js.Any): Double = js.native
    def hasMatchingInAnyGroup(args: js.Array[_]): Boolean = js.native
  }
  
}

