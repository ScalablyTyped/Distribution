package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLEmbedElement
  extends HTMLElement
     with GetSVGDocument {
  /** @deprecated */
  var align: java.lang.String = js.native
  /**
       * Sets or retrieves the height of the object.
       */
  var height: java.lang.String = js.native
  /**
       * Gets or sets whether the DLNA PlayTo device is available.
       */
  var msPlayToDisabled: scala.Boolean = js.native
  /**
       * Gets or sets the path to the preferred media source. This enables the Play To target device to stream the media content, which can be DRM protected, from a different location, such as a cloud media server.
       */
  var msPlayToPreferredSourceUri: java.lang.String = js.native
  /**
       * Gets or sets the primary DLNA PlayTo device.
       */
  var msPlayToPrimary: scala.Boolean = js.native
  /**
       * Gets the source associated with the media element for use by the PlayToManager.
       */
  val msPlayToSource: js.Any = js.native
  /**
       * Sets or retrieves the name of the object.
       */
  /** @deprecated */
  var name: java.lang.String = js.native
  /**
       * Retrieves the palette used for the embedded document.
       */
  val palette: java.lang.String = js.native
  /**
       * Retrieves the URL of the plug-in used to view an embedded document.
       */
  val pluginspage: java.lang.String = js.native
  val readyState: java.lang.String = js.native
  /**
       * Sets or retrieves a URL to be loaded by the object.
       */
  var src: java.lang.String = js.native
  /**
       * Sets or retrieves the height and width units of the embed object.
       */
  var units: java.lang.String = js.native
  /**
       * Sets or retrieves the width of the object.
       */
  var width: java.lang.String = js.native
  /**
       * Appends an event listener for events whose type attribute value is type. The callback argument sets the callback that will be invoked when the event is dispatched.
       * The options argument sets listener-specific options. For compatibility this can be a
       * boolean, in which case the method behaves exactly as if the value was specified as options's capture.
       * When set to true, options's capture prevents callback from being invoked when the event's eventPhase attribute value is BUBBLING_PHASE. When false (or not present), callback will not be invoked when event's eventPhase attribute value is CAPTURING_PHASE. Either way, callback will be invoked if event's eventPhase attribute value is AT_TARGET.
       * When set to true, options's passive indicates that the callback will not cancel the event by invoking preventDefault(). This is used to enable performance optimizations described in §2.8 Observing event listeners.
       * When set to true, options's once indicates that the callback will only be invoked once after which the event listener will
       * be removed.
       * The event listener is appended to target's event listener list and is not appended if it has the same type, callback, and capture.
       */
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): scala.Unit = js.native
  /**
       * Appends an event listener for events whose type attribute value is type. The callback argument sets the callback that will be invoked when the event is dispatched.
       * The options argument sets listener-specific options. For compatibility this can be a
       * boolean, in which case the method behaves exactly as if the value was specified as options's capture.
       * When set to true, options's capture prevents callback from being invoked when the event's eventPhase attribute value is BUBBLING_PHASE. When false (or not present), callback will not be invoked when event's eventPhase attribute value is CAPTURING_PHASE. Either way, callback will be invoked if event's eventPhase attribute value is AT_TARGET.
       * When set to true, options's passive indicates that the callback will not cancel the event by invoking preventDefault(). This is used to enable performance optimizations described in §2.8 Observing event listeners.
       * When set to true, options's once indicates that the callback will only be invoked once after which the event listener will
       * be removed.
       * The event listener is appended to target's event listener list and is not appended if it has the same type, callback, and capture.
       */
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  /**
       * Appends an event listener for events whose type attribute value is type. The callback argument sets the callback that will be invoked when the event is dispatched.
       * The options argument sets listener-specific options. For compatibility this can be a
       * boolean, in which case the method behaves exactly as if the value was specified as options's capture.
       * When set to true, options's capture prevents callback from being invoked when the event's eventPhase attribute value is BUBBLING_PHASE. When false (or not present), callback will not be invoked when event's eventPhase attribute value is CAPTURING_PHASE. Either way, callback will be invoked if event's eventPhase attribute value is AT_TARGET.
       * When set to true, options's passive indicates that the callback will not cancel the event by invoking preventDefault(). This is used to enable performance optimizations described in §2.8 Observing event listeners.
       * When set to true, options's once indicates that the callback will only be invoked once after which the event listener will
       * be removed.
       * The event listener is appended to target's event listener list and is not appended if it has the same type, callback, and capture.
       */
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  /**
       * Removes the event listener in target's event listener list with the same type, callback, and options.
       */
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): scala.Unit = js.native
  /**
       * Removes the event listener in target's event listener list with the same type, callback, and options.
       */
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  /**
       * Removes the event listener in target's event listener list with the same type, callback, and options.
       */
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): scala.Unit = js.native
}

@JSGlobal("HTMLEmbedElement")
@js.native
object HTMLEmbedElement
  extends org.scalablytyped.runtime.Instantiable0[HTMLEmbedElement]

