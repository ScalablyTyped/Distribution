package typings.synaptic.synapticMod.Global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.synaptic.synapticMod.NetworkNs.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Network")
@js.native
/**
  * Networks are basically an array of layers. They have an input layer, a number of hidden layers, and an output layer.
  */
class Network ()
  extends typings.synaptic.synapticMod.Network {
  def this(options: Options) = this()
}

@JSGlobal("Network")
@js.native
object Network
  extends Instantiable0[typings.synaptic.synapticMod.Network]
     with Instantiable1[/* options */ Options, typings.synaptic.synapticMod.Network] {
  /**
    * Rebuild a network that has been stored in a json using the method toJSON().
    */
  def fromJSON(exported: js.Any): typings.synaptic.synapticMod.Network = js.native
  /**
    * Creates a static String to store the source code of the functions that are identical for all the workers (train, _trainSet, test).
    * @returns Source code that can train a network inside a worker.
    */
  def getWorkerSharedFunctions(): String = js.native
}

