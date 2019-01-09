package typings
package tsDashNodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ConfigName extends js.Object {
  def apply(
    searchPath: java.lang.String,
    fileExists: js.Function1[/* fileName */ java.lang.String, scala.Boolean]
  ): js.UndefOr[java.lang.String] = js.native
  def apply(
    searchPath: java.lang.String,
    fileExists: js.Function1[/* fileName */ java.lang.String, scala.Boolean],
    configName: java.lang.String
  ): js.UndefOr[java.lang.String] = js.native
}

