package typings.typeaheadJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Twitter {
  
  object Typeahead {
    
    /**
      * Used for overriding the default class names.
      */
    trait ClassNames extends StObject {
      
      /**
        * Added to suggestion element when menu cursor moves to said suggestion.Defaults to tt- cursor.
        */
      var cursor: js.UndefOr[String] = js.undefined
      
      /**
        * Added to dataset elements.to Defaults to tt- dataset.
        */
      var dataset: js.UndefOr[String] = js.undefined
      
      /**
        * Added to menu element when it contains no content.Defaults to tt- empty.
        */
      var empty: js.UndefOr[String] = js.undefined
      
      /**
        * Added to the element that wraps highlighted text.Defaults to tt- highlight.
        */
      var highlight: js.UndefOr[String] = js.undefined
      
      /**
        * Added to hint input.Defaults to tt- hint.
        */
      var hint: js.UndefOr[String] = js.undefined
      
      /**
        * Added to input that's initialized into a typeahead. Defaults to tt-input.
        */
      var input: js.UndefOr[String] = js.undefined
      
      /**
        * Added to menu element.Defaults to tt- menu.
        */
      var menu: js.UndefOr[String] = js.undefined
      
      /**
        * Added to menu element when it is opened.Defaults to tt- open.
        */
      var open: js.UndefOr[String] = js.undefined
      
      /**
        * Added to suggestion elements.Defaults to tt- suggestion.
        */
      var suggestion: js.UndefOr[String] = js.undefined
    }
    object ClassNames {
      
      inline def apply(): ClassNames = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ClassNames]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ClassNames] (val x: Self) extends AnyVal {
        
        inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
        
        inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
        
        inline def setDataset(value: String): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
        
        inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
        
        inline def setEmpty(value: String): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
        
        inline def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
        
        inline def setHighlight(value: String): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
        
        inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
        
        inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
        
        inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
        
        inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
        
        inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
        
        inline def setMenu(value: String): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
        
        inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
        
        inline def setOpen(value: String): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
        
        inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
        
        inline def setSuggestion(value: String): Self = StObject.set(x, "suggestion", value.asInstanceOf[js.Any])
        
        inline def setSuggestionUndefined: Self = StObject.set(x, "suggestion", js.undefined)
      }
    }
    
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
    trait Dataset[T] extends StObject {
      
      /**
        * Lets the dataset know if async suggestions should be expected.
        * If not set, this information is inferred from the signature of
        * source i.e. if the source function expects 3 arguments, async will
        * be set to true.
        */
      var async: js.UndefOr[Boolean] = js.undefined
      
      /**
        * For a given suggestion, determines the string representation of it.
        * This will be used when setting the value of the input control after
        * a suggestion is selected. Can be either a key string or a function
        * that transforms a suggestion object into a string.
        * Defaults to stringifying the suggestion.
        */
      var display: js.UndefOr[String | (js.Function1[/* obj */ T, String])] = js.undefined
      
      /**
        * The max number of suggestions to be displayed. Defaults to 5.
        */
      var limit: js.UndefOr[Double] = js.undefined
      
      /**
        * The name of the dataset.
        * This will be appended to {{classNames.dataset}} - to form the class name of the containing DOM element.
        * Must only consist of underscores, dashes, letters (a-z), and numbers.
        * Defaults to a random number.
        */
      var name: js.UndefOr[String] = js.undefined
      
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
          ])
      
      /**
        * A hash of templates to be used when rendering the dataset. Note a
        * precompiled template is a function that takes a JavaScript object as
        * its first argument and returns a HTML string.
        */
      var templates: js.UndefOr[Templates[T]] = js.undefined
    }
    object Dataset {
      
      inline def apply[T](
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
      implicit open class MutableBuilder[Self <: Dataset[?], T] (val x: Self & Dataset[T]) extends AnyVal {
        
        inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
        
        inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
        
        inline def setDisplay(value: String | (js.Function1[/* obj */ T, String])): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
        
        inline def setDisplayFunction1(value: /* obj */ T => String): Self = StObject.set(x, "display", js.Any.fromFunction1(value))
        
        inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
        
        inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
        
        inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setSource(
          value: Bloodhound[T] | (js.Function3[
                  /* query */ String, 
                  /* syncResults */ js.Function1[/* result */ js.Array[T], Unit], 
                  /* asyncResults */ js.UndefOr[js.Function1[/* result */ js.Array[T], Unit]], 
                  Unit
                ])
        ): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        inline def setSourceFunction3(
          value: (/* query */ String, /* syncResults */ js.Function1[/* result */ js.Array[T], Unit], /* asyncResults */ js.UndefOr[js.Function1[/* result */ js.Array[T], Unit]]) => Unit
        ): Self = StObject.set(x, "source", js.Any.fromFunction3(value))
        
        inline def setTemplates(value: Templates[T]): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
        
        inline def setTemplatesUndefined: Self = StObject.set(x, "templates", js.undefined)
      }
    }
    
    trait Options extends StObject {
      
      /**
        * Used for overriding the default class names.
        */
      var classNames: js.UndefOr[ClassNames] = js.undefined
      
      /**
        * If true, when suggestions are rendered, pattern matches for the current query in text nodes will be wrapped in a strong element with its class set to {{classNames.highlight}}.
        * Defaults to false.
        */
      var highlight: js.UndefOr[Boolean] = js.undefined
      
      /**
        * If false, the typeahead will not show a hint.
        * Defaults to true.
        */
      var hint: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The minimum character length needed before suggestions start getting rendered.
        * Defaults to 1.
        */
      var minLength: js.UndefOr[Double] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        inline def setClassNames(value: ClassNames): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
        
        inline def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
        
        inline def setHighlight(value: Boolean): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
        
        inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
        
        inline def setHint(value: Boolean): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
        
        inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
        
        inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
        
        inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      }
    }
    
    /**
      * A hash of templates to be used when rendering the dataset. Note a
      * precompiled template is a function that takes a JavaScript object as
      * its first argument and returns a HTML string.
      */
    trait Templates[T] extends StObject {
      
      /**
        * Rendered at the bottom of the dataset when suggestions are present. Can be either a HTML string or
        * a precompiled template. If it's a precompiled template, the passed in context will contain
        * query and suggestions.
        */
      var footer: js.UndefOr[
            String | (js.Function2[/* query */ String, /* suggestions */ js.Array[T], String])
          ] = js.undefined
      
      /**
        * Rendered at the top of the dataset when suggestions are present. Can be either a HTML string or
        * a precompiled template. If it's a precompiled template, the passed in context will contain
        * query and suggestions.
        */
      var header: js.UndefOr[
            String | (js.Function2[/* query */ String, /* suggestions */ js.Array[T], String])
          ] = js.undefined
      
      /**
        * Rendered when 0 suggestions are available for the given query.
        * Can be either a HTML string or a precompiled template.
        * If it's a precompiled template, the passed in context will contain query.
        */
      var notFound: js.UndefOr[String | (js.Function1[/* query */ String, String])] = js.undefined
      
      /**
        * Rendered when 0 synchronous suggestions are available but asynchronous suggestions are expected.
        * Can be either a HTML string or a precompiled template.
        * If it's a precompiled template, the passed in context will contain query.
        */
      var pending: js.UndefOr[String | (js.Function1[/* query */ String, String])] = js.undefined
      
      /**
        * Used to render a single suggestion. If set, this has to be a precompiled template.
        * The associated suggestion object will serve as the context.
        * Defaults to the value of display wrapped in a div tag i.e. <div>{{value}}</div>.
        */
      var suggestion: js.UndefOr[js.Function1[/* suggestion */ T, String]] = js.undefined
    }
    object Templates {
      
      inline def apply[T](): Templates[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Templates[T]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Templates[?], T] (val x: Self & Templates[T]) extends AnyVal {
        
        inline def setFooter(value: String | (js.Function2[/* query */ String, /* suggestions */ js.Array[T], String])): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
        
        inline def setFooterFunction2(value: (/* query */ String, /* suggestions */ js.Array[T]) => String): Self = StObject.set(x, "footer", js.Any.fromFunction2(value))
        
        inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
        
        inline def setHeader(value: String | (js.Function2[/* query */ String, /* suggestions */ js.Array[T], String])): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
        
        inline def setHeaderFunction2(value: (/* query */ String, /* suggestions */ js.Array[T]) => String): Self = StObject.set(x, "header", js.Any.fromFunction2(value))
        
        inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
        
        inline def setNotFound(value: String | (js.Function1[/* query */ String, String])): Self = StObject.set(x, "notFound", value.asInstanceOf[js.Any])
        
        inline def setNotFoundFunction1(value: /* query */ String => String): Self = StObject.set(x, "notFound", js.Any.fromFunction1(value))
        
        inline def setNotFoundUndefined: Self = StObject.set(x, "notFound", js.undefined)
        
        inline def setPending(value: String | (js.Function1[/* query */ String, String])): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
        
        inline def setPendingFunction1(value: /* query */ String => String): Self = StObject.set(x, "pending", js.Any.fromFunction1(value))
        
        inline def setPendingUndefined: Self = StObject.set(x, "pending", js.undefined)
        
        inline def setSuggestion(value: /* suggestion */ T => String): Self = StObject.set(x, "suggestion", js.Any.fromFunction1(value))
        
        inline def setSuggestionUndefined: Self = StObject.set(x, "suggestion", js.undefined)
      }
    }
  }
}
