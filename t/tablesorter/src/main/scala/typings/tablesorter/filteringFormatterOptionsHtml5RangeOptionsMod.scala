package typings.tablesorter

import typings.tablesorter.filteringFormatterOptionsComparableOptionsMod.ComparableOptions
import typings.tablesorter.filteringFormatterOptionsControlOptionsMod.ControlOptions
import typings.tablesorter.filteringFormatterOptionsDefaultValueOptionsMod.DefaultValueOptions
import typings.tablesorter.filteringFormatterOptionsDelayableOptionsMod.DelayableOptions
import typings.tablesorter.filteringFormatterOptionsPreviewableOptionsMod.PreviewableOptions
import typings.tablesorter.filteringFormatterOptionsRangeOptionsMod.RangeOptions
import typings.tablesorter.filteringFormatterOptionsStrictOptionsMod.StrictOptions
import typings.tablesorter.filteringFormatterOptionsTestableOptionsMod.TestableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filteringFormatterOptionsHtml5RangeOptionsMod {
  
  trait Html5RangeOptions
    extends StObject
       with RangeOptions
       with ControlOptions
       with DefaultValueOptions[Double]
       with ComparableOptions
       with StrictOptions
       with PreviewableOptions
       with DelayableOptions
       with TestableOptions
  object Html5RangeOptions {
    
    inline def apply(): Html5RangeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Html5RangeOptions]
    }
  }
}
