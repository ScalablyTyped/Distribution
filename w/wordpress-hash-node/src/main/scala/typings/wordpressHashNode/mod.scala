package typings.wordpressHashNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wordpress-hash-node", "CheckPassword")
  @js.native
  def CheckPassword(password: String, hash: String): Boolean = js.native
  
  @JSImport("wordpress-hash-node", "HashPassword")
  @js.native
  def HashPassword(password: String): String = js.native
}
