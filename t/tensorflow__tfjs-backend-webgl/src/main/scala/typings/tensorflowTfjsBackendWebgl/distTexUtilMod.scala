package typings.tensorflowTfjsBackendWebgl

import typings.std.WebGLRenderingContext
import typings.std.WebGLTexture
import typings.tensorflowTfjsBackendWebgl.anon.FlatOffset
import typings.tensorflowTfjsBackendWebgl.anon.Imag
import typings.tensorflowTfjsCore.distTypesMod.BackendValues
import typings.tensorflowTfjsCore.distTypesMod.DataType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTexUtilMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/tex_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait PackingScheme extends StObject
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/tex_util", "PackingScheme")
  @js.native
  object PackingScheme extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PackingScheme & Double] = js.native
    
    /**
      * All values in a single texel are densely packed without any constraints.
      *
      * This is how the shader encodes a tensor with shape = [2, 3, 4]
      * (indices are [batch, row, col]).
      *
      * 000|001   010|011   020|021
      * -------   -------   -------
      * 002|003   012|013   022|023
      *
      * 100|101   110|111   120|121
      * -------   -------   -------
      * 102|103   112|113   122|123
      *
      */
    @js.native
    sealed trait DENSE
      extends StObject
         with PackingScheme
    /* 0 */ val DENSE: typings.tensorflowTfjsBackendWebgl.distTexUtilMod.PackingScheme.DENSE & Double = js.native
    
    /**
      * Single texels contain only values from the same batch, and from adjacent
      * rows and columns.
      *
      * This is how the shader encodes a tensor with shape = [2, 3, 5]
      * (indices are [batch, row, col]).
      *
      * 000|001   002|003   004|xxx   020|021   022|023   024|xxx
      * -------   -------   -------   -------   -------   -------
      * 010|011   012|013   014|xxx   xxx|xxx   xxx|xxx   xxx|xxx
      *
      * 100|101   102|103   104|xxx   120|121   122|123   124|xxx
      * -------   -------   -------   -------   -------   -------
      * 110|111   112|113   114|xxx   xxx|xxx   xxx|xxx   xxx|xxx
      *
      */
    @js.native
    sealed trait SHARED_BATCH
      extends StObject
         with PackingScheme
    /* 1 */ val SHARED_BATCH: typings.tensorflowTfjsBackendWebgl.distTexUtilMod.PackingScheme.SHARED_BATCH & Double = js.native
  }
  
  @js.native
  sealed trait PhysicalTextureType extends StObject
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/tex_util", "PhysicalTextureType")
  @js.native
  object PhysicalTextureType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PhysicalTextureType & Double] = js.native
    
    @js.native
    sealed trait PACKED_2X2_FLOAT16
      extends StObject
         with PhysicalTextureType
    /* 4 */ val PACKED_2X2_FLOAT16: typings.tensorflowTfjsBackendWebgl.distTexUtilMod.PhysicalTextureType.PACKED_2X2_FLOAT16 & Double = js.native
    
    @js.native
    sealed trait PACKED_2X2_FLOAT32
      extends StObject
         with PhysicalTextureType
    /* 3 */ val PACKED_2X2_FLOAT32: typings.tensorflowTfjsBackendWebgl.distTexUtilMod.PhysicalTextureType.PACKED_2X2_FLOAT32 & Double = js.native
    
    @js.native
    sealed trait PACKED_4X1_UNSIGNED_BYTE
      extends StObject
         with PhysicalTextureType
    /* 2 */ val PACKED_4X1_UNSIGNED_BYTE: typings.tensorflowTfjsBackendWebgl.distTexUtilMod.PhysicalTextureType.PACKED_4X1_UNSIGNED_BYTE & Double = js.native
    
    @js.native
    sealed trait UNPACKED_FLOAT16
      extends StObject
         with PhysicalTextureType
    /* 0 */ val UNPACKED_FLOAT16: typings.tensorflowTfjsBackendWebgl.distTexUtilMod.PhysicalTextureType.UNPACKED_FLOAT16 & Double = js.native
    
    @js.native
    sealed trait UNPACKED_FLOAT32
      extends StObject
         with PhysicalTextureType
    /* 1 */ val UNPACKED_FLOAT32: typings.tensorflowTfjsBackendWebgl.distTexUtilMod.PhysicalTextureType.UNPACKED_FLOAT32 & Double = js.native
  }
  
  @js.native
  sealed trait TextureUsage extends StObject
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/tex_util", "TextureUsage")
  @js.native
  object TextureUsage extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TextureUsage & Double] = js.native
    
    @js.native
    sealed trait DOWNLOAD
      extends StObject
         with TextureUsage
    /* 3 */ val DOWNLOAD: typings.tensorflowTfjsBackendWebgl.distTexUtilMod.TextureUsage.DOWNLOAD & Double = js.native
    
    @js.native
    sealed trait PIXELS
      extends StObject
         with TextureUsage
    /* 2 */ val PIXELS: typings.tensorflowTfjsBackendWebgl.distTexUtilMod.TextureUsage.PIXELS & Double = js.native
    
    @js.native
    sealed trait RENDER
      extends StObject
         with TextureUsage
    /* 0 */ val RENDER: typings.tensorflowTfjsBackendWebgl.distTexUtilMod.TextureUsage.RENDER & Double = js.native
    
    @js.native
    sealed trait UPLOAD
      extends StObject
         with TextureUsage
    /* 1 */ val UPLOAD: typings.tensorflowTfjsBackendWebgl.distTexUtilMod.TextureUsage.UPLOAD & Double = js.native
  }
  
  inline def decodeMatrixFromUnpackedColorRGBAArray(unpackedArray: js.typedarray.Float32Array, matrix: js.typedarray.Float32Array, channels: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeMatrixFromUnpackedColorRGBAArray")(unpackedArray.asInstanceOf[js.Any], matrix.asInstanceOf[js.Any], channels.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getColorMatrixTextureShapeWidthHeight(rows: Double, columns: Double): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getColorMatrixTextureShapeWidthHeight")(rows.asInstanceOf[js.Any], columns.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def getDenseTexShape(shape: js.Array[Double]): js.Tuple2[Double, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDenseTexShape")(shape.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def getMatrixSizeFromUnpackedArraySize(unpackedSize: Double, channelsPerTexture: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getMatrixSizeFromUnpackedArraySize")(unpackedSize.asInstanceOf[js.Any], channelsPerTexture.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getPackedMatrixTextureShapeWidthHeight(rows: Double, columns: Double): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPackedMatrixTextureShapeWidthHeight")(rows.asInstanceOf[js.Any], columns.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def getPackedRGBAArraySizeFromMatrixShape(rows: Double, columns: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getPackedRGBAArraySizeFromMatrixShape")(rows.asInstanceOf[js.Any], columns.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getTextureConfig(gl: WebGLRenderingContext): TextureConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("getTextureConfig")(gl.asInstanceOf[js.Any]).asInstanceOf[TextureConfig]
  inline def getTextureConfig(gl: WebGLRenderingContext, textureHalfFloatExtension: Any): TextureConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("getTextureConfig")(gl.asInstanceOf[js.Any], textureHalfFloatExtension.asInstanceOf[js.Any])).asInstanceOf[TextureConfig]
  
  inline def getUnpackedArraySizeFromMatrixSize(matrixSize: Double, channelsPerTexture: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getUnpackedArraySizeFromMatrixSize")(matrixSize.asInstanceOf[js.Any], channelsPerTexture.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getUnpackedMatrixTextureShapeWidthHeight(rows: Double, columns: Double): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getUnpackedMatrixTextureShapeWidthHeight")(rows.asInstanceOf[js.Any], columns.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  
  trait Texture extends StObject {
    
    var texShape: js.Tuple2[Double, Double]
    
    var texture: WebGLTexture
  }
  object Texture {
    
    inline def apply(texShape: js.Tuple2[Double, Double], texture: WebGLTexture): Texture = {
      val __obj = js.Dynamic.literal(texShape = texShape.asInstanceOf[js.Any], texture = texture.asInstanceOf[js.Any])
      __obj.asInstanceOf[Texture]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Texture] (val x: Self) extends AnyVal {
      
      inline def setTexShape(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "texShape", value.asInstanceOf[js.Any])
      
      inline def setTexture(value: WebGLTexture): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
    }
  }
  
  trait TextureConfig extends StObject {
    
    var defaultNumChannels: Double
    
    var downloadTextureFormat: Double
    
    var downloadUnpackNumChannels: Double
    
    var internalFormatFloat: Double
    
    var internalFormatHalfFloat: Double
    
    var internalFormatPackedFloat: Double
    
    var internalFormatPackedHalfFloat: Double
    
    var textureFormatFloat: Double
    
    var textureTypeFloat: Double
    
    var textureTypeHalfFloat: Double
  }
  object TextureConfig {
    
    inline def apply(
      defaultNumChannels: Double,
      downloadTextureFormat: Double,
      downloadUnpackNumChannels: Double,
      internalFormatFloat: Double,
      internalFormatHalfFloat: Double,
      internalFormatPackedFloat: Double,
      internalFormatPackedHalfFloat: Double,
      textureFormatFloat: Double,
      textureTypeFloat: Double,
      textureTypeHalfFloat: Double
    ): TextureConfig = {
      val __obj = js.Dynamic.literal(defaultNumChannels = defaultNumChannels.asInstanceOf[js.Any], downloadTextureFormat = downloadTextureFormat.asInstanceOf[js.Any], downloadUnpackNumChannels = downloadUnpackNumChannels.asInstanceOf[js.Any], internalFormatFloat = internalFormatFloat.asInstanceOf[js.Any], internalFormatHalfFloat = internalFormatHalfFloat.asInstanceOf[js.Any], internalFormatPackedFloat = internalFormatPackedFloat.asInstanceOf[js.Any], internalFormatPackedHalfFloat = internalFormatPackedHalfFloat.asInstanceOf[js.Any], textureFormatFloat = textureFormatFloat.asInstanceOf[js.Any], textureTypeFloat = textureTypeFloat.asInstanceOf[js.Any], textureTypeHalfFloat = textureTypeHalfFloat.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextureConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextureConfig] (val x: Self) extends AnyVal {
      
      inline def setDefaultNumChannels(value: Double): Self = StObject.set(x, "defaultNumChannels", value.asInstanceOf[js.Any])
      
      inline def setDownloadTextureFormat(value: Double): Self = StObject.set(x, "downloadTextureFormat", value.asInstanceOf[js.Any])
      
      inline def setDownloadUnpackNumChannels(value: Double): Self = StObject.set(x, "downloadUnpackNumChannels", value.asInstanceOf[js.Any])
      
      inline def setInternalFormatFloat(value: Double): Self = StObject.set(x, "internalFormatFloat", value.asInstanceOf[js.Any])
      
      inline def setInternalFormatHalfFloat(value: Double): Self = StObject.set(x, "internalFormatHalfFloat", value.asInstanceOf[js.Any])
      
      inline def setInternalFormatPackedFloat(value: Double): Self = StObject.set(x, "internalFormatPackedFloat", value.asInstanceOf[js.Any])
      
      inline def setInternalFormatPackedHalfFloat(value: Double): Self = StObject.set(x, "internalFormatPackedHalfFloat", value.asInstanceOf[js.Any])
      
      inline def setTextureFormatFloat(value: Double): Self = StObject.set(x, "textureFormatFloat", value.asInstanceOf[js.Any])
      
      inline def setTextureTypeFloat(value: Double): Self = StObject.set(x, "textureTypeFloat", value.asInstanceOf[js.Any])
      
      inline def setTextureTypeHalfFloat(value: Double): Self = StObject.set(x, "textureTypeHalfFloat", value.asInstanceOf[js.Any])
    }
  }
  
  trait TextureData extends StObject {
    
    var complexTensorInfos: js.UndefOr[Imag] = js.undefined
    
    var dtype: DataType
    
    var isPacked: js.UndefOr[Boolean] = js.undefined
    
    var refCount: Double
    
    var shape: js.Array[Double]
    
    var slice: js.UndefOr[FlatOffset] = js.undefined
    
    /** [rows, columns] shape of the texture. */
    var texShape: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var texture: js.UndefOr[Texture] = js.undefined
    
    var usage: js.UndefOr[TextureUsage] = js.undefined
    
    var values: js.UndefOr[BackendValues] = js.undefined
  }
  object TextureData {
    
    inline def apply(dtype: DataType, refCount: Double, shape: js.Array[Double]): TextureData = {
      val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any], refCount = refCount.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextureData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextureData] (val x: Self) extends AnyVal {
      
      inline def setComplexTensorInfos(value: Imag): Self = StObject.set(x, "complexTensorInfos", value.asInstanceOf[js.Any])
      
      inline def setComplexTensorInfosUndefined: Self = StObject.set(x, "complexTensorInfos", js.undefined)
      
      inline def setDtype(value: DataType): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      inline def setIsPacked(value: Boolean): Self = StObject.set(x, "isPacked", value.asInstanceOf[js.Any])
      
      inline def setIsPackedUndefined: Self = StObject.set(x, "isPacked", js.undefined)
      
      inline def setRefCount(value: Double): Self = StObject.set(x, "refCount", value.asInstanceOf[js.Any])
      
      inline def setShape(value: js.Array[Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeVarargs(value: Double*): Self = StObject.set(x, "shape", js.Array(value*))
      
      inline def setSlice(value: FlatOffset): Self = StObject.set(x, "slice", value.asInstanceOf[js.Any])
      
      inline def setSliceUndefined: Self = StObject.set(x, "slice", js.undefined)
      
      inline def setTexShape(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "texShape", value.asInstanceOf[js.Any])
      
      inline def setTexShapeUndefined: Self = StObject.set(x, "texShape", js.undefined)
      
      inline def setTexture(value: Texture): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
      
      inline def setTextureUndefined: Self = StObject.set(x, "texture", js.undefined)
      
      inline def setUsage(value: TextureUsage): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
      
      inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
      
      inline def setValues(value: BackendValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setValuesVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
}
