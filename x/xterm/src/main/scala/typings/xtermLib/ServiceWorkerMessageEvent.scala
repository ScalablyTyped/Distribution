package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceWorkerMessageEvent extends Event {
  val data: js.Any = js.native
  val lastEventId: java.lang.String = js.native
  val origin: java.lang.String = js.native
  val ports: js.Array[MessagePort] | scala.Null = js.native
  val source: ServiceWorker | MessagePort | scala.Null = js.native
}

@JSGlobal("ServiceWorkerMessageEvent")
@js.native
object ServiceWorkerMessageEvent
  extends org.scalablytyped.runtime.Instantiable1[/* type */ java.lang.String, ServiceWorkerMessageEvent]
     with org.scalablytyped.runtime.Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ ServiceWorkerMessageEventInit, 
      ServiceWorkerMessageEvent
    ]

