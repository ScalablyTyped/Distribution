package typings.atUifabricStyling.libUtilitiesIconsMod

import typings.atUifabricStyling.PartialIIconOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/styling/lib/utilities/icons", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getIcon(): js.UndefOr[IIconRecord] = js.native
  def getIcon(name: String): js.UndefOr[IIconRecord] = js.native
  def registerIconAlias(iconName: String, mappedToName: String): Unit = js.native
  def registerIcons(iconSubset: IIconSubset): Unit = js.native
  def registerIcons(iconSubset: IIconSubset, options: PartialIIconOptions): Unit = js.native
  def setIconOptions(options: PartialIIconOptions): Unit = js.native
  def unregisterIcons(iconNames: js.Array[String]): Unit = js.native
}

