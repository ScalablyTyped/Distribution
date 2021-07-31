package typings.strongholdPayJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def HOST: /* "https://api.strongholdpay.com" */ java.lang.String = typings.strongholdPayJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("HOST").asInstanceOf[/* "https://api.strongholdpay.com" */ java.lang.String]

@scala.inline
def Pay(options: typings.strongholdPayJs.mod.global.Stronghold.ClientOptions): typings.strongholdPayJs.mod.global.Stronghold.Client = typings.strongholdPayJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("Pay")(options.asInstanceOf[js.Any]).asInstanceOf[typings.strongholdPayJs.mod.global.Stronghold.Client]

@scala.inline
def frameForSrc(src: java.lang.String): typings.jquery.JQuery[typings.std.HTMLElement] = typings.strongholdPayJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("frameForSrc")(src.asInstanceOf[js.Any]).asInstanceOf[typings.jquery.JQuery[typings.std.HTMLElement]]

@scala.inline
def getChargeQuery(): org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Boolean]] = typings.strongholdPayJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getChargeQuery")().asInstanceOf[org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Boolean]]]
@scala.inline
def getChargeQuery(charge: typings.strongholdPayJs.mod.global.Stronghold.ChargeDropin): org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Boolean]] = typings.strongholdPayJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getChargeQuery")(charge.asInstanceOf[js.Any]).asInstanceOf[org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Boolean]]]

@scala.inline
def getOptionQuery(options: typings.strongholdPayJs.mod.global.Stronghold.Options): org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Boolean]] = typings.strongholdPayJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getOptionQuery")(options.asInstanceOf[js.Any]).asInstanceOf[org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Boolean]]]

@scala.inline
def getTipQuery(): org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Boolean]] = typings.strongholdPayJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getTipQuery")().asInstanceOf[org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Boolean]]]
@scala.inline
def getTipQuery(tip: typings.strongholdPayJs.mod.global.Stronghold.TipDataDropin): org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Boolean]] = typings.strongholdPayJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getTipQuery")(tip.asInstanceOf[js.Any]).asInstanceOf[org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Boolean]]]
@scala.inline
def getTipQuery(tip: typings.strongholdPayJs.mod.global.Stronghold.TipDropin): org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Boolean]] = typings.strongholdPayJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getTipQuery")(tip.asInstanceOf[js.Any]).asInstanceOf[org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Boolean]]]
