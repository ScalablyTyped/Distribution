package typings.waterline

import typings.waterline.waterlineMod.Attributes
import typings.waterline.waterlineStrings.alter
import typings.waterline.waterlineStrings.drop
import typings.waterline.waterlineStrings.safe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alter extends js.Object {
  var attributes: js.UndefOr[Attributes] = js.undefined
  var autoCreatedAt: js.UndefOr[Boolean] = js.undefined
  var autoPK: js.UndefOr[Boolean] = js.undefined
  var autoUpdatedAt: js.UndefOr[Boolean] = js.undefined
  var connection: js.UndefOr[String] = js.undefined
  var identity: js.UndefOr[String] = js.undefined
  var migrate: js.UndefOr[alter | drop | safe] = js.undefined
  var schema: js.UndefOr[Boolean] = js.undefined
  var tableName: js.UndefOr[String] = js.undefined
  var types: js.UndefOr[js.Any] = js.undefined
}

object Anon_Alter {
  @scala.inline
  def apply(
    attributes: Attributes = null,
    autoCreatedAt: js.UndefOr[Boolean] = js.undefined,
    autoPK: js.UndefOr[Boolean] = js.undefined,
    autoUpdatedAt: js.UndefOr[Boolean] = js.undefined,
    connection: String = null,
    identity: String = null,
    migrate: alter | drop | safe = null,
    schema: js.UndefOr[Boolean] = js.undefined,
    tableName: String = null,
    types: js.Any = null
  ): Anon_Alter = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCreatedAt)) __obj.updateDynamic("autoCreatedAt")(autoCreatedAt.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPK)) __obj.updateDynamic("autoPK")(autoPK.asInstanceOf[js.Any])
    if (!js.isUndefined(autoUpdatedAt)) __obj.updateDynamic("autoUpdatedAt")(autoUpdatedAt.asInstanceOf[js.Any])
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    if (identity != null) __obj.updateDynamic("identity")(identity.asInstanceOf[js.Any])
    if (migrate != null) __obj.updateDynamic("migrate")(migrate.asInstanceOf[js.Any])
    if (!js.isUndefined(schema)) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (tableName != null) __obj.updateDynamic("tableName")(tableName.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Alter]
  }
}

