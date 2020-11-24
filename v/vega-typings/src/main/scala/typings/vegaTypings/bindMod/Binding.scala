package typings.vegaTypings.bindMod

import typings.vegaTypings.vegaTypingsStrings.checkbox
import typings.vegaTypings.vegaTypingsStrings.radio
import typings.vegaTypings.vegaTypingsStrings.range
import typings.vegaTypings.vegaTypingsStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.bindMod.BindCheckbox
  - typings.vegaTypings.bindMod.BindRadioSelect
  - typings.vegaTypings.bindMod.BindRange
  - typings.vegaTypings.bindMod.InputBinding
*/
trait Binding extends js.Object
object Binding {
  
  @scala.inline
  def BindCheckbox(input: checkbox): Binding = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[Binding]
  }
  
  @scala.inline
  def BindRadioSelect(input: radio | select, options: js.Array[_]): Binding = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Binding]
  }
  
  @scala.inline
  def BindRange(input: range): Binding = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[Binding]
  }
  
  @scala.inline
  def InputBinding(): Binding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Binding]
  }
}
