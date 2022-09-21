package typings.strongholdPayJs.mod.global.Stronghold

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQuery
import typings.std.HTMLElement
import typings.strongholdPayJs.mod.global.Stronghold.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def HOST: /* "https://api.strongholdpay.com" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("HOST").asInstanceOf[/* "https://api.strongholdpay.com" */ String]

inline def Pay(options: ClientOptions): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("Pay")(options.asInstanceOf[js.Any]).asInstanceOf[Client]

inline def frameForSrc(src: String): JQuery[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("frameForSrc")(src.asInstanceOf[js.Any]).asInstanceOf[JQuery[HTMLElement]]

inline def getChargeQuery(): StringDictionary[js.UndefOr[String | Double | Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChargeQuery")().asInstanceOf[StringDictionary[js.UndefOr[String | Double | Boolean]]]
inline def getChargeQuery(charge: ChargeDropin): StringDictionary[js.UndefOr[String | Double | Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChargeQuery")(charge.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.UndefOr[String | Double | Boolean]]]

inline def getOptionQuery(options: Options): StringDictionary[js.UndefOr[String | Double | Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptionQuery")(options.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.UndefOr[String | Double | Boolean]]]

inline def getTipQuery(): StringDictionary[js.UndefOr[String | Double | Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTipQuery")().asInstanceOf[StringDictionary[js.UndefOr[String | Double | Boolean]]]
inline def getTipQuery(tip: TipDataDropin): StringDictionary[js.UndefOr[String | Double | Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTipQuery")(tip.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.UndefOr[String | Double | Boolean]]]
inline def getTipQuery(tip: TipDropin): StringDictionary[js.UndefOr[String | Double | Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTipQuery")(tip.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.UndefOr[String | Double | Boolean]]]

type AddPaymentSourceOnSuccess = js.Function1[/* paymentSource */ PaymentSource, Unit]

type ChargeOnSuccess = js.Function1[/* charge */ Charge, Unit]

type OnError = js.Function1[/* error */ StrongholdPayError, Unit]

type OnEvent = js.Function1[/* event */ StrongholdMessageEvent, Unit]

type OnExit = js.Function0[Unit]

type OnReady = js.Function0[Unit]

type TipOnSuccess = js.Function1[/* tip */ Tip, Unit]

type UpdatePaymentSourceOnSuccess = js.Function1[/* paymentSource */ PaymentSource, Unit]
