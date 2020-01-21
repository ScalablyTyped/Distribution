package typings.vueServerRenderer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderCache extends js.Object {
  var has: js.UndefOr[
    js.Function2[
      /* key */ String, 
      /* cb */ js.UndefOr[js.Function1[/* hit */ Boolean, Unit]], 
      Boolean | Unit
    ]
  ] = js.native
  def get(key: String): String | Unit = js.native
  def get(key: String, cb: js.Function1[/* res */ String, Unit]): String | Unit = js.native
  def set(key: String, `val`: String): Unit = js.native
}

