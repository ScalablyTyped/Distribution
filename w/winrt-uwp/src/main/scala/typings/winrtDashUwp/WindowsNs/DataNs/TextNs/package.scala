package typings.winrtDashUwp.WindowsNs.DataNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TextNs {
  /** Defines the signature of a function that is provided to SelectableWordsSegmenter.Tokenize . */
  type SelectableWordSegmentsTokenizingHandler = js.Function2[
    /* precedingWords */ IIterable[SelectableWordSegment], 
    /* words */ IIterable[SelectableWordSegment], 
    Unit
  ]
  /** Defines the signature of a function that is provided to WordsSegmenter.Tokenize . */
  type WordSegmentsTokenizingHandler = js.Function2[
    /* precedingWords */ IIterable[WordSegment], 
    /* words */ IIterable[WordSegment], 
    Unit
  ]
}
