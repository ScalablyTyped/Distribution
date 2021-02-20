package typings.tensorflowTfjsData

import org.scalablytyped.runtime.StringDictionary
import typings.std.Array
import typings.std.Blob
import typings.std.File
import typings.std.MediaTrackConstraints
import typings.std.Uint8Array
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.tensorTypesMod.TensorContainer
import typings.tensorflowTfjsData.tensorflowTfjsDataNumbers.`44100`
import typings.tensorflowTfjsData.tensorflowTfjsDataNumbers.`48000`
import typings.tensorflowTfjsData.tensorflowTfjsDataStrings.environment
import typings.tensorflowTfjsData.tensorflowTfjsDataStrings.user
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
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
    var columnConfigs: js.UndefOr[StringDictionary[ColumnConfig]] = js.native
    
    /**
      * A list of strings that corresponds to the CSV column names, in order. If
      * provided, it ignores the column names inferred from the header row. If not
      * provided, infers the column names from the first row of the records. If
      * `hasHeader` is false and `columnNames` is not provided, this method will
      * throw an error.
      */
    var columnNames: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * If true, only columns provided in `columnConfigs` will be parsed and
      * provided during iteration.
      */
    var configuredColumnsOnly: js.UndefOr[Boolean] = js.native
    
    /**
      * If true, delimiter field should be null. Parsing delimiter is whitespace
      * and treat continuous multiple whitespace as one delimiter.
      */
    var delimWhitespace: js.UndefOr[Boolean] = js.native
    
    /**
      * The string used to parse each line of the input file.
      */
    var delimiter: js.UndefOr[String] = js.native
    
    /**
      * A boolean value that indicates whether the first row of provided CSV file
      * is a header line with column names, and should not be included in the data.
      */
    var hasHeader: js.UndefOr[Boolean] = js.native
  }
  object CSVConfig {
    
    @scala.inline
    def apply(): CSVConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSVConfig]
    }
    
    @scala.inline
    implicit class CSVConfigMutableBuilder[Self <: CSVConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnConfigs(value: StringDictionary[ColumnConfig]): Self = StObject.set(x, "columnConfigs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnConfigsUndefined: Self = StObject.set(x, "columnConfigs", js.undefined)
      
      @scala.inline
      def setColumnNames(value: js.Array[String]): Self = StObject.set(x, "columnNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnNamesUndefined: Self = StObject.set(x, "columnNames", js.undefined)
      
      @scala.inline
      def setColumnNamesVarargs(value: String*): Self = StObject.set(x, "columnNames", js.Array(value :_*))
      
      @scala.inline
      def setConfiguredColumnsOnly(value: Boolean): Self = StObject.set(x, "configuredColumnsOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfiguredColumnsOnlyUndefined: Self = StObject.set(x, "configuredColumnsOnly", js.undefined)
      
      @scala.inline
      def setDelimWhitespace(value: Boolean): Self = StObject.set(x, "delimWhitespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimWhitespaceUndefined: Self = StObject.set(x, "delimWhitespace", js.undefined)
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      @scala.inline
      def setHasHeader(value: Boolean): Self = StObject.set(x, "hasHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasHeaderUndefined: Self = StObject.set(x, "hasHeader", js.undefined)
    }
  }
  
  @js.native
  trait ColumnConfig extends StObject {
    
    var default: js.UndefOr[TensorContainer] = js.native
    
    var dtype: js.UndefOr[DataType] = js.native
    
    var isLabel: js.UndefOr[Boolean] = js.native
    
    var required: js.UndefOr[Boolean] = js.native
  }
  object ColumnConfig {
    
    @scala.inline
    def apply(): ColumnConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnConfig]
    }
    
    @scala.inline
    implicit class ColumnConfigMutableBuilder[Self <: ColumnConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: TensorContainer): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setDtype(value: DataType): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDtypeUndefined: Self = StObject.set(x, "dtype", js.undefined)
      
      @scala.inline
      def setIsLabel(value: Boolean): Self = StObject.set(x, "isLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLabelUndefined: Self = StObject.set(x, "isLabel", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tensorflowTfjsData.typesMod.ContainerObject[T]
    - typings.tensorflowTfjsData.typesMod.ContainerArray[T]
  */
  trait Container[T] extends StObject
  
  @js.native
  trait ContainerArray[T]
    extends Array[ContainerOrT[T]]
       with Container[T]
  
  @js.native
  trait ContainerObject[T]
    extends /* x */ StringDictionary[ContainerOrT[T]]
       with Container[T]
  object ContainerObject {
    
    @scala.inline
    def apply[T](): ContainerObject[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContainerObject[T]]
    }
  }
  
  type ContainerOrT[T] = Container[T] | T
  
  type FileElement = File | Blob | Uint8Array
  
  @js.native
  trait MicrophoneConfig extends StObject {
    
    var audioTrackConstraints: js.UndefOr[MediaTrackConstraints] = js.native
    
    var columnTruncateLength: js.UndefOr[Double] = js.native
    
    var fftSize: js.UndefOr[Double] = js.native
    
    var includeSpectrogram: js.UndefOr[Boolean] = js.native
    
    var includeWaveform: js.UndefOr[Boolean] = js.native
    
    var numFramesPerSpectrogram: js.UndefOr[Double] = js.native
    
    var sampleRateHz: js.UndefOr[`44100` | `48000`] = js.native
    
    var smoothingTimeConstant: js.UndefOr[Double] = js.native
  }
  object MicrophoneConfig {
    
    @scala.inline
    def apply(): MicrophoneConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MicrophoneConfig]
    }
    
    @scala.inline
    implicit class MicrophoneConfigMutableBuilder[Self <: MicrophoneConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudioTrackConstraints(value: MediaTrackConstraints): Self = StObject.set(x, "audioTrackConstraints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudioTrackConstraintsUndefined: Self = StObject.set(x, "audioTrackConstraints", js.undefined)
      
      @scala.inline
      def setColumnTruncateLength(value: Double): Self = StObject.set(x, "columnTruncateLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnTruncateLengthUndefined: Self = StObject.set(x, "columnTruncateLength", js.undefined)
      
      @scala.inline
      def setFftSize(value: Double): Self = StObject.set(x, "fftSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFftSizeUndefined: Self = StObject.set(x, "fftSize", js.undefined)
      
      @scala.inline
      def setIncludeSpectrogram(value: Boolean): Self = StObject.set(x, "includeSpectrogram", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeSpectrogramUndefined: Self = StObject.set(x, "includeSpectrogram", js.undefined)
      
      @scala.inline
      def setIncludeWaveform(value: Boolean): Self = StObject.set(x, "includeWaveform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeWaveformUndefined: Self = StObject.set(x, "includeWaveform", js.undefined)
      
      @scala.inline
      def setNumFramesPerSpectrogram(value: Double): Self = StObject.set(x, "numFramesPerSpectrogram", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumFramesPerSpectrogramUndefined: Self = StObject.set(x, "numFramesPerSpectrogram", js.undefined)
      
      @scala.inline
      def setSampleRateHz(value: `44100` | `48000`): Self = StObject.set(x, "sampleRateHz", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSampleRateHzUndefined: Self = StObject.set(x, "sampleRateHz", js.undefined)
      
      @scala.inline
      def setSmoothingTimeConstant(value: Double): Self = StObject.set(x, "smoothingTimeConstant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmoothingTimeConstantUndefined: Self = StObject.set(x, "smoothingTimeConstant", js.undefined)
    }
  }
  
  @js.native
  trait WebcamConfig extends StObject {
    
    /**
      * A boolean value that indicates whether to crop the video frame from center.
      * If true, `resizeWidth` and `resizeHeight` must be specified; then an image
      * of size `[resizeWidth, resizeHeight]` is taken from the center of the frame
      * without scaling. If false, the entire image is returned (perhaps scaled to
      * fit in `[resizeWidth, resizeHeight]`, if those are provided).
      */
    var centerCrop: js.UndefOr[Boolean] = js.native
    
    /**
      * A string used to request a specific camera. The deviceId can be obtained by
      * calling `mediaDevices.enumerateDevices()`.
      */
    var deviceId: js.UndefOr[String] = js.native
    
    /**
      * A string specifying which camera to use on device. If the value is
      * 'user', it will use front camera. If the value is 'environment', it will
      * use rear camera.
      */
    var facingMode: js.UndefOr[user | environment] = js.native
    
    /**
      * Specifies the height of the output tensor. The actual height of the
      * HTMLVideoElement (if provided) can be different and the final image will be
      * resized to match resizeHeight.
      */
    var resizeHeight: js.UndefOr[Double] = js.native
    
    /**
      * Specifies the width of the output tensor. The actual width of the
      * HTMLVideoElement (if provided) can be different and the final image will be
      * resized to match resizeWidth.
      */
    var resizeWidth: js.UndefOr[Double] = js.native
  }
  object WebcamConfig {
    
    @scala.inline
    def apply(): WebcamConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebcamConfig]
    }
    
    @scala.inline
    implicit class WebcamConfigMutableBuilder[Self <: WebcamConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCenterCrop(value: Boolean): Self = StObject.set(x, "centerCrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterCropUndefined: Self = StObject.set(x, "centerCrop", js.undefined)
      
      @scala.inline
      def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
      
      @scala.inline
      def setFacingMode(value: user | environment): Self = StObject.set(x, "facingMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFacingModeUndefined: Self = StObject.set(x, "facingMode", js.undefined)
      
      @scala.inline
      def setResizeHeight(value: Double): Self = StObject.set(x, "resizeHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeHeightUndefined: Self = StObject.set(x, "resizeHeight", js.undefined)
      
      @scala.inline
      def setResizeWidth(value: Double): Self = StObject.set(x, "resizeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeWidthUndefined: Self = StObject.set(x, "resizeWidth", js.undefined)
    }
  }
}
