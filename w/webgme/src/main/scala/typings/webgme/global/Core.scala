package typings.webgme.global

import typings.std.Storage
import typings.webgme.Global_.GmeLogger
import typings.webgme.GmeCommon.ResultCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class defines the public API of the WebGME-Core
  * https://editor.dev.webgme.org/docs/source/module-Core.html
  */
@JSGlobal("Core")
@js.native
object Core extends js.Object {
  @js.native
  class Node ()
    extends typings.webgme.Core.Node {
    def this(id: String, logger: GmeLogger, state: js.Any, storeNode: ResultCallback[Storage]) = this()
  }
  
}

