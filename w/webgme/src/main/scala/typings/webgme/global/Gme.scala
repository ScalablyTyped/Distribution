package typings.webgme.global

import typings.webgme.Core.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Gme")
@js.native
object Gme extends js.Object {
  /**
    * https://github.com/webgme/webgme/wiki/GME-Client-API
    * 
    * https://github.com/webgme/webgme/blob/master/src/client/js/client.js
    */
  @js.native
  class Client ()
    extends typings.webgme.Gme.Client
  
  @js.native
  object Concepts extends js.Object {
    def isConnection(node: Node): Boolean = js.native
  }
  
}

