package typings.vegaDashTypings.typesSpecScaleMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiDataRef extends js.Object {
  var data: js.UndefOr[String] = js.undefined
  var fields: js.UndefOr[
    js.Array[(js.Array[String | Double | Boolean]) | DataRef | ScaleField | SignalRef]
  ] = js.undefined
}

object MultiDataRef {
  @scala.inline
  def apply(data: String = null, fields: js.Array[ScaleField] = null): MultiDataRef = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    __obj.asInstanceOf[MultiDataRef]
  }
}

