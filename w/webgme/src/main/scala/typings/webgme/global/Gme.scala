package typings.webgme.global

import typings.webgme.Core.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    extends StObject
       with typings.webgme.Gme.Client
  
  object Concepts {
    
    @JSGlobal("Gme.Concepts")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def isConnection(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConnection")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
