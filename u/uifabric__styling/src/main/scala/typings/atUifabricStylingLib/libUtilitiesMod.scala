package typings
package atUifabricStylingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/styling/lib/utilities", JSImport.Namespace)
@js.native
object libUtilitiesMod extends js.Object {
  def buildClassMap[T](styles: T): atUifabricStylingLib.atUifabricStylingLibStrings.buildClassMap with js.Any = js.native
  def getIcon(): js.UndefOr[atUifabricStylingLib.libUtilitiesIconsMod.IIconRecord] = js.native
  def getIcon(name: java.lang.String): js.UndefOr[atUifabricStylingLib.libUtilitiesIconsMod.IIconRecord] = js.native
  def getIconClassName(name: java.lang.String): java.lang.String = js.native
  def registerIconAlias(iconName: java.lang.String, mappedToName: java.lang.String): scala.Unit = js.native
  def registerIcons(iconSubset: atUifabricStylingLib.libUtilitiesIconsMod.IIconSubset): scala.Unit = js.native
  def registerIcons(
    iconSubset: atUifabricStylingLib.libUtilitiesIconsMod.IIconSubset,
    options: stdLib.Partial[atUifabricStylingLib.libUtilitiesIconsMod.IIconOptions]
  ): scala.Unit = js.native
  def setIconOptions(options: stdLib.Partial[atUifabricStylingLib.libUtilitiesIconsMod.IIconOptions]): scala.Unit = js.native
  def unregisterIcons(iconNames: js.Array[java.lang.String]): scala.Unit = js.native
}

