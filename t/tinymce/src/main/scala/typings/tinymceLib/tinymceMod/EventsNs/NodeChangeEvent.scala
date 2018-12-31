package typings
package tinymceLib.tinymceMod.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeChangeEvent extends Event {
  var element: stdLib.Node
  var parents: js.Array[stdLib.Node]
  var selectionChange: scala.Boolean
}

