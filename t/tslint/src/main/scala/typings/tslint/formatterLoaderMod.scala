package typings.tslint

import typings.tslint.formatterMod.FormatterConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatterLoaderMod {
  
  @JSImport("tslint/lib/formatterLoader", "findFormatter")
  @js.native
  def findFormatter(name: String): js.UndefOr[FormatterConstructor] = js.native
  @JSImport("tslint/lib/formatterLoader", "findFormatter")
  @js.native
  def findFormatter(name: String, formattersDirectory: String): js.UndefOr[FormatterConstructor] = js.native
  @JSImport("tslint/lib/formatterLoader", "findFormatter")
  @js.native
  def findFormatter(name: FormatterConstructor): js.UndefOr[FormatterConstructor] = js.native
  @JSImport("tslint/lib/formatterLoader", "findFormatter")
  @js.native
  def findFormatter(name: FormatterConstructor, formattersDirectory: String): js.UndefOr[FormatterConstructor] = js.native
}
