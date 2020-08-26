package typings.tslint.configurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConfigurationLoadResult extends js.Object {
  var path: js.UndefOr[String] = js.native
  var results: js.UndefOr[IConfigurationFile] = js.native
}

object IConfigurationLoadResult {
  @scala.inline
  def apply(): IConfigurationLoadResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConfigurationLoadResult]
  }
  @scala.inline
  implicit class IConfigurationLoadResultOps[Self <: IConfigurationLoadResult] (val x: Self) extends AnyVal {
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setResults(value: IConfigurationFile): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
  }
  
}

