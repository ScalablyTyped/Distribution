package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Response extends Body {
  val headers: Headers
  val ok: scala.Boolean
  val redirected: scala.Boolean
  val status: scala.Double
  val statusText: java.lang.String
  val trailer: js.Promise[Headers]
  val `type`: ResponseType
  val url: java.lang.String
}

@JSGlobal("Response")
@js.native
object Response
  extends ScalablyTyped.runtime.Instantiable1[/* body */ BodyInit, Response]
     with ScalablyTyped.runtime.Instantiable2[(/* body */ BodyInit) | (/* body */ scala.Null), /* init */ ResponseInit, Response]
     with ScalablyTyped.runtime.Instantiable0[Response] {
  def error(): xtermLib.Response = js.native
  def redirect(url: java.lang.String): xtermLib.Response = js.native
  def redirect(url: java.lang.String, status: scala.Double): xtermLib.Response = js.native
}

