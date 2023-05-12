package typings.territoryIndonesia

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("territory-indonesia", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAllDistricts(): js.Promise[js.Array[District]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllDistricts")().asInstanceOf[js.Promise[js.Array[District]]]
  
  inline def getAllProvinces(): js.Promise[js.Array[Province]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllProvinces")().asInstanceOf[js.Promise[js.Array[Province]]]
  
  inline def getAllRegencies(): js.Promise[js.Array[Regency]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllRegencies")().asInstanceOf[js.Promise[js.Array[Regency]]]
  
  inline def getAllVillages(): js.Promise[js.Array[Village]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllVillages")().asInstanceOf[js.Promise[js.Array[Village]]]
  
  inline def getDistrictById(id: String): js.Promise[District] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDistrictById")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[District]]
  
  inline def getDistrictByName(name: String): js.Promise[District] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDistrictByName")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[District]]
  
  inline def getDistrictsOfRegency(regencyId: String): js.Promise[js.Array[District]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDistrictsOfRegency")(regencyId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[District]]]
  
  inline def getDistrictsOfRegencyId(regencyId: String): js.Promise[js.Array[District]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDistrictsOfRegencyId")(regencyId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[District]]]
  
  inline def getDistrictsOfRegencyName(regencyName: String): js.Promise[js.Array[District]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDistrictsOfRegencyName")(regencyName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[District]]]
  
  inline def getProvinceById(id: String): js.Promise[Province] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProvinceById")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Province]]
  
  inline def getProvinceByName(name: String): js.Promise[Province] = ^.asInstanceOf[js.Dynamic].applyDynamic("getProvinceByName")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Province]]
  
  inline def getRegenciesOfProvince(provinceId: String): js.Promise[js.Array[Regency]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegenciesOfProvince")(provinceId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Regency]]]
  
  inline def getRegenciesOfProvinceId(provinceId: String): js.Promise[js.Array[Regency]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegenciesOfProvinceId")(provinceId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Regency]]]
  
  inline def getRegenciesOfProvinceName(provinceName: String): js.Promise[js.Array[Regency]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegenciesOfProvinceName")(provinceName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Regency]]]
  
  inline def getRegencyById(id: String): js.Promise[Regency] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegencyById")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Regency]]
  
  inline def getRegencyByName(name: String): js.Promise[Regency] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegencyByName")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Regency]]
  
  inline def getVillageById(id: String): js.Promise[Village] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVillageById")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Village]]
  
  inline def getVillageByName(name: String): js.Promise[Village] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVillageByName")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Village]]
  
  inline def getVillagesOfDistrict(districtId: String): js.Promise[js.Array[Village]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVillagesOfDistrict")(districtId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Village]]]
  
  inline def getVillagesOfDistrictId(districtId: String): js.Promise[js.Array[Village]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVillagesOfDistrictId")(districtId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Village]]]
  
  inline def getVillagesOfDistrictName(districtName: String): js.Promise[js.Array[Village]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVillagesOfDistrictName")(districtName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Village]]]
  
  trait District extends StObject {
    
    var alt_name: String
    
    var id: String
    
    var latitude: Double | Null
    
    var longitude: Double | Null
    
    var name: String
    
    var regency_id: String
  }
  object District {
    
    inline def apply(alt_name: String, id: String, name: String, regency_id: String): District = {
      val __obj = js.Dynamic.literal(alt_name = alt_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], regency_id = regency_id.asInstanceOf[js.Any], latitude = null, longitude = null)
      __obj.asInstanceOf[District]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: District] (val x: Self) extends AnyVal {
      
      inline def setAlt_name(value: String): Self = StObject.set(x, "alt_name", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLatitudeNull: Self = StObject.set(x, "latitude", null)
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      inline def setLongitudeNull: Self = StObject.set(x, "longitude", null)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRegency_id(value: String): Self = StObject.set(x, "regency_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Province extends StObject {
    
    var alt_name: String
    
    var id: String
    
    var latitude: Double | Null
    
    var longitude: Double | Null
    
    var name: String
  }
  object Province {
    
    inline def apply(alt_name: String, id: String, name: String): Province = {
      val __obj = js.Dynamic.literal(alt_name = alt_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], latitude = null, longitude = null)
      __obj.asInstanceOf[Province]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Province] (val x: Self) extends AnyVal {
      
      inline def setAlt_name(value: String): Self = StObject.set(x, "alt_name", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLatitudeNull: Self = StObject.set(x, "latitude", null)
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      inline def setLongitudeNull: Self = StObject.set(x, "longitude", null)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Regency extends StObject {
    
    var alt_name: String
    
    var id: String
    
    var latitude: Double | Null
    
    var longitude: Double | Null
    
    var name: String
    
    var province_id: String
  }
  object Regency {
    
    inline def apply(alt_name: String, id: String, name: String, province_id: String): Regency = {
      val __obj = js.Dynamic.literal(alt_name = alt_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], province_id = province_id.asInstanceOf[js.Any], latitude = null, longitude = null)
      __obj.asInstanceOf[Regency]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Regency] (val x: Self) extends AnyVal {
      
      inline def setAlt_name(value: String): Self = StObject.set(x, "alt_name", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLatitudeNull: Self = StObject.set(x, "latitude", null)
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      inline def setLongitudeNull: Self = StObject.set(x, "longitude", null)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProvince_id(value: String): Self = StObject.set(x, "province_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Village extends StObject {
    
    var district_id: String
    
    var id: String
    
    var latitude: Double | Null
    
    var longitude: Double | Null
    
    var name: String
  }
  object Village {
    
    inline def apply(district_id: String, id: String, name: String): Village = {
      val __obj = js.Dynamic.literal(district_id = district_id.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], latitude = null, longitude = null)
      __obj.asInstanceOf[Village]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Village] (val x: Self) extends AnyVal {
      
      inline def setDistrict_id(value: String): Self = StObject.set(x, "district_id", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLatitudeNull: Self = StObject.set(x, "latitude", null)
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      inline def setLongitudeNull: Self = StObject.set(x, "longitude", null)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
