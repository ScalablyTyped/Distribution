package typings.atUifabricExampleDashData

import typings.atUifabricExampleDashData.libFacepileMod.IExampleFacepilePersona
import typings.atUifabricExampleDashData.libListItemsMod.IExampleGroup
import typings.atUifabricExampleDashData.libListItemsMod.IExampleItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/example-data", JSImport.Namespace)
@js.native
object atUifabricExampleDashDataMod extends js.Object {
  val facepilePersonas: js.Array[IExampleFacepilePersona] = js.native
  val groupOne: js.Array[IExampleExtendedPersonaPropskeystringnumber] = js.native
  val groupTwo: js.Array[IExampleExtendedPersonaPropskeystringnumber] = js.native
  val mru: js.Array[IExampleExtendedPersonaPropskeystringnumber] = js.native
  val people: js.Array[IExampleExtendedPersonaPropskeystringnumber] = js.native
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
  def lorem(wordCount: Double): String = js.native
  @js.native
  object TestImages extends js.Object {
    var choiceGroupBarSelected: String = js.native
    var choiceGroupBarUnselected: String = js.native
    var choiceGroupPieSelected: String = js.native
    var choiceGroupPieUnselected: String = js.native
    var documentPreview: String = js.native
    var documentPreviewThree: String = js.native
    var documentPreviewTwo: String = js.native
    var iconOne: String = js.native
    var iconPpt: String = js.native
    var personaFemale: String = js.native
    var personaMale: String = js.native
  }
  
}

