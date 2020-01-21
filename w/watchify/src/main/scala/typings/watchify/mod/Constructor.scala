package typings.watchify.mod

import typings.browserify.mod.BrowserifyObject
import typings.watchify.AnonCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Constructor extends js.Object {
  var args: AnonCache = js.native
  def apply(b: BrowserifyObject): BrowserifyObject = js.native
  def apply(b: BrowserifyObject, opts: Options): BrowserifyObject = js.native
  def apply[T /* <: BrowserifyObject */](b: T): T = js.native
  def apply[T /* <: BrowserifyObject */](b: T, opts: Options): T = js.native
}

