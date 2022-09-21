package typings.unlCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unl-core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adjacent(locationId: String, direction: Direction): String = (^.asInstanceOf[js.Dynamic].applyDynamic("adjacent")(locationId.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def appendElevation(locationIdWithoutElevation: String, elevation: Double, elevationType: ElevationType): String = (^.asInstanceOf[js.Dynamic].applyDynamic("appendElevation")(locationIdWithoutElevation.asInstanceOf[js.Any], elevation.asInstanceOf[js.Any], elevationType.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def bounds(locationId: String): Bounds_ = ^.asInstanceOf[js.Dynamic].applyDynamic("bounds")(locationId.asInstanceOf[js.Any]).asInstanceOf[Bounds_]
  
  inline def compressPolyhash(polyhash: js.Array[Polyhash]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("compressPolyhash")(polyhash.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def decode(locationId: String): PointWithElevation = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(locationId.asInstanceOf[js.Any]).asInstanceOf[PointWithElevation]
  
  inline def decompressPolyhash(compressedPolyhash: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("decompressPolyhash")(compressedPolyhash.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def deflate(locationIds: js.Array[String]): js.Array[Polyhash] = ^.asInstanceOf[js.Dynamic].applyDynamic("deflate")(locationIds.asInstanceOf[js.Any]).asInstanceOf[js.Array[Polyhash]]
  
  inline def encode(lat: Double, lon: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(lat: Double, lon: Double, precision: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(lat: Double, lon: Double, precision: Double, options: EncodeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], precision.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(lat: Double, lon: Double, precision: Unit, options: EncodeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(lat.asInstanceOf[js.Any], lon.asInstanceOf[js.Any], precision.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def excludeElevation(locationIdWithElevation: String): LocationIdWithElevation = ^.asInstanceOf[js.Dynamic].applyDynamic("excludeElevation")(locationIdWithElevation.asInstanceOf[js.Any]).asInstanceOf[LocationIdWithElevation]
  
  inline def fromWords(words: String, apiKey: String, langCode: String): Address = (^.asInstanceOf[js.Dynamic].applyDynamic("fromWords")(words.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any], langCode.asInstanceOf[js.Any])).asInstanceOf[Address]
  
  inline def gridLines(bounds: Bounds_): js.Array[js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("gridLines")(bounds.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]]]
  inline def gridLines(bounds: Bounds_, precision: Double): js.Array[js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("gridLines")(bounds.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]]]
  
  inline def groupByPrefix(locationIds: js.Array[String]): js.Array[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("groupByPrefix")(locationIds.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[String]]]
  
  inline def inflate(deflatedList: js.Array[Polyhash]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("inflate")(deflatedList.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def neighbours(locationId: String): Neighbours_ = ^.asInstanceOf[js.Dynamic].applyDynamic("neighbours")(locationId.asInstanceOf[js.Any]).asInstanceOf[Neighbours_]
  
  inline def toCluster(points: js.Array[js.Array[Double]], locationIdPrecision: Double): js.Array[Polyhash] = (^.asInstanceOf[js.Dynamic].applyDynamic("toCluster")(points.asInstanceOf[js.Any], locationIdPrecision.asInstanceOf[js.Any])).asInstanceOf[js.Array[Polyhash]]
  
  inline def toCoordinates(polyhash: js.Array[String]): js.Array[js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toCoordinates")(polyhash.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[Double]]]
  
  inline def toPolyhash(points: js.Array[js.Array[Double]], locationIdPrecision: Double): js.Array[Polyhash] = (^.asInstanceOf[js.Dynamic].applyDynamic("toPolyhash")(points.asInstanceOf[js.Any], locationIdPrecision.asInstanceOf[js.Any])).asInstanceOf[js.Array[Polyhash]]
  
  inline def toWords(location: String, apiKey: String, langCode: String, count: Double): Address = (^.asInstanceOf[js.Dynamic].applyDynamic("toWords")(location.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any], langCode.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[Address]
  
  trait Address extends StObject {
    
    var bounds: Bounds_
    
    var coordinates: PointWithElevation
    
    var geohash: String
    
    var words: String
  }
  object Address {
    
    inline def apply(bounds: Bounds_, coordinates: PointWithElevation, geohash: String, words: String): Address = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any], geohash = geohash.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    extension [Self <: Address](x: Self) {
      
      inline def setBounds(value: Bounds_): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setCoordinates(value: PointWithElevation): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setGeohash(value: String): Self = StObject.set(x, "geohash", value.asInstanceOf[js.Any])
      
      inline def setWords(value: String): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
    }
  }
  
  trait Bounds_ extends StObject {
    
    var e: Double
    
    var n: Double
    
    var s: Double
    
    var w: Double
  }
  object Bounds_ {
    
    inline def apply(e: Double, n: Double, s: Double, w: Double): Bounds_ = {
      val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bounds_]
    }
    
    extension [Self <: Bounds_](x: Self) {
      
      inline def setE(value: Double): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.unlCore.unlCoreStrings.N
    - typings.unlCore.unlCoreStrings.S
    - typings.unlCore.unlCoreStrings.E
    - typings.unlCore.unlCoreStrings.W
  */
  trait Direction extends StObject
  object Direction {
    
    inline def E: typings.unlCore.unlCoreStrings.E = "E".asInstanceOf[typings.unlCore.unlCoreStrings.E]
    
    inline def N: typings.unlCore.unlCoreStrings.N = "N".asInstanceOf[typings.unlCore.unlCoreStrings.N]
    
    inline def S: typings.unlCore.unlCoreStrings.S = "S".asInstanceOf[typings.unlCore.unlCoreStrings.S]
    
    inline def W: typings.unlCore.unlCoreStrings.W = "W".asInstanceOf[typings.unlCore.unlCoreStrings.W]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.unlCore.unlCoreStrings.floor
    - typings.unlCore.unlCoreStrings.heightincm
  */
  trait ElevationType extends StObject
  object ElevationType {
    
    inline def floor: typings.unlCore.unlCoreStrings.floor = "floor".asInstanceOf[typings.unlCore.unlCoreStrings.floor]
    
    inline def heightincm: typings.unlCore.unlCoreStrings.heightincm = "heightincm".asInstanceOf[typings.unlCore.unlCoreStrings.heightincm]
  }
  
  trait EncodeOptions extends StObject {
    
    var elevation: Double
    
    var elevationType: ElevationType
  }
  object EncodeOptions {
    
    inline def apply(elevation: Double, elevationType: ElevationType): EncodeOptions = {
      val __obj = js.Dynamic.literal(elevation = elevation.asInstanceOf[js.Any], elevationType = elevationType.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncodeOptions]
    }
    
    extension [Self <: EncodeOptions](x: Self) {
      
      inline def setElevation(value: Double): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
      
      inline def setElevationType(value: ElevationType): Self = StObject.set(x, "elevationType", value.asInstanceOf[js.Any])
    }
  }
  
  trait LocationIdWithElevation extends StObject {
    
    var elevation: Double
    
    var elevationType: ElevationType
    
    var locationId: String
  }
  object LocationIdWithElevation {
    
    inline def apply(elevation: Double, elevationType: ElevationType, locationId: String): LocationIdWithElevation = {
      val __obj = js.Dynamic.literal(elevation = elevation.asInstanceOf[js.Any], elevationType = elevationType.asInstanceOf[js.Any], locationId = locationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocationIdWithElevation]
    }
    
    extension [Self <: LocationIdWithElevation](x: Self) {
      
      inline def setElevation(value: Double): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
      
      inline def setElevationType(value: ElevationType): Self = StObject.set(x, "elevationType", value.asInstanceOf[js.Any])
      
      inline def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    }
  }
  
  trait Neighbours_ extends StObject {
    
    var e: String
    
    var n: String
    
    @JSName("ne")
    var ne_FNeighbours_ : String
    
    var nw: String
    
    var s: String
    
    var se: String
    
    var sw: String
    
    var w: String
  }
  object Neighbours_ {
    
    inline def apply(e: String, n: String, ne_ : String, nw: String, s: String, se: String, sw: String, w: String): Neighbours_ = {
      val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], nw = nw.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], se = se.asInstanceOf[js.Any], sw = sw.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
      __obj.updateDynamic("ne")(ne_.asInstanceOf[js.Any])
      __obj.asInstanceOf[Neighbours_]
    }
    
    extension [Self <: Neighbours_](x: Self) {
      
      inline def setE(value: String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      inline def setNe_(value: String): Self = StObject.set(x, "ne", value.asInstanceOf[js.Any])
      
      inline def setNw(value: String): Self = StObject.set(x, "nw", value.asInstanceOf[js.Any])
      
      inline def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setSe(value: String): Self = StObject.set(x, "se", value.asInstanceOf[js.Any])
      
      inline def setSw(value: String): Self = StObject.set(x, "sw", value.asInstanceOf[js.Any])
      
      inline def setW(value: String): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    }
  }
  
  trait Point extends StObject {
    
    var lat: Double
    
    var lon: Double
  }
  object Point {
    
    inline def apply(lat: Double, lon: Double): Point = {
      val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    extension [Self <: Point](x: Self) {
      
      inline def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
      
      inline def setLon(value: Double): Self = StObject.set(x, "lon", value.asInstanceOf[js.Any])
    }
  }
  
  trait PointWithElevation
    extends StObject
       with Point {
    
    var bounds: Bounds_
    
    var elevation: Double
    
    var elevationType: ElevationType
  }
  object PointWithElevation {
    
    inline def apply(bounds: Bounds_, elevation: Double, elevationType: ElevationType, lat: Double, lon: Double): PointWithElevation = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], elevation = elevation.asInstanceOf[js.Any], elevationType = elevationType.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointWithElevation]
    }
    
    extension [Self <: PointWithElevation](x: Self) {
      
      inline def setBounds(value: Bounds_): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setElevation(value: Double): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
      
      inline def setElevationType(value: ElevationType): Self = StObject.set(x, "elevationType", value.asInstanceOf[js.Any])
    }
  }
  
  trait Polyhash extends StObject {
    
    var data: js.Array[String]
    
    var precision: Double
  }
  object Polyhash {
    
    inline def apply(data: js.Array[String], precision: Double): Polyhash = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any])
      __obj.asInstanceOf[Polyhash]
    }
    
    extension [Self <: Polyhash](x: Self) {
      
      inline def setData(value: js.Array[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: String*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    }
  }
}
