package typings.videoJs.mod.videojs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Xhr extends js.Object {
  
  def apply(url: String, callback: XhrCallback): js.Any = js.native
  def apply(url: String, options: XhrOptions, callback: XhrCallback): js.Any = js.native
  def apply(url: XhrOptions, callback: XhrCallback): js.Any = js.native
}
