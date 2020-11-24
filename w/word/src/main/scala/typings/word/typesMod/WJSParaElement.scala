package typings.word.typesMod

import typings.word.wordStrings.s
import typings.word.wordStrings.t
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.word.typesMod.WJSTextRun
  - typings.word.typesMod.WJSTable
*/
trait WJSParaElement extends js.Object
object WJSParaElement {
  
  @scala.inline
  def WJSTextRun(t: s, v: String): WJSParaElement = {
    val __obj = js.Dynamic.literal(t = t.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[WJSParaElement]
  }
  
  @scala.inline
  def WJSTable(r: js.Array[WJSTableRow], t: t): WJSParaElement = {
    val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[WJSParaElement]
  }
}
