package typings.tablesorter

import typings.tablesorter.filteringFormatterOptionsComparableOptionsMod.ComparableOptions
import typings.tablesorter.filteringFormatterOptionsControlOptionsMod.ControlOptions
import typings.tablesorter.filteringFormatterOptionsDefaultValueOptionsMod.DefaultValueOptions
import typings.tablesorter.filteringFormatterOptionsDelayableOptionsMod.DelayableOptions
import typings.tablesorter.filteringFormatterOptionsIntervalOptionsMod.IntervalOptions
import typings.tablesorter.filteringFormatterOptionsStrictOptionsMod.StrictOptions
import typings.tablesorter.filteringFormatterOptionsTestableOptionsMod.TestableOptions
import typings.tablesorter.filteringFormatterOptionsToggleableOptionsMod.ToggleableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filteringFormatterOptionsHtml5NumberOptionsMod {
  
  trait Html5NumberOptions
    extends StObject
       with IntervalOptions
       with ControlOptions
       with DefaultValueOptions[Double]
       with ComparableOptions
       with ToggleableOptions
       with DelayableOptions
       with StrictOptions
       with TestableOptions
  object Html5NumberOptions {
    
    inline def apply(): Html5NumberOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Html5NumberOptions]
    }
  }
}
