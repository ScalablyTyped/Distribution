package typings.vscodeDashLanguageclient

import typings.vscodeDashLanguageclient.vscodeDashLanguageclientMod.NodeModule
import typings.vscodeDashLanguageclient.vscodeDashLanguageclientMod._ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DebugRun extends _ServerOptions {
  var debug: NodeModule
  var run: NodeModule
}

object Anon_DebugRun {
  @scala.inline
  def apply(debug: NodeModule, run: NodeModule): Anon_DebugRun = {
    val __obj = js.Dynamic.literal(debug = debug, run = run)
  
    __obj.asInstanceOf[Anon_DebugRun]
  }
}

