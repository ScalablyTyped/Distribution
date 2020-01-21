package typings.waterline.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecycleCallbacks extends js.Object {
  var afterCreate: js.UndefOr[
    (js.Array[js.Function2[/* newlyCreatedRecord */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* newlyCreatedRecord */ js.Any, /* next */ js.Function, Unit])
  ] = js.undefined
  var afterDestroy: js.UndefOr[
    (js.Array[js.Function2[/* destroyedInstance */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* destroyedInstance */ js.Any, /* next */ js.Function, Unit])
  ] = js.undefined
  var afterUpdate: js.UndefOr[
    (js.Array[js.Function2[/* valuesToUpdate */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* valuesToUpdate */ js.Any, /* next */ js.Function, Unit])
  ] = js.undefined
  var beforeCreate: js.UndefOr[
    (js.Array[js.Function2[/* values */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* vaues */ js.Any, /* next */ js.Function, Unit])
  ] = js.undefined
  var beforeDestroy: js.UndefOr[
    (js.Array[js.Function2[/* criteria */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* valuesToUpdate */ js.Any, /* next */ js.Function, Unit])
  ] = js.undefined
  var beforeUpdate: js.UndefOr[
    (js.Array[js.Function2[/* valuesToUpdate */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* valuesToUpdate */ js.Any, /* next */ js.Function, Unit])
  ] = js.undefined
  var beforeValidate: js.UndefOr[
    (js.Array[js.Function2[/* vaues */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* vaues */ js.Any, /* next */ js.Function, Unit])
  ] = js.undefined
}

object LifecycleCallbacks {
  @scala.inline
  def apply(
    afterCreate: (js.Array[js.Function2[/* newlyCreatedRecord */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* newlyCreatedRecord */ js.Any, /* next */ js.Function, Unit]) = null,
    afterDestroy: (js.Array[js.Function2[/* destroyedInstance */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* destroyedInstance */ js.Any, /* next */ js.Function, Unit]) = null,
    afterUpdate: (js.Array[js.Function2[/* valuesToUpdate */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* valuesToUpdate */ js.Any, /* next */ js.Function, Unit]) = null,
    beforeCreate: (js.Array[js.Function2[/* values */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* vaues */ js.Any, /* next */ js.Function, Unit]) = null,
    beforeDestroy: (js.Array[js.Function2[/* criteria */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* valuesToUpdate */ js.Any, /* next */ js.Function, Unit]) = null,
    beforeUpdate: (js.Array[js.Function2[/* valuesToUpdate */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* valuesToUpdate */ js.Any, /* next */ js.Function, Unit]) = null,
    beforeValidate: (js.Array[js.Function2[/* vaues */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* vaues */ js.Any, /* next */ js.Function, Unit]) = null
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

