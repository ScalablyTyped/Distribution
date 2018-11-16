package typings
package winrtDashUwpLib.WindowsNs.DataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object TextNs {
  /** Defines the signature of a function that is provided to SelectableWordsSegmenter.Tokenize . */
  type SelectableWordSegmentsTokenizingHandler = js.Function2[
    /* precedingWords */ winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[SelectableWordSegment], 
    /* words */ winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[SelectableWordSegment], 
    scala.Unit
  ]
  /** Defines the signature of a function that is provided to WordsSegmenter.Tokenize . */
  type WordSegmentsTokenizingHandler = js.Function2[
    /* precedingWords */ winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[WordSegment], 
    /* words */ winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[WordSegment], 
    scala.Unit
  ]
}
