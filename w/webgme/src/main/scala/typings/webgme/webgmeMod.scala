package typings.webgme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Based on examination of
// Example: https://github.com/typed-typings/env-node/blob/master/0.12/node.d.ts
// Source: https://raw.githubusercontent.com/phreed/typed-npm-webgme/master/webgme.d.ts
// Documentation: https://editor.webgme.org/docs/source/index.html
// https://github.com/webgme/webgme/tree/master/config
@JSImport("webgme", JSImport.Namespace)
@js.native
object webgmeMod extends js.Object {
  @js.native
  class Standalone protected () extends js.Object {
    def this(config: js.Any) = this()
    def start(fn: js.Any): Unit = js.native
    def stop(): Unit = js.native
  }
  
  def addToRequireJsPaths(config: js.Any): Unit = js.native
  def standaloneServer(config: js.Any): Unit = js.native
}

