package typings.tabris.global

import typings.tabris.ProgressEventInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("ProgressEvent")
@js.native
class ProgressEvent protected ()
  extends StObject
     with typings.tabris.ProgressEvent {
  def this(`type`: String) = this()
  def this(`type`: String, eventInitDict: ProgressEventInit) = this()
  
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
  override val currentTarget: typings.tabris.EventTarget = js.native
  
  /* CompleteClass */
  override val defaultPrevented: Boolean = js.native
  
  /* CompleteClass */
  override val eventPhase: Double = js.native
  
  /* CompleteClass */
  override def initEvent(eventTypeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean): Unit = js.native
  
  /* CompleteClass */
  override def initProgressEvent(
    typeArg: String,
    canBubbleArg: Boolean,
    cancelableArg: Boolean,
    lengthComputableArg: Boolean,
    loadedArg: Double,
    totalArg: Double
  ): Unit = js.native
  
  /* CompleteClass */
  override val isTrusted: Boolean = js.native
  
  /* CompleteClass */
  override val lengthComputable: Boolean = js.native
  
  /* CompleteClass */
  override val loaded: Double = js.native
  
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
  override val total: Double = js.native
  
  /* CompleteClass */
  override val `type`: String = js.native
}
