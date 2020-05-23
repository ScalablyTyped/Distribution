package typings.ts3NodejsLibrary.propertyTypesMod

import typings.ts3NodejsLibrary.ts3NodejsLibraryStrings.Asterisk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiKeyList extends js.Object {
  /** database ids to list  */
  var cldbid: js.UndefOr[Double | Asterisk] = js.undefined
  /** amount of entries to retrieve */
  var duration: js.UndefOr[Double] = js.undefined
  /** offset from where the list should start */
  var start: js.UndefOr[Double] = js.undefined
}

object ApiKeyList {
  @scala.inline
  def apply(
    cldbid: Double | Asterisk = null,
    duration: js.UndefOr[Double] = js.undefined,
    start: js.UndefOr[Double] = js.undefined
  ): ApiKeyList = {
    val __obj = js.Dynamic.literal()
    if (cldbid != null) __obj.updateDynamic("cldbid")(cldbid.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiKeyList]
  }
}

