package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HashChangeEvent extends Event {
  val newURL: java.lang.String = js.native
  val oldURL: java.lang.String = js.native
}

@JSGlobal("HashChangeEvent")
@js.native
object HashChangeEvent
  extends org.scalablytyped.runtime.Instantiable1[/* type */ java.lang.String, HashChangeEvent]
     with org.scalablytyped.runtime.Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ HashChangeEventInit, 
      HashChangeEvent
    ]

