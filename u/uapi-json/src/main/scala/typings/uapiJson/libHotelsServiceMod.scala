package typings.uapiJson

import typings.uapiJson.anon.Age
import typings.uapiJson.anon.Book
import typings.uapiJson.libSettingsMod.Settings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHotelsServiceMod {
  
  @JSImport("uapi-json/lib/HotelsService", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createHotelService(settings: Settings): Book = ^.asInstanceOf[js.Dynamic].applyDynamic("createHotelService")(settings.asInstanceOf[js.Any]).asInstanceOf[Book]
  
  trait BookParams extends StObject {
    
    var Guarantee: typings.uapiJson.libHotelsServiceMod.Guarantee
    
    var HostToken: String
    
    var HotelChain: String
    
    var HotelCode: String
    
    var endDate: String
    
    var people: js.Array[People]
    
    var rates: js.Array[Any]
    
    var roomsRefs: js.Array[RoomRef]
    
    var startDate: String
  }
  object BookParams {
    
    inline def apply(
      Guarantee: Guarantee,
      HostToken: String,
      HotelChain: String,
      HotelCode: String,
      endDate: String,
      people: js.Array[People],
      rates: js.Array[Any],
      roomsRefs: js.Array[RoomRef],
      startDate: String
    ): BookParams = {
      val __obj = js.Dynamic.literal(Guarantee = Guarantee.asInstanceOf[js.Any], HostToken = HostToken.asInstanceOf[js.Any], HotelChain = HotelChain.asInstanceOf[js.Any], HotelCode = HotelCode.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], people = people.asInstanceOf[js.Any], rates = rates.asInstanceOf[js.Any], roomsRefs = roomsRefs.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[BookParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BookParams] (val x: Self) extends AnyVal {
      
      inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setGuarantee(value: Guarantee): Self = StObject.set(x, "Guarantee", value.asInstanceOf[js.Any])
      
      inline def setHostToken(value: String): Self = StObject.set(x, "HostToken", value.asInstanceOf[js.Any])
      
      inline def setHotelChain(value: String): Self = StObject.set(x, "HotelChain", value.asInstanceOf[js.Any])
      
      inline def setHotelCode(value: String): Self = StObject.set(x, "HotelCode", value.asInstanceOf[js.Any])
      
      inline def setPeople(value: js.Array[People]): Self = StObject.set(x, "people", value.asInstanceOf[js.Any])
      
      inline def setPeopleVarargs(value: People*): Self = StObject.set(x, "people", js.Array(value*))
      
      inline def setRates(value: js.Array[Any]): Self = StObject.set(x, "rates", value.asInstanceOf[js.Any])
      
      inline def setRatesVarargs(value: Any*): Self = StObject.set(x, "rates", js.Array(value*))
      
      inline def setRoomsRefs(value: js.Array[RoomRef]): Self = StObject.set(x, "roomsRefs", value.asInstanceOf[js.Any])
      
      inline def setRoomsRefsVarargs(value: RoomRef*): Self = StObject.set(x, "roomsRefs", js.Array(value*))
      
      inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    }
  }
  
  trait CancelBookParams extends StObject {
    
    var LocatorCode: String
  }
  object CancelBookParams {
    
    inline def apply(LocatorCode: String): CancelBookParams = {
      val __obj = js.Dynamic.literal(LocatorCode = LocatorCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[CancelBookParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CancelBookParams] (val x: Self) extends AnyVal {
      
      inline def setLocatorCode(value: String): Self = StObject.set(x, "LocatorCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait Guarantee extends StObject {
    
    var BankCountryCode: String
    
    var BankName: String
    
    var CVV: Double
    
    var CardHolder: String
    
    var CardNumber: String
    
    var CardType: String
    
    var ExpDate: String
  }
  object Guarantee {
    
    inline def apply(
      BankCountryCode: String,
      BankName: String,
      CVV: Double,
      CardHolder: String,
      CardNumber: String,
      CardType: String,
      ExpDate: String
    ): Guarantee = {
      val __obj = js.Dynamic.literal(BankCountryCode = BankCountryCode.asInstanceOf[js.Any], BankName = BankName.asInstanceOf[js.Any], CVV = CVV.asInstanceOf[js.Any], CardHolder = CardHolder.asInstanceOf[js.Any], CardNumber = CardNumber.asInstanceOf[js.Any], CardType = CardType.asInstanceOf[js.Any], ExpDate = ExpDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[Guarantee]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Guarantee] (val x: Self) extends AnyVal {
      
      inline def setBankCountryCode(value: String): Self = StObject.set(x, "BankCountryCode", value.asInstanceOf[js.Any])
      
      inline def setBankName(value: String): Self = StObject.set(x, "BankName", value.asInstanceOf[js.Any])
      
      inline def setCVV(value: Double): Self = StObject.set(x, "CVV", value.asInstanceOf[js.Any])
      
      inline def setCardHolder(value: String): Self = StObject.set(x, "CardHolder", value.asInstanceOf[js.Any])
      
      inline def setCardNumber(value: String): Self = StObject.set(x, "CardNumber", value.asInstanceOf[js.Any])
      
      inline def setCardType(value: String): Self = StObject.set(x, "CardType", value.asInstanceOf[js.Any])
      
      inline def setExpDate(value: String): Self = StObject.set(x, "ExpDate", value.asInstanceOf[js.Any])
    }
  }
  
  trait People extends StObject {
    
    var Age: Double
    
    var AreaCode: Double
    
    var BirthDate: String
    
    var City: String
    
    var Country: String
    
    var CountryCode: Double
    
    var Email: String
    
    var FirstName: String
    
    var LastName: String
    
    var Nationality: String
    
    var Number: Double
    
    var PostalCode: Double
    
    var PrefixName: String
    
    var Street: String
    
    var TravelerType: String
    
    var key: Double
  }
  object People {
    
    inline def apply(
      Age: Double,
      AreaCode: Double,
      BirthDate: String,
      City: String,
      Country: String,
      CountryCode: Double,
      Email: String,
      FirstName: String,
      LastName: String,
      Nationality: String,
      Number: Double,
      PostalCode: Double,
      PrefixName: String,
      Street: String,
      TravelerType: String,
      key: Double
    ): People = {
      val __obj = js.Dynamic.literal(Age = Age.asInstanceOf[js.Any], AreaCode = AreaCode.asInstanceOf[js.Any], BirthDate = BirthDate.asInstanceOf[js.Any], City = City.asInstanceOf[js.Any], Country = Country.asInstanceOf[js.Any], CountryCode = CountryCode.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], FirstName = FirstName.asInstanceOf[js.Any], LastName = LastName.asInstanceOf[js.Any], Nationality = Nationality.asInstanceOf[js.Any], Number = Number.asInstanceOf[js.Any], PostalCode = PostalCode.asInstanceOf[js.Any], PrefixName = PrefixName.asInstanceOf[js.Any], Street = Street.asInstanceOf[js.Any], TravelerType = TravelerType.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[People]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: People] (val x: Self) extends AnyVal {
      
      inline def setAge(value: Double): Self = StObject.set(x, "Age", value.asInstanceOf[js.Any])
      
      inline def setAreaCode(value: Double): Self = StObject.set(x, "AreaCode", value.asInstanceOf[js.Any])
      
      inline def setBirthDate(value: String): Self = StObject.set(x, "BirthDate", value.asInstanceOf[js.Any])
      
      inline def setCity(value: String): Self = StObject.set(x, "City", value.asInstanceOf[js.Any])
      
      inline def setCountry(value: String): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
      
      inline def setCountryCode(value: Double): Self = StObject.set(x, "CountryCode", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
      
      inline def setFirstName(value: String): Self = StObject.set(x, "FirstName", value.asInstanceOf[js.Any])
      
      inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLastName(value: String): Self = StObject.set(x, "LastName", value.asInstanceOf[js.Any])
      
      inline def setNationality(value: String): Self = StObject.set(x, "Nationality", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: Double): Self = StObject.set(x, "Number", value.asInstanceOf[js.Any])
      
      inline def setPostalCode(value: Double): Self = StObject.set(x, "PostalCode", value.asInstanceOf[js.Any])
      
      inline def setPrefixName(value: String): Self = StObject.set(x, "PrefixName", value.asInstanceOf[js.Any])
      
      inline def setStreet(value: String): Self = StObject.set(x, "Street", value.asInstanceOf[js.Any])
      
      inline def setTravelerType(value: String): Self = StObject.set(x, "TravelerType", value.asInstanceOf[js.Any])
    }
  }
  
  trait RatesParams extends StObject {
    
    var HostToken: String
    
    var HotelChain: String
    
    var HotelCode: String
    
    var Suppliers: js.Array[String]
    
    var currency: String
    
    var endDate: String
    
    var rooms: js.Array[Room]
    
    var startDate: String
  }
  object RatesParams {
    
    inline def apply(
      HostToken: String,
      HotelChain: String,
      HotelCode: String,
      Suppliers: js.Array[String],
      currency: String,
      endDate: String,
      rooms: js.Array[Room],
      startDate: String
    ): RatesParams = {
      val __obj = js.Dynamic.literal(HostToken = HostToken.asInstanceOf[js.Any], HotelChain = HotelChain.asInstanceOf[js.Any], HotelCode = HotelCode.asInstanceOf[js.Any], Suppliers = Suppliers.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], rooms = rooms.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[RatesParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RatesParams] (val x: Self) extends AnyVal {
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setHostToken(value: String): Self = StObject.set(x, "HostToken", value.asInstanceOf[js.Any])
      
      inline def setHotelChain(value: String): Self = StObject.set(x, "HotelChain", value.asInstanceOf[js.Any])
      
      inline def setHotelCode(value: String): Self = StObject.set(x, "HotelCode", value.asInstanceOf[js.Any])
      
      inline def setRooms(value: js.Array[Room]): Self = StObject.set(x, "rooms", value.asInstanceOf[js.Any])
      
      inline def setRoomsVarargs(value: Room*): Self = StObject.set(x, "rooms", js.Array(value*))
      
      inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setSuppliers(value: js.Array[String]): Self = StObject.set(x, "Suppliers", value.asInstanceOf[js.Any])
      
      inline def setSuppliersVarargs(value: String*): Self = StObject.set(x, "Suppliers", js.Array(value*))
    }
  }
  
  trait Room extends StObject {
    
    var adults: Double
    
    var children: js.Array[Double]
  }
  object Room {
    
    inline def apply(adults: Double, children: js.Array[Double]): Room = {
      val __obj = js.Dynamic.literal(adults = adults.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[Room]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Room] (val x: Self) extends AnyVal {
      
      inline def setAdults(value: Double): Self = StObject.set(x, "adults", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: js.Array[Double]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: Double*): Self = StObject.set(x, "children", js.Array(value*))
    }
  }
  
  trait RoomRef extends StObject {
    
    var adults: Double
    
    var adultsRefs: js.Array[Double]
    
    var children: js.Array[Age]
  }
  object RoomRef {
    
    inline def apply(adults: Double, adultsRefs: js.Array[Double], children: js.Array[Age]): RoomRef = {
      val __obj = js.Dynamic.literal(adults = adults.asInstanceOf[js.Any], adultsRefs = adultsRefs.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoomRef]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RoomRef] (val x: Self) extends AnyVal {
      
      inline def setAdults(value: Double): Self = StObject.set(x, "adults", value.asInstanceOf[js.Any])
      
      inline def setAdultsRefs(value: js.Array[Double]): Self = StObject.set(x, "adultsRefs", value.asInstanceOf[js.Any])
      
      inline def setAdultsRefsVarargs(value: Double*): Self = StObject.set(x, "adultsRefs", js.Array(value*))
      
      inline def setChildren(value: js.Array[Age]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: Age*): Self = StObject.set(x, "children", js.Array(value*))
    }
  }
  
  trait SearchParams extends StObject {
    
    var MaxProperties: Double
    
    var MaxWait: Double
    
    var currency: String
    
    var endDate: String
    
    var location: String
    
    var rating: js.Array[Double]
    
    var rooms: js.Array[Room]
    
    var startDate: String
  }
  object SearchParams {
    
    inline def apply(
      MaxProperties: Double,
      MaxWait: Double,
      currency: String,
      endDate: String,
      location: String,
      rating: js.Array[Double],
      rooms: js.Array[Room],
      startDate: String
    ): SearchParams = {
      val __obj = js.Dynamic.literal(MaxProperties = MaxProperties.asInstanceOf[js.Any], MaxWait = MaxWait.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], rooms = rooms.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SearchParams] (val x: Self) extends AnyVal {
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setMaxProperties(value: Double): Self = StObject.set(x, "MaxProperties", value.asInstanceOf[js.Any])
      
      inline def setMaxWait(value: Double): Self = StObject.set(x, "MaxWait", value.asInstanceOf[js.Any])
      
      inline def setRating(value: js.Array[Double]): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
      
      inline def setRatingVarargs(value: Double*): Self = StObject.set(x, "rating", js.Array(value*))
      
      inline def setRooms(value: js.Array[Room]): Self = StObject.set(x, "rooms", value.asInstanceOf[js.Any])
      
      inline def setRoomsVarargs(value: Room*): Self = StObject.set(x, "rooms", js.Array(value*))
      
      inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    }
  }
}
