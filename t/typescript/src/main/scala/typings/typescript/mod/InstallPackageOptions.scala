package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstallPackageOptions extends js.Object {
  var fileName: Path = js.native
  var packageName: java.lang.String = js.native
}

object InstallPackageOptions {
  @scala.inline
  def apply(fileName: Path, packageName: java.lang.String): InstallPackageOptions = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallPackageOptions]
  }
  @scala.inline
  implicit class InstallPackageOptionsOps[Self <: InstallPackageOptions] (val x: Self) extends AnyVal {
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
    def setFileName(value: Path): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPackageName(value: java.lang.String): Self = this.set("packageName", value.asInstanceOf[js.Any])
  }
  
}

