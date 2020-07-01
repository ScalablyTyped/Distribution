package typings.wordpressBlocks.mod

import typings.std.Node
import typings.std.Partial
import typings.std.Record
import typings.wordpressBlocks.wordpressBlocksStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformRaw[T /* <: Record[String, _] */] extends Transform[T] {
  var isMatch: js.UndefOr[js.Function1[/* node */ Node, Boolean]] = js.undefined
  var priority: js.UndefOr[Double] = js.undefined
  var schema: js.UndefOr[TransformRawSchema] = js.undefined
  /**
    * Comma-separated list of selectors, no spaces.
    *
    * @example 'p,div,h1,.css-class,#id'
    */
  var selector: js.UndefOr[String] = js.undefined
  var transform: js.UndefOr[js.Function1[/* node */ Node, BlockInstance[Partial[T]] | Unit]] = js.undefined
  var `type`: raw
}

object TransformRaw {
  @scala.inline
  def apply[/* <: typings.std.Record[java.lang.String, _] */ T](
    `type`: raw,
    isMatch: /* node */ Node => Boolean = null,
    priority: js.UndefOr[Double] = js.undefined,
    schema: TransformRawSchema = null,
    selector: String = null,
    transform: /* node */ Node => BlockInstance[Partial[T]] | Unit = null
  ): TransformRaw[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (isMatch != null) __obj.updateDynamic("isMatch")(js.Any.fromFunction1(isMatch))
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1(transform))
    __obj.asInstanceOf[TransformRaw[T]]
  }
}

