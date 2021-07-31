package typings.wav

import typings.node.Buffer
import typings.node.fsMod.WriteStream
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformOptions
import typings.wav.wavStrings.BE
import typings.wav.wavStrings.LE
import typings.wav.wavStrings.chunk
import typings.wav.wavStrings.done
import typings.wav.wavStrings.format
import typings.wav.wavStrings.header
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wav", "FileWriter")
  @js.native
  class FileWriter protected () extends Writer {
    def this(path: String) = this()
    def this(path: String, opts: WriterOptions) = this()
    
    @JSName("addListener")
    def addListener_done(event: done, listener: js.Function0[Unit]): this.type = js.native
    
    var file: WriteStream = js.native
    
    @JSName("on")
    def on_done(event: done, listener: js.Function0[Unit]): this.type = js.native
    
    var path: String = js.native
  }
  
  @JSImport("wav", "Reader")
  @js.native
  class Reader () extends Transform {
    def this(opts: TransformOptions) = this()
    
    @JSName("addListener")
    def addListener_chunk(event: chunk, listener: js.Function1[/* unknownChunk */ UnknownChunk, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_format(event: format, listener: js.Function1[/* format */ Format, Unit]): this.type = js.native
    
    @JSName("on")
    def on_chunk(event: chunk, listener: js.Function1[/* unknownChunk */ UnknownChunk, Unit]): this.type = js.native
    @JSName("on")
    def on_format(event: format, listener: js.Function1[/* format */ Format, Unit]): this.type = js.native
  }
  
  @JSImport("wav", "Writer")
  @js.native
  class Writer () extends Transform {
    def this(opts: WriterOptions) = this()
    
    @JSName("addListener")
    def addListener_header(event: header, listener: js.Function1[/* header */ Buffer, Unit]): this.type = js.native
    
    var bitDepth: Double = js.native
    
    var bytesProcessed: Double = js.native
    
    var channels: Double = js.native
    
    var endianness: LE = js.native
    
    var format: Double = js.native
    
    @JSName("on")
    def on_header(event: header, listener: js.Function1[/* header */ Buffer, Unit]): this.type = js.native
    
    var sampleRate: Double = js.native
  }
  
  trait Format extends StObject {
    
    var audioFormat: Double
    
    var bitDepth: Double
    
    var blockAlign: Double
    
    var byteRate: Double
    
    var channels: Double
    
    var endianness: LE | BE
    
    var sampleRate: Double
    
    var signed: Boolean
  }
  object Format {
    
    @scala.inline
    def apply(
      audioFormat: Double,
      bitDepth: Double,
      blockAlign: Double,
      byteRate: Double,
      channels: Double,
      endianness: LE | BE,
      sampleRate: Double,
      signed: Boolean
    ): Format = {
      val __obj = js.Dynamic.literal(audioFormat = audioFormat.asInstanceOf[js.Any], bitDepth = bitDepth.asInstanceOf[js.Any], blockAlign = blockAlign.asInstanceOf[js.Any], byteRate = byteRate.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any], endianness = endianness.asInstanceOf[js.Any], sampleRate = sampleRate.asInstanceOf[js.Any], signed = signed.asInstanceOf[js.Any])
      __obj.asInstanceOf[Format]
    }
    
    @scala.inline
    implicit class FormatMutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudioFormat(value: Double): Self = StObject.set(x, "audioFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBitDepth(value: Double): Self = StObject.set(x, "bitDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockAlign(value: Double): Self = StObject.set(x, "blockAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setByteRate(value: Double): Self = StObject.set(x, "byteRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannels(value: Double): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndianness(value: LE | BE): Self = StObject.set(x, "endianness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigned(value: Boolean): Self = StObject.set(x, "signed", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnknownChunk extends StObject {
    
    var data: js.Any
    
    var id: String
  }
  object UnknownChunk {
    
    @scala.inline
    def apply(data: js.Any, id: String): UnknownChunk = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnknownChunk]
    }
    
    @scala.inline
    implicit class UnknownChunkMutableBuilder[Self <: UnknownChunk] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait WriterOptions
    extends StObject
       with TransformOptions {
    
    var bitDepth: js.UndefOr[Double] = js.undefined
    
    var channels: js.UndefOr[Double] = js.undefined
    
    var format: js.UndefOr[Double] = js.undefined
    
    var sampleRate: js.UndefOr[Double] = js.undefined
  }
  object WriterOptions {
    
    @scala.inline
    def apply(): WriterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WriterOptions]
    }
    
    @scala.inline
    implicit class WriterOptionsMutableBuilder[Self <: WriterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBitDepth(value: Double): Self = StObject.set(x, "bitDepth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBitDepthUndefined: Self = StObject.set(x, "bitDepth", js.undefined)
      
      @scala.inline
      def setChannels(value: Double): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
      
      @scala.inline
      def setFormat(value: Double): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
    }
  }
}
