package typings.winrtUwp.Windows.Data.Text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/** Defines the signature of a function that is provided to SelectableWordsSegmenter.Tokenize . */
type SelectableWordSegmentsTokenizingHandler = js.Function2[
/* precedingWords */ typings.winrtUwp.Windows.Foundation.Collections.IIterable[typings.winrtUwp.Windows.Data.Text.SelectableWordSegment], 
/* words */ typings.winrtUwp.Windows.Foundation.Collections.IIterable[typings.winrtUwp.Windows.Data.Text.SelectableWordSegment], 
scala.Unit]

/** Defines the signature of a function that is provided to WordsSegmenter.Tokenize . */
type WordSegmentsTokenizingHandler = js.Function2[
/* precedingWords */ typings.winrtUwp.Windows.Foundation.Collections.IIterable[typings.winrtUwp.Windows.Data.Text.WordSegment], 
/* words */ typings.winrtUwp.Windows.Foundation.Collections.IIterable[typings.winrtUwp.Windows.Data.Text.WordSegment], 
scala.Unit]
