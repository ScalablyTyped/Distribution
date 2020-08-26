package typings.typedRestClient.interfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.typedRestClient.anon.ArrayFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRequestQueryParams extends js.Object {
  var options: js.UndefOr[ArrayFormat] = js.native
  var params: StringDictionary[String | Double | (js.Array[String | Double])] = js.native
}

object IRequestQueryParams {
  @scala.inline
  def apply(params: StringDictionary[String | Double | (js.Array[String | Double])]): IRequestQueryParams = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRequestQueryParams]
  }
  @scala.inline
  implicit class IRequestQueryParamsOps[Self <: IRequestQueryParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setParams(value: StringDictionary[String | Double | (js.Array[String | Double])]): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: ArrayFormat): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}

