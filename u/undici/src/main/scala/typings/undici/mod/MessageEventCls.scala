package typings.undici.mod

import org.scalablytyped.runtime.Instantiable0
import typings.node.workerThreadsMod.MessagePort
import typings.undici.typesWebsocketMod.MessageEvent
import typings.undici.typesWebsocketMod.MessageEventInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("undici", "MessageEvent")
@js.native
open class MessageEventCls[T] protected ()
  extends StObject
     with MessageEvent[T] {
  def this(`type`: String) = this()
  def this(`type`: String, eventInitDict: MessageEventInit[T]) = this()
  
  /* CompleteClass */
  override val data: T = js.native
  
  /* CompleteClass */
  override def initMessageEvent(
    `type`: String,
    bubbles: js.UndefOr[Boolean],
    cancelable: js.UndefOr[Boolean],
    data: js.UndefOr[Any],
    origin: js.UndefOr[String],
    lastEventId: js.UndefOr[String],
    source: js.UndefOr[Instantiable0[MessagePort] | Null],
    ports: js.UndefOr[js.Array[Instantiable0[MessagePort]]]
  ): Unit = js.native
  
  /* CompleteClass */
  override val lastEventId: String = js.native
  
  /* CompleteClass */
  override val origin: String = js.native
  
  /* CompleteClass */
  override val ports: js.Array[Instantiable0[MessagePort]] = js.native
  
  /* CompleteClass */
  override val source: Instantiable0[MessagePort] | Null = js.native
}
