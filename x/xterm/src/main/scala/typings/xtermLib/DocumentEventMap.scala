package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DocumentEventMap
  extends GlobalEventHandlersEventMap
     with DocumentAndElementEventHandlersEventMap {
  var fullscreenchange: Event
  var fullscreenerror: Event
  var readystatechange: ProgressEvent
  var visibilitychange: Event
}

