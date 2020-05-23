package typings.wordpressBlocks.parserMod.Schema

import typings.wordpressBlocks.parserMod.Source
import typings.wordpressBlocks.wordpressBlocksStrings.query_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query[T] extends Source[T] {
  var query: T
  var selector: js.UndefOr[String] = js.undefined
  var source: query_
}

object Query {
  @scala.inline
  def apply[T](query: T, source: query_, selector: String = null): Query[T] = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query[T]]
  }
}

