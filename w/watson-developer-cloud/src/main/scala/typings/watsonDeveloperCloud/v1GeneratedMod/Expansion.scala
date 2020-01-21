package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An expansion definition. Each object respresents one set of expandable strings. For example, you could have expansions for the word `hot` in one object, and expansions for the word `cold` in another. */
trait Expansion extends js.Object {
  /** A list of terms that this expansion will be expanded to. If specified without **input_terms**, it also functions as the input term list. */
  var expanded_terms: js.Array[String]
  /** A list of terms that will be expanded for this expansion. If specified, only the items in this list are expanded. */
  var input_terms: js.UndefOr[js.Array[String]] = js.undefined
}

object Expansion {
  @scala.inline
  def apply(expanded_terms: js.Array[String], input_terms: js.Array[String] = null): Expansion = {
    val __obj = js.Dynamic.literal(expanded_terms = expanded_terms.asInstanceOf[js.Any])
    if (input_terms != null) __obj.updateDynamic("input_terms")(input_terms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expansion]
  }
}

