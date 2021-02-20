package typings.webgme.global

import typings.std.Storage
import typings.webgme.Global_.GmeLogger
import typings.webgme.GmeCommon.ResultCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class defines the public API of the WebGME-Core
  * https://editor.dev.webgme.org/docs/source/module-Core.html
  */
object Core {
  
  @JSGlobal("Core.Node")
  @js.native
  class Node ()
    extends typings.webgme.Core.Node {
    def this(id: String, logger: GmeLogger, state: js.Any, storeNode: ResultCallback[Storage]) = this()
  }
}
