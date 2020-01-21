package typings.synaptic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Neuron {
  type SquashingFunction = js.Function2[/* x */ scala.Double, /* derivate */ scala.Boolean, scala.Double]
}
