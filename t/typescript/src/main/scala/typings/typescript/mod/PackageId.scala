package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PackageId extends js.Object {
  /**
    * Name of the package.
    * Should not include `@types`.
    * If accessing a non-index file, this should include its name e.g. "foo/bar".
    */
  var name: java.lang.String = js.native
  /**
    * Name of a submodule within this package.
    * May be "".
    */
  var subModuleName: java.lang.String = js.native
  /** Version of the package, e.g. "1.2.3" */
  var version: java.lang.String = js.native
}

object PackageId {
  @scala.inline
  def apply(name: java.lang.String, subModuleName: java.lang.String, version: java.lang.String): PackageId = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], subModuleName = subModuleName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageId]
  }
  @scala.inline
  implicit class PackageIdOps[Self <: PackageId] (val x: Self) extends AnyVal {
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
    def setName(value: java.lang.String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubModuleName(value: java.lang.String): Self = this.set("subModuleName", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: java.lang.String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

