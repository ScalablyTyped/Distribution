package typings
package atUifabricStylingLib.libUtilitiesIconsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/styling/lib/utilities/icons", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getIcon(): js.UndefOr[IIconRecord] = js.native
  def getIcon(name: java.lang.String): js.UndefOr[IIconRecord] = js.native
  def registerIconAlias(iconName: java.lang.String, mappedToName: java.lang.String): scala.Unit = js.native
  def registerIcons(iconSubset: IIconSubset): scala.Unit = js.native
  def registerIcons(iconSubset: IIconSubset, options: stdLib.Partial[IIconOptions]): scala.Unit = js.native
  def setIconOptions(options: stdLib.Partial[IIconOptions]): scala.Unit = js.native
  def unregisterIcons(iconNames: js.Array[java.lang.String]): scala.Unit = js.native
}

