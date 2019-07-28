package typings.watchify.watchifyMod

import typings.browserify.browserifyMod.BrowserifyObject
import typings.watchify.Anon_Cache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Constructor extends js.Object {
  var args: Anon_Cache = js.native
  def apply(b: BrowserifyObject): BrowserifyObject = js.native
  def apply(b: BrowserifyObject, opts: Options): BrowserifyObject = js.native
  def apply[T /* <: BrowserifyObject */](b: T): T = js.native
  def apply[T /* <: BrowserifyObject */](b: T, opts: Options): T = js.native
}

