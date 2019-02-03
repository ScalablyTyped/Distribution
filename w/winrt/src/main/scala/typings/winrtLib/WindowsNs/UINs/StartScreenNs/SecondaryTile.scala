package typings
package winrtLib.WindowsNs.UINs.StartScreenNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.StartScreen.SecondaryTile")
@js.native
class SecondaryTile () extends ISecondaryTile {
  def this(tileId: java.lang.String) = this()
  def this(tileId: java.lang.String, shortName: java.lang.String, displayName: java.lang.String, args: java.lang.String, tileOptions: TileOptions, logoReference: winrtLib.WindowsNs.FoundationNs.Uri) = this()
  def this(tileId: java.lang.String, shortName: java.lang.String, displayName: java.lang.String, args: java.lang.String, tileOptions: TileOptions, logoReference: winrtLib.WindowsNs.FoundationNs.Uri, wideLogoReference: winrtLib.WindowsNs.FoundationNs.Uri) = this()
}

/* static members */
@JSGlobal("Windows.UI.StartScreen.SecondaryTile")
@js.native
object SecondaryTile extends js.Object {
  def exists(tileId: java.lang.String): scala.Boolean = js.native
  def findAllAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[
    winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.UINs.StartScreenNs.SecondaryTile]
  ] = js.native
  def findAllAsync(applicationId: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[
    winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.UINs.StartScreenNs.SecondaryTile]
  ] = js.native
  def findAllForPackageAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[
    winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.UINs.StartScreenNs.SecondaryTile]
  ] = js.native
}

