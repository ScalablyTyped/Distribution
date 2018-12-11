package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopStateEvent extends Event {
  val state: js.Any = js.native
}

@JSGlobal("PopStateEvent")
@js.native
object PopStateEvent
  extends ScalablyTyped.runtime.Instantiable1[/* type */ java.lang.String, PopStateEvent]
     with ScalablyTyped.runtime.Instantiable2[/* type */ java.lang.String, /* eventInitDict */ PopStateEventInit, PopStateEvent]

