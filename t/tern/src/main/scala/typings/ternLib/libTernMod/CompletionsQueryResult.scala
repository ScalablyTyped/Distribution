package typings
package ternLib.libTernMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletionsQueryResult extends js.Object {
  // TODO depends on completionsquery settings -> conditional types?
  /**
    * array of completions. When one of the `types`, `depths`, `docs`, `urls`, or `origins`
    * options was passed, the array will hold objects with a `name` property (the completion text),
    * and, depending on the options, `type`, `depth`, `doc`, `url`, and `origin` properties.
    * When none of these options are enabled, the result array will hold plain strings.
    */
  var completions: js.Array[java.lang.String] | js.Array[ternLib.Anon_Depth]
  /** end offsets of the word that was completed */
  var end: scala.Double | Position
  /** whether the completion is for a property or a variable */
  var isProperty: scala.Boolean
  /** start offsets of the word that was completed */
  var start: scala.Double | Position
}

object CompletionsQueryResult {
  @scala.inline
  def apply(
    completions: js.Array[java.lang.String] | js.Array[ternLib.Anon_Depth],
    end: scala.Double | Position,
    isProperty: scala.Boolean,
    start: scala.Double | Position
  ): CompletionsQueryResult = {
    val __obj = js.Dynamic.literal(completions = completions.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], isProperty = isProperty, start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CompletionsQueryResult]
  }
}

