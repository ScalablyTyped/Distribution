package typings.tensorflowTfjsBackendWebgl

import typings.std.Float32Array
import typings.std.Uint8Array
import typings.std.WebGLRenderingContext
import typings.std.WebGLTexture
import typings.tensorflowTfjsBackendWebgl.anon.FlatOffset
import typings.tensorflowTfjsBackendWebgl.anon.Imag
import typings.tensorflowTfjsCore.distTypesMod.BackendValues
import typings.tensorflowTfjsCore.distTypesMod.DataType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object texUtilMod {
  
  @js.native
  sealed trait PackingScheme extends StObject
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/tex_util", "PackingScheme")
  @js.native
  object PackingScheme extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PackingScheme with Double] = js.native
    
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
    sealed trait DENSE extends PackingScheme
    /* 0 */ val DENSE: typings.tensorflowTfjsBackendWebgl.texUtilMod.PackingScheme.DENSE with Double = js.native
    
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
    sealed trait SHARED_BATCH extends PackingScheme
    /* 1 */ val SHARED_BATCH: typings.tensorflowTfjsBackendWebgl.texUtilMod.PackingScheme.SHARED_BATCH with Double = js.native
  }
  
  @js.native
  sealed trait PhysicalTextureType extends StObject
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/tex_util", "PhysicalTextureType")
  @js.native
  object PhysicalTextureType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PhysicalTextureType with Double] = js.native
    
    @js.native
    sealed trait PACKED_2X2_FLOAT16 extends PhysicalTextureType
    /* 4 */ val PACKED_2X2_FLOAT16: typings.tensorflowTfjsBackendWebgl.texUtilMod.PhysicalTextureType.PACKED_2X2_FLOAT16 with Double = js.native
    
    @js.native
    sealed trait PACKED_2X2_FLOAT32 extends PhysicalTextureType
    /* 3 */ val PACKED_2X2_FLOAT32: typings.tensorflowTfjsBackendWebgl.texUtilMod.PhysicalTextureType.PACKED_2X2_FLOAT32 with Double = js.native
    
    @js.native
    sealed trait PACKED_4X1_UNSIGNED_BYTE extends PhysicalTextureType
    /* 2 */ val PACKED_4X1_UNSIGNED_BYTE: typings.tensorflowTfjsBackendWebgl.texUtilMod.PhysicalTextureType.PACKED_4X1_UNSIGNED_BYTE with Double = js.native
    
    @js.native
    sealed trait UNPACKED_FLOAT16 extends PhysicalTextureType
    /* 0 */ val UNPACKED_FLOAT16: typings.tensorflowTfjsBackendWebgl.texUtilMod.PhysicalTextureType.UNPACKED_FLOAT16 with Double = js.native
    
    @js.native
    sealed trait UNPACKED_FLOAT32 extends PhysicalTextureType
    /* 1 */ val UNPACKED_FLOAT32: typings.tensorflowTfjsBackendWebgl.texUtilMod.PhysicalTextureType.UNPACKED_FLOAT32 with Double = js.native
  }
  
  @js.native
  sealed trait TextureUsage extends StObject
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/tex_util", "TextureUsage")
  @js.native
  object TextureUsage extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TextureUsage with Double] = js.native
    
    @js.native
    sealed trait DOWNLOAD extends TextureUsage
    /* 3 */ val DOWNLOAD: typings.tensorflowTfjsBackendWebgl.texUtilMod.TextureUsage.DOWNLOAD with Double = js.native
    
    @js.native
    sealed trait PIXELS extends TextureUsage
    /* 2 */ val PIXELS: typings.tensorflowTfjsBackendWebgl.texUtilMod.TextureUsage.PIXELS with Double = js.native
    
    @js.native
    sealed trait RENDER extends TextureUsage
    /* 0 */ val RENDER: typings.tensorflowTfjsBackendWebgl.texUtilMod.TextureUsage.RENDER with Double = js.native
    
    @js.native
    sealed trait UPLOAD extends TextureUsage
    /* 1 */ val UPLOAD: typings.tensorflowTfjsBackendWebgl.texUtilMod.TextureUsage.UPLOAD with Double = js.native
  }
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/tex_util", "decodeMatrixFromUnpackedColorRGBAArray")
  @js.native
  def decodeMatrixFromUnpackedColorRGBAArray(unpackedArray: Float32Array, matrix: Float32Array, channels: Double): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/tex_util", "getColorMatrixTextureShapeWidthHeight")
  @js.native
  def getColorMatrixTextureShapeWidthHeight(rows: Double, columns: Double): js.Tuple2[Double, Double] = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/tex_util", "getDenseTexShape")
  @js.native
  def getDenseTexShape(shape: js.Array[Double]): js.Tuple2[Double, Double] = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/tex_util", "getMatrixSizeFromUnpackedArraySize")
  @js.native
  def getMatrixSizeFromUnpackedArraySize(unpackedSize: Double, channelsPerTexture: Double): Double = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/tex_util", "getPackedMatrixTextureShapeWidthHeight")
  @js.native
  def getPackedMatrixTextureShapeWidthHeight(rows: Double, columns: Double): js.Tuple2[Double, Double] = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/tex_util", "getPackedRGBAArraySizeFromMatrixShape")
  @js.native
  def getPackedRGBAArraySizeFromMatrixShape(rows: Double, columns: Double): Double = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/tex_util", "getTextureConfig")
  @js.native
  def getTextureConfig(gl: WebGLRenderingContext): TextureConfig = js.native
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/tex_util", "getTextureConfig")
  @js.native
  def getTextureConfig(gl: WebGLRenderingContext, textureHalfFloatExtension: js.Any): TextureConfig = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/tex_util", "getUnpackedArraySizeFromMatrixSize")
  @js.native
  def getUnpackedArraySizeFromMatrixSize(matrixSize: Double, channelsPerTexture: Double): Double = js.native
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/tex_util", "getUnpackedMatrixTextureShapeWidthHeight")
  @js.native
  def getUnpackedMatrixTextureShapeWidthHeight(rows: Double, columns: Double): js.Tuple2[Double, Double] = js.native
  
  @js.native
  trait TextureConfig extends StObject {
    
    var defaultNumChannels: Double = js.native
    
    var downloadTextureFormat: Double = js.native
    
    var downloadUnpackNumChannels: Double = js.native
    
    var internalFormatFloat: Double = js.native
    
    var internalFormatHalfFloat: Double = js.native
    
    var internalFormatPackedFloat: Double = js.native
    
    var internalFormatPackedHalfFloat: Double = js.native
    
    var textureFormatFloat: Double = js.native
    
    var textureTypeFloat: Double = js.native
    
    var textureTypeHalfFloat: Double = js.native
  }
  object TextureConfig {
    
    @scala.inline
    def apply(
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
    implicit class TextureConfigMutableBuilder[Self <: TextureConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultNumChannels(value: Double): Self = StObject.set(x, "defaultNumChannels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadTextureFormat(value: Double): Self = StObject.set(x, "downloadTextureFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadUnpackNumChannels(value: Double): Self = StObject.set(x, "downloadUnpackNumChannels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternalFormatFloat(value: Double): Self = StObject.set(x, "internalFormatFloat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternalFormatHalfFloat(value: Double): Self = StObject.set(x, "internalFormatHalfFloat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternalFormatPackedFloat(value: Double): Self = StObject.set(x, "internalFormatPackedFloat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternalFormatPackedHalfFloat(value: Double): Self = StObject.set(x, "internalFormatPackedHalfFloat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextureFormatFloat(value: Double): Self = StObject.set(x, "textureFormatFloat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextureTypeFloat(value: Double): Self = StObject.set(x, "textureTypeFloat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextureTypeHalfFloat(value: Double): Self = StObject.set(x, "textureTypeHalfFloat", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TextureData extends StObject {
    
    var complexParentRefCount: Double = js.native
    
    var complexTensorInfos: js.UndefOr[Imag] = js.native
    
    var dtype: DataType = js.native
    
    var isPacked: js.UndefOr[Boolean] = js.native
    
    var refCount: Double = js.native
    
    var shape: js.Array[Double] = js.native
    
    var slice: js.UndefOr[FlatOffset] = js.native
    
    /** [rows, columns] shape of the texture. */
    var texShape: js.UndefOr[js.Tuple2[Double, Double]] = js.native
    
    var texture: js.UndefOr[WebGLTexture] = js.native
    
    var usage: js.UndefOr[TextureUsage] = js.native
    
    var values: js.UndefOr[BackendValues] = js.native
  }
  object TextureData {
    
    @scala.inline
    def apply(complexParentRefCount: Double, dtype: DataType, refCount: Double, shape: js.Array[Double]): TextureData = {
      val __obj = js.Dynamic.literal(complexParentRefCount = complexParentRefCount.asInstanceOf[js.Any], dtype = dtype.asInstanceOf[js.Any], refCount = refCount.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextureData]
    }
    
    @scala.inline
    implicit class TextureDataMutableBuilder[Self <: TextureData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComplexParentRefCount(value: Double): Self = StObject.set(x, "complexParentRefCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComplexTensorInfos(value: Imag): Self = StObject.set(x, "complexTensorInfos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComplexTensorInfosUndefined: Self = StObject.set(x, "complexTensorInfos", js.undefined)
      
      @scala.inline
      def setDtype(value: DataType): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPacked(value: Boolean): Self = StObject.set(x, "isPacked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPackedUndefined: Self = StObject.set(x, "isPacked", js.undefined)
      
      @scala.inline
      def setRefCount(value: Double): Self = StObject.set(x, "refCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShape(value: js.Array[Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeVarargs(value: Double*): Self = StObject.set(x, "shape", js.Array(value :_*))
      
      @scala.inline
      def setSlice(value: FlatOffset): Self = StObject.set(x, "slice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSliceUndefined: Self = StObject.set(x, "slice", js.undefined)
      
      @scala.inline
      def setTexShape(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "texShape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTexShapeUndefined: Self = StObject.set(x, "texShape", js.undefined)
      
      @scala.inline
      def setTexture(value: WebGLTexture): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextureUndefined: Self = StObject.set(x, "texture", js.undefined)
      
      @scala.inline
      def setUsage(value: TextureUsage): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
      
      @scala.inline
      def setValues(value: BackendValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setValuesVarargs(value: Uint8Array*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
}
