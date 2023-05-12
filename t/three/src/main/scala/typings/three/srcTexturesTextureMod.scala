package typings.three

import typings.std.EventTarget
import typings.std.TexImageSource
import typings.three.srcConstantsMod.AnyMapping
import typings.three.srcConstantsMod.AnyPixelFormat
import typings.three.srcConstantsMod.ColorSpace
import typings.three.srcConstantsMod.MagnificationTextureFilter
import typings.three.srcConstantsMod.Mapping
import typings.three.srcConstantsMod.MinificationTextureFilter
import typings.three.srcConstantsMod.PixelFormat
import typings.three.srcConstantsMod.PixelFormatGPU
import typings.three.srcConstantsMod.TextureDataType
import typings.three.srcConstantsMod.TextureEncoding
import typings.three.srcConstantsMod.Wrapping
import typings.three.srcCoreEventDispatcherMod.Event
import typings.three.srcCoreEventDispatcherMod.EventDispatcher
import typings.three.srcMathMatrix3Mod.Matrix3
import typings.three.srcMathVector2Mod.Vector2
import typings.three.srcTexturesSourceMod.Source
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTexturesTextureMod {
  
  @JSImport("three/src/textures/Texture", "Texture")
  @js.native
  open class Texture protected () extends EventDispatcher[Event] {
    /**
      * This creates a new {@link THREE.Texture | Texture} object.
      * @param image See {@link Texture.image | .image}. Default {@link THREE.Texture.DEFAULT_IMAGE}
      * @param mapping See {@link Texture.mapping | .mapping}. Default {@link THREE.Texture.DEFAULT_MAPPING}
      * @param wrapS See {@link Texture.wrapS | .wrapS}. Default {@link THREE.ClampToEdgeWrapping}
      * @param wrapT See {@link Texture.wrapT | .wrapT}. Default {@link THREE.ClampToEdgeWrapping}
      * @param magFilter See {@link Texture.magFilter | .magFilter}. Default {@link THREE.LinearFilter}
      * @param minFilter  See {@link Texture.minFilter | .minFilter}. Default {@link THREE.LinearMipmapLinearFilter}
      * @param format See {@link Texture.format | .format}. Default {@link THREE.RGBAFormat}
      * @param type See {@link Texture.type | .type}. Default {@link THREE.UnsignedByteType}
      * @param anisotropy See {@link Texture.anisotropy | .anisotropy}. Default {@link THREE.Texture.DEFAULT_ANISOTROPY}
      * @param colorSpace See {@link Texture.colorSpace | .colorSpace}. Default {@link THREE.NoColorSpace}
      */
    def this(
      image: js.UndefOr[TexImageSource | OffscreenCanvas],
      mapping: js.UndefOr[Mapping],
      wrapS: js.UndefOr[Wrapping],
      wrapT: js.UndefOr[Wrapping],
      magFilter: js.UndefOr[MagnificationTextureFilter],
      minFilter: js.UndefOr[MinificationTextureFilter],
      format: js.UndefOr[PixelFormat],
      `type`: js.UndefOr[TextureDataType],
      anisotropy: js.UndefOr[Double],
      colorSpace: js.UndefOr[ColorSpace]
    ) = this()
    /**
      * @deprecated
      */
    def this(
      image: TexImageSource,
      mapping: Mapping,
      wrapS: Wrapping,
      wrapT: Wrapping,
      magFilter: MagnificationTextureFilter,
      minFilter: MinificationTextureFilter,
      format: PixelFormat,
      `type`: TextureDataType,
      anisotropy: Double,
      encoding: TextureEncoding
    ) = this()
    def this(
      image: OffscreenCanvas,
      mapping: Mapping,
      wrapS: Wrapping,
      wrapT: Wrapping,
      magFilter: MagnificationTextureFilter,
      minFilter: MinificationTextureFilter,
      format: PixelFormat,
      `type`: TextureDataType,
      anisotropy: Double,
      encoding: TextureEncoding
    ) = this()
    
    /**
      * The number of samples taken along the axis through the pixel that has the highest density of texels.
      * @remarks A higher value gives a less blurry result than a basic mipmap, at the cost of more {@link Texture} samples being used.
      * @remarks Use {@link THREE.WebGLCapabilities.getMaxAnisotropy() | renderer.capabilities.getMaxAnisotropy()} to find the maximum valid anisotropy value for the GPU;
      * @remarks This value is usually a power of 2.
      * @default _value of_ {@link THREE.Texture.DEFAULT_ANISOTROPY}. That is normally `1`.
      */
    var anisotropy: Double = js.native
    
    /**
      * The point around which rotation occurs.
      * @remarks A value of `(0.5, 0.5)` corresponds to the center of the texture.
      * @defaultValue `new THREE.Vector2( 0, 0 )`, _lower left._
      */
    var center: Vector2 = js.native
    
    /**
      * Lets you select the uv attribute to map the texture to. `0` for `uv`, `1` for `uv1`, `2` for `uv2` and `3` for
      * `uv3`.
      */
    var channel: Double = js.native
    
    /**
      * The {@link Textures | {@link Texture} constants} page for details of other color spaces.
      * @remarks
      * Textures containing color data should be annotated with {@link SRGBColorSpace THREE.SRGBColorSpace} or
      * {@link LinearSRGBColorSpace THREE.LinearSRGBColorSpace}.
      * @see {@link https://threejs.org/docs/index.html#api/en/constants/Textures | Texture Constants}
      * @see {@link THREE.TextureDataType}
      * @defaultValue {@link THREE.NoColorSpace}
      */
    var colorSpace: ColorSpace = js.native
    
    def copy(source: Texture): this.type = js.native
    
    /**
      * Frees the GPU-related resources allocated by this instance
      * @remarks Call this method whenever this instance is no longer used in your app.
      */
    def dispose(): Unit = js.native
    
    // TODO Fix typing to only allow the expected values.
    /**
      * The {@link Textures | {@link Texture} constants} page for details of other formats.
      * @remarks
      * Values of {@link encoding} !== {@link THREE.LinearEncoding} are only supported on _map_, _envMap_ and _emissiveMap_.
      * @remarks
      * Note that if this value is changed on a texture after the material has been used, it is necessary to trigger a {@link THREE.Material.needsUpdate} for this value to be realized in the shader.
      * @see {@link https://threejs.org/docs/index.html#api/en/constants/Textures | Texture Constants}
      * @see {@link THREE.TextureDataType}
      * @defaultValue {@link THREE.LinearEncoding}
      * @deprecated Use {@link Texture.colorSpace .colorSpace} in three.js r152+.
      */
    var encoding: TextureEncoding = js.native
    
    /**
      * If set to `true`, the texture is flipped along the vertical axis when uploaded to the GPU.
      * @remarks
      * Note that this property has no effect for {@link https://developer.mozilla.org/en-US/docs/Web/API/ImageBitmap | ImageBitmap}.
      * You need to configure on bitmap creation instead. See {@link THREE.ImageBitmapLoader | ImageBitmapLoader}.
      * @see {@link THREE.ImageBitmapLoader | ImageBitmapLoader}.
      * @defaultValue `true`
      */
    var flipY: Boolean = js.native
    
    /**
      * These define how elements of a 2D texture, or texels, are read by shaders.
      * @remarks All {@link Texture} types except {@link THREE.DeepTexture} and {@link THREE.CompressedPixelFormat} expect the _values_ be {@link THREE.PixelFormat}
      * @remarks {@link DeepTexture} expect the _values_ be {@link THREE.CubeTextureMapping}
      * @remarks {@link CompressedPixelFormat} expect the _values_ be {@link THREE.CubeTextureMapping}
      * @see {@link https://threejs.org/docs/index.html#api/en/constants/Textures | Texture Constants}
      * @see {@link THREE.PixelFormat}
      * @defaultValue {@link THREE.RGBAFormat}.
      */
    var format: AnyPixelFormat = js.native
    
    /**
      * Whether to generate mipmaps, _(if possible)_ for a texture.
      * @remarks Set this to false if you are creating mipmaps manually.
      * @defaultValue true
      */
    var generateMipmaps: Boolean = js.native
    
    /**
      * Unique number for this {@link Texture} instance.
      * @remarks Note that ids are assigned in chronological order: 1, 2, 3, ..., incrementing by one for each new object.
      * @remarks Expects a `Integer`
      */
    val id: Double = js.native
    
    /**
      * An image object, typically created using the {@link THREE.TextureLoader.load | TextureLoader.load()} method.
      * @remarks This can be any image (e.g., PNG, JPG, GIF, DDS) or video (e.g., MP4, OGG/OGV) type supported by three.js.
      * @remarks To use video as a {@link Texture} you need to have a playing HTML5 video element as a source
      * for your {@link Texture} image and continuously update this {@link Texture}
      * as long as video is playing - the {@link THREE.VideoTexture | VideoTexture} class handles this automatically.
      */
    def image: Any = js.native
    def image_=(data: Any): Unit = js.native
    
    /**
      * The GPU Pixel Format allows the developer to specify how the data is going to be stored on the GPU.
      * @remarks Compatible only with {@link WebGL2RenderingContext | WebGL 2 Rendering Context}.
      * @see {@link https://threejs.org/docs/index.html#api/en/constants/Textures | Texture Constants}
      * @defaultValue The default value is obtained using a combination of {@link Texture.format | .format} and {@link Texture.type | .type}.
      */
    var internalFormat: PixelFormatGPU | Null = js.native
    
    /**
      * Indicates whether a texture belongs to a render target or not
      * @defaultValue `false`
      */
    var isRenderTargetTexture: Boolean = js.native
    
    /**
      * Read-only flag to check if a given object is of type {@link Texture}.
      * @remarks This is a _constant_ value
      * @defaultValue `true`
      */
    val isTexture: `true` = js.native
    
    /**
      * How the {@link Texture} is sampled when a texel covers more than one pixel.
      * @see {@link https://threejs.org/docs/index.html#api/en/constants/Textures | Texture Constants}
      * @see {@link minFilter}
      * @see {@link THREE.MagnificationTextureFilter}
      * @defaultValue {@link THREE.LinearFilter}
      */
    var magFilter: MagnificationTextureFilter = js.native
    
    // ImageData[] for 2D textures and CubeTexture[] for cube textures;
    /**
      * How the image is applied to the object.
      * @remarks All {@link Texture} types except {@link THREE.CubeTexture} expect the _values_ be {@link THREE.Mapping}
      * @remarks {@link CubeTexture} expect the _values_ be {@link THREE.CubeTextureMapping}
      * @see {@link https://threejs.org/docs/index.html#api/en/constants/Textures | Texture Constants}
      * @defaultValue _value of_ {@link THREE.Texture.DEFAULT_MAPPING}
      */
    var mapping: AnyMapping = js.native
    
    /**
      * The uv-transform matrix for the texture.
      * @remarks
      * When {@link Texture.matrixAutoUpdate | .matrixAutoUpdate} property is `true`.
      * Will be updated by the renderer from the properties:
      *  - {@link Texture.offset | .offset}
      *  - {@link Texture.repeat | .repeat}
      *  - {@link Texture.rotation | .rotation}
      *  - {@link Texture.center | .center}
      * @remarks
      * When {@link Texture.matrixAutoUpdate | .matrixAutoUpdate} property is `false`.
      * This matrix may be set manually.
      * @see {@link matrixAutoUpdate | .matrixAutoUpdate}
      * @defaultValue `new THREE.Matrix3()`
      */
    var matrix: Matrix3 = js.native
    
    /**
      * Whether is to update the texture's uv-transform {@link matrix | .matrix}.
      * @remarks Set this to `false` if you are specifying the uv-transform {@link matrix} directly.
      * @see {@link matrix | .matrix}
      * @defaultValue `true`
      */
    var matrixAutoUpdate: Boolean = js.native
    
    /**
      * How the {@link Texture} is sampled when a texel covers less than one pixel.
      * @see {@link https://threejs.org/docs/index.html#api/en/constants/Textures | Texture Constants}
      * @see {@link magFilter}
      * @see {@link THREE.MinificationTextureFilter}
      * @defaultValue {@link THREE.LinearMipmapLinearFilter}
      */
    var minFilter: MinificationTextureFilter = js.native
    
    /**
      * Array of user-specified mipmaps
      * @defaultValue `[]`
      */
    var mipmaps: js.Array[Any] = js.native
    
    /**
      * Optional name of the object
      * @remarks _(doesn't need to be unique)_.
      * @defaultValue `""`
      */
    var name: String = js.native
    
    /**
      * Indicates whether this texture should be processed by {@link THREE.PMREMGenerator} or not.
      * @remarks Only relevant for render target textures.
      * @defaultValue `false`
      */
    var needsPMREMUpdate: Boolean = js.native
    
    /**
      * Set this to `true` to trigger an update next time the texture is used. Particularly important for setting the wrap mode.
      */
    def needsUpdate_=(value: Boolean): Unit = js.native
    
    /**
      * How much a single repetition of the texture is offset from the beginning, in each direction **U** and **V**.
      * @remarks Typical range is `0.0` to `1.0`.
      * @defaultValue `new THREE.Vector2(0, 0)`
      */
    var offset: Vector2 = js.native
    
    /**
      * A callback function, called when the texture is updated _(e.g., when needsUpdate has been set to true and then the texture is used)_.
      */
    def onUpdate(): Unit = js.native
    
    /**
      * If set to `true`, the alpha channel, if present, is multiplied into the color channels when the texture is uploaded to the GPU.
      * @remarks
      * Note that this property has no effect for {@link https://developer.mozilla.org/en-US/docs/Web/API/ImageBitmap | ImageBitmap}.
      * You need to configure on bitmap creation instead. See {@link THREE.ImageBitmapLoader | ImageBitmapLoader}.
      * @see {@link THREE.ImageBitmapLoader | ImageBitmapLoader}.
      * @defaultValue `false`
      */
    var premultiplyAlpha: Boolean = js.native
    
    /**
      * How many times the texture is repeated across the surface, in each direction **U** and **V**.
      * @remarks
      * If repeat is set greater than `1` in either direction, the corresponding *Wrap* parameter should
      * also be set to {@link THREE.RepeatWrapping} or {@link THREE.MirroredRepeatWrapping} to achieve the desired tiling effect.
      * @see {@link wrapS}
      * @see {@link wrapT}
      * @defaultValue `new THREE.Vector2( 1, 1 )`
      */
    var repeat: Vector2 = js.native
    
    /**
      * How much the texture is rotated around the center point, in radians.
      * @remarks Positive values are counter-clockwise.
      * @defaultValue `0`
      */
    var rotation: Double = js.native
    
    /**
      * The data definition of a texture. A reference to the data source can be shared across textures.
      * This is often useful in context of spritesheets where multiple textures render the same data
      * but with different {@link Texture} transformations.
      */
    var source: Source = js.native
    
    /**
      * Convert the texture to three.js {@link https://github.com/mrdoob/three.js/wiki/JSON-Object-Scene-format-4 | JSON Object/Scene format}.
      * @param meta Optional object containing metadata.
      */
    def toJSON(): js.Object = js.native
    def toJSON(meta: String): js.Object = js.native
    def toJSON(meta: js.Object): js.Object = js.native
    
    /**
      * Transform the **UV** based on the value of this texture's
      * {@link offset | .offset},
      * {@link repeat | .repeat},
      * {@link wrapS | .wrapS},
      * {@link wrapT | .wrapT} and
      * {@link flipY | .flipY} properties.
      * @param uv
      */
    def transformUv(uv: Vector2): Vector2 = js.native
    
    /**
      * This must correspond to the {@link Texture.format | .format}.
      * @remarks {@link THREE.UnsignedByteType}, is the type most used by Texture formats.
      * @see {@link https://threejs.org/docs/index.html#api/en/constants/Textures | Texture Constants}
      * @see {@link THREE.TextureDataType}
      * @defaultValue {@link THREE.UnsignedByteType}
      */
    var `type`: TextureDataType = js.native
    
    /**
      * Specifies the alignment requirements for the start of each pixel row in memory.
      * @remarks
      * The allowable values are:
      *  - `1` (byte-alignment)
      *  - `2` (rows aligned to even-numbered bytes)
      *  - `4` (word-alignment)
      *  - `8` (rows start on double-word boundaries).
      * @see {@link http://www.khronos.org/opengles/sdk/docs/man/xhtml/glPixelStorei.xml | glPixelStorei} for more information.
      * @defaultValue `4`
      */
    var unpackAlignment: Double = js.native
    
    /**
      * Update the texture's **UV-transform** {@link matrix | .matrix} from the texture properties
      * {@link offset | .offset},
      * {@link repeat | .repeat},
      * {@link rotation | .rotation} and
      * {@link center | .center}.
      */
    def updateMatrix(): Unit = js.native
    
    /**
      * An object that can be used to store custom data about the texture.
      * @remarks It should not hold references to functions as these will not be cloned.
      * @defaultValue `{}`
      */
    var userData: Any = js.native
    
    /**
      * {@link http://en.wikipedia.org/wiki/Universally_unique_identifier | UUID} of this object instance.
      * @remarks This gets automatically assigned and shouldn't be edited.
      */
    var uuid: String = js.native
    
    /**
      * This starts at `0` and counts how many times {@link needsUpdate | .needsUpdate} is set to `true`.
      * @remarks Expects a `Integer`
      * @defaultValue `0`
      */
    var version: Double = js.native
    
    /**
      * This defines how the {@link Texture} is wrapped *horizontally* and corresponds to **U** in UV mapping.
      * @remarks for **WEBGL1** - tiling of images in textures only functions if image dimensions are powers of two
      * (2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, ...) in terms of pixels.
      * Individual dimensions need not be equal, but each must be a power of two. This is a limitation of WebGL1, not three.js.
      * **WEBGL2** does not have this limitation.
      * @see {@link https://threejs.org/docs/index.html#api/en/constants/Textures | Texture Constants}
      * @see {@link wrapT}
      * @see {@link repeat}
      * @defaultValue {@link THREE.ClampToEdgeWrapping}
      */
    var wrapS: Wrapping = js.native
    
    /**
      * This defines how the {@link Texture} is wrapped *vertically* and corresponds to **V** in UV mapping.
      * @remarks for **WEBGL1** - tiling of images in textures only functions if image dimensions are powers of two
      * (2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, ...) in terms of pixels.
      * Individual dimensions need not be equal, but each must be a power of two. This is a limitation of WebGL1, not three.js.
      * **WEBGL2** does not have this limitation.
      * @see {@link https://threejs.org/docs/index.html#api/en/constants/Textures | Texture Constants}
      * @see {@link wrapS}
      * @see {@link repeat}
      * @defaultValue {@link THREE.ClampToEdgeWrapping}
      */
    var wrapT: Wrapping = js.native
  }
  /* static members */
  object Texture {
    
    @JSImport("three/src/textures/Texture", "Texture")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The Global default value for {@link anisotropy | .anisotropy}.
      * @defaultValue `1`.
      */
    @JSImport("three/src/textures/Texture", "Texture.DEFAULT_ANISOTROPY")
    @js.native
    def DEFAULT_ANISOTROPY: Double = js.native
    inline def DEFAULT_ANISOTROPY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_ANISOTROPY")(x.asInstanceOf[js.Any])
    
    /**
      * The Global default value for {@link Texture.image | .image}.
      * @defaultValue `null`.
      */
    @JSImport("three/src/textures/Texture", "Texture.DEFAULT_IMAGE")
    @js.native
    def DEFAULT_IMAGE: Any = js.native
    inline def DEFAULT_IMAGE_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_IMAGE")(x.asInstanceOf[js.Any])
    
    /**
      * The Global default value for {@link mapping | .mapping}.
      * @defaultValue {@link THREE.UVMapping}
      */
    @JSImport("three/src/textures/Texture", "Texture.DEFAULT_MAPPING")
    @js.native
    def DEFAULT_MAPPING: Mapping = js.native
    inline def DEFAULT_MAPPING_=(x: Mapping): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MAPPING")(x.asInstanceOf[js.Any])
  }
  
  type OffscreenCanvas = EventTarget
}
