package typings.typedRestClient.interfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.typedRestClient.AnonArrayFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRequestQueryParams extends js.Object {
  var options: js.UndefOr[AnonArrayFormat] = js.undefined
  var params: StringDictionary[String | Double | (js.Array[String | Double])]
}

object IRequestQueryParams {
  @scala.inline
  def apply(
    params: StringDictionary[String | Double | (js.Array[String | Double])],
    options: AnonArrayFormat = null
  ): IRequestQueryParams = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRequestQueryParams]
  }
}

