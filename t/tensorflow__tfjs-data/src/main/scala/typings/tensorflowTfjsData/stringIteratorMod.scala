package typings.tensorflowTfjsData

import typings.tensorflowTfjsData.lazyIteratorMod.LazyIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data/dist/iterators/string_iterator", JSImport.Namespace)
@js.native
object stringIteratorMod extends js.Object {
  @js.native
  abstract class StringIterator () extends LazyIterator[String] {
    /**
      * Splits a string stream on a given separator.
      *
      * It is assumed that the incoming chunk boundaries have no semantic meaning,
      * so conceptually the incoming stream is treated simply as the concatenation
      * of its elements.
      *
      * The outgoing stream provides chunks corresponding to the results of the
      * standard string split() operation (even if such a chunk spanned incoming
      * chunks).  The separators are not included.
      *
      * A typical usage is to split a text file (represented as a stream with
      * arbitrary chunk boundaries) into lines.
      *
      * @param upstream A readable stream of strings that can be treated as
      *   concatenated.
      * @param separator A character to split on.
      */
    def split(separator: String): StringIterator = js.native
  }
  
}

