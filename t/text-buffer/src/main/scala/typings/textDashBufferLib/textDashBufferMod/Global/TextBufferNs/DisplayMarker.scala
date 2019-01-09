package typings
package textDashBufferLib.textDashBufferMod.Global.TextBufferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *  Represents a buffer annotation that remains logically stationary even as the
  *  buffer changes. This is used to represent cursors, folds, snippet targets,
  *  misspelled words, and anything else that needs to track a logical location
  *  in the buffer over time.
  */
@js.native
trait DisplayMarker extends js.Object {
  /**
    *  Removes the marker's tail. After calling the marker's head position will be
    *  reported as its current tail position until the tail is planted again.
    */
  def clearTail(): scala.Unit = js.native
  // Comparing to other markers
  /** Compares this marker to another based on their ranges. */
  def compare(other: DisplayMarker): scala.Double = js.native
  /** Creates and returns a new DisplayMarker with the same properties as this marker. */
  def copy(): DisplayMarker = js.native
  def copy(options: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.OptionsNs.CopyMarker): DisplayMarker = js.native
  // Construction and Destruction
  /**
    *  Destroys the marker, causing it to emit the 'destroyed' event. Once destroyed,
    *  a marker cannot be restored by undo/redo operations.
    */
  def destroy(): scala.Unit = js.native
  // Managing the marker's range
  /** Gets the buffer range of this marker. */
  def getBufferRange(): Range = js.native
  /**
    *  Retrieves the buffer position of the marker's end. This will always be greater
    *  than or equal to the result of DisplayMarker::getStartBufferPosition.
    */
  def getEndBufferPosition(): Point = js.native
  /**
    *  Retrieves the screen position of the marker's end. This will always be
    *  greater than or equal to the result of DisplayMarker::getStartScreenPosition.
    */
  def getEndScreenPosition(): Point = js.native
  def getEndScreenPosition(options: textDashBufferLib.Anon_BackwardClipDirection): Point = js.native
  /** Retrieves the buffer position of the marker's head. */
  def getHeadBufferPosition(): Point = js.native
  /** Retrieves the screen position of the marker's head. */
  def getHeadScreenPosition(): Point = js.native
  def getHeadScreenPosition(options: textDashBufferLib.Anon_BackwardClipDirection): Point = js.native
  /**
    *  Get the invalidation strategy for this marker.
    *  Valid values include: never, surround, overlap, inside, and touch.
    */
  def getInvalidationStrategy(): java.lang.String = js.native
  /** Returns an Object containing any custom properties associated with the marker. */
  def getProperties(): js.Object = js.native
  /** Gets the screen range of this marker. */
  def getScreenRange(): Range = js.native
  /**
    *  Retrieves the buffer position of the marker's start. This will always be less
    *  than or equal to the result of DisplayMarker::getEndBufferPosition.
    */
  def getStartBufferPosition(): Point = js.native
  /**
    *  Retrieves the screen position of the marker's start. This will always be
    *  less than or equal to the result of DisplayMarker::getEndScreenPosition.
    */
  def getStartScreenPosition(): Point = js.native
  def getStartScreenPosition(options: textDashBufferLib.Anon_BackwardClipDirection): Point = js.native
  /** Retrieves the buffer position of the marker's tail. */
  def getTailBufferPosition(): Point = js.native
  /** Retrieves the screen position of the marker's tail. */
  def getTailScreenPosition(): Point = js.native
  def getTailScreenPosition(options: textDashBufferLib.Anon_BackwardClipDirection): Point = js.native
  /** Returns a boolean indicating whether the marker has a tail. */
  def hasTail(): scala.Boolean = js.native
  /**
    *  Returns a boolean indicating whether the marker has been destroyed. A marker
    *  can be invalid without being destroyed, in which case undoing the invalidating
    *  operation would restore the marker.
    */
  def isDestroyed(): scala.Boolean = js.native
  /**
    *  Returns a boolean indicating whether this marker is equivalent to another
    *  marker, meaning they have the same range and options.
    */
  def isEqual(other: DisplayMarker): scala.Boolean = js.native
  /**
    *  Returns a boolean indicating whether changes that occur exactly at the marker's
    *  head or tail cause it to move.
    */
  def isExclusive(): scala.Boolean = js.native
  /** Returns a boolean indicating whether the head precedes the tail. */
  def isReversed(): scala.Boolean = js.native
  // TextEditorMarker Details
  /**
    *  Returns a boolean indicating whether the marker is valid. Markers can be
    *  invalidated when a region surrounding them in the buffer is changed.
    */
  def isValid(): scala.Boolean = js.native
  /** Returns whether this marker matches the given parameters. */
  def matchesProperties(attributes: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.OptionsNs.FindDisplayMarker): scala.Boolean = js.native
  // Event Subscription
  /** Invoke the given callback when the state of the marker changes. */
  def onDidChange(
    callback: js.Function1[
      /* event */ textDashBufferLib.textDashBufferMod.Global.TextBufferNs.EventsNs.DisplayMarkerChanged, 
      scala.Unit
    ]
  ): eventDashKitLib.eventDashKitMod.Disposable = js.native
  /** Invoke the given callback when the marker is destroyed. */
  def onDidDestroy(callback: js.Function0[scala.Unit]): eventDashKitLib.eventDashKitMod.Disposable = js.native
  /**
    *  Plants the marker's tail at the current head position. After calling the
    *  marker's tail position will be its head position at the time of the call,
    *  regardless of where the marker's head is moved.
    */
  def plantTail(): scala.Unit = js.native
  /** Modifies the buffer range of this marker. */
  def setBufferRange(bufferRange: RangeCompatible): scala.Unit = js.native
  def setBufferRange(bufferRange: RangeCompatible, properties: textDashBufferLib.Anon_Reversed): scala.Unit = js.native
  /** Sets the buffer position of the marker's head. */
  def setHeadBufferPosition(bufferPosition: PointCompatible): scala.Unit = js.native
  /** Sets the screen position of the marker's head. */
  def setHeadScreenPosition(screenPosition: PointCompatible): scala.Unit = js.native
  def setHeadScreenPosition(screenPosition: PointCompatible, options: textDashBufferLib.Anon_BackwardClipDirection): scala.Unit = js.native
  /** Merges an Object containing new properties into the marker's existing properties. */
  def setProperties(properties: js.Object): scala.Unit = js.native
  /** Modifies the screen range of this marker. */
  def setScreenRange(screenRange: RangeCompatible): scala.Unit = js.native
  def setScreenRange(screenRange: RangeCompatible, options: textDashBufferLib.Anon_Backward): scala.Unit = js.native
  /** Sets the buffer position of the marker's tail. */
  def setTailBufferPosition(bufferPosition: PointCompatible): scala.Unit = js.native
  /** Sets the screen position of the marker's tail. */
  def setTailScreenPosition(screenPosition: PointCompatible): scala.Unit = js.native
  def setTailScreenPosition(screenPosition: PointCompatible, options: textDashBufferLib.Anon_BackwardClipDirection): scala.Unit = js.native
}

