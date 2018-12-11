package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait VideoTrack extends js.Object {
  val id: java.lang.String
  var kind: java.lang.String
  val label: java.lang.String
  var language: java.lang.String
  var selected: scala.Boolean
  val sourceBuffer: SourceBuffer
}

@JSGlobal("VideoTrack")
@js.native
object VideoTrack
  extends ScalablyTyped.runtime.Instantiable0[VideoTrack]

