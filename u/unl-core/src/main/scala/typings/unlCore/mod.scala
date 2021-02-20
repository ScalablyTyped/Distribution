package typings.unlCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unl-core", "adjacent")
  @js.native
  def adjacent(locationId: String, direction: Direction): String = js.native
  
  @JSImport("unl-core", "appendElevation")
  @js.native
  def appendElevation(locationIdWithoutElevation: String, elevation: Double, elevationType: ElevationType): String = js.native
  
  @JSImport("unl-core", "bounds")
  @js.native
  def bounds(locationId: String): BoundsWithElevation = js.native
  
  @JSImport("unl-core", "compressPolyhash")
  @js.native
  def compressPolyhash(polyhash: js.Array[Polyhash]): String = js.native
  
  @JSImport("unl-core", "decode")
  @js.native
  def decode(locationId: String): PointWithElevation = js.native
  
  @JSImport("unl-core", "decompressPolyhash")
  @js.native
  def decompressPolyhash(compressedPolyhash: String): js.Array[String] = js.native
  
  @JSImport("unl-core", "deflate")
  @js.native
  def deflate(locationIds: js.Array[String]): js.Array[Polyhash] = js.native
  
  @JSImport("unl-core", "encode")
  @js.native
  def encode(lat: Double, lon: Double): String = js.native
  @JSImport("unl-core", "encode")
  @js.native
  def encode(lat: Double, lon: Double, precision: js.UndefOr[scala.Nothing], options: EncodeOptions): String = js.native
  @JSImport("unl-core", "encode")
  @js.native
  def encode(lat: Double, lon: Double, precision: Double): String = js.native
  @JSImport("unl-core", "encode")
  @js.native
  def encode(lat: Double, lon: Double, precision: Double, options: EncodeOptions): String = js.native
  
  @JSImport("unl-core", "excludeElevation")
  @js.native
  def excludeElevation(locationIdWithElevation: String): LocationIdWithElevation = js.native
  
  @JSImport("unl-core", "fromWords")
  @js.native
  def fromWords(words: String, apiKey: String, langCode: String): Address = js.native
  
  @JSImport("unl-core", "gridLines")
  @js.native
  def gridLines(bounds: Bounds_): js.Array[js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]] = js.native
  @JSImport("unl-core", "gridLines")
  @js.native
  def gridLines(bounds: Bounds_, precision: Double): js.Array[js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]] = js.native
  
  @JSImport("unl-core", "groupByPrefix")
  @js.native
  def groupByPrefix(locationIds: js.Array[String]): js.Array[js.Array[String]] = js.native
  
  @JSImport("unl-core", "inflate")
  @js.native
  def inflate(deflatedList: js.Array[Polyhash]): js.Array[String] = js.native
  
  @JSImport("unl-core", "neighbours")
  @js.native
  def neighbours(locationId: String): Neighbours_ = js.native
  
  @JSImport("unl-core", "toCluster")
  @js.native
  def toCluster(points: js.Array[js.Array[Double]], locationIdPrecision: Double): js.Array[Polyhash] = js.native
  
  @JSImport("unl-core", "toCoordinates")
  @js.native
  def toCoordinates(polyhash: js.Array[String]): js.Array[js.Array[Double]] = js.native
  
  @JSImport("unl-core", "toPolyhash")
  @js.native
  def toPolyhash(points: js.Array[js.Array[Double]], locationIdPrecision: Double): js.Array[Polyhash] = js.native
  
  @JSImport("unl-core", "toWords")
  @js.native
  def toWords(location: String, apiKey: String, langCode: String, count: Double): Address = js.native
  
  @js.native
  trait Address extends StObject {
    
    var bounds: BoundsWithElevation = js.native
    
    var coordinates: PointWithElevation = js.native
    
    var geohash: String = js.native
    
    var words: String = js.native
  }
  object Address {
    
    @scala.inline
    def apply(bounds: BoundsWithElevation, coordinates: PointWithElevation, geohash: String, words: String): Address = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], coordinates = coordinates.asInstanceOf[js.Any], geohash = geohash.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    @scala.inline
    implicit class AddressMutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounds(value: BoundsWithElevation): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoordinates(value: PointWithElevation): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeohash(value: String): Self = StObject.set(x, "geohash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWords(value: String): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BoundsWithElevation extends Bounds_ {
    
    var elevation: Double = js.native
    
    var elevationType: ElevationType = js.native
  }
  object BoundsWithElevation {
    
    @scala.inline
    def apply(elevation: Double, elevationType: ElevationType, ne_ : Point, sw: Point): BoundsWithElevation = {
      val __obj = js.Dynamic.literal(elevation = elevation.asInstanceOf[js.Any], elevationType = elevationType.asInstanceOf[js.Any], sw = sw.asInstanceOf[js.Any])
      __obj.updateDynamic("ne")(ne_.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoundsWithElevation]
    }
    
    @scala.inline
    implicit class BoundsWithElevationMutableBuilder[Self <: BoundsWithElevation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElevation(value: Double): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElevationType(value: ElevationType): Self = StObject.set(x, "elevationType", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Bounds_ extends StObject {
    
    @JSName("ne")
    var ne_FBounds_ : Point = js.native
    
    var sw: Point = js.native
  }
  object Bounds_ {
    
    @scala.inline
    def apply(ne_ : Point, sw: Point): Bounds_ = {
      val __obj = js.Dynamic.literal(sw = sw.asInstanceOf[js.Any])
      __obj.updateDynamic("ne")(ne_.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bounds_]
    }
    
    @scala.inline
    implicit class Bounds_MutableBuilder[Self <: Bounds_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNe_(value: Point): Self = StObject.set(x, "ne", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSw(value: Point): Self = StObject.set(x, "sw", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def E: typings.unlCore.unlCoreStrings.E = "E".asInstanceOf[typings.unlCore.unlCoreStrings.E]
    
    @scala.inline
    def N: typings.unlCore.unlCoreStrings.N = "N".asInstanceOf[typings.unlCore.unlCoreStrings.N]
    
    @scala.inline
    def S: typings.unlCore.unlCoreStrings.S = "S".asInstanceOf[typings.unlCore.unlCoreStrings.S]
    
    @scala.inline
    def W: typings.unlCore.unlCoreStrings.W = "W".asInstanceOf[typings.unlCore.unlCoreStrings.W]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.unlCore.unlCoreStrings.floor
    - typings.unlCore.unlCoreStrings.heightincm
  */
  trait ElevationType extends StObject
  object ElevationType {
    
    @scala.inline
    def floor: typings.unlCore.unlCoreStrings.floor = "floor".asInstanceOf[typings.unlCore.unlCoreStrings.floor]
    
    @scala.inline
    def heightincm: typings.unlCore.unlCoreStrings.heightincm = "heightincm".asInstanceOf[typings.unlCore.unlCoreStrings.heightincm]
  }
  
  @js.native
  trait EncodeOptions extends StObject {
    
    var elevation: Double = js.native
    
    var elevationType: ElevationType = js.native
  }
  object EncodeOptions {
    
    @scala.inline
    def apply(elevation: Double, elevationType: ElevationType): EncodeOptions = {
      val __obj = js.Dynamic.literal(elevation = elevation.asInstanceOf[js.Any], elevationType = elevationType.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncodeOptions]
    }
    
    @scala.inline
    implicit class EncodeOptionsMutableBuilder[Self <: EncodeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElevation(value: Double): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElevationType(value: ElevationType): Self = StObject.set(x, "elevationType", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LocationIdWithElevation extends StObject {
    
    var elevation: Double = js.native
    
    var elevationType: ElevationType = js.native
    
    var locationId: String = js.native
  }
  object LocationIdWithElevation {
    
    @scala.inline
    def apply(elevation: Double, elevationType: ElevationType, locationId: String): LocationIdWithElevation = {
      val __obj = js.Dynamic.literal(elevation = elevation.asInstanceOf[js.Any], elevationType = elevationType.asInstanceOf[js.Any], locationId = locationId.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocationIdWithElevation]
    }
    
    @scala.inline
    implicit class LocationIdWithElevationMutableBuilder[Self <: LocationIdWithElevation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElevation(value: Double): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElevationType(value: ElevationType): Self = StObject.set(x, "elevationType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Neighbours_ extends StObject {
    
    var e: String = js.native
    
    var n: String = js.native
    
    @JSName("ne")
    var ne_FNeighbours_ : String = js.native
    
    var nw: String = js.native
    
    var s: String = js.native
    
    var se: String = js.native
    
    var sw: String = js.native
    
    var w: String = js.native
  }
  object Neighbours_ {
    
    @scala.inline
    def apply(e: String, n: String, ne_ : String, nw: String, s: String, se: String, sw: String, w: String): Neighbours_ = {
      val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], nw = nw.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], se = se.asInstanceOf[js.Any], sw = sw.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
      __obj.updateDynamic("ne")(ne_.asInstanceOf[js.Any])
      __obj.asInstanceOf[Neighbours_]
    }
    
    @scala.inline
    implicit class Neighbours_MutableBuilder[Self <: Neighbours_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setE(value: String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNe_(value: String): Self = StObject.set(x, "ne", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNw(value: String): Self = StObject.set(x, "nw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSe(value: String): Self = StObject.set(x, "se", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSw(value: String): Self = StObject.set(x, "sw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setW(value: String): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Point extends StObject {
    
    var lat: Double = js.native
    
    var lon: Double = js.native
  }
  object Point {
    
    @scala.inline
    def apply(lat: Double, lon: Double): Point = {
      val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    @scala.inline
    implicit class PointMutableBuilder[Self <: Point] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLon(value: Double): Self = StObject.set(x, "lon", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PointWithElevation extends Point {
    
    var bounds: BoundsWithElevation = js.native
    
    var elevation: Double = js.native
    
    var elevationType: ElevationType = js.native
  }
  object PointWithElevation {
    
    @scala.inline
    def apply(
      bounds: BoundsWithElevation,
      elevation: Double,
      elevationType: ElevationType,
      lat: Double,
      lon: Double
    ): PointWithElevation = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], elevation = elevation.asInstanceOf[js.Any], elevationType = elevationType.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointWithElevation]
    }
    
    @scala.inline
    implicit class PointWithElevationMutableBuilder[Self <: PointWithElevation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounds(value: BoundsWithElevation): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElevation(value: Double): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElevationType(value: ElevationType): Self = StObject.set(x, "elevationType", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Polyhash extends StObject {
    
    var data: js.Array[String] = js.native
    
    var precision: Double = js.native
  }
  object Polyhash {
    
    @scala.inline
    def apply(data: js.Array[String], precision: Double): Polyhash = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any])
      __obj.asInstanceOf[Polyhash]
    }
    
    @scala.inline
    implicit class PolyhashMutableBuilder[Self <: Polyhash] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Array[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: String*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    }
  }
}
