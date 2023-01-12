package typings.three

import org.scalablytyped.runtime.StringDictionary
import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.examplesJsmLoadersMtlloaderMod.MTLLoader.MaterialCreator
import typings.three.srcConstantsMod.Mapping
import typings.three.srcConstantsMod.Side
import typings.three.srcConstantsMod.Wrapping
import typings.three.srcThreeMod.BufferGeometry
import typings.three.srcThreeMod.Loader
import typings.three.srcThreeMod.LoadingManager
import typings.three.srcThreeMod.Material
import typings.three.srcThreeMod.Texture
import typings.three.srcThreeMod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmLoadersMtlloaderMod {
  
  @JSImport("three/examples/jsm/loaders/MTLLoader", "MTLLoader")
  @js.native
  open class MTLLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    def load(url: String, onLoad: js.Function1[/* materialCreator */ MaterialCreator, Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* materialCreator */ MaterialCreator, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* materialCreator */ MaterialCreator, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* materialCreator */ MaterialCreator, Unit],
      onProgress: Unit,
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    
    var materialOptions: MaterialCreatorOptions = js.native
    
    def parse(text: String, path: String): MaterialCreator = js.native
    
    def setMaterialOptions(value: MaterialCreatorOptions): Unit = js.native
  }
  object MTLLoader {
    
    @JSImport("three/examples/jsm/loaders/MTLLoader", "MTLLoader.MaterialCreator")
    @js.native
    open class MaterialCreator () extends StObject {
      def this(baseUrl: String) = this()
      def this(baseUrl: String, options: MaterialCreatorOptions) = this()
      def this(baseUrl: Unit, options: MaterialCreatorOptions) = this()
      
      var baseUrl: String = js.native
      
      def convert(materialsInfo: StringDictionary[MaterialInfo]): StringDictionary[MaterialInfo] = js.native
      
      def create(materialName: String): Material = js.native
      
      def createMaterial_(materialName: String): Material = js.native
      
      var crossOrigin: String = js.native
      
      def getAsArray(): js.Array[Material] = js.native
      
      def getIndex(materialName: String): Double = js.native
      
      def getTextureParams(value: String, matParams: Any): TexParams = js.native
      
      def loadTexture(url: String): Texture = js.native
      def loadTexture(url: String, mapping: Unit, onLoad: js.Function1[/* bufferGeometry */ BufferGeometry, Unit]): Texture = js.native
      def loadTexture(
        url: String,
        mapping: Unit,
        onLoad: js.Function1[/* bufferGeometry */ BufferGeometry, Unit],
        onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
      ): Texture = js.native
      def loadTexture(
        url: String,
        mapping: Unit,
        onLoad: js.Function1[/* bufferGeometry */ BufferGeometry, Unit],
        onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
        onError: js.Function1[/* event */ ErrorEvent, Unit]
      ): Texture = js.native
      def loadTexture(
        url: String,
        mapping: Unit,
        onLoad: js.Function1[/* bufferGeometry */ BufferGeometry, Unit],
        onProgress: Unit,
        onError: js.Function1[/* event */ ErrorEvent, Unit]
      ): Texture = js.native
      def loadTexture(
        url: String,
        mapping: Unit,
        onLoad: Unit,
        onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
      ): Texture = js.native
      def loadTexture(
        url: String,
        mapping: Unit,
        onLoad: Unit,
        onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
        onError: js.Function1[/* event */ ErrorEvent, Unit]
      ): Texture = js.native
      def loadTexture(
        url: String,
        mapping: Unit,
        onLoad: Unit,
        onProgress: Unit,
        onError: js.Function1[/* event */ ErrorEvent, Unit]
      ): Texture = js.native
      def loadTexture(url: String, mapping: Mapping): Texture = js.native
      def loadTexture(url: String, mapping: Mapping, onLoad: js.Function1[/* bufferGeometry */ BufferGeometry, Unit]): Texture = js.native
      def loadTexture(
        url: String,
        mapping: Mapping,
        onLoad: js.Function1[/* bufferGeometry */ BufferGeometry, Unit],
        onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
      ): Texture = js.native
      def loadTexture(
        url: String,
        mapping: Mapping,
        onLoad: js.Function1[/* bufferGeometry */ BufferGeometry, Unit],
        onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
        onError: js.Function1[/* event */ ErrorEvent, Unit]
      ): Texture = js.native
      def loadTexture(
        url: String,
        mapping: Mapping,
        onLoad: js.Function1[/* bufferGeometry */ BufferGeometry, Unit],
        onProgress: Unit,
        onError: js.Function1[/* event */ ErrorEvent, Unit]
      ): Texture = js.native
      def loadTexture(
        url: String,
        mapping: Mapping,
        onLoad: Unit,
        onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
      ): Texture = js.native
      def loadTexture(
        url: String,
        mapping: Mapping,
        onLoad: Unit,
        onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
        onError: js.Function1[/* event */ ErrorEvent, Unit]
      ): Texture = js.native
      def loadTexture(
        url: String,
        mapping: Mapping,
        onLoad: Unit,
        onProgress: Unit,
        onError: js.Function1[/* event */ ErrorEvent, Unit]
      ): Texture = js.native
      
      var materials: StringDictionary[Material] = js.native
      
      /* private */ var materialsArray: js.Array[Material] = js.native
      
      var materialsInfo: StringDictionary[MaterialInfo] = js.native
      
      var nameLookup: StringDictionary[Double] = js.native
      
      var options: MaterialCreatorOptions = js.native
      
      def preload(): Unit = js.native
      
      def setCrossOrigin(value: String): this.type = js.native
      
      def setManager(value: LoadingManager): Unit = js.native
      
      def setMaterials(materialsInfo: StringDictionary[MaterialInfo]): Unit = js.native
      
      var side: Side = js.native
      
      var wrap: Wrapping = js.native
    }
  }
  
  trait MaterialCreatorOptions extends StObject {
    
    /*
      * ignoreZeroRGBs: Ignore values of RGBs (Ka,Kd,Ks) that are all 0's
      * Default: false
      */
    var ignoreZeroRGBs: js.UndefOr[Boolean] = js.undefined
    
    /*
      * invertTrProperty: Use values 1 of Tr field for fully opaque. This option is useful for obj
      * exported from 3ds MAX, vcglib or meshlab.
      * Default: false
      */
    var invertTrProperty: js.UndefOr[Boolean] = js.undefined
    
    /*
      * normalizeRGB: RGBs need to be normalized to 0-1 from 0-255
      * Default: false, assumed to be already normalized
      */
    var normalizeRGB: js.UndefOr[Boolean] = js.undefined
    
    /**
      * side: Which side to apply the material
      * THREE.FrontSide (default), THREE.BackSide, THREE.DoubleSide
      */
    var side: js.UndefOr[Side] = js.undefined
    
    /*
      * wrap: What type of wrapping to apply for textures
      * THREE.RepeatWrapping (default), THREE.ClampToEdgeWrapping, THREE.MirroredRepeatWrapping
      */
    var wrap: js.UndefOr[Wrapping] = js.undefined
  }
  object MaterialCreatorOptions {
    
    inline def apply(): MaterialCreatorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaterialCreatorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MaterialCreatorOptions] (val x: Self) extends AnyVal {
      
      inline def setIgnoreZeroRGBs(value: Boolean): Self = StObject.set(x, "ignoreZeroRGBs", value.asInstanceOf[js.Any])
      
      inline def setIgnoreZeroRGBsUndefined: Self = StObject.set(x, "ignoreZeroRGBs", js.undefined)
      
      inline def setInvertTrProperty(value: Boolean): Self = StObject.set(x, "invertTrProperty", value.asInstanceOf[js.Any])
      
      inline def setInvertTrPropertyUndefined: Self = StObject.set(x, "invertTrProperty", js.undefined)
      
      inline def setNormalizeRGB(value: Boolean): Self = StObject.set(x, "normalizeRGB", value.asInstanceOf[js.Any])
      
      inline def setNormalizeRGBUndefined: Self = StObject.set(x, "normalizeRGB", js.undefined)
      
      inline def setSide(value: Side): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
      
      inline def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
      
      inline def setWrap(value: Wrapping): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  trait MaterialInfo extends StObject {
    
    var bump: js.UndefOr[String] = js.undefined
    
    var d: js.UndefOr[Double] = js.undefined
    
    var kd: js.UndefOr[js.Array[Double]] = js.undefined
    
    var ke: js.UndefOr[js.Array[Double]] = js.undefined
    
    var ks: js.UndefOr[js.Array[Double]] = js.undefined
    
    var map_bump: js.UndefOr[String] = js.undefined
    
    var map_d: js.UndefOr[String] = js.undefined
    
    var map_kd: js.UndefOr[String] = js.undefined
    
    var map_ke: js.UndefOr[String] = js.undefined
    
    var map_ks: js.UndefOr[String] = js.undefined
    
    var norm: js.UndefOr[String] = js.undefined
    
    var ns: js.UndefOr[Double] = js.undefined
    
    var tr: js.UndefOr[Double] = js.undefined
  }
  object MaterialInfo {
    
    inline def apply(): MaterialInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaterialInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MaterialInfo] (val x: Self) extends AnyVal {
      
      inline def setBump(value: String): Self = StObject.set(x, "bump", value.asInstanceOf[js.Any])
      
      inline def setBumpUndefined: Self = StObject.set(x, "bump", js.undefined)
      
      inline def setD(value: Double): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      inline def setDUndefined: Self = StObject.set(x, "d", js.undefined)
      
      inline def setKd(value: js.Array[Double]): Self = StObject.set(x, "kd", value.asInstanceOf[js.Any])
      
      inline def setKdUndefined: Self = StObject.set(x, "kd", js.undefined)
      
      inline def setKdVarargs(value: Double*): Self = StObject.set(x, "kd", js.Array(value*))
      
      inline def setKe(value: js.Array[Double]): Self = StObject.set(x, "ke", value.asInstanceOf[js.Any])
      
      inline def setKeUndefined: Self = StObject.set(x, "ke", js.undefined)
      
      inline def setKeVarargs(value: Double*): Self = StObject.set(x, "ke", js.Array(value*))
      
      inline def setKs(value: js.Array[Double]): Self = StObject.set(x, "ks", value.asInstanceOf[js.Any])
      
      inline def setKsUndefined: Self = StObject.set(x, "ks", js.undefined)
      
      inline def setKsVarargs(value: Double*): Self = StObject.set(x, "ks", js.Array(value*))
      
      inline def setMap_bump(value: String): Self = StObject.set(x, "map_bump", value.asInstanceOf[js.Any])
      
      inline def setMap_bumpUndefined: Self = StObject.set(x, "map_bump", js.undefined)
      
      inline def setMap_d(value: String): Self = StObject.set(x, "map_d", value.asInstanceOf[js.Any])
      
      inline def setMap_dUndefined: Self = StObject.set(x, "map_d", js.undefined)
      
      inline def setMap_kd(value: String): Self = StObject.set(x, "map_kd", value.asInstanceOf[js.Any])
      
      inline def setMap_kdUndefined: Self = StObject.set(x, "map_kd", js.undefined)
      
      inline def setMap_ke(value: String): Self = StObject.set(x, "map_ke", value.asInstanceOf[js.Any])
      
      inline def setMap_keUndefined: Self = StObject.set(x, "map_ke", js.undefined)
      
      inline def setMap_ks(value: String): Self = StObject.set(x, "map_ks", value.asInstanceOf[js.Any])
      
      inline def setMap_ksUndefined: Self = StObject.set(x, "map_ks", js.undefined)
      
      inline def setNorm(value: String): Self = StObject.set(x, "norm", value.asInstanceOf[js.Any])
      
      inline def setNormUndefined: Self = StObject.set(x, "norm", js.undefined)
      
      inline def setNs(value: Double): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
      
      inline def setNsUndefined: Self = StObject.set(x, "ns", js.undefined)
      
      inline def setTr(value: Double): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
      
      inline def setTrUndefined: Self = StObject.set(x, "tr", js.undefined)
    }
  }
  
  trait TexParams extends StObject {
    
    var offset: Vector2
    
    var scale: Vector2
    
    var url: String
  }
  object TexParams {
    
    inline def apply(offset: Vector2, scale: Vector2, url: String): TexParams = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[TexParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TexParams] (val x: Self) extends AnyVal {
      
      inline def setOffset(value: Vector2): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setScale(value: Vector2): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
