package typings.atUifabricUtilities.libCustomizationsCustomizationsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomizations extends js.Object {
  var inCustomizerContext: js.UndefOr[Boolean] = js.undefined
  var scopedSettings: StringDictionary[ISettings]
  var settings: ISettings
}

object ICustomizations {
  @scala.inline
  def apply(
    scopedSettings: StringDictionary[ISettings],
    settings: ISettings,
    inCustomizerContext: js.UndefOr[Boolean] = js.undefined
  ): ICustomizations = {
    val __obj = js.Dynamic.literal(scopedSettings = scopedSettings.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    if (!js.isUndefined(inCustomizerContext)) __obj.updateDynamic("inCustomizerContext")(inCustomizerContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomizations]
  }
}

