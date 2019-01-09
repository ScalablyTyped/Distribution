package typings
package synapticLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Exported
  extends org.scalablytyped.runtime.Instantiable0[synapticLib.synapticMod.Network]
     with org.scalablytyped.runtime.Instantiable1[
      /* options */ synapticLib.synapticMod.NetworkNs.Options, 
      synapticLib.synapticMod.Network
    ] {
  /**
    * Rebuild a network that has been stored in a json using the method toJSON().
    */
  def fromJSON(exported: js.Any): synapticLib.synapticMod.Network = js.native
  /**
    * Creates a static String to store the source code of the functions that are identical for all the workers (train, _trainSet, test).
    * @returns Source code that can train a network inside a worker.
    */
  def getWorkerSharedFunctions(): java.lang.String = js.native
}

