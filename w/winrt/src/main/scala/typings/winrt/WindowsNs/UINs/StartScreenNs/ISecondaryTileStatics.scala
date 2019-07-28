package typings.winrt.WindowsNs.UINs.StartScreenNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISecondaryTileStatics extends js.Object {
  def exists(tileId: String): Boolean = js.native
  def findAllAsync(): IAsyncOperation[IVectorView[SecondaryTile]] = js.native
  def findAllAsync(applicationId: String): IAsyncOperation[IVectorView[SecondaryTile]] = js.native
  def findAllForPackageAsync(): IAsyncOperation[IVectorView[SecondaryTile]] = js.native
}

