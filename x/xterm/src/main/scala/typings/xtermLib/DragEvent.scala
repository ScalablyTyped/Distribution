package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragEvent extends MouseEvent {
  /**
       * Returns the DataTransfer object for the event.
       */
  val dataTransfer: DataTransfer | scala.Null = js.native
}

@JSGlobal("DragEvent")
@js.native
object DragEvent
  extends ScalablyTyped.runtime.Instantiable1[/* type */ java.lang.String, DragEvent]
     with ScalablyTyped.runtime.Instantiable2[/* type */ java.lang.String, /* eventInitDict */ DragEventInit, DragEvent]

