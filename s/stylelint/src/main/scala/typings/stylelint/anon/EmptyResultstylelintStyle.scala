package typings.stylelint.anon

import typings.postcss.libResultMod.Message
import typings.stylelint.mod.PostcssResult
import typings.stylelint.mod.StylelintPostcssResult
import typings.stylelint.mod.WarningOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stylelint.stylelint.EmptyResult & {  stylelint :stylelint.stylelint.StylelintPostcssResult, warn (message : string, options : stylelint.stylelint.WarningOptions | undefined): void} */
@js.native
trait EmptyResultstylelintStyle
  extends StObject
     with PostcssResult {
  
  var messages: js.Array[Message] = js.native
  
  var opts: Unit = js.native
  
  var root: Nodes = js.native
  
  var stylelint: StylelintPostcssResult = js.native
  
  def warn(message: String): Unit = js.native
  def warn(message: String, options: WarningOptions): Unit = js.native
}
