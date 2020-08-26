package typings.tsconfigPaths.tsconfigLoaderMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TsConfigLoaderResult extends js.Object {
  var baseUrl: js.UndefOr[String] = js.native
  var paths: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
  var tsConfigPath: js.UndefOr[String] = js.native
}

object TsConfigLoaderResult {
  @scala.inline
  def apply(): TsConfigLoaderResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TsConfigLoaderResult]
  }
  @scala.inline
  implicit class TsConfigLoaderResultOps[Self <: TsConfigLoaderResult] (val x: Self) extends AnyVal {
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
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseUrl: Self = this.set("baseUrl", js.undefined)
    @scala.inline
    def setPaths(value: StringDictionary[js.Array[String]]): Self = this.set("paths", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaths: Self = this.set("paths", js.undefined)
    @scala.inline
    def setTsConfigPath(value: String): Self = this.set("tsConfigPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTsConfigPath: Self = this.set("tsConfigPath", js.undefined)
  }
  
}

