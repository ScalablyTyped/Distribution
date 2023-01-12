package typings.tensorflowTfjsData

import org.scalablytyped.runtime.StringDictionary
import typings.std.Blob
import typings.std.File
import typings.std.MediaTrackConstraints
import typings.tensorflowTfjsCore.distTensorTypesMod.TensorContainer
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsData.tensorflowTfjsDataInts.`44100`
import typings.tensorflowTfjsData.tensorflowTfjsDataInts.`48000`
import typings.tensorflowTfjsData.tensorflowTfjsDataStrings.environment
import typings.tensorflowTfjsData.tensorflowTfjsDataStrings.user
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  trait CSVConfig extends StObject {
    
    /**
      * A dictionary whose key is column names, value is an object stating if this
      * column is required, column's data type, default value, and if this column
      * is label. If provided, keys must correspond to names provided in
      * `columnNames` or inferred from the file header lines. If any column is
      * marked as label, the .csv() API will return an array of two items: the
      * first item is a dict of features key/value pairs, the second item is a dict
      * of labels key/value pairs. If no column is marked as label returns a dict
      * of features only.
      *
      * Has the following fields:
      * - `required` If value in this column is required. If set to `true`, throw
      * an error when it finds an empty value.
      *
      * - `dtype` Data type of this column. Could be int32, float32, bool, or
      * string.
      *
      * - `default` Default value of this column.
      *
      * - `isLabel` Whether this column is label instead of features. If isLabel is
      * `true` for at least one column, the element in returned `CSVDataset` will
      * be an object of {xs: features, ys: labels}: xs is a dict of features
      * key/value pairs, ys is a dict of labels key/value pairs. If no column is
      * marked as label, returns a dict of features only.
      */
    var columnConfigs: js.UndefOr[StringDictionary[ColumnConfig]] = js.undefined
    
    /**
      * A list of strings that corresponds to the CSV column names, in order. If
      * provided, it ignores the column names inferred from the header row. If not
      * provided, infers the column names from the first row of the records. If
      * `hasHeader` is false and `columnNames` is not provided, this method will
      * throw an error.
      */
    var columnNames: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * If true, only columns provided in `columnConfigs` will be parsed and
      * provided during iteration.
      */
    var configuredColumnsOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, delimiter field should be null. Parsing delimiter is whitespace
      * and treat continuous multiple whitespace as one delimiter.
      */
    var delimWhitespace: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The string used to parse each line of the input file.
      */
    var delimiter: js.UndefOr[String] = js.undefined
    
    /**
      * A boolean value that indicates whether the first row of provided CSV file
      * is a header line with column names, and should not be included in the data.
      */
    var hasHeader: js.UndefOr[Boolean] = js.undefined
  }
  object CSVConfig {
    
    inline def apply(): CSVConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSVConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CSVConfig] (val x: Self) extends AnyVal {
      
      inline def setColumnConfigs(value: StringDictionary[ColumnConfig]): Self = StObject.set(x, "columnConfigs", value.asInstanceOf[js.Any])
      
      inline def setColumnConfigsUndefined: Self = StObject.set(x, "columnConfigs", js.undefined)
      
      inline def setColumnNames(value: js.Array[String]): Self = StObject.set(x, "columnNames", value.asInstanceOf[js.Any])
      
      inline def setColumnNamesUndefined: Self = StObject.set(x, "columnNames", js.undefined)
      
      inline def setColumnNamesVarargs(value: String*): Self = StObject.set(x, "columnNames", js.Array(value*))
      
      inline def setConfiguredColumnsOnly(value: Boolean): Self = StObject.set(x, "configuredColumnsOnly", value.asInstanceOf[js.Any])
      
      inline def setConfiguredColumnsOnlyUndefined: Self = StObject.set(x, "configuredColumnsOnly", js.undefined)
      
      inline def setDelimWhitespace(value: Boolean): Self = StObject.set(x, "delimWhitespace", value.asInstanceOf[js.Any])
      
      inline def setDelimWhitespaceUndefined: Self = StObject.set(x, "delimWhitespace", js.undefined)
      
      inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      inline def setHasHeader(value: Boolean): Self = StObject.set(x, "hasHeader", value.asInstanceOf[js.Any])
      
      inline def setHasHeaderUndefined: Self = StObject.set(x, "hasHeader", js.undefined)
    }
  }
  
  trait ColumnConfig extends StObject {
    
    var default: js.UndefOr[TensorContainer] = js.undefined
    
    var dtype: js.UndefOr[DataType] = js.undefined
    
    var isLabel: js.UndefOr[Boolean] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
  }
  object ColumnConfig {
    
    inline def apply(): ColumnConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColumnConfig] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: TensorContainer): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDtype(value: DataType): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      inline def setDtypeUndefined: Self = StObject.set(x, "dtype", js.undefined)
      
      inline def setIsLabel(value: Boolean): Self = StObject.set(x, "isLabel", value.asInstanceOf[js.Any])
      
      inline def setIsLabelUndefined: Self = StObject.set(x, "isLabel", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    }
  }
  
  type Container[T] = ContainerObject[T] | ContainerArray[T]
  
  type ContainerArray[T] = js.Array[ContainerOrT[T]]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type ContainerObject = {[x: string] : @tensorflow/tfjs-data.@tensorflow/tfjs-data/dist/types.ContainerOrT<T>}
  }}}
  to avoid circular code involving: 
  - @tensorflow/tfjs-data.@tensorflow/tfjs-data/dist/dataset.DatasetContainer
  - @tensorflow/tfjs-data.@tensorflow/tfjs-data/dist/iterators/lazy_iterator.IteratorContainer
  - @tensorflow/tfjs-data.@tensorflow/tfjs-data/dist/types.Container
  - @tensorflow/tfjs-data.@tensorflow/tfjs-data/dist/types.ContainerArray
  - @tensorflow/tfjs-data.@tensorflow/tfjs-data/dist/types.ContainerObject
  - @tensorflow/tfjs-data.@tensorflow/tfjs-data/dist/types.ContainerOrT
  */
  trait ContainerObject[T]
    extends StObject
       with /* x */ StringDictionary[ContainerOrT[T]]
  object ContainerObject {
    
    inline def apply[T](): ContainerObject[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContainerObject[T]]
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type ContainerOrT = @tensorflow/tfjs-data.@tensorflow/tfjs-data/dist/types.Container<T> | T
  }}}
  to avoid circular code involving: 
  - @tensorflow/tfjs-data.@tensorflow/tfjs-data/dist/dataset.DatasetContainer
  - @tensorflow/tfjs-data.@tensorflow/tfjs-data/dist/iterators/lazy_iterator.IteratorContainer
  - @tensorflow/tfjs-data.@tensorflow/tfjs-data/dist/types.Container
  - @tensorflow/tfjs-data.@tensorflow/tfjs-data/dist/types.ContainerArray
  - @tensorflow/tfjs-data.@tensorflow/tfjs-data/dist/types.ContainerOrT
  */
  type ContainerOrT[T] = Any | T
  
  type FileElement = File | Blob | js.typedarray.Uint8Array
  
  trait MicrophoneConfig extends StObject {
    
    var audioTrackConstraints: js.UndefOr[MediaTrackConstraints] = js.undefined
    
    var columnTruncateLength: js.UndefOr[Double] = js.undefined
    
    var fftSize: js.UndefOr[Double] = js.undefined
    
    var includeSpectrogram: js.UndefOr[Boolean] = js.undefined
    
    var includeWaveform: js.UndefOr[Boolean] = js.undefined
    
    var numFramesPerSpectrogram: js.UndefOr[Double] = js.undefined
    
    var sampleRateHz: js.UndefOr[`44100` | `48000`] = js.undefined
    
    var smoothingTimeConstant: js.UndefOr[Double] = js.undefined
  }
  object MicrophoneConfig {
    
    inline def apply(): MicrophoneConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MicrophoneConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MicrophoneConfig] (val x: Self) extends AnyVal {
      
      inline def setAudioTrackConstraints(value: MediaTrackConstraints): Self = StObject.set(x, "audioTrackConstraints", value.asInstanceOf[js.Any])
      
      inline def setAudioTrackConstraintsUndefined: Self = StObject.set(x, "audioTrackConstraints", js.undefined)
      
      inline def setColumnTruncateLength(value: Double): Self = StObject.set(x, "columnTruncateLength", value.asInstanceOf[js.Any])
      
      inline def setColumnTruncateLengthUndefined: Self = StObject.set(x, "columnTruncateLength", js.undefined)
      
      inline def setFftSize(value: Double): Self = StObject.set(x, "fftSize", value.asInstanceOf[js.Any])
      
      inline def setFftSizeUndefined: Self = StObject.set(x, "fftSize", js.undefined)
      
      inline def setIncludeSpectrogram(value: Boolean): Self = StObject.set(x, "includeSpectrogram", value.asInstanceOf[js.Any])
      
      inline def setIncludeSpectrogramUndefined: Self = StObject.set(x, "includeSpectrogram", js.undefined)
      
      inline def setIncludeWaveform(value: Boolean): Self = StObject.set(x, "includeWaveform", value.asInstanceOf[js.Any])
      
      inline def setIncludeWaveformUndefined: Self = StObject.set(x, "includeWaveform", js.undefined)
      
      inline def setNumFramesPerSpectrogram(value: Double): Self = StObject.set(x, "numFramesPerSpectrogram", value.asInstanceOf[js.Any])
      
      inline def setNumFramesPerSpectrogramUndefined: Self = StObject.set(x, "numFramesPerSpectrogram", js.undefined)
      
      inline def setSampleRateHz(value: `44100` | `48000`): Self = StObject.set(x, "sampleRateHz", value.asInstanceOf[js.Any])
      
      inline def setSampleRateHzUndefined: Self = StObject.set(x, "sampleRateHz", js.undefined)
      
      inline def setSmoothingTimeConstant(value: Double): Self = StObject.set(x, "smoothingTimeConstant", value.asInstanceOf[js.Any])
      
      inline def setSmoothingTimeConstantUndefined: Self = StObject.set(x, "smoothingTimeConstant", js.undefined)
    }
  }
  
  trait WebcamConfig extends StObject {
    
    /**
      * A boolean value that indicates whether to crop the video frame from center.
      * If true, `resizeWidth` and `resizeHeight` must be specified; then an image
      * of size `[resizeWidth, resizeHeight]` is taken from the center of the frame
      * without scaling. If false, the entire image is returned (perhaps scaled to
      * fit in `[resizeWidth, resizeHeight]`, if those are provided).
      */
    var centerCrop: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A string used to request a specific camera. The deviceId can be obtained by
      * calling `mediaDevices.enumerateDevices()`.
      */
    var deviceId: js.UndefOr[String] = js.undefined
    
    /**
      * A string specifying which camera to use on device. If the value is
      * 'user', it will use front camera. If the value is 'environment', it will
      * use rear camera.
      */
    var facingMode: js.UndefOr[user | environment] = js.undefined
    
    /**
      * Specifies the height of the output tensor. The actual height of the
      * HTMLVideoElement (if provided) can be different and the final image will be
      * resized to match resizeHeight.
      */
    var resizeHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Specifies the width of the output tensor. The actual width of the
      * HTMLVideoElement (if provided) can be different and the final image will be
      * resized to match resizeWidth.
      */
    var resizeWidth: js.UndefOr[Double] = js.undefined
  }
  object WebcamConfig {
    
    inline def apply(): WebcamConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebcamConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebcamConfig] (val x: Self) extends AnyVal {
      
      inline def setCenterCrop(value: Boolean): Self = StObject.set(x, "centerCrop", value.asInstanceOf[js.Any])
      
      inline def setCenterCropUndefined: Self = StObject.set(x, "centerCrop", js.undefined)
      
      inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
      
      inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
      
      inline def setFacingMode(value: user | environment): Self = StObject.set(x, "facingMode", value.asInstanceOf[js.Any])
      
      inline def setFacingModeUndefined: Self = StObject.set(x, "facingMode", js.undefined)
      
      inline def setResizeHeight(value: Double): Self = StObject.set(x, "resizeHeight", value.asInstanceOf[js.Any])
      
      inline def setResizeHeightUndefined: Self = StObject.set(x, "resizeHeight", js.undefined)
      
      inline def setResizeWidth(value: Double): Self = StObject.set(x, "resizeWidth", value.asInstanceOf[js.Any])
      
      inline def setResizeWidthUndefined: Self = StObject.set(x, "resizeWidth", js.undefined)
    }
  }
}
