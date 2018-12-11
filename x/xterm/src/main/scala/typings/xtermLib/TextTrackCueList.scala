package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TextTrackCueList
  extends /* index */ ScalablyTyped.runtime.NumberDictionary[TextTrackCue] {
  val length: scala.Double
  def getCueById(id: java.lang.String): TextTrackCue
  def item(index: scala.Double): TextTrackCue
}

@JSGlobal("TextTrackCueList")
@js.native
object TextTrackCueList
  extends ScalablyTyped.runtime.Instantiable0[TextTrackCueList]

