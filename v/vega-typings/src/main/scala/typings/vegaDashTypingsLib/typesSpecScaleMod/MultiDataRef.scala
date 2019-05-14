package typings
package vegaDashTypingsLib.typesSpecScaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiDataRef extends js.Object {
  var data: js.UndefOr[java.lang.String] = js.undefined
  var fields: js.UndefOr[
    js.Array[
      (js.Array[java.lang.String | scala.Double | scala.Boolean]) | DataRef | ScaleField | vegaDashTypingsLib.typesSpecSignalMod.SignalRef
    ]
  ] = js.undefined
}

object MultiDataRef {
  @scala.inline
  def apply(data: java.lang.String = null, fields: js.Array[ScaleField] = null): MultiDataRef = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    __obj.asInstanceOf[MultiDataRef]
  }
}

