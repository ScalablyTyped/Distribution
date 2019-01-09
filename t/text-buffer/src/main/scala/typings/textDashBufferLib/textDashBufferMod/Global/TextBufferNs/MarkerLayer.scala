package typings
package textDashBufferLib.textDashBufferMod.Global.TextBufferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Experimental: A container for a related set of markers. */
@js.native
trait MarkerLayer extends js.Object {
  /** Remove all markers from this layer. */
  def clear(): scala.Unit = js.native
  // Lifecycle
  /** Create a copy of this layer with markers in the same state and locations. */
  def copy(): MarkerLayer = js.native
  /** Destroy this layer. */
  def destroy(): scala.Boolean = js.native
  /** Find markers in the layer conforming to the given parameters. */
  def findMarkers(params: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.OptionsNs.FindMarker): js.Array[Marker] = js.native
  // Querying
  /** Get an existing marker by its id. */
  def getMarker(id: scala.Double): js.UndefOr[Marker] = js.native
  /** Get the number of markers in the marker layer. */
  def getMarkerCount(): scala.Double = js.native
  /** Get all existing markers on the marker layer. */
  def getMarkers(): js.Array[Marker] = js.native
  /** Determine whether this layer has been destroyed. */
  def isDestroyed(): scala.Boolean = js.native
  /** Create a marker at with its head at the given position with no tail. */
  def markPosition(position: PointCompatible): Marker = js.native
  def markPosition(position: PointCompatible, options: textDashBufferLib.Anon_ExclusiveInsideInvalidate): Marker = js.native
  // Marker Creation
  /** Create a marker with the given range. */
  def markRange(range: RangeCompatible): Marker = js.native
  def markRange(range: RangeCompatible, options: textDashBufferLib.Anon_ExclusiveInside): Marker = js.native
  /**
    *  Subscribe to be notified synchronously whenever markers are created on
    *  this layer.
    */
  def onDidCreateMarker(callback: js.Function1[/* marker */ Marker, scala.Unit]): eventDashKitLib.eventDashKitMod.Disposable = js.native
  /** Subscribe to be notified synchronously when this layer is destroyed. */
  def onDidDestroy(callback: js.Function0[scala.Unit]): eventDashKitLib.eventDashKitMod.Disposable = js.native
  // Event Subscription
  /**
    *  Subscribe to be notified asynchronously whenever markers are created,
    *  updated, or destroyed on this layer.
    */
  def onDidUpdate(callback: js.Function0[scala.Unit]): eventDashKitLib.eventDashKitMod.Disposable = js.native
}

