package typings.synaptic.mod.Neuron

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("synaptic", "Neuron.connection")
@js.native
class connection protected () extends Connection_ {
  def this(from: Double, to: Double) = this()
  def this(from: Double, to: Double, weight: Double) = this()
}
@JSImport("synaptic", "Neuron.connection")
@js.native
object connection
  extends Instantiable2[/* from */ Double, /* to */ Double, Connection_]
     with Instantiable3[/* from */ Double, /* to */ Double, /* weight */ Double, Connection_] {
  
  def uid(): Double = js.native
}
