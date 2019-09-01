package typings.atUifabricExampleDashData.libListItemsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/example-data/lib/listItems", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createGroups(groupCount: Double, groupDepth: Double, startIndex: Double, itemsPerGroup: Double): js.Array[IExampleGroup] = js.native
  def createGroups(groupCount: Double, groupDepth: Double, startIndex: Double, itemsPerGroup: Double, level: Double): js.Array[IExampleGroup] = js.native
  def createGroups(
    groupCount: Double,
    groupDepth: Double,
    startIndex: Double,
    itemsPerGroup: Double,
    level: Double,
    key: String
  ): js.Array[IExampleGroup] = js.native
  def createGroups(
    groupCount: Double,
    groupDepth: Double,
    startIndex: Double,
    itemsPerGroup: Double,
    level: Double,
    key: String,
    isCollapsed: Boolean
  ): js.Array[IExampleGroup] = js.native
  def createListItems(count: Double): js.Array[IExampleItem] = js.native
  def createListItems(count: Double, startIndex: Double): js.Array[IExampleItem] = js.native
  def isGroupable(key: String): Boolean = js.native
}

