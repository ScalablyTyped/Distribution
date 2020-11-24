package typings.tabulatorTables.Tabulator

import typings.tabulatorTables.tabulatorTablesBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _EditorParams extends js.Object
object _EditorParams {
  
  @scala.inline
  def TextAreaParams(): _EditorParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_EditorParams]
  }
  
  @scala.inline
  def NumberParams(): _EditorParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_EditorParams]
  }
  
  @scala.inline
  def SelectParams(values: `true` | (js.Array[SelectParamsGroup | String]) | JSONRecord | String): _EditorParams = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[_EditorParams]
  }
  
  @scala.inline
  def CheckboxParams(): _EditorParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_EditorParams]
  }
  
  @scala.inline
  def AutoCompleteParams(values: `true` | (js.Array[_ | String]) | JSONRecord | String): _EditorParams = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[_EditorParams]
  }
  
  @scala.inline
  def InputParams(): _EditorParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_EditorParams]
  }
}
