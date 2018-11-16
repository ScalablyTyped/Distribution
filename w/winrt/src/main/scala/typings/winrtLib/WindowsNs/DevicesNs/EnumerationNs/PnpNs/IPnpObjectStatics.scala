package typings
package winrtLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPnpObjectStatics extends js.Object {
  def createFromIdAsync(
    `type`: PnpObjectType,
    id: java.lang.String,
    requestedProperties: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[PnpObject] = js.native
  def createWatcher(
    `type`: PnpObjectType,
    requestedProperties: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]
  ): PnpObjectWatcher = js.native
  def createWatcher(
    `type`: PnpObjectType,
    requestedProperties: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String],
    aqsFilter: java.lang.String
  ): PnpObjectWatcher = js.native
  def findAllAsync(
    `type`: PnpObjectType,
    requestedProperties: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[PnpObjectCollection] = js.native
  def findAllAsync(
    `type`: PnpObjectType,
    requestedProperties: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String],
    aqsFilter: java.lang.String
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[PnpObjectCollection] = js.native
}

