package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLContextEvent extends Event {
  val statusMessage: java.lang.String = js.native
}

@JSGlobal("WebGLContextEvent")
@js.native
object WebGLContextEvent
  extends ScalablyTyped.runtime.Instantiable1[/* type */ java.lang.String, WebGLContextEvent]
     with ScalablyTyped.runtime.Instantiable2[
      /* type */ java.lang.String, 
      /* eventInit */ WebGLContextEventInit, 
      WebGLContextEvent
    ]

