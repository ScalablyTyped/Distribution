package typings.typescript.mod

import typings.typescript.AnonFileExists
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "validateLocaleAndSetLanguage")
@js.native
object validateLocaleAndSetLanguage extends js.Object {
  /**
    * Checks to see if the locale is in the appropriate format,
    * and if it is, attempts to set the appropriate language.
    */
  def apply(locale: java.lang.String, sys: AnonFileExists): Unit = js.native
  def apply(locale: java.lang.String, sys: AnonFileExists, errors: Push[Diagnostic]): Unit = js.native
}

