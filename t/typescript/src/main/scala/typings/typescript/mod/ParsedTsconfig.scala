package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParsedTsconfig extends js.Object {
  /**
    * Note that the case of the config path has not yet been normalized, as no files have been imported into the project yet
    */
  var extendedConfigPath: js.UndefOr[java.lang.String] = js.native
  var options: js.UndefOr[CompilerOptions] = js.native
  var raw: js.Any = js.native
  var typeAcquisition: js.UndefOr[TypeAcquisition] = js.native
  var watchOptions: js.UndefOr[WatchOptions] = js.native
}

object ParsedTsconfig {
  @scala.inline
  def apply(raw: js.Any): ParsedTsconfig = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedTsconfig]
  }
  @scala.inline
  implicit class ParsedTsconfigOps[Self <: ParsedTsconfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRaw(value: js.Any): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtendedConfigPath(value: java.lang.String): Self = this.set("extendedConfigPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtendedConfigPath: Self = this.set("extendedConfigPath", js.undefined)
    @scala.inline
    def setOptions(value: CompilerOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setTypeAcquisition(value: TypeAcquisition): Self = this.set("typeAcquisition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeAcquisition: Self = this.set("typeAcquisition", js.undefined)
    @scala.inline
    def setWatchOptions(value: WatchOptions): Self = this.set("watchOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWatchOptions: Self = this.set("watchOptions", js.undefined)
  }
  
}

