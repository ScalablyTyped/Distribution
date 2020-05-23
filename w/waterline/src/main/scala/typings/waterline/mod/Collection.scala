package typings.waterline.mod

import typings.waterline.waterlineStrings.alter
import typings.waterline.waterlineStrings.drop
import typings.waterline.waterlineStrings.safe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined waterline.waterline.CollectionDefinition */
trait Collection extends js.Object {
  var afterCreate: js.UndefOr[
    (js.Array[js.Function2[/* newlyCreatedRecord */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* newlyCreatedRecord */ js.Any, /* next */ js.Function, Unit])
  ] = js.undefined
  var afterDestroy: js.UndefOr[
    (js.Array[js.Function2[/* destroyedInstance */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* destroyedInstance */ js.Any, /* next */ js.Function, Unit])
  ] = js.undefined
  var afterUpdate: js.UndefOr[
    (js.Array[js.Function2[/* valuesToUpdate */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* valuesToUpdate */ js.Any, /* next */ js.Function, Unit])
  ] = js.undefined
  var attributes: js.UndefOr[Attributes] = js.undefined
  var autoCreatedAt: js.UndefOr[Boolean] = js.undefined
  var autoPK: js.UndefOr[Boolean] = js.undefined
  var autoUpdatedAt: js.UndefOr[Boolean] = js.undefined
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
  var connection: js.UndefOr[String] = js.undefined
  var identity: js.UndefOr[String] = js.undefined
  var migrate: js.UndefOr[alter | drop | safe] = js.undefined
  var schema: js.UndefOr[Boolean] = js.undefined
  var tableName: js.UndefOr[String] = js.undefined
  var types: js.UndefOr[js.Any] = js.undefined
}

object Collection {
  @scala.inline
  def apply(
    afterCreate: (js.Array[js.Function2[/* newlyCreatedRecord */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* newlyCreatedRecord */ js.Any, /* next */ js.Function, Unit]) = null,
    afterDestroy: (js.Array[js.Function2[/* destroyedInstance */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* destroyedInstance */ js.Any, /* next */ js.Function, Unit]) = null,
    afterUpdate: (js.Array[js.Function2[/* valuesToUpdate */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* valuesToUpdate */ js.Any, /* next */ js.Function, Unit]) = null,
    attributes: Attributes = null,
    autoCreatedAt: js.UndefOr[Boolean] = js.undefined,
    autoPK: js.UndefOr[Boolean] = js.undefined,
    autoUpdatedAt: js.UndefOr[Boolean] = js.undefined,
    beforeCreate: (js.Array[js.Function2[/* values */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* vaues */ js.Any, /* next */ js.Function, Unit]) = null,
    beforeDestroy: (js.Array[js.Function2[/* criteria */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* valuesToUpdate */ js.Any, /* next */ js.Function, Unit]) = null,
    beforeUpdate: (js.Array[js.Function2[/* valuesToUpdate */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* valuesToUpdate */ js.Any, /* next */ js.Function, Unit]) = null,
    beforeValidate: (js.Array[js.Function2[/* vaues */ _, /* next */ js.Function, Unit]]) | (js.Function2[/* vaues */ js.Any, /* next */ js.Function, Unit]) = null,
    connection: String = null,
    identity: String = null,
    migrate: alter | drop | safe = null,
    schema: js.UndefOr[Boolean] = js.undefined,
    tableName: String = null,
    types: js.Any = null
  ): Collection = {
    val __obj = js.Dynamic.literal()
    if (afterCreate != null) __obj.updateDynamic("afterCreate")(afterCreate.asInstanceOf[js.Any])
    if (afterDestroy != null) __obj.updateDynamic("afterDestroy")(afterDestroy.asInstanceOf[js.Any])
    if (afterUpdate != null) __obj.updateDynamic("afterUpdate")(afterUpdate.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCreatedAt)) __obj.updateDynamic("autoCreatedAt")(autoCreatedAt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPK)) __obj.updateDynamic("autoPK")(autoPK.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoUpdatedAt)) __obj.updateDynamic("autoUpdatedAt")(autoUpdatedAt.get.asInstanceOf[js.Any])
    if (beforeCreate != null) __obj.updateDynamic("beforeCreate")(beforeCreate.asInstanceOf[js.Any])
    if (beforeDestroy != null) __obj.updateDynamic("beforeDestroy")(beforeDestroy.asInstanceOf[js.Any])
    if (beforeUpdate != null) __obj.updateDynamic("beforeUpdate")(beforeUpdate.asInstanceOf[js.Any])
    if (beforeValidate != null) __obj.updateDynamic("beforeValidate")(beforeValidate.asInstanceOf[js.Any])
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    if (identity != null) __obj.updateDynamic("identity")(identity.asInstanceOf[js.Any])
    if (migrate != null) __obj.updateDynamic("migrate")(migrate.asInstanceOf[js.Any])
    if (!js.isUndefined(schema)) __obj.updateDynamic("schema")(schema.get.asInstanceOf[js.Any])
    if (tableName != null) __obj.updateDynamic("tableName")(tableName.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collection]
  }
}

