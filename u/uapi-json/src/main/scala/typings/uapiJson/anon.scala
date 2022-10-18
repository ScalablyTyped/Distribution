package typings.uapiJson

import typings.uapiJson.libAirMod.AddSegmentsParams
import typings.uapiJson.libAirMod.BookParams
import typings.uapiJson.libAirMod.CancelBookingParams
import typings.uapiJson.libAirMod.CancelTicketParams
import typings.uapiJson.libAirMod.FareRulesParams
import typings.uapiJson.libAirMod.FlightInfoParams
import typings.uapiJson.libAirMod.GetBookingParams
import typings.uapiJson.libAirMod.GetEMDItemParams
import typings.uapiJson.libAirMod.GetEMDListParams
import typings.uapiJson.libAirMod.GetTicketParams
import typings.uapiJson.libAirMod.GetTicketsParams
import typings.uapiJson.libAirMod.GetUniversalRecordByPNRParams
import typings.uapiJson.libAirMod.GetUniversalRecordParams
import typings.uapiJson.libAirMod.SearchBookingsByPassengerNameParams
import typings.uapiJson.libAirMod.ShopParams
import typings.uapiJson.libAirMod.TicketParams
import typings.uapiJson.libAirMod.ToQueueParams
import typings.uapiJson.libHotelsServiceMod.CancelBookParams
import typings.uapiJson.libHotelsServiceMod.RatesParams
import typings.uapiJson.libHotelsServiceMod.SearchParams
import typings.uapiJson.libUtilsServiceMod.CurrencyConvertParams
import typings.uapiJson.libUtilsServiceMod.ReferenceDataParams
import typings.uapiJson.uapiJsonBooleans.`true`
import typings.uapiJson.uapiJsonStrings.Cash
import typings.uapiJson.uapiJsonStrings.Z
import typings.uapiJson.uapiJsonStrings.ZA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var `type`: Cash
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("Cash")
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setType(value: Cash): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait AddSegments extends StObject {
    
    def addSegments(params: AddSegmentsParams): js.Promise[Any]
    
    def availability(params: ShopParams): js.Promise[Any]
    
    def book(params: BookParams): js.Promise[Any]
    
    def cancelBooking(params: CancelBookingParams): js.Promise[Any]
    
    def cancelTicket(params: CancelTicketParams): js.Promise[Any]
    
    def fareRules(params: FareRulesParams): js.Promise[Any]
    
    def flightInfo(params: FlightInfoParams): js.Promise[Any]
    
    def getBooking(params: GetBookingParams): js.Promise[Any]
    
    def getEMDItem(params: GetEMDItemParams): js.Promise[Any]
    
    def getEMDList(params: GetEMDListParams): js.Promise[Any]
    
    def getTicket(params: GetTicketParams): js.Promise[Any]
    
    def getTickets(params: GetTicketsParams): js.Promise[Any]
    
    def getUniversalRecord(params: GetUniversalRecordParams): js.Promise[Any]
    
    def getUniversalRecordByPNR(params: GetUniversalRecordByPNRParams): js.Promise[Any]
    
    def importPNR(): js.Promise[Any]
    
    def retrieveShop(params: ShopParams): js.Promise[Any]
    
    def searchBookingsByPassengerName(params: SearchBookingsByPassengerNameParams): js.Promise[Data]
    
    def shop(params: ShopParams): js.Promise[Any]
    
    def ticket(params: TicketParams): js.Promise[Any]
    
    def toQueue(params: ToQueueParams): js.Promise[`true` | js.Error]
  }
  object AddSegments {
    
    inline def apply(
      addSegments: AddSegmentsParams => js.Promise[Any],
      availability: ShopParams => js.Promise[Any],
      book: BookParams => js.Promise[Any],
      cancelBooking: CancelBookingParams => js.Promise[Any],
      cancelTicket: CancelTicketParams => js.Promise[Any],
      fareRules: FareRulesParams => js.Promise[Any],
      flightInfo: FlightInfoParams => js.Promise[Any],
      getBooking: GetBookingParams => js.Promise[Any],
      getEMDItem: GetEMDItemParams => js.Promise[Any],
      getEMDList: GetEMDListParams => js.Promise[Any],
      getTicket: GetTicketParams => js.Promise[Any],
      getTickets: GetTicketsParams => js.Promise[Any],
      getUniversalRecord: GetUniversalRecordParams => js.Promise[Any],
      getUniversalRecordByPNR: GetUniversalRecordByPNRParams => js.Promise[Any],
      importPNR: () => js.Promise[Any],
      retrieveShop: ShopParams => js.Promise[Any],
      searchBookingsByPassengerName: SearchBookingsByPassengerNameParams => js.Promise[Data],
      shop: ShopParams => js.Promise[Any],
      ticket: TicketParams => js.Promise[Any],
      toQueue: ToQueueParams => js.Promise[`true` | js.Error]
    ): AddSegments = {
      val __obj = js.Dynamic.literal(addSegments = js.Any.fromFunction1(addSegments), availability = js.Any.fromFunction1(availability), book = js.Any.fromFunction1(book), cancelBooking = js.Any.fromFunction1(cancelBooking), cancelTicket = js.Any.fromFunction1(cancelTicket), fareRules = js.Any.fromFunction1(fareRules), flightInfo = js.Any.fromFunction1(flightInfo), getBooking = js.Any.fromFunction1(getBooking), getEMDItem = js.Any.fromFunction1(getEMDItem), getEMDList = js.Any.fromFunction1(getEMDList), getTicket = js.Any.fromFunction1(getTicket), getTickets = js.Any.fromFunction1(getTickets), getUniversalRecord = js.Any.fromFunction1(getUniversalRecord), getUniversalRecordByPNR = js.Any.fromFunction1(getUniversalRecordByPNR), importPNR = js.Any.fromFunction0(importPNR), retrieveShop = js.Any.fromFunction1(retrieveShop), searchBookingsByPassengerName = js.Any.fromFunction1(searchBookingsByPassengerName), shop = js.Any.fromFunction1(shop), ticket = js.Any.fromFunction1(ticket), toQueue = js.Any.fromFunction1(toQueue))
      __obj.asInstanceOf[AddSegments]
    }
    
    extension [Self <: AddSegments](x: Self) {
      
      inline def setAddSegments(value: AddSegmentsParams => js.Promise[Any]): Self = StObject.set(x, "addSegments", js.Any.fromFunction1(value))
      
      inline def setAvailability(value: ShopParams => js.Promise[Any]): Self = StObject.set(x, "availability", js.Any.fromFunction1(value))
      
      inline def setBook(value: BookParams => js.Promise[Any]): Self = StObject.set(x, "book", js.Any.fromFunction1(value))
      
      inline def setCancelBooking(value: CancelBookingParams => js.Promise[Any]): Self = StObject.set(x, "cancelBooking", js.Any.fromFunction1(value))
      
      inline def setCancelTicket(value: CancelTicketParams => js.Promise[Any]): Self = StObject.set(x, "cancelTicket", js.Any.fromFunction1(value))
      
      inline def setFareRules(value: FareRulesParams => js.Promise[Any]): Self = StObject.set(x, "fareRules", js.Any.fromFunction1(value))
      
      inline def setFlightInfo(value: FlightInfoParams => js.Promise[Any]): Self = StObject.set(x, "flightInfo", js.Any.fromFunction1(value))
      
      inline def setGetBooking(value: GetBookingParams => js.Promise[Any]): Self = StObject.set(x, "getBooking", js.Any.fromFunction1(value))
      
      inline def setGetEMDItem(value: GetEMDItemParams => js.Promise[Any]): Self = StObject.set(x, "getEMDItem", js.Any.fromFunction1(value))
      
      inline def setGetEMDList(value: GetEMDListParams => js.Promise[Any]): Self = StObject.set(x, "getEMDList", js.Any.fromFunction1(value))
      
      inline def setGetTicket(value: GetTicketParams => js.Promise[Any]): Self = StObject.set(x, "getTicket", js.Any.fromFunction1(value))
      
      inline def setGetTickets(value: GetTicketsParams => js.Promise[Any]): Self = StObject.set(x, "getTickets", js.Any.fromFunction1(value))
      
      inline def setGetUniversalRecord(value: GetUniversalRecordParams => js.Promise[Any]): Self = StObject.set(x, "getUniversalRecord", js.Any.fromFunction1(value))
      
      inline def setGetUniversalRecordByPNR(value: GetUniversalRecordByPNRParams => js.Promise[Any]): Self = StObject.set(x, "getUniversalRecordByPNR", js.Any.fromFunction1(value))
      
      inline def setImportPNR(value: () => js.Promise[Any]): Self = StObject.set(x, "importPNR", js.Any.fromFunction0(value))
      
      inline def setRetrieveShop(value: ShopParams => js.Promise[Any]): Self = StObject.set(x, "retrieveShop", js.Any.fromFunction1(value))
      
      inline def setSearchBookingsByPassengerName(value: SearchBookingsByPassengerNameParams => js.Promise[Data]): Self = StObject.set(x, "searchBookingsByPassengerName", js.Any.fromFunction1(value))
      
      inline def setShop(value: ShopParams => js.Promise[Any]): Self = StObject.set(x, "shop", js.Any.fromFunction1(value))
      
      inline def setTicket(value: TicketParams => js.Promise[Any]): Self = StObject.set(x, "ticket", js.Any.fromFunction1(value))
      
      inline def setToQueue(value: ToQueueParams => js.Promise[`true` | js.Error]): Self = StObject.set(x, "toQueue", js.Any.fromFunction1(value))
    }
  }
  
  trait Age extends StObject {
    
    var age: Double
    
    var key: Double
  }
  object Age {
    
    inline def apply(age: Double, key: Double): Age = {
      val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Age]
    }
    
    extension [Self <: Age](x: Self) {
      
      inline def setAge(value: Double): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
      
      inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait Book extends StObject {
    
    def book(params: typings.uapiJson.libHotelsServiceMod.BookParams): js.Promise[Any]
    
    def cancelBook(params: CancelBookParams): js.Promise[Any]
    
    def rates(params: RatesParams): js.Promise[Any]
    
    def search(params: SearchParams): js.Promise[Any]
  }
  object Book {
    
    inline def apply(
      book: typings.uapiJson.libHotelsServiceMod.BookParams => js.Promise[Any],
      cancelBook: CancelBookParams => js.Promise[Any],
      rates: RatesParams => js.Promise[Any],
      search: SearchParams => js.Promise[Any]
    ): Book = {
      val __obj = js.Dynamic.literal(book = js.Any.fromFunction1(book), cancelBook = js.Any.fromFunction1(cancelBook), rates = js.Any.fromFunction1(rates), search = js.Any.fromFunction1(search))
      __obj.asInstanceOf[Book]
    }
    
    extension [Self <: Book](x: Self) {
      
      inline def setBook(value: typings.uapiJson.libHotelsServiceMod.BookParams => js.Promise[Any]): Self = StObject.set(x, "book", js.Any.fromFunction1(value))
      
      inline def setCancelBook(value: CancelBookParams => js.Promise[Any]): Self = StObject.set(x, "cancelBook", js.Any.fromFunction1(value))
      
      inline def setRates(value: RatesParams => js.Promise[Any]): Self = StObject.set(x, "rates", js.Any.fromFunction1(value))
      
      inline def setSearch(value: SearchParams => js.Promise[Any]): Self = StObject.set(x, "search", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait CloseSession extends StObject {
    
    def closeSession(): js.Promise[Boolean] = js.native
    
    def executeCommand(rawCommand: String): js.Promise[String] = js.native
    def executeCommand(rawCommand: String, stopMD: js.Function1[/* screens */ Any, Boolean]): js.Promise[String] = js.native
    
    def getToken(): js.Promise[String] = js.native
  }
  
  trait CurrencyConvert extends StObject {
    
    def currencyConvert(params: CurrencyConvertParams): js.Promise[Any]
    
    def referenceData(params: ReferenceDataParams): js.Promise[Any]
  }
  object CurrencyConvert {
    
    inline def apply(
      currencyConvert: CurrencyConvertParams => js.Promise[Any],
      referenceData: ReferenceDataParams => js.Promise[Any]
    ): CurrencyConvert = {
      val __obj = js.Dynamic.literal(currencyConvert = js.Any.fromFunction1(currencyConvert), referenceData = js.Any.fromFunction1(referenceData))
      __obj.asInstanceOf[CurrencyConvert]
    }
    
    extension [Self <: CurrencyConvert](x: Self) {
      
      inline def setCurrencyConvert(value: CurrencyConvertParams => js.Promise[Any]): Self = StObject.set(x, "currencyConvert", js.Any.fromFunction1(value))
      
      inline def setReferenceData(value: ReferenceDataParams => js.Promise[Any]): Self = StObject.set(x, "referenceData", js.Any.fromFunction1(value))
    }
  }
  
  trait Data extends StObject {
    
    var data: String | js.Array[Any]
    
    var `type`: String
  }
  object Data {
    
    inline def apply(data: String | js.Array[Any], `type`: String): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: String | js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait From extends StObject {
    
    var from: String
    
    var to: String
  }
  object From {
    
    inline def apply(from: String, to: String): From = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    extension [Self <: From](x: Self) {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    var `type`: ZA | Z
    
    var value: Double
  }
  object Type {
    
    inline def apply(`type`: ZA | Z, value: Double): Type = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setType(value: ZA | Z): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
