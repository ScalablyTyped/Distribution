package typings.tizenTvWebapis.mod

import typings.tizenTvWebapis.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def adinfo: AdInfoManager = ^.asInstanceOf[js.Dynamic].selectDynamic("adinfo").asInstanceOf[AdInfoManager]

inline def appcommon: AppCommonManager = ^.asInstanceOf[js.Dynamic].selectDynamic("appcommon").asInstanceOf[AppCommonManager]

inline def avinfo: AvInfoManager = ^.asInstanceOf[js.Dynamic].selectDynamic("avinfo").asInstanceOf[AvInfoManager]

inline def avplay: AVPlayManager = ^.asInstanceOf[js.Dynamic].selectDynamic("avplay").asInstanceOf[AVPlayManager]

inline def avplaystore: AVPlayStoreManager = ^.asInstanceOf[js.Dynamic].selectDynamic("avplaystore").asInstanceOf[AVPlayStoreManager]

inline def billing: BillingManager = ^.asInstanceOf[js.Dynamic].selectDynamic("billing").asInstanceOf[BillingManager]

inline def network: NetworkManager = ^.asInstanceOf[js.Dynamic].selectDynamic("network").asInstanceOf[NetworkManager]

inline def productinfo: ProductInfoManager = ^.asInstanceOf[js.Dynamic].selectDynamic("productinfo").asInstanceOf[ProductInfoManager]

inline def sso: SsoManager = ^.asInstanceOf[js.Dynamic].selectDynamic("sso").asInstanceOf[SsoManager]

inline def systeminfo: SystemInfoManager = ^.asInstanceOf[js.Dynamic].selectDynamic("systeminfo").asInstanceOf[SystemInfoManager]

inline def tvinfo: TvInfoManager = ^.asInstanceOf[js.Dynamic].selectDynamic("tvinfo").asInstanceOf[TvInfoManager]

inline def widgetdata: WidgetDataManager = ^.asInstanceOf[js.Dynamic].selectDynamic("widgetdata").asInstanceOf[WidgetDataManager]

type BillingApplyInvoiceCallback = js.Function1[/* data */ ApplyInvoiceData, Unit]

type BillingBuyDataSuccessCallback = js.Function1[/* data */ BillingBuyData, Unit]

type BillingCancelSubscriptionCallback = js.Function1[/* data */ CancelSubscriptionData, Unit]

type BillingGetServiceCountryAvailabilityCallback = js.Function1[/* data */ ServiceCountryAvailabilityData, Unit]

type BillingGetUserPurchaseListCallback = js.Function1[/* data */ UserPurchaseData, Unit]

type BillingIsServiceAvailableCallback = js.Function1[/* data */ ServiceAvailableData, Unit]

type BillingProductsListCallback = js.Function1[/* data */ ProductsListData, Unit]

type BillingShowPurchaseHistoryCallback = js.Function1[/* data */ ShowPurchaseHistoryData, Unit]

type BillingShowRegisterCreditCardCallback = js.Function1[/* data */ ShowRegisterCreditCardData, Unit]

type BillingShowRegisterPromotionalCodeCallback = js.Function1[/* data */ ShowRegisterPromotionalCodeData, Unit]

type BillingVerifyInvoiceCallback = js.Function1[/* data */ VerifyInvoiceData, Unit]

type ErrorCallback = js.Function1[/* error */ WebAPIError, Unit]

type NetworkStateChangedCallback = js.Function1[/* state */ NetworkState, Unit]

type ProductInfoConfigChangeCallback = js.Function1[/* key */ ProductInfoConfigKey, Unit]

type SsoCallDataSuccessCallback = js.Function1[/* data */ SsoCallData, Unit]

type SsoNumSuccessCallback = js.Function1[/* data */ Double, Unit]

type SsoStringSuccessCallback = js.Function1[/* data */ String, Unit]

type SuccessCallback = js.Function0[Unit]

type TvInfoCaptionChangeCallback = js.Function1[/* key */ TvInfoMenuKey, Unit]

type TvInfoChangeCallback = js.Function1[/* key */ TvInfoKey, Unit]
