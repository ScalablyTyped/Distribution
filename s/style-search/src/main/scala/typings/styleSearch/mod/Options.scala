package typings.styleSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Syntax feature options all accept three keywords:"skip", "check", "only".
  * An error will be thrown if you use "only" more than once
  */
trait Options extends js.Object {
  /**
    * This includes both standard `/ * CSS comments *\/`
    * and non-standard but widely used `// single line comments`.
    * @default 'skip'
    */
  var comments: js.UndefOr[SyntaxFeatureOption] = js.undefined
  /**
    * @default 'check'
    */
  var functionArguments: js.UndefOr[SyntaxFeatureOption] = js.undefined
  /**
    * @default 'skip'
    */
  var functionNames: js.UndefOr[SyntaxFeatureOption] = js.undefined
  /**
    * If true, the search will stop after one match is found.
    * @default false
    */
  var once: js.UndefOr[Boolean] = js.undefined
  /**
    * @default 'check'
    */
  var parentheticals: js.UndefOr[SyntaxFeatureOption] = js.undefined
  /** The source string to search through. */
  var source: String
  /**
    * @default 'skip'
    */
  var strings: js.UndefOr[SyntaxFeatureOption] = js.undefined
  /**
    * The target of the search. Can be
    * - a single character
    * - a string with some length
    * - an array of strings, all of which count as matches
    * (the match object passed to the callback will differentiate which string in the array
    * got matched via its target property)
    */
  var target: String | js.Array[String]
}

object Options {
  @scala.inline
  def apply(
    source: String,
    target: String | js.Array[String],
    comments: SyntaxFeatureOption = null,
    functionArguments: SyntaxFeatureOption = null,
    functionNames: SyntaxFeatureOption = null,
    once: js.UndefOr[Boolean] = js.undefined,
    parentheticals: SyntaxFeatureOption = null,
    strings: SyntaxFeatureOption = null
  ): Options = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (functionArguments != null) __obj.updateDynamic("functionArguments")(functionArguments.asInstanceOf[js.Any])
    if (functionNames != null) __obj.updateDynamic("functionNames")(functionNames.asInstanceOf[js.Any])
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once.asInstanceOf[js.Any])
    if (parentheticals != null) __obj.updateDynamic("parentheticals")(parentheticals.asInstanceOf[js.Any])
    if (strings != null) __obj.updateDynamic("strings")(strings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

