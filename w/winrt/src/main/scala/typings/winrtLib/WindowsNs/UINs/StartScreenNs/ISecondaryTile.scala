package typings
package winrtLib.WindowsNs.UINs.StartScreenNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISecondaryTile extends js.Object {
  var arguments: java.lang.String = js.native
  var backgroundColor: winrtLib.WindowsNs.UINs.Color = js.native
  var displayName: java.lang.String = js.native
  var foregroundText: ForegroundText = js.native
  var lockScreenBadgeLogo: winrtLib.WindowsNs.FoundationNs.Uri = js.native
  var lockScreenDisplayBadgeAndTileText: scala.Boolean = js.native
  var logo: winrtLib.WindowsNs.FoundationNs.Uri = js.native
  var shortName: java.lang.String = js.native
  var smallLogo: winrtLib.WindowsNs.FoundationNs.Uri = js.native
  var tileId: java.lang.String = js.native
  var tileOptions: TileOptions = js.native
  var wideLogo: winrtLib.WindowsNs.FoundationNs.Uri = js.native
  def requestCreateAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Boolean] = js.native
  def requestCreateAsync(invocationPoint: winrtLib.WindowsNs.FoundationNs.Point): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Boolean] = js.native
  def requestCreateForSelectionAsync(selection: winrtLib.WindowsNs.FoundationNs.Rect): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Boolean] = js.native
  def requestCreateForSelectionAsync(
    selection: winrtLib.WindowsNs.FoundationNs.Rect,
    preferredPlacement: winrtLib.WindowsNs.UINs.PopupsNs.Placement
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Boolean] = js.native
  def requestDeleteAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Boolean] = js.native
  def requestDeleteAsync(invocationPoint: winrtLib.WindowsNs.FoundationNs.Point): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Boolean] = js.native
  def requestDeleteForSelectionAsync(selection: winrtLib.WindowsNs.FoundationNs.Rect): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Boolean] = js.native
  def requestDeleteForSelectionAsync(
    selection: winrtLib.WindowsNs.FoundationNs.Rect,
    preferredPlacement: winrtLib.WindowsNs.UINs.PopupsNs.Placement
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Boolean] = js.native
  def updateAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Boolean] = js.native
}

