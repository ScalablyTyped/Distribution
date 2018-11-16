package typings
package xhrLib.xhrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XhrInstance extends js.Object {
  def apply(options: XhrUriConfig, callback: XhrCallback): js.Any = js.native
  def apply(options: XhrUrlConfig, callback: XhrCallback): js.Any = js.native
  def apply(url: java.lang.String, callback: XhrCallback): js.Any = js.native
  def apply(url: java.lang.String, options: XhrBaseConfig, callback: XhrCallback): js.Any = js.native
}

