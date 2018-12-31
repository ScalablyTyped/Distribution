package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLObjectElement
  extends HTMLElement
     with GetSVGDocument {
  /**
    * Retrieves a string of the URL where the object tag can be found. This is often the href of the document that the object is in, or the value set by a base element.
    */
  val BaseHref: java.lang.String = js.native
  /** @deprecated */
  var align: java.lang.String = js.native
  /**
    * Sets or retrieves a character string that can be used to implement your own archive functionality for the object.
    */
  /** @deprecated */
  var archive: java.lang.String = js.native
  /** @deprecated */
  var border: java.lang.String = js.native
  /**
    * Sets or retrieves the URL of the file containing the compiled Java class.
    */
  /** @deprecated */
  var code: java.lang.String = js.native
  /**
    * Sets or retrieves the URL of the component.
    */
  /** @deprecated */
  var codeBase: java.lang.String = js.native
  /**
    * Sets or retrieves the Internet media type for the code associated with the object.
    */
  /** @deprecated */
  var codeType: java.lang.String = js.native
  /**
    * Retrieves the document object of the page or frame.
    */
  val contentDocument: Document | scala.Null = js.native
  /**
    * Sets or retrieves the URL that references the data of the object.
    */
  var data: java.lang.String = js.native
  /** @deprecated */
  var declare: scala.Boolean = js.native
  /**
    * Retrieves a reference to the form that the object is embedded in.
    */
  val form: HTMLFormElement | scala.Null = js.native
  /**
    * Sets or retrieves the height of the object.
    */
  var height: java.lang.String = js.native
  /** @deprecated */
  var hspace: scala.Double = js.native
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
  var name: java.lang.String = js.native
  val readyState: scala.Double = js.native
  /**
    * Sets or retrieves a message to be displayed while an object is loading.
    */
  /** @deprecated */
  var standby: java.lang.String = js.native
  /**
    * Sets or retrieves the MIME type of the object.
    */
  var `type`: java.lang.String = js.native
  var typemustmatch: scala.Boolean = js.native
  /**
    * Sets or retrieves the URL, often with a bookmark extension (#name), to use as a client-side image map.
    */
  var useMap: java.lang.String = js.native
  /**
    * Returns the error message that would be displayed if the user submits the form, or an empty string if no error message. It also triggers the standard error message, such as "this is a required field". The result is that the user sees validation messages without actually submitting.
    */
  val validationMessage: java.lang.String = js.native
  /**
    * Returns a  ValidityState object that represents the validity states of an element.
    */
  val validity: ValidityState = js.native
  /** @deprecated */
  var vspace: scala.Double = js.native
  /**
    * Sets or retrieves the width of the object.
    */
  var width: java.lang.String = js.native
  /**
    * Returns whether an element will successfully validate based on forms validation rules and constraints.
    */
  val willValidate: scala.Boolean = js.native
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
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  /**
    * Returns whether a form will validate when it is submitted, without having to submit it.
    */
  def checkValidity(): scala.Boolean = js.native
  /**
    * Removes the event listener in target's event listener list with the same type, callback, and options.
    */
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): scala.Unit = js.native
  def reportValidity(): scala.Boolean = js.native
  /**
    * Sets a custom error message that is displayed when a form is submitted.
    * @param error Sets a custom error message that is displayed when a form is submitted.
    */
  def setCustomValidity(error: java.lang.String): scala.Unit = js.native
}

@JSGlobal("HTMLObjectElement")
@js.native
object HTMLObjectElement
  extends org.scalablytyped.runtime.Instantiable0[HTMLObjectElement]

