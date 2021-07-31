package typings.strongholdPayJs.mod.global.Stronghold

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def HOST: /* "https://api.strongholdpay.com" */ java.lang.String = typings.strongholdPayJs.mod.global.Stronghold.^.asInstanceOf[js.Dynamic].selectDynamic("HOST").asInstanceOf[/* "https://api.strongholdpay.com" */ java.lang.String]

@scala.inline
def Pay(options: typings.strongholdPayJs.mod.global.Stronghold.ClientOptions): typings.strongholdPayJs.mod.global.Stronghold.Client = typings.strongholdPayJs.mod.global.Stronghold.^.asInstanceOf[js.Dynamic].applyDynamic("Pay")(options.asInstanceOf[js.Any]).asInstanceOf[typings.strongholdPayJs.mod.global.Stronghold.Client]

@scala.inline
def frameForSrc(src: java.lang.String): typings.jquery.JQuery[typings.std.HTMLElement] = typings.strongholdPayJs.mod.global.Stronghold.^.asInstanceOf[js.Dynamic].applyDynamic("frameForSrc")(src.asInstanceOf[js.Any]).asInstanceOf[typings.jquery.JQuery[typings.std.HTMLElement]]

@scala.inline
def getChargeQuery(): org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Boolean]] = typings.strongholdPayJs.mod.global.Stronghold.^.asInstanceOf[js.Dynamic].applyDynamic("getChargeQuery")().asInstanceOf[org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Boolean]]]
@scala.inline
def getChargeQuery(charge: typings.strongholdPayJs.mod.global.Stronghold.ChargeDropin): org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Boolean]] = typings.strongholdPayJs.mod.global.Stronghold.^.asInstanceOf[js.Dynamic].applyDynamic("getChargeQuery")(charge.asInstanceOf[js.Any]).asInstanceOf[org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Boolean]]]

@scala.inline
def getOptionQuery(options: typings.strongholdPayJs.mod.global.Stronghold.Options): org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Boolean]] = typings.strongholdPayJs.mod.global.Stronghold.^.asInstanceOf[js.Dynamic].applyDynamic("getOptionQuery")(options.asInstanceOf[js.Any]).asInstanceOf[org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Boolean]]]

@scala.inline
def getTipQuery(): org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Boolean]] = typings.strongholdPayJs.mod.global.Stronghold.^.asInstanceOf[js.Dynamic].applyDynamic("getTipQuery")().asInstanceOf[org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Boolean]]]
@scala.inline
def getTipQuery(tip: typings.strongholdPayJs.mod.global.Stronghold.TipDataDropin): org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Boolean]] = typings.strongholdPayJs.mod.global.Stronghold.^.asInstanceOf[js.Dynamic].applyDynamic("getTipQuery")(tip.asInstanceOf[js.Any]).asInstanceOf[org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Boolean]]]
@scala.inline
def getTipQuery(tip: typings.strongholdPayJs.mod.global.Stronghold.TipDropin): org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Boolean]] = typings.strongholdPayJs.mod.global.Stronghold.^.asInstanceOf[js.Dynamic].applyDynamic("getTipQuery")(tip.asInstanceOf[js.Any]).asInstanceOf[org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Boolean]]]

type AddPaymentSourceOnSuccess = js.Function1[
/* paymentSource */ typings.strongholdPayJs.mod.global.Stronghold.PaymentSource, 
scala.Unit]

type ChargeOnSuccess = js.Function1[/* charge */ typings.strongholdPayJs.mod.global.Stronghold.Charge, scala.Unit]

type OnError = js.Function1[
/* error */ typings.strongholdPayJs.mod.global.Stronghold.StrongholdPayError, 
scala.Unit]

type OnEvent = js.Function1[
/* event */ typings.strongholdPayJs.mod.global.Stronghold.StrongholdMessageEvent, 
scala.Unit]

type OnExit = js.Function0[scala.Unit]

type OnReady = js.Function0[scala.Unit]

type TipOnSuccess = js.Function1[/* tip */ typings.strongholdPayJs.mod.global.Stronghold.Tip, scala.Unit]

type UpdatePaymentSourceOnSuccess = js.Function1[
/* paymentSource */ typings.strongholdPayJs.mod.global.Stronghold.PaymentSource, 
scala.Unit]
