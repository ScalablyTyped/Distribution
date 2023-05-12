package typings.twilio.libMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import typings.node.bufferMod.global.Buffer
import typings.std.Record
import typings.twilio.libBaseRequestClientMod.RequestClientOptions
import typings.twilio.libMod.^
import typings.twilio.libWebhooksWebhooksMod.Request
import typings.twilio.libWebhooksWebhooksMod.RequestValidatorOptions
import typings.twilio.libWebhooksWebhooksMod.WebhookOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def apply(): typings.twilio.libMod.Twilio = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.twilio.libMod.Twilio]
inline def apply(accountSid: String): typings.twilio.libMod.Twilio = ^.asInstanceOf[js.Dynamic].apply(accountSid.asInstanceOf[js.Any]).asInstanceOf[typings.twilio.libMod.Twilio]
inline def apply(accountSid: String, authToken: String): typings.twilio.libMod.Twilio = (^.asInstanceOf[js.Dynamic].apply(accountSid.asInstanceOf[js.Any], authToken.asInstanceOf[js.Any])).asInstanceOf[typings.twilio.libMod.Twilio]
inline def apply(accountSid: String, authToken: String, opts: typings.twilio.libBaseBaseTwilioMod.ClientOpts): typings.twilio.libMod.Twilio = (^.asInstanceOf[js.Dynamic].apply(accountSid.asInstanceOf[js.Any], authToken.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.twilio.libMod.Twilio]
inline def apply(accountSid: String, authToken: Unit, opts: typings.twilio.libBaseBaseTwilioMod.ClientOpts): typings.twilio.libMod.Twilio = (^.asInstanceOf[js.Dynamic].apply(accountSid.asInstanceOf[js.Any], authToken.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.twilio.libMod.Twilio]
inline def apply(accountSid: Unit, authToken: String): typings.twilio.libMod.Twilio = (^.asInstanceOf[js.Dynamic].apply(accountSid.asInstanceOf[js.Any], authToken.asInstanceOf[js.Any])).asInstanceOf[typings.twilio.libMod.Twilio]
inline def apply(accountSid: Unit, authToken: String, opts: typings.twilio.libBaseBaseTwilioMod.ClientOpts): typings.twilio.libMod.Twilio = (^.asInstanceOf[js.Dynamic].apply(accountSid.asInstanceOf[js.Any], authToken.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.twilio.libMod.Twilio]
inline def apply(accountSid: Unit, authToken: Unit, opts: typings.twilio.libBaseBaseTwilioMod.ClientOpts): typings.twilio.libMod.Twilio = (^.asInstanceOf[js.Dynamic].apply(accountSid.asInstanceOf[js.Any], authToken.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.twilio.libMod.Twilio]

inline def RequestClient: Instantiable1[
/* opts */ js.UndefOr[RequestClientOptions], 
typings.twilio.libBaseRequestClientMod.^] = ^.asInstanceOf[js.Dynamic].selectDynamic("RequestClient").asInstanceOf[Instantiable1[
/* opts */ js.UndefOr[RequestClientOptions], 
typings.twilio.libBaseRequestClientMod.^]]
type RequestClient = typings.twilio.libBaseRequestClientMod.^

inline def Twilio: Instantiable3[
/* username */ js.UndefOr[String], 
/* password */ js.UndefOr[String], 
/* opts */ js.UndefOr[typings.twilio.libBaseBaseTwilioMod.ClientOpts], 
typings.twilio.libRestTwilioMod.^] = ^.asInstanceOf[js.Dynamic].selectDynamic("Twilio").asInstanceOf[Instantiable3[
/* username */ js.UndefOr[String], 
/* password */ js.UndefOr[String], 
/* opts */ js.UndefOr[typings.twilio.libBaseBaseTwilioMod.ClientOpts], 
typings.twilio.libRestTwilioMod.^]]
type Twilio = typings.twilio.libRestTwilioMod.^

inline def getExpectedBodyHash: js.Function1[/* body */ String, String] = ^.asInstanceOf[js.Dynamic].selectDynamic("getExpectedBodyHash").asInstanceOf[js.Function1[/* body */ String, String]]
type getExpectedBodyHash = js.Function1[/* body */ String, String]

inline def getExpectedTwilioSignature: js.Function3[/* authToken */ String, /* url */ String, /* params */ Record[String, Any], String] = ^.asInstanceOf[js.Dynamic].selectDynamic("getExpectedTwilioSignature").asInstanceOf[js.Function3[/* authToken */ String, /* url */ String, /* params */ Record[String, Any], String]]
type getExpectedTwilioSignature = js.Function3[/* authToken */ String, /* url */ String, /* params */ Record[String, Any], String]

inline def validateBody: js.Function2[/* body */ String, /* bodyHash */ js.Array[Any] | String | Buffer, Boolean] = ^.asInstanceOf[js.Dynamic].selectDynamic("validateBody").asInstanceOf[js.Function2[/* body */ String, /* bodyHash */ js.Array[Any] | String | Buffer, Boolean]]
type validateBody = js.Function2[/* body */ String, /* bodyHash */ js.Array[Any] | String | Buffer, Boolean]

inline def validateExpressRequest: js.Function3[
/* request */ Request, 
/* authToken */ String, 
/* opts */ js.UndefOr[RequestValidatorOptions], 
Boolean] = ^.asInstanceOf[js.Dynamic].selectDynamic("validateExpressRequest").asInstanceOf[js.Function3[
/* request */ Request, 
/* authToken */ String, 
/* opts */ js.UndefOr[RequestValidatorOptions], 
Boolean]]
type validateExpressRequest = js.Function3[
/* request */ Request, 
/* authToken */ String, 
/* opts */ js.UndefOr[RequestValidatorOptions], 
Boolean]

inline def validateIncomingRequest: js.Function3[
/* request */ Request, 
/* authToken */ String, 
/* opts */ js.UndefOr[RequestValidatorOptions], 
Boolean] = ^.asInstanceOf[js.Dynamic].selectDynamic("validateIncomingRequest").asInstanceOf[js.Function3[
/* request */ Request, 
/* authToken */ String, 
/* opts */ js.UndefOr[RequestValidatorOptions], 
Boolean]]
type validateIncomingRequest = js.Function3[
/* request */ Request, 
/* authToken */ String, 
/* opts */ js.UndefOr[RequestValidatorOptions], 
Boolean]

inline def validateRequest: js.Function4[
/* authToken */ String, 
/* twilioHeader */ String, 
/* url */ String, 
/* params */ Record[String, Any], 
Boolean] = ^.asInstanceOf[js.Dynamic].selectDynamic("validateRequest").asInstanceOf[js.Function4[
/* authToken */ String, 
/* twilioHeader */ String, 
/* url */ String, 
/* params */ Record[String, Any], 
Boolean]]
type validateRequest = js.Function4[
/* authToken */ String, 
/* twilioHeader */ String, 
/* url */ String, 
/* params */ Record[String, Any], 
Boolean]

inline def validateRequestWithBody: js.Function4[
/* authToken */ String, 
/* twilioHeader */ String, 
/* url */ String, 
/* body */ String, 
Boolean] = ^.asInstanceOf[js.Dynamic].selectDynamic("validateRequestWithBody").asInstanceOf[js.Function4[
/* authToken */ String, 
/* twilioHeader */ String, 
/* url */ String, 
/* body */ String, 
Boolean]]
type validateRequestWithBody = js.Function4[
/* authToken */ String, 
/* twilioHeader */ String, 
/* url */ String, 
/* body */ String, 
Boolean]

inline def webhook: js.Function2[
/* opts */ js.UndefOr[String | WebhookOptions], 
/* authToken */ js.UndefOr[String | WebhookOptions], 
js.Function3[/* req */ Any, /* res */ Any, /* next */ Any, Unit]] = ^.asInstanceOf[js.Dynamic].selectDynamic("webhook").asInstanceOf[js.Function2[
/* opts */ js.UndefOr[String | WebhookOptions], 
/* authToken */ js.UndefOr[String | WebhookOptions], 
js.Function3[/* req */ Any, /* res */ Any, /* next */ Any, Unit]]]
type webhook = js.Function2[
/* opts */ js.UndefOr[String | WebhookOptions], 
/* authToken */ js.UndefOr[String | WebhookOptions], 
js.Function3[/* req */ Any, /* res */ Any, /* next */ Any, Unit]]

type ClientOpts = typings.twilio.libBaseBaseTwilioMod.ClientOpts
