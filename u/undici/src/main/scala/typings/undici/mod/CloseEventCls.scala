package typings.undici.mod

import typings.undici.typesWebsocketMod.CloseEvent
import typings.undici.typesWebsocketMod.CloseEventInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("undici", "CloseEvent")
@js.native
open class CloseEventCls protected ()
  extends StObject
     with CloseEvent {
  def this(`type`: String) = this()
  def this(`type`: String, eventInitDict: CloseEventInit) = this()
  
  /* CompleteClass */
  override val code: Double = js.native
  
  /* CompleteClass */
  override val reason: String = js.native
  
  /* CompleteClass */
  override val wasClean: Boolean = js.native
}
