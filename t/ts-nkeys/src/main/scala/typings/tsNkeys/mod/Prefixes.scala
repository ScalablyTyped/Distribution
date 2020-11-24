package typings.tsNkeys.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ts-nkeys", "Prefixes")
@js.native
class Prefixes () extends js.Object
/* static members */
@JSImport("ts-nkeys", "Prefixes")
@js.native
object Prefixes extends js.Object {
  
  def isValidPrefix(prefix: Prefix): Boolean = js.native
  
  def isValidPublicPrefix(prefix: Prefix): Boolean = js.native
  
  def parsePrefix(v: Double): Prefix = js.native
  
  def startsWithValidPrefix(s: String): Boolean = js.native
}
