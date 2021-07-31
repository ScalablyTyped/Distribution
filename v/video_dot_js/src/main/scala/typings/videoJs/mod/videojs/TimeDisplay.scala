package typings.videoJs.mod.videojs

import typings.videoJs.mod.videojs.EventTarget.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Displays the time left in the video
  */
@js.native
trait TimeDisplay
  extends StObject
     with Component {
  
  /**
    * To be filled out in the child class, should update the displayed time
    * in accordance with the fact that the current time has changed.
    *
    * @param [event]
    *        The `timeupdate`  event that caused this to run.
    *
    * @listens Player#timeupdate
    */
  def updateContent(): Unit = js.native
  def updateContent(event: Event): Unit = js.native
}
