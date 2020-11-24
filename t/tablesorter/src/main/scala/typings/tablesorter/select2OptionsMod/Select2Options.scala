package typings.tablesorter.select2OptionsMod

import typings.select2.mod.DataFormat
import typings.select2.mod.GroupedDataFormat
import typings.select2.mod.Options
import typings.tablesorter.controlOptionsMod.ControlOptions
import typings.tablesorter.defaultValueOptionsMod.DefaultValueOptions
import typings.tablesorter.strictOptionsMod.StrictOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Select2Options
  extends Options[DataFormat | GroupedDataFormat, js.Any]
     with ControlOptions
     with StrictOptions
     with DefaultValueOptions[String]
object Select2Options {
  
  @scala.inline
  def apply(): Select2Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Select2Options]
  }
}
