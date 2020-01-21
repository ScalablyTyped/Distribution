package typings.vegaTypings

import typings.vegaTypings.scaleMod.DataRef
import typings.vegaTypings.scaleMod.MultiDataRef
import typings.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFields extends MultiDataRef {
  var fields: js.Array[(js.Array[String | Double | Boolean]) | DataRef | SignalRef]
}

object AnonFields {
  @scala.inline
  def apply(fields: js.Array[(js.Array[String | Double | Boolean]) | DataRef | SignalRef]): AnonFields = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFields]
  }
}

