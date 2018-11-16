package typings
package vueDashServerDashRendererLib.vueDashServerDashRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderCache extends js.Object {
  var has: js.UndefOr[
    js.Function2[
      /* key */ java.lang.String, 
      /* cb */ js.UndefOr[js.Function1[/* hit */ scala.Boolean, scala.Unit]], 
      scala.Boolean | scala.Unit
    ]
  ] = js.native
  def get(key: java.lang.String): java.lang.String | scala.Unit = js.native
  def get(key: java.lang.String, cb: js.Function1[/* res */ java.lang.String, scala.Unit]): java.lang.String | scala.Unit = js.native
  def set(key: java.lang.String, `val`: java.lang.String): scala.Unit = js.native
}

