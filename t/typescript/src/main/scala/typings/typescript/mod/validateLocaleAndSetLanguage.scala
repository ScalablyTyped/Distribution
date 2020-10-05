package typings.typescript.mod

import typings.typescript.anon.FileExists
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "validateLocaleAndSetLanguage")
@js.native
object validateLocaleAndSetLanguage extends js.Object {
  /**
    * Checks to see if the locale is in the appropriate format,
    * and if it is, attempts to set the appropriate language.
    */
  def apply(locale: java.lang.String, sys: FileExists): Unit = js.native
  def apply(locale: java.lang.String, sys: FileExists, errors: Push[Diagnostic]): Unit = js.native
}

