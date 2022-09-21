package typings.winrtUwp.Windows.Data.Text

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/** Defines the signature of a function that is provided to SelectableWordsSegmenter.Tokenize . */
type SelectableWordSegmentsTokenizingHandler = js.Function2[
/* precedingWords */ IIterable[SelectableWordSegment], 
/* words */ IIterable[SelectableWordSegment], 
Unit]

/** Defines the signature of a function that is provided to WordsSegmenter.Tokenize . */
type WordSegmentsTokenizingHandler = js.Function2[
/* precedingWords */ IIterable[WordSegment], 
/* words */ IIterable[WordSegment], 
Unit]
