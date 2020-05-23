package typings.vizJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Viz extends js.Object {
  def renderString(src: String): js.Promise[String] = js.native
  def renderString(src: String, options: Options): js.Promise[String] = js.native
}

