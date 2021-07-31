package typings.tablesorter

import typings.select2.mod.DataFormat
import typings.select2.mod.GroupedDataFormat
import typings.select2.mod.Options
import typings.tablesorter.controlOptionsMod.ControlOptions
import typings.tablesorter.defaultValueOptionsMod.DefaultValueOptions
import typings.tablesorter.strictOptionsMod.StrictOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object select2OptionsMod {
  
  trait Select2Options
    extends StObject
       with Options[DataFormat | GroupedDataFormat, js.Any]
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
}
