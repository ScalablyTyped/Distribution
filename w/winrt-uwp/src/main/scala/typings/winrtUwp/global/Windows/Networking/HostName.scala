package typings.winrtUwp.global.Windows.Networking

import typings.winrtUwp.Windows.Networking.Connectivity.IPInformation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for a hostname or an IP address. */
@JSGlobal("Windows.Networking.HostName")
@js.native
class HostName protected ()
  extends StObject
     with typings.winrtUwp.Windows.Networking.HostName {
  /**
    * Creates a new HostName object from a string that contains a hostname or an IP address.
    * @param hostName A string that contains a hostname or an IP address.
    */
  def this(hostName: String) = this()
  
  /** Gets the canonical name for the HostName object. */
  /* CompleteClass */
  var canonicalName: String = js.native
  
  /** Gets the display name for the HostName object. */
  /* CompleteClass */
  var displayName: String = js.native
  
  /** Gets the IPInformation object for a local IP address assigned to a HostName object. */
  /* CompleteClass */
  var ipInformation: IPInformation = js.native
  
  /**
    * Determines whether the specified HostName object has an equivalent value to the current HostName object.
    * @param hostName A HostName object that is compared with the current HostName.
    * @return A Boolean value that indicates whether the specified HostName object is equal to the current HostName object.
    */
  /* CompleteClass */
  override def isEqual(hostName: typings.winrtUwp.Windows.Networking.HostName): Boolean = js.native
  
  /** Gets the original string used to construct the HostName object. */
  /* CompleteClass */
  var rawName: String = js.native
  
  /** Gets the HostNameType of the HostName object. */
  /* CompleteClass */
  var `type`: typings.winrtUwp.Windows.Networking.HostNameType = js.native
}
object HostName {
  
  @JSGlobal("Windows.Networking.HostName")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Compares two strings to determine if they represent the same hostname.
    * @param value1 A hostname or IP address.
    * @param value2 A hostname or IP address.
    * @return The return value indicates the lexicographic relation of value1 to value2. If the two parameters represent the same canonical hostname, then zero is returned. If value1 is less than value2, the return value is less than zero. If value1 is greater than value2, the return vale is greater than zero.
    */
  /* static member */
  inline def compare(value1: String, value2: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[Double]
}
