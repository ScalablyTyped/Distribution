package typings.tsconfigPaths.configLoaderMod

import typings.tsconfigPaths.tsconfigPathsStrings.failed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigLoaderFailResult extends ConfigLoaderResult {
  var message: String = js.native
  var resultType: failed = js.native
}

object ConfigLoaderFailResult {
  @scala.inline
  def apply(message: String, resultType: failed): ConfigLoaderFailResult = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], resultType = resultType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigLoaderFailResult]
  }
  @scala.inline
  implicit class ConfigLoaderFailResultOps[Self <: ConfigLoaderFailResult] (val x: Self) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultType(value: failed): Self = this.set("resultType", value.asInstanceOf[js.Any])
  }
  
}

