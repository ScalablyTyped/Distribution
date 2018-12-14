package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorEvent extends Event {
  val colno: scala.Double = js.native
  val error: js.Any = js.native
  val filename: java.lang.String = js.native
  val lineno: scala.Double = js.native
  val message: java.lang.String = js.native
}

@JSGlobal("ErrorEvent")
@js.native
object ErrorEvent
  extends org.scalablytyped.runtime.Instantiable1[/* type */ java.lang.String, ErrorEvent]
     with org.scalablytyped.runtime.Instantiable2[/* type */ java.lang.String, /* eventInitDict */ ErrorEventInit, ErrorEvent]

