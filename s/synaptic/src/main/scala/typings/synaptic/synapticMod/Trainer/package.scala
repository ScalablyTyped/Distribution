package typings.synaptic.synapticMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Trainer {
  type CostFunction = js.Function2[/* targetValues */ js.Array[Double], /* outputValues */ js.Array[Double], Double]
  type TrainingSet = js.Array[TrainingPair]
}
