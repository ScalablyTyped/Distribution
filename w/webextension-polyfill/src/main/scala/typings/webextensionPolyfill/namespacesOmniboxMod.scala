package typings.webextensionPolyfill

import typings.webextensionPolyfill.namespacesEventsMod.Events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespacesOmniboxMod {
  
  object Omnibox {
    
    /**
      * A suggest result.
      */
    trait DefaultSuggestResult extends StObject {
      
      /**
        * The text that is displayed in the URL dropdown.
        */
      var description: String
    }
    object DefaultSuggestResult {
      
      inline def apply(description: String): DefaultSuggestResult = {
        val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
        __obj.asInstanceOf[DefaultSuggestResult]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: DefaultSuggestResult] (val x: Self) extends AnyVal {
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The style type.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.url
      - typings.webextensionPolyfill.webextensionPolyfillStrings.`match`
      - typings.webextensionPolyfill.webextensionPolyfillStrings.dim
    */
    trait DescriptionStyleType extends StObject
    object DescriptionStyleType {
      
      inline def dim: typings.webextensionPolyfill.webextensionPolyfillStrings.dim = "dim".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.dim]
      
      inline def `match`: typings.webextensionPolyfill.webextensionPolyfillStrings.`match` = "match".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.`match`]
      
      inline def url: typings.webextensionPolyfill.webextensionPolyfillStrings.url = "url".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.url]
    }
    
    /**
      * The window disposition for the omnibox query. This is the recommended context to display results. For example,
      * if the omnibox command is to navigate to a certain URL, a disposition of 'newForegroundTab' means the navigation should
      * take place in a new selected tab.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.webextensionPolyfill.webextensionPolyfillStrings.currentTab
      - typings.webextensionPolyfill.webextensionPolyfillStrings.newForegroundTab
      - typings.webextensionPolyfill.webextensionPolyfillStrings.newBackgroundTab
    */
    trait OnInputEnteredDisposition extends StObject
    object OnInputEnteredDisposition {
      
      inline def currentTab: typings.webextensionPolyfill.webextensionPolyfillStrings.currentTab = "currentTab".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.currentTab]
      
      inline def newBackgroundTab: typings.webextensionPolyfill.webextensionPolyfillStrings.newBackgroundTab = "newBackgroundTab".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.newBackgroundTab]
      
      inline def newForegroundTab: typings.webextensionPolyfill.webextensionPolyfillStrings.newForegroundTab = "newForegroundTab".asInstanceOf[typings.webextensionPolyfill.webextensionPolyfillStrings.newForegroundTab]
    }
    
    trait Static extends StObject {
      
      /**
        * User has deleted a suggested result.
        *
        * @param text
        */
      var onDeleteSuggestion: Event[js.Function1[/* text */ String, Unit]]
      
      /**
        * User has ended the keyword input session without accepting the input.
        */
      var onInputCancelled: Event[js.Function0[Unit]]
      
      /**
        * User has changed what is typed into the omnibox.
        *
        * @param text
        * @param suggest A callback passed to the onInputChanged event used for sending suggestions back to the browser.
        */
      var onInputChanged: Event[
            js.Function2[
              /* text */ String, 
              /* suggest */ js.Function1[/* suggestResults */ js.Array[SuggestResult], Unit], 
              Unit
            ]
          ]
      
      /**
        * User has accepted what is typed into the omnibox.
        *
        * @param text
        * @param disposition
        */
      var onInputEntered: Event[
            js.Function2[/* text */ String, /* disposition */ OnInputEnteredDisposition, Unit]
          ]
      
      /**
        * User has started a keyword input session by typing the extension's keyword. This is guaranteed to be sent exactly once
        * per input session, and before any onInputChanged events.
        */
      var onInputStarted: Event[js.Function0[Unit]]
      
      /**
        * Sets the description and styling for the default suggestion. The default suggestion is the text that is displayed in the
        * first suggestion row underneath the URL bar.
        *
        * @param suggestion A partial SuggestResult object, without the 'content' parameter.
        */
      def setDefaultSuggestion(suggestion: DefaultSuggestResult): Unit
    }
    object Static {
      
      inline def apply(
        onDeleteSuggestion: Event[js.Function1[/* text */ String, Unit]],
        onInputCancelled: Event[js.Function0[Unit]],
        onInputChanged: Event[
              js.Function2[
                /* text */ String, 
                /* suggest */ js.Function1[/* suggestResults */ js.Array[SuggestResult], Unit], 
                Unit
              ]
            ],
        onInputEntered: Event[
              js.Function2[/* text */ String, /* disposition */ OnInputEnteredDisposition, Unit]
            ],
        onInputStarted: Event[js.Function0[Unit]],
        setDefaultSuggestion: DefaultSuggestResult => Unit
      ): Static = {
        val __obj = js.Dynamic.literal(onDeleteSuggestion = onDeleteSuggestion.asInstanceOf[js.Any], onInputCancelled = onInputCancelled.asInstanceOf[js.Any], onInputChanged = onInputChanged.asInstanceOf[js.Any], onInputEntered = onInputEntered.asInstanceOf[js.Any], onInputStarted = onInputStarted.asInstanceOf[js.Any], setDefaultSuggestion = js.Any.fromFunction1(setDefaultSuggestion))
        __obj.asInstanceOf[Static]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Static] (val x: Self) extends AnyVal {
        
        inline def setOnDeleteSuggestion(value: Event[js.Function1[/* text */ String, Unit]]): Self = StObject.set(x, "onDeleteSuggestion", value.asInstanceOf[js.Any])
        
        inline def setOnInputCancelled(value: Event[js.Function0[Unit]]): Self = StObject.set(x, "onInputCancelled", value.asInstanceOf[js.Any])
        
        inline def setOnInputChanged(
          value: Event[
                  js.Function2[
                    /* text */ String, 
                    /* suggest */ js.Function1[/* suggestResults */ js.Array[SuggestResult], Unit], 
                    Unit
                  ]
                ]
        ): Self = StObject.set(x, "onInputChanged", value.asInstanceOf[js.Any])
        
        inline def setOnInputEntered(
          value: Event[
                  js.Function2[/* text */ String, /* disposition */ OnInputEnteredDisposition, Unit]
                ]
        ): Self = StObject.set(x, "onInputEntered", value.asInstanceOf[js.Any])
        
        inline def setOnInputStarted(value: Event[js.Function0[Unit]]): Self = StObject.set(x, "onInputStarted", value.asInstanceOf[js.Any])
        
        inline def setSetDefaultSuggestion(value: DefaultSuggestResult => Unit): Self = StObject.set(x, "setDefaultSuggestion", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * A suggest result.
      */
    trait SuggestResult extends StObject {
      
      /**
        * The text that is put into the URL bar, and that is sent to the extension when the user chooses this entry.
        */
      var content: String
      
      /**
        * Whether the suggest result can be deleted by the user.
        * Optional.
        */
      var deletable: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The text that is displayed in the URL dropdown. Can contain XML-style markup for styling.
        * The supported tags are 'url' (for a literal URL), 'match' (for highlighting text that matched what the user's query),
        * and 'dim' (for dim helper text). The styles can be nested, eg. <dim><match>dimmed match</match></dim>.
        * You must escape the five predefined entities to display them as text: stackoverflow.com/a/1091953/89484
        */
      var description: String
    }
    object SuggestResult {
      
      inline def apply(content: String, description: String): SuggestResult = {
        val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
        __obj.asInstanceOf[SuggestResult]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: SuggestResult] (val x: Self) extends AnyVal {
        
        inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        inline def setDeletable(value: Boolean): Self = StObject.set(x, "deletable", value.asInstanceOf[js.Any])
        
        inline def setDeletableUndefined: Self = StObject.set(x, "deletable", js.undefined)
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      }
    }
  }
}
