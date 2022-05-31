package typings.tabris.global

import typings.tabris.ErrorEventInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("ErrorEvent")
@js.native
class ErrorEvent protected ()
  extends StObject
     with typings.tabris.ErrorEvent {
  def this(`type`: String) = this()
  def this(`type`: String, errorEventInitDict: ErrorEventInit) = this()
  
  /* CompleteClass */
  override val AT_TARGET: Double = js.native
  
  /* CompleteClass */
  override val BUBBLING_PHASE: Double = js.native
  
  /* CompleteClass */
  override val CAPTURING_PHASE: Double = js.native
  
  /* CompleteClass */
  override val bubbles: Boolean = js.native
  
  /* CompleteClass */
  override val cancelable: Boolean = js.native
  
  /* CompleteClass */
  override val colno: Double = js.native
  
  /* CompleteClass */
  override val currentTarget: typings.tabris.EventTarget = js.native
  
  /* CompleteClass */
  override val defaultPrevented: Boolean = js.native
  
  /* CompleteClass */
  override val error: js.Any = js.native
  
  /* CompleteClass */
  override val eventPhase: Double = js.native
  
  /* CompleteClass */
  override val filename: String = js.native
  
  /* CompleteClass */
  override def initErrorEvent(
    typeArg: String,
    canBubbleArg: Boolean,
    cancelableArg: Boolean,
    messageArg: String,
    filenameArg: String,
    linenoArg: Double
  ): Unit = js.native
  
  /* CompleteClass */
  override def initEvent(eventTypeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean): Unit = js.native
  
  /* CompleteClass */
  override val isTrusted: Boolean = js.native
  
  /* CompleteClass */
  override val lineno: Double = js.native
  
  /* CompleteClass */
  override val message: String = js.native
  
  /* CompleteClass */
  override def preventDefault(): Unit = js.native
  
  /* CompleteClass */
  override def stopImmediatePropagation(): Unit = js.native
  
  /* CompleteClass */
  override def stopPropagation(): Unit = js.native
  
  /* CompleteClass */
  override val target: typings.tabris.EventTarget = js.native
  
  /* CompleteClass */
  override val timeStamp: Double = js.native
  
  /* CompleteClass */
  override val `type`: String = js.native
}
