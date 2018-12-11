package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceLightEvent extends Event {
  val value: scala.Double = js.native
}

@JSGlobal("DeviceLightEvent")
@js.native
object DeviceLightEvent
  extends ScalablyTyped.runtime.Instantiable1[/* typeArg */ java.lang.String, DeviceLightEvent]
     with ScalablyTyped.runtime.Instantiable2[
      /* typeArg */ java.lang.String, 
      /* eventInitDict */ DeviceLightEventInit, 
      DeviceLightEvent
    ]

