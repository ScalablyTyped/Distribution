package typings.strongholdPayJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQuery
import typings.std.HTMLElement
import typings.strongholdPayJs.mod.^
import typings.strongholdPayJs.mod.global.Stronghold.ChargeDropin
import typings.strongholdPayJs.mod.global.Stronghold.ClientOptions
import typings.strongholdPayJs.mod.global.Stronghold.Options
import typings.strongholdPayJs.mod.global.Stronghold.TipDataDropin
import typings.strongholdPayJs.mod.global.Stronghold.TipDropin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def HOST: /* "https://api.strongholdpay.com" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("HOST").asInstanceOf[/* "https://api.strongholdpay.com" */ String]

inline def Pay(options: ClientOptions): typings.strongholdPayJs.mod.global.Stronghold.Client = ^.asInstanceOf[js.Dynamic].applyDynamic("Pay")(options.asInstanceOf[js.Any]).asInstanceOf[typings.strongholdPayJs.mod.global.Stronghold.Client]

inline def frameForSrc(src: String): JQuery[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("frameForSrc")(src.asInstanceOf[js.Any]).asInstanceOf[JQuery[HTMLElement]]

inline def getChargeQuery(): StringDictionary[js.UndefOr[String | Double | Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChargeQuery")().asInstanceOf[StringDictionary[js.UndefOr[String | Double | Boolean]]]
inline def getChargeQuery(charge: ChargeDropin): StringDictionary[js.UndefOr[String | Double | Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChargeQuery")(charge.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.UndefOr[String | Double | Boolean]]]

inline def getOptionQuery(options: Options): StringDictionary[js.UndefOr[String | Double | Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptionQuery")(options.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.UndefOr[String | Double | Boolean]]]

inline def getTipQuery(): StringDictionary[js.UndefOr[String | Double | Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTipQuery")().asInstanceOf[StringDictionary[js.UndefOr[String | Double | Boolean]]]
inline def getTipQuery(tip: TipDataDropin): StringDictionary[js.UndefOr[String | Double | Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTipQuery")(tip.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.UndefOr[String | Double | Boolean]]]
inline def getTipQuery(tip: TipDropin): StringDictionary[js.UndefOr[String | Double | Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTipQuery")(tip.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[js.UndefOr[String | Double | Boolean]]]
