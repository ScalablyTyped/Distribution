package typings.winrtUwp.global.Windows.Networking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for a hostname or an IP address. */
@JSGlobal("Windows.Networking.HostName")
@js.native
class HostName protected ()
  extends typings.winrtUwp.Windows.Networking.HostName {
  /**
    * Creates a new HostName object from a string that contains a hostname or an IP address.
    * @param hostName A string that contains a hostname or an IP address.
    */
  def this(hostName: String) = this()
}
object HostName {
  
  /**
    * Compares two strings to determine if they represent the same hostname.
    * @param value1 A hostname or IP address.
    * @param value2 A hostname or IP address.
    * @return The return value indicates the lexicographic relation of value1 to value2. If the two parameters represent the same canonical hostname, then zero is returned. If value1 is less than value2, the return value is less than zero. If value1 is greater than value2, the return vale is greater than zero.
    */
  /* static member */
  @JSGlobal("Windows.Networking.HostName.compare")
  @js.native
  def compare(value1: String, value2: String): Double = js.native
}
