package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDBVersionChangeEvent extends Event {
  val newVersion: scala.Double | scala.Null = js.native
  val oldVersion: scala.Double = js.native
}

@JSGlobal("IDBVersionChangeEvent")
@js.native
object IDBVersionChangeEvent
  extends org.scalablytyped.runtime.Instantiable1[/* type */ java.lang.String, IDBVersionChangeEvent]
     with org.scalablytyped.runtime.Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ IDBVersionChangeEventInit, 
      IDBVersionChangeEvent
    ]

