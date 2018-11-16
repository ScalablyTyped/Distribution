package typings
package viewporterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Viewporter extends js.Object {
  var ACTIVE: scala.Boolean
  var READY: scala.Boolean
  var forceDetection: scala.Boolean
  var preventPageScroll: scala.Boolean
  def change(callback: stdLib.EventListener): scala.Unit
  def isLandscape(): scala.Boolean
  def ready(callback: stdLib.EventListener): scala.Unit
  def refresh(): scala.Unit
}

