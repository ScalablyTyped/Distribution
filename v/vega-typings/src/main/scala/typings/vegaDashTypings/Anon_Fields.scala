package typings.vegaDashTypings

import typings.vegaDashTypings.typesSpecScaleMod.DataRef
import typings.vegaDashTypings.typesSpecScaleMod.MultiDataRef
import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fields extends MultiDataRef {
  var fields: js.Array[(js.Array[String | Double | Boolean]) | DataRef | SignalRef]
}

object Anon_Fields {
  @scala.inline
  def apply(fields: js.Array[(js.Array[String | Double | Boolean]) | DataRef | SignalRef]): Anon_Fields = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Fields]
  }
}

