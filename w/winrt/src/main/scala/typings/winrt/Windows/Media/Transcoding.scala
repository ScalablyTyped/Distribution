package typings.winrt.Windows.Media

import typings.winrt.Windows.Foundation.Collections.IPropertySet
import typings.winrt.Windows.Foundation.IAsyncActionWithProgress
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Media.MediaProperties.MediaEncodingProfile
import typings.winrt.Windows.Storage.IStorageFile
import typings.winrt.Windows.Storage.Streams.IRandomAccessStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Transcoding {
  
  @js.native
  sealed trait TranscodeFailureReason extends StObject
  @JSGlobal("Windows.Media.Transcoding.TranscodeFailureReason")
  @js.native
  object TranscodeFailureReason extends StObject {
    
    @js.native
    sealed trait codecNotFound
      extends StObject
         with TranscodeFailureReason
    
    @js.native
    sealed trait invalidProfile
      extends StObject
         with TranscodeFailureReason
    
    @js.native
    sealed trait none
      extends StObject
         with TranscodeFailureReason
    
    @js.native
    sealed trait unknown
      extends StObject
         with TranscodeFailureReason
  }
  
  @js.native
  trait IMediaTranscoder extends StObject {
    
    def addAudioEffect(activatableClassId: String): Unit = js.native
    def addAudioEffect(activatableClassId: String, effectRequired: Boolean, configuration: IPropertySet): Unit = js.native
    
    def addVideoEffect(activatableClassId: String): Unit = js.native
    def addVideoEffect(activatableClassId: String, effectRequired: Boolean, configuration: IPropertySet): Unit = js.native
    
    var alwaysReencode: Boolean = js.native
    
    def clearEffects(): Unit = js.native
    
    var hardwareAccelerationEnabled: Boolean = js.native
    
    def prepareFileTranscodeAsync(source: IStorageFile, destination: IStorageFile, profile: MediaEncodingProfile): IAsyncOperation[PrepareTranscodeResult] = js.native
    
    def prepareStreamTranscodeAsync(source: IRandomAccessStream, destination: IRandomAccessStream, profile: MediaEncodingProfile): IAsyncOperation[PrepareTranscodeResult] = js.native
    
    var trimStartTime: Double = js.native
    
    var trimStopTime: Double = js.native
  }
  
  trait IPrepareTranscodeResult extends StObject {
    
    var canTranscode: Boolean
    
    var failureReason: TranscodeFailureReason
    
    def transcodeAsync(): IAsyncActionWithProgress[Double]
  }
  object IPrepareTranscodeResult {
    
    @scala.inline
    def apply(
      canTranscode: Boolean,
      failureReason: TranscodeFailureReason,
      transcodeAsync: () => IAsyncActionWithProgress[Double]
    ): IPrepareTranscodeResult = {
      val __obj = js.Dynamic.literal(canTranscode = canTranscode.asInstanceOf[js.Any], failureReason = failureReason.asInstanceOf[js.Any], transcodeAsync = js.Any.fromFunction0(transcodeAsync))
      __obj.asInstanceOf[IPrepareTranscodeResult]
    }
    
    @scala.inline
    implicit class IPrepareTranscodeResultMutableBuilder[Self <: IPrepareTranscodeResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanTranscode(value: Boolean): Self = StObject.set(x, "canTranscode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailureReason(value: TranscodeFailureReason): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranscodeAsync(value: () => IAsyncActionWithProgress[Double]): Self = StObject.set(x, "transcodeAsync", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait MediaTranscoder
    extends StObject
       with IMediaTranscoder
  
  trait PrepareTranscodeResult
    extends StObject
       with IPrepareTranscodeResult
  object PrepareTranscodeResult {
    
    @scala.inline
    def apply(
      canTranscode: Boolean,
      failureReason: TranscodeFailureReason,
      transcodeAsync: () => IAsyncActionWithProgress[Double]
    ): PrepareTranscodeResult = {
      val __obj = js.Dynamic.literal(canTranscode = canTranscode.asInstanceOf[js.Any], failureReason = failureReason.asInstanceOf[js.Any], transcodeAsync = js.Any.fromFunction0(transcodeAsync))
      __obj.asInstanceOf[PrepareTranscodeResult]
    }
  }
}
