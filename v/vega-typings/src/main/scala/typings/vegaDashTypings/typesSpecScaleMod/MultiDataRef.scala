package typings.vegaDashTypings.typesSpecScaleMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.vegaDashTypings.Anon_DataFields
  - typings.vegaDashTypings.Anon_Fields
*/
trait MultiDataRef extends js.Object

object MultiDataRef {
  @scala.inline
  def Anon_DataFields(data: String, fields: js.Array[ScaleField]): MultiDataRef = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MultiDataRef]
  }
  @scala.inline
  def Anon_Fields(fields: js.Array[(js.Array[String | Double | Boolean]) | DataRef | SignalRef]): MultiDataRef = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MultiDataRef]
  }
}

