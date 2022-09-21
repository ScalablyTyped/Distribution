package typings.webextensionPolyfill

import org.scalablytyped.runtime.StringDictionary
import typings.webextensionPolyfill.eventsMod.Events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devtoolsNetworkMod {
  
  object DevtoolsNetwork {
    
    /**
      * A HAR log. See HAR specification for details.
      */
    type GetHARCallbackHarLogType = StringDictionary[Any]
    
    /**
      * Represents a network request for a document resource (script, image and so on). See HAR Specification for reference.
      */
    trait Request extends StObject {
      
      /**
        * Returns content of the response body.
        *
        * @returns A function that receives the response body when the request completes.
        */
      def getContent(): js.Promise[js.Tuple2[String, String]]
    }
    object Request {
      
      inline def apply(getContent: () => js.Promise[js.Tuple2[String, String]]): Request = {
        val __obj = js.Dynamic.literal(getContent = js.Any.fromFunction0(getContent))
        __obj.asInstanceOf[Request]
      }
      
      extension [Self <: Request](x: Self) {
        
        inline def setGetContent(value: () => js.Promise[js.Tuple2[String, String]]): Self = StObject.set(x, "getContent", js.Any.fromFunction0(value))
      }
    }
    
    trait Static extends StObject {
      
      /**
        * Returns HAR log that contains all known network requests.
        *
        * @returns A function that receives the HAR log when the request completes.
        */
      def getHAR(): js.Promise[GetHARCallbackHarLogType]
      
      /**
        * Fired when the inspected window navigates to a new page.
        *
        * @param url URL of the new page.
        */
      var onNavigated: Event[js.Function1[/* url */ String, Unit]]
      
      /**
        * Fired when a network request is finished and all request data are available.
        *
        * @param request Description of a network request in the form of a HAR entry. See HAR specification for details.
        */
      var onRequestFinished: Event[js.Function1[/* request */ Request, Unit]]
    }
    object Static {
      
      inline def apply(
        getHAR: () => js.Promise[GetHARCallbackHarLogType],
        onNavigated: Event[js.Function1[/* url */ String, Unit]],
        onRequestFinished: Event[js.Function1[/* request */ Request, Unit]]
      ): Static = {
        val __obj = js.Dynamic.literal(getHAR = js.Any.fromFunction0(getHAR), onNavigated = onNavigated.asInstanceOf[js.Any], onRequestFinished = onRequestFinished.asInstanceOf[js.Any])
        __obj.asInstanceOf[Static]
      }
      
      extension [Self <: Static](x: Self) {
        
        inline def setGetHAR(value: () => js.Promise[GetHARCallbackHarLogType]): Self = StObject.set(x, "getHAR", js.Any.fromFunction0(value))
        
        inline def setOnNavigated(value: Event[js.Function1[/* url */ String, Unit]]): Self = StObject.set(x, "onNavigated", value.asInstanceOf[js.Any])
        
        inline def setOnRequestFinished(value: Event[js.Function1[/* request */ Request, Unit]]): Self = StObject.set(x, "onRequestFinished", value.asInstanceOf[js.Any])
      }
    }
  }
}
