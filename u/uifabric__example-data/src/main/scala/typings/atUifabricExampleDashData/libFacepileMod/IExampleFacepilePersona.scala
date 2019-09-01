package typings.atUifabricExampleDashData.libFacepileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExampleFacepilePersona extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var imageInitials: js.UndefOr[String] = js.undefined
  var imageUrl: js.UndefOr[String] = js.undefined
  var initialsColor: js.UndefOr[Double] = js.undefined
  var onClick: js.UndefOr[
    js.Function2[/* ev */ js.Any, /* persona */ js.UndefOr[IExampleFacepilePersona], Unit]
  ] = js.undefined
  var personaName: js.UndefOr[String] = js.undefined
}

object IExampleFacepilePersona {
  @scala.inline
  def apply(
    data: js.Any = null,
    imageInitials: String = null,
    imageUrl: String = null,
    initialsColor: Int | Double = null,
    onClick: (/* ev */ js.Any, /* persona */ js.UndefOr[IExampleFacepilePersona]) => Unit = null,
    personaName: String = null
  ): IExampleFacepilePersona = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (imageInitials != null) __obj.updateDynamic("imageInitials")(imageInitials)
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (initialsColor != null) __obj.updateDynamic("initialsColor")(initialsColor.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (personaName != null) __obj.updateDynamic("personaName")(personaName)
    __obj.asInstanceOf[IExampleFacepilePersona]
  }
}

