package typings.webextensionPolyfill

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespacesEventsMod {
  
  object Events {
    
    /**
      * An object which allows the addition and removal of listeners for a Chrome event.
      */
    trait Event[T /* <: js.Function1[/* repeated */ Any, Any] */] extends StObject {
      
      /**
        * Registers an event listener <em>callback</em> to an event.
        *
        * @param callback Called when an event occurs. The parameters of this function depend on the type of event.
        * @param ...params Further parameters, depending on the event.
        */
      def addListener(callback: T, params: Any*): Unit
      
      /**
        * @param callback Listener whose registration status shall be tested.
        * @returns True if <em>callback</em> is registered to the event.
        */
      def hasListener(callback: T): Boolean
      
      /**
        * @returns True if any event listeners are registered to the event.
        */
      def hasListeners(): Boolean
      
      /**
        * Deregisters an event listener <em>callback</em> from an event.
        *
        * @param callback Listener that shall be unregistered.
        */
      def removeListener(callback: T): Unit
    }
    object Event {
      
      inline def apply[T /* <: js.Function1[/* repeated */ Any, Any] */](
        addListener: (T, /* repeated */ Any) => Unit,
        hasListener: T => Boolean,
        hasListeners: () => Boolean,
        removeListener: T => Unit
      ): Event[T] = {
        val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), hasListener = js.Any.fromFunction1(hasListener), hasListeners = js.Any.fromFunction0(hasListeners), removeListener = js.Any.fromFunction1(removeListener))
        __obj.asInstanceOf[Event[T]]
      }
      
      extension [Self <: Event[?], T /* <: js.Function1[/* repeated */ Any, Any] */](x: Self & Event[T]) {
        
        inline def setAddListener(value: (T, /* repeated */ Any) => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
        
        inline def setHasListener(value: T => Boolean): Self = StObject.set(x, "hasListener", js.Any.fromFunction1(value))
        
        inline def setHasListeners(value: () => Boolean): Self = StObject.set(x, "hasListeners", js.Any.fromFunction0(value))
        
        inline def setRemoveListener(value: T => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * Description of a declarative rule for handling events.
      */
    trait Rule extends StObject {
      
      /**
        * List of actions that are triggered if one of the condtions is fulfilled.
        */
      var actions: js.Array[Any]
      
      /**
        * List of conditions that can trigger the actions.
        */
      var conditions: js.Array[Any]
      
      /**
        * Optional identifier that allows referencing this rule.
        * Optional.
        */
      var id: js.UndefOr[String] = js.undefined
      
      /**
        * Optional priority of this rule. Defaults to 100.
        * Optional.
        */
      var priority: js.UndefOr[Double] = js.undefined
      
      /**
        * Tags can be used to annotate rules and perform operations on sets of rules.
        * Optional.
        */
      var tags: js.UndefOr[js.Array[String]] = js.undefined
    }
    object Rule {
      
      inline def apply(actions: js.Array[Any], conditions: js.Array[Any]): Rule = {
        val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any])
        __obj.asInstanceOf[Rule]
      }
      
      extension [Self <: Rule](x: Self) {
        
        inline def setActions(value: js.Array[Any]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
        
        inline def setActionsVarargs(value: Any*): Self = StObject.set(x, "actions", js.Array(value*))
        
        inline def setConditions(value: js.Array[Any]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
        
        inline def setConditionsVarargs(value: Any*): Self = StObject.set(x, "conditions", js.Array(value*))
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
        
        inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
        
        inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
        
        inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
        
        inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
      }
    }
    
    type Static = StringDictionary[Any]
    
    /**
      * Filters URLs for various criteria. See <a href='events#filtered'>event filtering</a>. All criteria are case sensitive.
      */
    trait UrlFilter extends StObject {
      
      /**
        * Matches if the host name of the URL contains a specified string. To test whether a host name component has a prefix
        * 'foo', use hostContains: '.foo'. This matches 'www.foobar.com' and 'foo.com', because an implicit dot is added at the
        * beginning of the host name. Similarly, hostContains can be used to match against component suffix ('foo.')
        * and to exactly match against components ('.foo.'). Suffix- and exact-matching for the last components need to be done
        * separately using hostSuffix, because no implicit dot is added at the end of the host name.
        * Optional.
        */
      var hostContains: js.UndefOr[String] = js.undefined
      
      /**
        * Matches if the host name of the URL is equal to a specified string.
        * Optional.
        */
      var hostEquals: js.UndefOr[String] = js.undefined
      
      /**
        * Matches if the host name of the URL starts with a specified string.
        * Optional.
        */
      var hostPrefix: js.UndefOr[String] = js.undefined
      
      /**
        * Matches if the host name of the URL ends with a specified string.
        * Optional.
        */
      var hostSuffix: js.UndefOr[String] = js.undefined
      
      /**
        * Matches if the URL without query segment and fragment identifier matches a specified regular expression.
        * Port numbers are stripped from the URL if they match the default port number. The regular expressions use the <a
        * href="https://github.com/google/re2/blob/master/doc/syntax.txt">RE2 syntax</a>.
        * Optional.
        */
      var originAndPathMatches: js.UndefOr[String] = js.undefined
      
      /**
        * Matches if the path segment of the URL contains a specified string.
        * Optional.
        */
      var pathContains: js.UndefOr[String] = js.undefined
      
      /**
        * Matches if the path segment of the URL is equal to a specified string.
        * Optional.
        */
      var pathEquals: js.UndefOr[String] = js.undefined
      
      /**
        * Matches if the path segment of the URL starts with a specified string.
        * Optional.
        */
      var pathPrefix: js.UndefOr[String] = js.undefined
      
      /**
        * Matches if the path segment of the URL ends with a specified string.
        * Optional.
        */
      var pathSuffix: js.UndefOr[String] = js.undefined
      
      /**
        * Matches if the port of the URL is contained in any of the specified port lists. For example <code>[80, 443, [1000, 1200]]
        * </code> matches all requests on port 80, 443 and in the range 1000-1200.
        * Optional.
        */
      var ports: js.UndefOr[js.Array[Double | (js.Tuple2[Double, Double])]] = js.undefined
      
      /**
        * Matches if the query segment of the URL contains a specified string.
        * Optional.
        */
      var queryContains: js.UndefOr[String] = js.undefined
      
      /**
        * Matches if the query segment of the URL is equal to a specified string.
        * Optional.
        */
      var queryEquals: js.UndefOr[String] = js.undefined
      
      /**
        * Matches if the query segment of the URL starts with a specified string.
        * Optional.
        */
      var queryPrefix: js.UndefOr[String] = js.undefined
      
      /**
        * Matches if the query segment of the URL ends with a specified string.
        * Optional.
        */
      var querySuffix: js.UndefOr[String] = js.undefined
      
      /**
        * Matches if the scheme of the URL is equal to any of the schemes specified in the array.
        * Optional.
        */
      var schemes: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * Matches if the URL (without fragment identifier) contains a specified string. Port numbers are stripped from the URL if
        * they match the default port number.
        * Optional.
        */
      var urlContains: js.UndefOr[String] = js.undefined
      
      /**
        * Matches if the URL (without fragment identifier) is equal to a specified string. Port numbers are stripped from the URL
        * if they match the default port number.
        * Optional.
        */
      var urlEquals: js.UndefOr[String] = js.undefined
      
      /**
        * Matches if the URL (without fragment identifier) matches a specified regular expression.
        * Port numbers are stripped from the URL if they match the default port number. The regular expressions use the <a
        * href="https://github.com/google/re2/blob/master/doc/syntax.txt">RE2 syntax</a>.
        * Optional.
        */
      var urlMatches: js.UndefOr[String] = js.undefined
      
      /**
        * Matches if the URL (without fragment identifier) starts with a specified string. Port numbers are stripped from the URL
        * if they match the default port number.
        * Optional.
        */
      var urlPrefix: js.UndefOr[String] = js.undefined
      
      /**
        * Matches if the URL (without fragment identifier) ends with a specified string. Port numbers are stripped from the URL if
        * they match the default port number.
        * Optional.
        */
      var urlSuffix: js.UndefOr[String] = js.undefined
    }
    object UrlFilter {
      
      inline def apply(): UrlFilter = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UrlFilter]
      }
      
      extension [Self <: UrlFilter](x: Self) {
        
        inline def setHostContains(value: String): Self = StObject.set(x, "hostContains", value.asInstanceOf[js.Any])
        
        inline def setHostContainsUndefined: Self = StObject.set(x, "hostContains", js.undefined)
        
        inline def setHostEquals(value: String): Self = StObject.set(x, "hostEquals", value.asInstanceOf[js.Any])
        
        inline def setHostEqualsUndefined: Self = StObject.set(x, "hostEquals", js.undefined)
        
        inline def setHostPrefix(value: String): Self = StObject.set(x, "hostPrefix", value.asInstanceOf[js.Any])
        
        inline def setHostPrefixUndefined: Self = StObject.set(x, "hostPrefix", js.undefined)
        
        inline def setHostSuffix(value: String): Self = StObject.set(x, "hostSuffix", value.asInstanceOf[js.Any])
        
        inline def setHostSuffixUndefined: Self = StObject.set(x, "hostSuffix", js.undefined)
        
        inline def setOriginAndPathMatches(value: String): Self = StObject.set(x, "originAndPathMatches", value.asInstanceOf[js.Any])
        
        inline def setOriginAndPathMatchesUndefined: Self = StObject.set(x, "originAndPathMatches", js.undefined)
        
        inline def setPathContains(value: String): Self = StObject.set(x, "pathContains", value.asInstanceOf[js.Any])
        
        inline def setPathContainsUndefined: Self = StObject.set(x, "pathContains", js.undefined)
        
        inline def setPathEquals(value: String): Self = StObject.set(x, "pathEquals", value.asInstanceOf[js.Any])
        
        inline def setPathEqualsUndefined: Self = StObject.set(x, "pathEquals", js.undefined)
        
        inline def setPathPrefix(value: String): Self = StObject.set(x, "pathPrefix", value.asInstanceOf[js.Any])
        
        inline def setPathPrefixUndefined: Self = StObject.set(x, "pathPrefix", js.undefined)
        
        inline def setPathSuffix(value: String): Self = StObject.set(x, "pathSuffix", value.asInstanceOf[js.Any])
        
        inline def setPathSuffixUndefined: Self = StObject.set(x, "pathSuffix", js.undefined)
        
        inline def setPorts(value: js.Array[Double | (js.Tuple2[Double, Double])]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
        
        inline def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
        
        inline def setPortsVarargs(value: (Double | (js.Tuple2[Double, Double]))*): Self = StObject.set(x, "ports", js.Array(value*))
        
        inline def setQueryContains(value: String): Self = StObject.set(x, "queryContains", value.asInstanceOf[js.Any])
        
        inline def setQueryContainsUndefined: Self = StObject.set(x, "queryContains", js.undefined)
        
        inline def setQueryEquals(value: String): Self = StObject.set(x, "queryEquals", value.asInstanceOf[js.Any])
        
        inline def setQueryEqualsUndefined: Self = StObject.set(x, "queryEquals", js.undefined)
        
        inline def setQueryPrefix(value: String): Self = StObject.set(x, "queryPrefix", value.asInstanceOf[js.Any])
        
        inline def setQueryPrefixUndefined: Self = StObject.set(x, "queryPrefix", js.undefined)
        
        inline def setQuerySuffix(value: String): Self = StObject.set(x, "querySuffix", value.asInstanceOf[js.Any])
        
        inline def setQuerySuffixUndefined: Self = StObject.set(x, "querySuffix", js.undefined)
        
        inline def setSchemes(value: js.Array[String]): Self = StObject.set(x, "schemes", value.asInstanceOf[js.Any])
        
        inline def setSchemesUndefined: Self = StObject.set(x, "schemes", js.undefined)
        
        inline def setSchemesVarargs(value: String*): Self = StObject.set(x, "schemes", js.Array(value*))
        
        inline def setUrlContains(value: String): Self = StObject.set(x, "urlContains", value.asInstanceOf[js.Any])
        
        inline def setUrlContainsUndefined: Self = StObject.set(x, "urlContains", js.undefined)
        
        inline def setUrlEquals(value: String): Self = StObject.set(x, "urlEquals", value.asInstanceOf[js.Any])
        
        inline def setUrlEqualsUndefined: Self = StObject.set(x, "urlEquals", js.undefined)
        
        inline def setUrlMatches(value: String): Self = StObject.set(x, "urlMatches", value.asInstanceOf[js.Any])
        
        inline def setUrlMatchesUndefined: Self = StObject.set(x, "urlMatches", js.undefined)
        
        inline def setUrlPrefix(value: String): Self = StObject.set(x, "urlPrefix", value.asInstanceOf[js.Any])
        
        inline def setUrlPrefixUndefined: Self = StObject.set(x, "urlPrefix", js.undefined)
        
        inline def setUrlSuffix(value: String): Self = StObject.set(x, "urlSuffix", value.asInstanceOf[js.Any])
        
        inline def setUrlSuffixUndefined: Self = StObject.set(x, "urlSuffix", js.undefined)
      }
    }
  }
}
