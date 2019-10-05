package typings.winjs.WinJS.Utilities

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion Properties
//#region Interfaces
trait ILogOptions extends js.Object {
  var action: js.UndefOr[js.Function3[/* message */ String, /* tags */ String, /* type */ String, Unit]] = js.undefined
  var excludeTags: js.UndefOr[String] = js.undefined
  var tags: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object ILogOptions {
  @scala.inline
  def apply(
    action: (/* message */ String, /* tags */ String, /* type */ String) => Unit = null,
    excludeTags: String = null,
    tags: String = null,
    `type`: String = null
  ): ILogOptions = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(js.Any.fromFunction3(action))
    if (excludeTags != null) __obj.updateDynamic("excludeTags")(excludeTags)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ILogOptions]
  }
}

