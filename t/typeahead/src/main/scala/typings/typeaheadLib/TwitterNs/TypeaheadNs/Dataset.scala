package typings
package typeaheadLib.TwitterNs.TypeaheadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A typeahead is composed of one or more datasets. When an end-user
  * modifies the value of a typeahead, each dataset will attempt to render
  * suggestions for the new value.
  * For most use cases, one dataset should suffice. It's only in the scenario
  * where you want rendered suggestions to be grouped based on some sort of
  * categorical relationship that you'd need to use multiple datasets. For
  * example, on twitter.com, the search typeahead groups results into recent
  * searches, trends, and accounts  that would be a great use case for using
  * multiple datasets.
  */
trait Dataset[T] extends js.Object {
  /**
    * Lets the dataset know if async suggestions should be expected.
    * If not set, this information is inferred from the signature of
    * source i.e. if the source function expects 3 arguments, async will
    * be set to true.
    */
  var async: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * For a given suggestion, determines the string representation of it.
    * This will be used when setting the value of the input control after
    * a suggestion is selected. Can be either a key string or a function
    * that transforms a suggestion object into a string.
    * Defaults to stringifying the suggestion.
    */
  var display: js.UndefOr[java.lang.String | (js.Function1[/* obj */ T, java.lang.String])] = js.undefined
  /**
    * The max number of suggestions to be displayed. Defaults to 5.
    */
  var limit: js.UndefOr[scala.Double] = js.undefined
  /**
    * The name of the dataset.
    * This will be appended to {{classNames.dataset}} - to form the class name of the containing DOM element.
    * Must only consist of underscores, dashes, letters (a-z), and numbers.
    * Defaults to a random number.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The backing data source for suggestions.
    * Expected to be a function with the signature (query, syncResults, asyncResults).
    * syncResults should be called with suggestions computed synchronously and
    *  asyncResults should be called with suggestions computed asynchronously
    * (e.g. suggestions that come for an AJAX request).
    *  source can also be a Bloodhound instance.
    */
  var source: typeaheadLib.Bloodhound[T] | (js.Function3[
    /* query */ java.lang.String, 
    /* syncResults */ js.Function1[/* result */ js.Array[T], scala.Unit], 
    /* asyncResults */ js.UndefOr[js.Function1[/* result */ js.Array[T], scala.Unit]], 
    scala.Unit
  ])
  /**
    * A hash of templates to be used when rendering the dataset. Note a
    * precompiled template is a function that takes a JavaScript object as
    * its first argument and returns a HTML string.
    */
  var templates: js.UndefOr[Templates[T]] = js.undefined
}

object Dataset {
  @scala.inline
  def apply[T](
    source: typeaheadLib.Bloodhound[T] | (js.Function3[
      /* query */ java.lang.String, 
      /* syncResults */ js.Function1[/* result */ js.Array[T], scala.Unit], 
      /* asyncResults */ js.UndefOr[js.Function1[/* result */ js.Array[T], scala.Unit]], 
      scala.Unit
    ]),
    async: js.UndefOr[scala.Boolean] = js.undefined,
    display: java.lang.String | (js.Function1[/* obj */ T, java.lang.String]) = null,
    limit: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    templates: Templates[T] = null
  ): Dataset[T] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (templates != null) __obj.updateDynamic("templates")(templates)
    __obj.asInstanceOf[Dataset[T]]
  }
}

