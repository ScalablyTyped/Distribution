package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaQueryListEvent extends Event {
  val matches: scala.Boolean = js.native
  val media: java.lang.String = js.native
}

@JSGlobal("MediaQueryListEvent")
@js.native
object MediaQueryListEvent
  extends ScalablyTyped.runtime.Instantiable1[/* type */ java.lang.String, MediaQueryListEvent]
     with ScalablyTyped.runtime.Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ MediaQueryListEventInit, 
      MediaQueryListEvent
    ]

