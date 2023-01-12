package typings.twilio

import typings.node.http2Mod.IncomingHttpHeaders
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWebhooksWebhooksMod {
  
  @JSImport("twilio/lib/webhooks/webhooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getExpectedBodyHash(body: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getExpectedBodyHash")(body.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getExpectedTwilioSignature(authToken: String, url: String, params: Record[String, Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getExpectedTwilioSignature")(authToken.asInstanceOf[js.Any], url.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def validateExpressRequest(request: Request, authToken: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validateExpressRequest")(request.asInstanceOf[js.Any], authToken.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def validateExpressRequest(request: Request, authToken: String, opts: RequestValidatorOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validateExpressRequest")(request.asInstanceOf[js.Any], authToken.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def validateRequest(authToken: String, twilioHeader: String, url: String, params: Record[String, Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validateRequest")(authToken.asInstanceOf[js.Any], twilioHeader.asInstanceOf[js.Any], url.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def validateRequestWithBody(authToken: String, twilioHeader: String, requestUrl: String, body: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validateRequestWithBody")(authToken.asInstanceOf[js.Any], twilioHeader.asInstanceOf[js.Any], requestUrl.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def webhook(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("webhook")().asInstanceOf[Any]
  inline def webhook(authToken: String, opts: WebhookOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("webhook")(authToken.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def webhook(opts: WebhookOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("webhook")(opts.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def webhook(opts: WebhookOptions, authToken: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("webhook")(opts.asInstanceOf[js.Any], authToken.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  trait Request extends StObject {
    
    var body: Any
    
    def header(name: String): js.UndefOr[String]
    
    var headers: IncomingHttpHeaders
    
    var originalUrl: String
    
    var protocol: String
    
    var rawBody: js.UndefOr[Any] = js.undefined
  }
  object Request {
    
    inline def apply(
      body: Any,
      header: String => js.UndefOr[String],
      headers: IncomingHttpHeaders,
      originalUrl: String,
      protocol: String
    ): Request = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], header = js.Any.fromFunction1(header), headers = headers.asInstanceOf[js.Any], originalUrl = originalUrl.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeader(value: String => js.UndefOr[String]): Self = StObject.set(x, "header", js.Any.fromFunction1(value))
      
      inline def setHeaders(value: IncomingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setOriginalUrl(value: String): Self = StObject.set(x, "originalUrl", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setRawBody(value: Any): Self = StObject.set(x, "rawBody", value.asInstanceOf[js.Any])
      
      inline def setRawBodyUndefined: Self = StObject.set(x, "rawBody", js.undefined)
    }
  }
  
  trait RequestValidatorOptions extends StObject {
    
    /**
      * Manually specify the host name used by Twilio in a number's webhook config
      */
    var host: js.UndefOr[String] = js.undefined
    
    /**
      * Manually specify the protocol used by Twilio in a number's webhook config
      */
    var protocol: js.UndefOr[String] = js.undefined
    
    /**
      * The full URL (with query string) you used to configure the webhook with Twilio - overrides host/protocol options
      */
    var url: js.UndefOr[String] = js.undefined
  }
  object RequestValidatorOptions {
    
    inline def apply(): RequestValidatorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestValidatorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestValidatorOptions] (val x: Self) extends AnyVal {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait WebhookOptions extends StObject {
    
    /**
      * Manually specify the host name used by Twilio in a number's webhook config
      */
    var host: js.UndefOr[String] = js.undefined
    
    /**
      * Add helpers to the response object to improve support for XML (TwiML) rendering.  Default true.
      */
    var includeHelpers: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Manually specify the protocol used by Twilio in a number's webhook config
      */
    var protocol: js.UndefOr[String] = js.undefined
    
    /**
      * The full URL (with query string) you used to configure the webhook with Twilio - overrides host/protocol options
      */
    var url: js.UndefOr[String] = js.undefined
    
    /**
      * Whether or not the middleware should validate the request
      * came from Twilio.  Default true. If the request does not originate from
      * Twilio, we will return a text body and a 403.  If there is no configured
      * auth token and validate=true, this is an error condition, so we will return
      * a 500.
      */
    var validate: js.UndefOr[Boolean] = js.undefined
  }
  object WebhookOptions {
    
    inline def apply(): WebhookOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebhookOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebhookOptions] (val x: Self) extends AnyVal {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setIncludeHelpers(value: Boolean): Self = StObject.set(x, "includeHelpers", value.asInstanceOf[js.Any])
      
      inline def setIncludeHelpersUndefined: Self = StObject.set(x, "includeHelpers", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
}
