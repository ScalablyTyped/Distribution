package typings.videoDotJs.videoDotJsMod.default

import typings.std.Element
import typings.videoDotJs.videoDotJsMod.videojs.EventTarget.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js", "on")
@js.native
object on extends js.Object {
  /**
    * Add an event listener to element
    * It stores the handler function in a separate cache object
    * and adds a generic handler to the element's event,
    * along with a unique id (guid) to the element.
    *
    * @param elem
    *        Element or object to bind listeners to
    *
    * @param type
    *        Type of event to bind to.
    *
    * @param fn
    *        Event listener.
    */
  def apply(elem: Element, `type`: String, fn: EventListener): Unit = js.native
  def apply(elem: Element, `type`: js.Array[String], fn: EventListener): Unit = js.native
}

