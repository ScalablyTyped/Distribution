package typings.winrtDashUwp.Windows.Data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Text {
  import typings.winrtDashUwp.Windows.Foundation.Collections.IIterable

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
