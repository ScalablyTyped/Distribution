package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Unique identifier with a package name and version.
  * If changing this, remember to change `packageIdIsEqual`.
  */
trait PackageId extends js.Object {
  /**
    * Name of the package.
    * Should not include `@types`.
    * If accessing a non-index file, this should include its name e.g. "foo/bar".
    */
  var name: String
  /**
    * Name of a submodule within this package.
    * May be "".
    */
  var subModuleName: String
  /** Version of the package, e.g. "1.2.3" */
  var version: String
}

object PackageId {
  @scala.inline
  def apply(name: String, subModuleName: String, version: String): PackageId = {
    val __obj = js.Dynamic.literal(name = name, subModuleName = subModuleName, version = version)
  
    __obj.asInstanceOf[PackageId]
  }
}

