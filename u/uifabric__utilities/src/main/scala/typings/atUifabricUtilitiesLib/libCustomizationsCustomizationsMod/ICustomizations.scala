package typings
package atUifabricUtilitiesLib.libCustomizationsCustomizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICustomizations extends js.Object {
  var inCustomizerContext: js.UndefOr[scala.Boolean] = js.undefined
  var scopedSettings: org.scalablytyped.runtime.StringDictionary[ISettings]
  var settings: ISettings
}

object ICustomizations {
  @scala.inline
  def apply(
    scopedSettings: org.scalablytyped.runtime.StringDictionary[ISettings],
    settings: ISettings,
    inCustomizerContext: js.UndefOr[scala.Boolean] = js.undefined
  ): ICustomizations = {
    val __obj = js.Dynamic.literal(scopedSettings = scopedSettings, settings = settings)
    if (!js.isUndefined(inCustomizerContext)) __obj.updateDynamic("inCustomizerContext")(inCustomizerContext)
    __obj.asInstanceOf[ICustomizations]
  }
}

