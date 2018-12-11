package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FocusNavigationEvent extends Event {
  val navigationReason: NavigationReason = js.native
  val originHeight: scala.Double = js.native
  val originLeft: scala.Double = js.native
  val originTop: scala.Double = js.native
  val originWidth: scala.Double = js.native
  def requestFocus(): scala.Unit = js.native
}

@JSGlobal("FocusNavigationEvent")
@js.native
object FocusNavigationEvent
  extends ScalablyTyped.runtime.Instantiable1[/* type */ java.lang.String, FocusNavigationEvent]
     with ScalablyTyped.runtime.Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ FocusNavigationEventInit, 
      FocusNavigationEvent
    ]

