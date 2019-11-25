package typings.vscodeDashLanguageclient

import typings.vscodeDashLanguageclient.vscodeDashLanguageclientMod.Executable
import typings.vscodeDashLanguageclient.vscodeDashLanguageclientMod._ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Debug extends _ServerOptions {
  var debug: Executable
  var run: Executable
}

object Anon_Debug {
  @scala.inline
  def apply(debug: Executable, run: Executable): Anon_Debug = {
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], run = run.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Debug]
  }
}

