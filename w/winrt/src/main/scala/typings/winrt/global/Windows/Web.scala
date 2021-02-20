package typings.winrt.global.Windows

import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Security.Credentials.PasswordCredential
import typings.winrt.Windows.Web.Syndication.SyndicationErrorStatus
import typings.winrt.Windows.Web.Syndication.SyndicationTextType
import typings.winrt.Windows.Web.WebErrorStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Web {
  
  object AtomPub {
    
    @JSGlobal("Windows.Web.AtomPub.AtomPubClient")
    @js.native
    class AtomPubClient ()
      extends typings.winrt.Windows.Web.AtomPub.AtomPubClient {
      def this(serverCredential: PasswordCredential) = this()
    }
    
    @JSGlobal("Windows.Web.AtomPub.ResourceCollection")
    @js.native
    class ResourceCollection ()
      extends typings.winrt.Windows.Web.AtomPub.ResourceCollection
    
    @JSGlobal("Windows.Web.AtomPub.ServiceDocument")
    @js.native
    class ServiceDocument ()
      extends typings.winrt.Windows.Web.AtomPub.ServiceDocument
    
    @JSGlobal("Windows.Web.AtomPub.Workspace")
    @js.native
    class Workspace ()
      extends typings.winrt.Windows.Web.AtomPub.Workspace
  }
  
  object Syndication {
    
    @JSGlobal("Windows.Web.Syndication.SyndicationAttribute")
    @js.native
    class SyndicationAttribute ()
      extends typings.winrt.Windows.Web.Syndication.SyndicationAttribute {
      def this(attributeName: String, attributeNamespace: String, attributeValue: String) = this()
    }
    
    @JSGlobal("Windows.Web.Syndication.SyndicationCategory")
    @js.native
    class SyndicationCategory ()
      extends typings.winrt.Windows.Web.Syndication.SyndicationCategory {
      def this(term: String) = this()
      def this(term: String, scheme: String, label: String) = this()
    }
    
    @JSGlobal("Windows.Web.Syndication.SyndicationClient")
    @js.native
    class SyndicationClient ()
      extends typings.winrt.Windows.Web.Syndication.SyndicationClient {
      def this(serverCredential: PasswordCredential) = this()
    }
    
    @JSGlobal("Windows.Web.Syndication.SyndicationContent")
    @js.native
    class SyndicationContent ()
      extends typings.winrt.Windows.Web.Syndication.SyndicationContent {
      def this(sourceUri: Uri) = this()
      def this(text: String, `type`: SyndicationTextType) = this()
    }
    
    @JSGlobal("Windows.Web.Syndication.SyndicationError")
    @js.native
    class SyndicationError ()
      extends typings.winrt.Windows.Web.Syndication.SyndicationError
    /* static members */
    object SyndicationError {
      
      @JSGlobal("Windows.Web.Syndication.SyndicationError.getStatus")
      @js.native
      def getStatus(hresult: Double): SyndicationErrorStatus = js.native
    }
    
    @JSGlobal("Windows.Web.Syndication.SyndicationErrorStatus")
    @js.native
    object SyndicationErrorStatus extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.Web.Syndication.SyndicationErrorStatus with Double] = js.native
      
      /* 3 */ val invalidXml: typings.winrt.Windows.Web.Syndication.SyndicationErrorStatus.invalidXml with Double = js.native
      
      /* 2 */ val missingRequiredAttribute: typings.winrt.Windows.Web.Syndication.SyndicationErrorStatus.missingRequiredAttribute with Double = js.native
      
      /* 1 */ val missingRequiredElement: typings.winrt.Windows.Web.Syndication.SyndicationErrorStatus.missingRequiredElement with Double = js.native
      
      /* 4 */ val unexpectedContent: typings.winrt.Windows.Web.Syndication.SyndicationErrorStatus.unexpectedContent with Double = js.native
      
      /* 0 */ val unknown: typings.winrt.Windows.Web.Syndication.SyndicationErrorStatus.unknown with Double = js.native
      
      /* 5 */ val unsupportedFormat: typings.winrt.Windows.Web.Syndication.SyndicationErrorStatus.unsupportedFormat with Double = js.native
    }
    
    @JSGlobal("Windows.Web.Syndication.SyndicationFeed")
    @js.native
    class SyndicationFeed ()
      extends typings.winrt.Windows.Web.Syndication.SyndicationFeed {
      def this(title: String, subtitle: String, uri: Uri) = this()
    }
    
    @JSGlobal("Windows.Web.Syndication.SyndicationFormat")
    @js.native
    object SyndicationFormat extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.Web.Syndication.SyndicationFormat with Double] = js.native
      
      /* 5 */ val atom03: typings.winrt.Windows.Web.Syndication.SyndicationFormat.atom03 with Double = js.native
      
      /* 0 */ val atom10: typings.winrt.Windows.Web.Syndication.SyndicationFormat.atom10 with Double = js.native
      
      /* 4 */ val rss091: typings.winrt.Windows.Web.Syndication.SyndicationFormat.rss091 with Double = js.native
      
      /* 3 */ val rss092: typings.winrt.Windows.Web.Syndication.SyndicationFormat.rss092 with Double = js.native
      
      /* 2 */ val rss10: typings.winrt.Windows.Web.Syndication.SyndicationFormat.rss10 with Double = js.native
      
      /* 1 */ val rss20: typings.winrt.Windows.Web.Syndication.SyndicationFormat.rss20 with Double = js.native
    }
    
    @JSGlobal("Windows.Web.Syndication.SyndicationGenerator")
    @js.native
    class SyndicationGenerator ()
      extends typings.winrt.Windows.Web.Syndication.SyndicationGenerator {
      def this(text: String) = this()
    }
    
    @JSGlobal("Windows.Web.Syndication.SyndicationItem")
    @js.native
    class SyndicationItem ()
      extends typings.winrt.Windows.Web.Syndication.SyndicationItem {
      def this(title: String, content: typings.winrt.Windows.Web.Syndication.SyndicationContent, uri: Uri) = this()
    }
    
    @JSGlobal("Windows.Web.Syndication.SyndicationLink")
    @js.native
    class SyndicationLink ()
      extends typings.winrt.Windows.Web.Syndication.SyndicationLink {
      def this(uri: Uri) = this()
      def this(uri: Uri, relationship: String, title: String, mediaType: String, length: Double) = this()
    }
    
    @JSGlobal("Windows.Web.Syndication.SyndicationNode")
    @js.native
    class SyndicationNode ()
      extends typings.winrt.Windows.Web.Syndication.SyndicationNode {
      def this(nodeName: String, nodeNamespace: String, nodeValue: String) = this()
    }
    
    @JSGlobal("Windows.Web.Syndication.SyndicationPerson")
    @js.native
    class SyndicationPerson ()
      extends typings.winrt.Windows.Web.Syndication.SyndicationPerson {
      def this(name: String) = this()
      def this(name: String, email: String, uri: Uri) = this()
    }
    
    @JSGlobal("Windows.Web.Syndication.SyndicationText")
    @js.native
    class SyndicationText ()
      extends typings.winrt.Windows.Web.Syndication.SyndicationText {
      def this(text: String) = this()
      def this(text: String, `type`: SyndicationTextType) = this()
    }
    
    @JSGlobal("Windows.Web.Syndication.SyndicationTextType")
    @js.native
    object SyndicationTextType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.Web.Syndication.SyndicationTextType with Double] = js.native
      
      /* 1 */ val html: typings.winrt.Windows.Web.Syndication.SyndicationTextType.html with Double = js.native
      
      /* 0 */ val text: typings.winrt.Windows.Web.Syndication.SyndicationTextType.text with Double = js.native
      
      /* 2 */ val xhtml: typings.winrt.Windows.Web.Syndication.SyndicationTextType.xhtml with Double = js.native
    }
  }
  
  @JSGlobal("Windows.Web.WebError")
  @js.native
  class WebError ()
    extends typings.winrt.Windows.Web.WebError
  /* static members */
  object WebError {
    
    @JSGlobal("Windows.Web.WebError.getStatus")
    @js.native
    def getStatus(hresult: Double): WebErrorStatus = js.native
  }
  
  @JSGlobal("Windows.Web.WebErrorStatus")
  @js.native
  object WebErrorStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Web.WebErrorStatus with Double] = js.native
    
    /* 49 */ val badGateway: typings.winrt.Windows.Web.WebErrorStatus.badGateway with Double = js.native
    
    /* 29 */ val badRequest: typings.winrt.Windows.Web.WebErrorStatus.badRequest with Double = js.native
    
    /* 14 */ val cannotConnect: typings.winrt.Windows.Web.WebErrorStatus.cannotConnect with Double = js.native
    
    /* 1 */ val certificateCommonNameIsIncorrect: typings.winrt.Windows.Web.WebErrorStatus.certificateCommonNameIsIncorrect with Double = js.native
    
    /* 3 */ val certificateContainsErrors: typings.winrt.Windows.Web.WebErrorStatus.certificateContainsErrors with Double = js.native
    
    /* 2 */ val certificateExpired: typings.winrt.Windows.Web.WebErrorStatus.certificateExpired with Double = js.native
    
    /* 5 */ val certificateIsInvalid: typings.winrt.Windows.Web.WebErrorStatus.certificateIsInvalid with Double = js.native
    
    /* 4 */ val certificateRevoked: typings.winrt.Windows.Web.WebErrorStatus.certificateRevoked with Double = js.native
    
    /* 38 */ val conflict: typings.winrt.Windows.Web.WebErrorStatus.conflict with Double = js.native
    
    /* 9 */ val connectionAborted: typings.winrt.Windows.Web.WebErrorStatus.connectionAborted with Double = js.native
    
    /* 10 */ val connectionReset: typings.winrt.Windows.Web.WebErrorStatus.connectionReset with Double = js.native
    
    /* 11 */ val disconnected: typings.winrt.Windows.Web.WebErrorStatus.disconnected with Double = js.native
    
    /* 8 */ val errorHttpInvalidServerResponse: typings.winrt.Windows.Web.WebErrorStatus.errorHttpInvalidServerResponse with Double = js.native
    
    /* 46 */ val expectationFailed: typings.winrt.Windows.Web.WebErrorStatus.expectationFailed with Double = js.native
    
    /* 32 */ val forbidden: typings.winrt.Windows.Web.WebErrorStatus.forbidden with Double = js.native
    
    /* 24 */ val found: typings.winrt.Windows.Web.WebErrorStatus.found with Double = js.native
    
    /* 51 */ val gatewayTimeout: typings.winrt.Windows.Web.WebErrorStatus.gatewayTimeout with Double = js.native
    
    /* 39 */ val gone: typings.winrt.Windows.Web.WebErrorStatus.gone with Double = js.native
    
    /* 15 */ val hostNameNotResolved: typings.winrt.Windows.Web.WebErrorStatus.hostNameNotResolved with Double = js.native
    
    /* 12 */ val httpToHttpsOnRedirection: typings.winrt.Windows.Web.WebErrorStatus.httpToHttpsOnRedirection with Double = js.native
    
    /* 52 */ val httpVersionNotSupported: typings.winrt.Windows.Web.WebErrorStatus.httpVersionNotSupported with Double = js.native
    
    /* 13 */ val httpsToHttpOnRedirection: typings.winrt.Windows.Web.WebErrorStatus.httpsToHttpOnRedirection with Double = js.native
    
    /* 47 */ val internalServerError: typings.winrt.Windows.Web.WebErrorStatus.internalServerError with Double = js.native
    
    /* 40 */ val lengthRequired: typings.winrt.Windows.Web.WebErrorStatus.lengthRequired with Double = js.native
    
    /* 34 */ val methodNotAllowed: typings.winrt.Windows.Web.WebErrorStatus.methodNotAllowed with Double = js.native
    
    /* 23 */ val movedPermanently: typings.winrt.Windows.Web.WebErrorStatus.movedPermanently with Double = js.native
    
    /* 22 */ val multipleChoices: typings.winrt.Windows.Web.WebErrorStatus.multipleChoices with Double = js.native
    
    /* 35 */ val notAcceptable: typings.winrt.Windows.Web.WebErrorStatus.notAcceptable with Double = js.native
    
    /* 33 */ val notFound: typings.winrt.Windows.Web.WebErrorStatus.notFound with Double = js.native
    
    /* 48 */ val notImplemented: typings.winrt.Windows.Web.WebErrorStatus.notImplemented with Double = js.native
    
    /* 26 */ val notModified: typings.winrt.Windows.Web.WebErrorStatus.notModified with Double = js.native
    
    /* 16 */ val operationCanceled: typings.winrt.Windows.Web.WebErrorStatus.operationCanceled with Double = js.native
    
    /* 31 */ val paymentRequired: typings.winrt.Windows.Web.WebErrorStatus.paymentRequired with Double = js.native
    
    /* 41 */ val preconditionFailed: typings.winrt.Windows.Web.WebErrorStatus.preconditionFailed with Double = js.native
    
    /* 36 */ val proxyAuthenticationRequired: typings.winrt.Windows.Web.WebErrorStatus.proxyAuthenticationRequired with Double = js.native
    
    /* 17 */ val redirectFailed: typings.winrt.Windows.Web.WebErrorStatus.redirectFailed with Double = js.native
    
    /* 42 */ val requestEntityTooLarge: typings.winrt.Windows.Web.WebErrorStatus.requestEntityTooLarge with Double = js.native
    
    /* 37 */ val requestTimeout: typings.winrt.Windows.Web.WebErrorStatus.requestTimeout with Double = js.native
    
    /* 43 */ val requestUriTooLong: typings.winrt.Windows.Web.WebErrorStatus.requestUriTooLong with Double = js.native
    
    /* 45 */ val requestedRangeNotSatisfiable: typings.winrt.Windows.Web.WebErrorStatus.requestedRangeNotSatisfiable with Double = js.native
    
    /* 25 */ val seeOther: typings.winrt.Windows.Web.WebErrorStatus.seeOther with Double = js.native
    
    /* 6 */ val serverUnreachable: typings.winrt.Windows.Web.WebErrorStatus.serverUnreachable with Double = js.native
    
    /* 50 */ val serviceUnavailable: typings.winrt.Windows.Web.WebErrorStatus.serviceUnavailable with Double = js.native
    
    /* 28 */ val temporaryRedirect: typings.winrt.Windows.Web.WebErrorStatus.temporaryRedirect with Double = js.native
    
    /* 7 */ val timeout: typings.winrt.Windows.Web.WebErrorStatus.timeout with Double = js.native
    
    /* 30 */ val unauthorized: typings.winrt.Windows.Web.WebErrorStatus.unauthorized with Double = js.native
    
    /* 20 */ val unexpectedClientError: typings.winrt.Windows.Web.WebErrorStatus.unexpectedClientError with Double = js.native
    
    /* 19 */ val unexpectedRedirection: typings.winrt.Windows.Web.WebErrorStatus.unexpectedRedirection with Double = js.native
    
    /* 21 */ val unexpectedServerError: typings.winrt.Windows.Web.WebErrorStatus.unexpectedServerError with Double = js.native
    
    /* 18 */ val unexpectedStatusCode: typings.winrt.Windows.Web.WebErrorStatus.unexpectedStatusCode with Double = js.native
    
    /* 0 */ val unknown: typings.winrt.Windows.Web.WebErrorStatus.unknown with Double = js.native
    
    /* 44 */ val unsupportedMediaType: typings.winrt.Windows.Web.WebErrorStatus.unsupportedMediaType with Double = js.native
    
    /* 27 */ val useProxy: typings.winrt.Windows.Web.WebErrorStatus.useProxy with Double = js.native
  }
}
