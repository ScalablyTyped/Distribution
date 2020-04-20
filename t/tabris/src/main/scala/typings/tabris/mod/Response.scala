package typings.tabris.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.tabris.Blob
import typings.tabris.FormData
import typings.tabris.ResponseInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tabris", "Response")
@js.native
class Response ()
  extends typings.tabris.Response {
  def this(body: String) = this()
  def this(body: Blob) = this()
  def this(body: FormData) = this()
  def this(body: String, init: ResponseInit) = this()
  def this(body: Blob, init: ResponseInit) = this()
  def this(body: FormData, init: ResponseInit) = this()
}

@JSImport("tabris", "Response")
@js.native
object Response
  extends Instantiable0[typings.tabris.Response]
     with Instantiable1[
      (/* body */ Blob) | (/* body */ FormData) | (/* body */ String), 
      typings.tabris.Response
    ]
     with Instantiable2[
      (/* body */ Blob) | (/* body */ FormData) | (/* body */ String), 
      /* init */ ResponseInit, 
      typings.tabris.Response
    ] {
  def error(): typings.tabris.Response = js.native
  def redirect(url: String, status: Double): typings.tabris.Response = js.native
}

