package typings.synaptic.synapticMod.Layer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a connection from one layer to another, and keeps track of its weight and gain.
  */
@JSImport("synaptic", "Layer.LayerConnection")
@js.native
class LayerConnection () extends js.Object {
  var ID: Double = js.native
  var connections: js.Any = js.native
  var from: js.Any = js.native
  var gatedfrom: js.Any = js.native
  var list: js.Any = js.native
  var selfconnection: js.Any = js.native
  var size: js.Any = js.native
  var to: js.Any = js.native
  var `type`: js.Any = js.native
}

/* static members */
@JSImport("synaptic", "Layer.LayerConnection")
@js.native
object LayerConnection extends js.Object {
  def uid(): Double = js.native
}

