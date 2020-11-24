package typings.w3cScreenOrientation

import typings.std.Event
import typings.std.EventTarget
import typings.std.OrientationType
import typings.w3cScreenOrientation.w3cScreenOrientationStrings.change
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScreenOrientation extends EventTarget {
  
  @JSName("addEventListener")
  def addEventListener_change(`type`: change, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    useCapture: Boolean
  ): Unit = js.native
  
  val angle: Double = js.native
  
  def lock(orientation: ScreenOrientationLockType): js.Promise[Unit] = js.native
  
  val `type`: OrientationType = js.native
  
  def unlock(): Unit = js.native
}
