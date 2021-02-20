package typings.webgme.global

import typings.webgme.Core.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Gme {
  
  /**
    * https://github.com/webgme/webgme/wiki/GME-Client-API
    * 
    * https://github.com/webgme/webgme/blob/master/src/client/js/client.js
    */
  @JSGlobal("Gme.Client")
  @js.native
  class Client ()
    extends typings.webgme.Gme.Client
  
  object Concepts {
    
    @JSGlobal("Gme.Concepts.isConnection")
    @js.native
    def isConnection(node: Node): Boolean = js.native
  }
}
