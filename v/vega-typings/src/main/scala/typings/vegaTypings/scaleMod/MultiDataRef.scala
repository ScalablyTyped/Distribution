package typings.vegaTypings.scaleMod

import typings.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.AnonDataFields
  - typings.vegaTypings.AnonFields
*/
trait MultiDataRef extends js.Object

object MultiDataRef {
  @scala.inline
  def AnonDataFields(data: String, fields: js.Array[ScaleField]): MultiDataRef = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MultiDataRef]
  }
  @scala.inline
  def AnonFields(fields: js.Array[(js.Array[String | Double | Boolean]) | DataRef | SignalRef]): MultiDataRef = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MultiDataRef]
  }
}

