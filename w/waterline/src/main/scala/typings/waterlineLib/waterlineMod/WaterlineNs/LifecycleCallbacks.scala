package typings
package waterlineLib.waterlineMod.WaterlineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecycleCallbacks extends js.Object {
  var afterCreate: js.UndefOr[
    js.Array[waterlineLib.Anon_NewlyCreatedRecord] | waterlineLib.Anon_NewlyCreatedRecord
  ] = js.undefined
  var afterDestroy: js.UndefOr[
    js.Array[waterlineLib.Anon_DestroyedInstance] | waterlineLib.Anon_DestroyedInstance
  ] = js.undefined
  var afterUpdate: js.UndefOr[js.Array[waterlineLib.Anon_Next] | waterlineLib.Anon_Next] = js.undefined
  var beforeCreate: js.UndefOr[js.Array[waterlineLib.Anon_Next] | waterlineLib.Anon_Next] = js.undefined
  var beforeDestroy: js.UndefOr[js.Array[waterlineLib.Anon_Criteria] | waterlineLib.Anon_Next] = js.undefined
  var beforeUpdate: js.UndefOr[js.Array[waterlineLib.Anon_Next] | waterlineLib.Anon_Next] = js.undefined
  var beforeValidate: js.UndefOr[js.Array[waterlineLib.Anon_Next] | waterlineLib.Anon_Next] = js.undefined
}

object LifecycleCallbacks {
  @scala.inline
  def apply(
    afterCreate: js.Array[waterlineLib.Anon_NewlyCreatedRecord] | waterlineLib.Anon_NewlyCreatedRecord = null,
    afterDestroy: js.Array[waterlineLib.Anon_DestroyedInstance] | waterlineLib.Anon_DestroyedInstance = null,
    afterUpdate: js.Array[waterlineLib.Anon_Next] | waterlineLib.Anon_Next = null,
    beforeCreate: js.Array[waterlineLib.Anon_Next] | waterlineLib.Anon_Next = null,
    beforeDestroy: js.Array[waterlineLib.Anon_Criteria] | waterlineLib.Anon_Next = null,
    beforeUpdate: js.Array[waterlineLib.Anon_Next] | waterlineLib.Anon_Next = null,
    beforeValidate: js.Array[waterlineLib.Anon_Next] | waterlineLib.Anon_Next = null
  ): LifecycleCallbacks = {
    val __obj = js.Dynamic.literal()
    if (afterCreate != null) __obj.updateDynamic("afterCreate")(afterCreate.asInstanceOf[js.Any])
    if (afterDestroy != null) __obj.updateDynamic("afterDestroy")(afterDestroy.asInstanceOf[js.Any])
    if (afterUpdate != null) __obj.updateDynamic("afterUpdate")(afterUpdate.asInstanceOf[js.Any])
    if (beforeCreate != null) __obj.updateDynamic("beforeCreate")(beforeCreate.asInstanceOf[js.Any])
    if (beforeDestroy != null) __obj.updateDynamic("beforeDestroy")(beforeDestroy.asInstanceOf[js.Any])
    if (beforeUpdate != null) __obj.updateDynamic("beforeUpdate")(beforeUpdate.asInstanceOf[js.Any])
    if (beforeValidate != null) __obj.updateDynamic("beforeValidate")(beforeValidate.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleCallbacks]
  }
}

