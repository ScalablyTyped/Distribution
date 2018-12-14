package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressEvent extends Event {
  val lengthComputable: scala.Boolean = js.native
  val loaded: scala.Double = js.native
  val total: scala.Double = js.native
}

@JSGlobal("ProgressEvent")
@js.native
object ProgressEvent
  extends org.scalablytyped.runtime.Instantiable1[/* type */ java.lang.String, ProgressEvent]
     with org.scalablytyped.runtime.Instantiable2[/* type */ java.lang.String, /* eventInitDict */ ProgressEventInit, ProgressEvent]

