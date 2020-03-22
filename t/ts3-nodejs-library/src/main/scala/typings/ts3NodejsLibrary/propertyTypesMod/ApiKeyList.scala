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
  def apply(cldbid: Double | Asterisk = null, duration: Int | Double = null, start: Int | Double = null): ApiKeyList = {
    val __obj = js.Dynamic.literal()
    if (cldbid != null) __obj.updateDynamic("cldbid")(cldbid.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiKeyList]
  }
}

