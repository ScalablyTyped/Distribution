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

