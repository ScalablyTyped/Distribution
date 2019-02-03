package typings
package wonderDotJsLib.distEs2015EventObjectCustomEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/event/object/CustomEvent", "CustomEvent")
@js.native
class CustomEvent protected ()
  extends wonderDotJsLib.distEs2015EventObjectEventMod.Event {
  def this(eventName: java.lang.String) = this()
  def this(eventName: java.lang.String, userData: js.Any) = this()
  var userData: js.Any = js.native
  def copyPublicAttri(destination: js.Any, source: js.Any): js.Any = js.native
  def getDataFromDomEvent(event: wonderDotJsLib.distEs2015EventObjectDomEventMod.DomEvent): scala.Unit = js.native
}

/* static members */
@JSImport("wonder.js/dist/es2015/event/object/CustomEvent", "CustomEvent")
@js.native
object CustomEvent extends js.Object {
  def create(eventName: java.lang.String): js.Any = js.native
  def create(eventName: java.lang.String, userData: js.Any): js.Any = js.native
}

