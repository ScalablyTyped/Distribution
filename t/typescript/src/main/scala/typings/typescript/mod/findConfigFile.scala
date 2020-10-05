package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "findConfigFile")
@js.native
object findConfigFile extends js.Object {
  def apply(searchPath: java.lang.String, fileExists: js.Function1[/* fileName */ java.lang.String, Boolean]): js.UndefOr[java.lang.String] = js.native
  def apply(
    searchPath: java.lang.String,
    fileExists: js.Function1[/* fileName */ java.lang.String, Boolean],
    configName: java.lang.String
  ): js.UndefOr[java.lang.String] = js.native
}

