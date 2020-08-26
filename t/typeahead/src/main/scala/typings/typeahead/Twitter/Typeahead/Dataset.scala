package typings.typeahead.Twitter.Typeahead

import typings.typeahead.Bloodhound
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
@js.native
trait Dataset[T] extends js.Object {
  /**
    * Lets the dataset know if async suggestions should be expected.
    * If not set, this information is inferred from the signature of
    * source i.e. if the source function expects 3 arguments, async will
    * be set to true.
    */
  var async: js.UndefOr[Boolean] = js.native
  /**
    * For a given suggestion, determines the string representation of it.
    * This will be used when setting the value of the input control after
    * a suggestion is selected. Can be either a key string or a function
    * that transforms a suggestion object into a string.
    * Defaults to stringifying the suggestion.
    */
  var display: js.UndefOr[String | (js.Function1[/* obj */ T, String])] = js.native
  /**
    * The max number of suggestions to be displayed. Defaults to 5.
    */
  var limit: js.UndefOr[Double] = js.native
  /**
    * The name of the dataset.
    * This will be appended to {{classNames.dataset}} - to form the class name of the containing DOM element.
    * Must only consist of underscores, dashes, letters (a-z), and numbers.
    * Defaults to a random number.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The backing data source for suggestions.
    * Expected to be a function with the signature (query, syncResults, asyncResults).
    * syncResults should be called with suggestions computed synchronously and
    *  asyncResults should be called with suggestions computed asynchronously
    * (e.g. suggestions that come for an AJAX request).
    *  source can also be a Bloodhound instance.
    */
  var source: Bloodhound[T] | (js.Function3[
    /* query */ String, 
    /* syncResults */ js.Function1[/* result */ js.Array[T], Unit], 
    /* asyncResults */ js.UndefOr[js.Function1[/* result */ js.Array[T], Unit]], 
    Unit
  ]) = js.native
  /**
    * A hash of templates to be used when rendering the dataset. Note a
    * precompiled template is a function that takes a JavaScript object as
    * its first argument and returns a HTML string.
    */
  var templates: js.UndefOr[Templates[T]] = js.native
}

object Dataset {
  @scala.inline
  def apply[T](
    source: Bloodhound[T] | (js.Function3[
      /* query */ String, 
      /* syncResults */ js.Function1[/* result */ js.Array[T], Unit], 
      /* asyncResults */ js.UndefOr[js.Function1[/* result */ js.Array[T], Unit]], 
      Unit
    ])
  ): Dataset[T] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dataset[T]]
  }
  @scala.inline
  implicit class DatasetOps[Self <: Dataset[_], T] (val x: Self with Dataset[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSourceFunction3(
      value: (/* query */ String, /* syncResults */ js.Function1[/* result */ js.Array[T], Unit], /* asyncResults */ js.UndefOr[js.Function1[/* result */ js.Array[T], Unit]]) => Unit
    ): Self = this.set("source", js.Any.fromFunction3(value))
    @scala.inline
    def setSource(
      value: Bloodhound[T] | (js.Function3[
          /* query */ String, 
          /* syncResults */ js.Function1[/* result */ js.Array[T], Unit], 
          /* asyncResults */ js.UndefOr[js.Function1[/* result */ js.Array[T], Unit]], 
          Unit
        ])
    ): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    @scala.inline
    def setDisplayFunction1(value: /* obj */ T => String): Self = this.set("display", js.Any.fromFunction1(value))
    @scala.inline
    def setDisplay(value: String | (js.Function1[/* obj */ T, String])): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTemplates(value: Templates[T]): Self = this.set("templates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplates: Self = this.set("templates", js.undefined)
  }
  
}

