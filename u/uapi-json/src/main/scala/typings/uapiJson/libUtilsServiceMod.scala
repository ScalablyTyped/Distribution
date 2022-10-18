package typings.uapiJson

import typings.uapiJson.anon.CurrencyConvert
import typings.uapiJson.anon.From
import typings.uapiJson.libSettingsMod.Settings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsServiceMod {
  
  @JSImport("uapi-json/lib/UtilsService", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createUtilsService(settings: Settings): CurrencyConvert = ^.asInstanceOf[js.Dynamic].applyDynamic("createUtilsService")(settings.asInstanceOf[js.Any]).asInstanceOf[CurrencyConvert]
  
  trait CurrencyConvertParams extends StObject {
    
    var currencies: js.Array[From]
  }
  object CurrencyConvertParams {
    
    inline def apply(currencies: js.Array[From]): CurrencyConvertParams = {
      val __obj = js.Dynamic.literal(currencies = currencies.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurrencyConvertParams]
    }
    
    extension [Self <: CurrencyConvertParams](x: Self) {
      
      inline def setCurrencies(value: js.Array[From]): Self = StObject.set(x, "currencies", value.asInstanceOf[js.Any])
      
      inline def setCurrenciesVarargs(value: From*): Self = StObject.set(x, "currencies", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.uapiJson.uapiJsonStrings.AccountingReferenceType
    - typings.uapiJson.uapiJsonStrings.AccountingRemarkType
    - typings.uapiJson.uapiJsonStrings.Airport
    - typings.uapiJson.uapiJsonStrings.AirAndRailMiscType
    - typings.uapiJson.uapiJsonStrings.AirAndRailSupplierType
    - typings.uapiJson.uapiJsonStrings.BusinessType
    - typings.uapiJson.uapiJsonStrings.Carrier
    - typings.uapiJson.uapiJsonStrings.City
    - typings.uapiJson.uapiJsonStrings.CityAirport
    - typings.uapiJson.uapiJsonStrings.Country
    - typings.uapiJson.uapiJsonStrings.Currency
    - typings.uapiJson.uapiJsonStrings.EmailType
    - typings.uapiJson.uapiJsonStrings.Equipment
    - typings.uapiJson.uapiJsonStrings.FulfillmentType
    - typings.uapiJson.uapiJsonStrings.GeoPoliticalArea
    - typings.uapiJson.uapiJsonStrings.HotelAmenities
    - typings.uapiJson.uapiJsonStrings.HotelMealPlans
    - typings.uapiJson.uapiJsonStrings.HotelMiscType
    - typings.uapiJson.uapiJsonStrings.HotelRateCategory
    - typings.uapiJson.uapiJsonStrings.HotelRoomViewType
    - typings.uapiJson.uapiJsonStrings.HotelSupplierType
    - typings.uapiJson.uapiJsonStrings.HotelTaxType
    - typings.uapiJson.uapiJsonStrings.TRMLocation
    - typings.uapiJson.uapiJsonStrings.MerchandisingOfferType
    - typings.uapiJson.uapiJsonStrings.PassengerTypeCode
    - typings.uapiJson.uapiJsonStrings.PaymentFormatType
    - typings.uapiJson.uapiJsonStrings.PaymentType
    - typings.uapiJson.uapiJsonStrings.PosChannel
    - typings.uapiJson.uapiJsonStrings.PersonGenderType
    - typings.uapiJson.uapiJsonStrings.ReferencePointSearch
    - typings.uapiJson.uapiJsonStrings.ResourceCategoryType
    - typings.uapiJson.uapiJsonStrings.RoleCategoryType
    - typings.uapiJson.uapiJsonStrings.SsrType
    - typings.uapiJson.uapiJsonStrings.State
    - typings.uapiJson.uapiJsonStrings.StateProvince
    - typings.uapiJson.uapiJsonStrings.SupplierType
    - typings.uapiJson.uapiJsonStrings.TaxCategory
    - typings.uapiJson.uapiJsonStrings.Title
    - typings.uapiJson.uapiJsonStrings.VehicleMiscType
    - typings.uapiJson.uapiJsonStrings.VehicleSpecialEquipment
    - typings.uapiJson.uapiJsonStrings.VehicleSupplierType
  */
  trait DataType extends StObject
  object DataType {
    
    inline def AccountingReferenceType: typings.uapiJson.uapiJsonStrings.AccountingReferenceType = "AccountingReferenceType".asInstanceOf[typings.uapiJson.uapiJsonStrings.AccountingReferenceType]
    
    inline def AccountingRemarkType: typings.uapiJson.uapiJsonStrings.AccountingRemarkType = "AccountingRemarkType".asInstanceOf[typings.uapiJson.uapiJsonStrings.AccountingRemarkType]
    
    inline def AirAndRailMiscType: typings.uapiJson.uapiJsonStrings.AirAndRailMiscType = "AirAndRailMiscType".asInstanceOf[typings.uapiJson.uapiJsonStrings.AirAndRailMiscType]
    
    inline def AirAndRailSupplierType: typings.uapiJson.uapiJsonStrings.AirAndRailSupplierType = "AirAndRailSupplierType".asInstanceOf[typings.uapiJson.uapiJsonStrings.AirAndRailSupplierType]
    
    inline def Airport: typings.uapiJson.uapiJsonStrings.Airport = "Airport".asInstanceOf[typings.uapiJson.uapiJsonStrings.Airport]
    
    inline def BusinessType: typings.uapiJson.uapiJsonStrings.BusinessType = "BusinessType".asInstanceOf[typings.uapiJson.uapiJsonStrings.BusinessType]
    
    inline def Carrier: typings.uapiJson.uapiJsonStrings.Carrier = "Carrier".asInstanceOf[typings.uapiJson.uapiJsonStrings.Carrier]
    
    inline def City: typings.uapiJson.uapiJsonStrings.City = "City".asInstanceOf[typings.uapiJson.uapiJsonStrings.City]
    
    inline def CityAirport: typings.uapiJson.uapiJsonStrings.CityAirport = "CityAirport".asInstanceOf[typings.uapiJson.uapiJsonStrings.CityAirport]
    
    inline def Country: typings.uapiJson.uapiJsonStrings.Country = "Country".asInstanceOf[typings.uapiJson.uapiJsonStrings.Country]
    
    inline def Currency: typings.uapiJson.uapiJsonStrings.Currency = "Currency".asInstanceOf[typings.uapiJson.uapiJsonStrings.Currency]
    
    inline def EmailType: typings.uapiJson.uapiJsonStrings.EmailType = "EmailType".asInstanceOf[typings.uapiJson.uapiJsonStrings.EmailType]
    
    inline def Equipment: typings.uapiJson.uapiJsonStrings.Equipment = "Equipment".asInstanceOf[typings.uapiJson.uapiJsonStrings.Equipment]
    
    inline def FulfillmentType: typings.uapiJson.uapiJsonStrings.FulfillmentType = "FulfillmentType".asInstanceOf[typings.uapiJson.uapiJsonStrings.FulfillmentType]
    
    inline def GeoPoliticalArea: typings.uapiJson.uapiJsonStrings.GeoPoliticalArea = "GeoPoliticalArea".asInstanceOf[typings.uapiJson.uapiJsonStrings.GeoPoliticalArea]
    
    inline def HotelAmenities: typings.uapiJson.uapiJsonStrings.HotelAmenities = "HotelAmenities".asInstanceOf[typings.uapiJson.uapiJsonStrings.HotelAmenities]
    
    inline def HotelMealPlans: typings.uapiJson.uapiJsonStrings.HotelMealPlans = "HotelMealPlans".asInstanceOf[typings.uapiJson.uapiJsonStrings.HotelMealPlans]
    
    inline def HotelMiscType: typings.uapiJson.uapiJsonStrings.HotelMiscType = "HotelMiscType".asInstanceOf[typings.uapiJson.uapiJsonStrings.HotelMiscType]
    
    inline def HotelRateCategory: typings.uapiJson.uapiJsonStrings.HotelRateCategory = "HotelRateCategory".asInstanceOf[typings.uapiJson.uapiJsonStrings.HotelRateCategory]
    
    inline def HotelRoomViewType: typings.uapiJson.uapiJsonStrings.HotelRoomViewType = "HotelRoomViewType".asInstanceOf[typings.uapiJson.uapiJsonStrings.HotelRoomViewType]
    
    inline def HotelSupplierType: typings.uapiJson.uapiJsonStrings.HotelSupplierType = "HotelSupplierType".asInstanceOf[typings.uapiJson.uapiJsonStrings.HotelSupplierType]
    
    inline def HotelTaxType: typings.uapiJson.uapiJsonStrings.HotelTaxType = "HotelTaxType".asInstanceOf[typings.uapiJson.uapiJsonStrings.HotelTaxType]
    
    inline def MerchandisingOfferType: typings.uapiJson.uapiJsonStrings.MerchandisingOfferType = "MerchandisingOfferType".asInstanceOf[typings.uapiJson.uapiJsonStrings.MerchandisingOfferType]
    
    inline def PassengerTypeCode: typings.uapiJson.uapiJsonStrings.PassengerTypeCode = "PassengerTypeCode".asInstanceOf[typings.uapiJson.uapiJsonStrings.PassengerTypeCode]
    
    inline def PaymentFormatType: typings.uapiJson.uapiJsonStrings.PaymentFormatType = "PaymentFormatType".asInstanceOf[typings.uapiJson.uapiJsonStrings.PaymentFormatType]
    
    inline def PaymentType: typings.uapiJson.uapiJsonStrings.PaymentType = "PaymentType".asInstanceOf[typings.uapiJson.uapiJsonStrings.PaymentType]
    
    inline def PersonGenderType: typings.uapiJson.uapiJsonStrings.PersonGenderType = "PersonGenderType".asInstanceOf[typings.uapiJson.uapiJsonStrings.PersonGenderType]
    
    inline def PosChannel: typings.uapiJson.uapiJsonStrings.PosChannel = "PosChannel".asInstanceOf[typings.uapiJson.uapiJsonStrings.PosChannel]
    
    inline def ReferencePointSearch: typings.uapiJson.uapiJsonStrings.ReferencePointSearch = "ReferencePointSearch".asInstanceOf[typings.uapiJson.uapiJsonStrings.ReferencePointSearch]
    
    inline def ResourceCategoryType: typings.uapiJson.uapiJsonStrings.ResourceCategoryType = "ResourceCategoryType".asInstanceOf[typings.uapiJson.uapiJsonStrings.ResourceCategoryType]
    
    inline def RoleCategoryType: typings.uapiJson.uapiJsonStrings.RoleCategoryType = "RoleCategoryType".asInstanceOf[typings.uapiJson.uapiJsonStrings.RoleCategoryType]
    
    inline def SsrType: typings.uapiJson.uapiJsonStrings.SsrType = "SsrType".asInstanceOf[typings.uapiJson.uapiJsonStrings.SsrType]
    
    inline def State: typings.uapiJson.uapiJsonStrings.State = "State".asInstanceOf[typings.uapiJson.uapiJsonStrings.State]
    
    inline def StateProvince: typings.uapiJson.uapiJsonStrings.StateProvince = "StateProvince".asInstanceOf[typings.uapiJson.uapiJsonStrings.StateProvince]
    
    inline def SupplierType: typings.uapiJson.uapiJsonStrings.SupplierType = "SupplierType".asInstanceOf[typings.uapiJson.uapiJsonStrings.SupplierType]
    
    inline def TRMLocation: typings.uapiJson.uapiJsonStrings.TRMLocation = "TRMLocation".asInstanceOf[typings.uapiJson.uapiJsonStrings.TRMLocation]
    
    inline def TaxCategory: typings.uapiJson.uapiJsonStrings.TaxCategory = "TaxCategory".asInstanceOf[typings.uapiJson.uapiJsonStrings.TaxCategory]
    
    inline def Title: typings.uapiJson.uapiJsonStrings.Title = "Title".asInstanceOf[typings.uapiJson.uapiJsonStrings.Title]
    
    inline def VehicleMiscType: typings.uapiJson.uapiJsonStrings.VehicleMiscType = "VehicleMiscType".asInstanceOf[typings.uapiJson.uapiJsonStrings.VehicleMiscType]
    
    inline def VehicleSpecialEquipment: typings.uapiJson.uapiJsonStrings.VehicleSpecialEquipment = "VehicleSpecialEquipment".asInstanceOf[typings.uapiJson.uapiJsonStrings.VehicleSpecialEquipment]
    
    inline def VehicleSupplierType: typings.uapiJson.uapiJsonStrings.VehicleSupplierType = "VehicleSupplierType".asInstanceOf[typings.uapiJson.uapiJsonStrings.VehicleSupplierType]
  }
  
  trait ReferenceDataParams extends StObject {
    
    var TraceId: String
    
    var dataType: DataType
  }
  object ReferenceDataParams {
    
    inline def apply(TraceId: String, dataType: DataType): ReferenceDataParams = {
      val __obj = js.Dynamic.literal(TraceId = TraceId.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReferenceDataParams]
    }
    
    extension [Self <: ReferenceDataParams](x: Self) {
      
      inline def setDataType(value: DataType): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      inline def setTraceId(value: String): Self = StObject.set(x, "TraceId", value.asInstanceOf[js.Any])
    }
  }
}
