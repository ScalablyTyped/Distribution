package typings.yazl

import typings.buffer.mod.Buffer
import typings.node.NodeJS.ReadableStream
import typings.std.Date
import typings.yazl.anon.PartialDirectoryOptions
import typings.yazl.anon.PartialOptions
import typings.yazl.anon.PartialReadStreamOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("yazl", "ZipFile")
  @js.native
  class ZipFile () extends StObject {
    
    def addBuffer(buffer: Buffer, metadataPath: String): Unit = js.native
    def addBuffer(buffer: Buffer, metadataPath: String, options: PartialOptions): Unit = js.native
    
    def addEmptyDirectory(metadataPath: String): Unit = js.native
    def addEmptyDirectory(metadataPath: String, options: PartialDirectoryOptions): Unit = js.native
    
    def addFile(realPath: String, metadataPath: String): Unit = js.native
    def addFile(realPath: String, metadataPath: String, options: PartialOptions): Unit = js.native
    
    def addReadStream(input: ReadableStream, metadataPath: String): Unit = js.native
    def addReadStream(input: ReadableStream, metadataPath: String, options: PartialReadStreamOptions): Unit = js.native
    
    def dateToDosDateTime(jsDate: Date): DosDateTime = js.native
    
    def end(): Unit = js.native
    def end(options: Unit, finalSizeCallback: js.Function0[Unit]): Unit = js.native
    def end(options: EndOptions): Unit = js.native
    def end(options: EndOptions, finalSizeCallback: js.Function0[Unit]): Unit = js.native
    
    var outputStream: ReadableStream = js.native
  }
  
  trait DirectoryOptions extends StObject {
    
    var mode: Double
    
    var mtime: Date
  }
  object DirectoryOptions {
    
    @scala.inline
    def apply(mode: Double, mtime: Date): DirectoryOptions = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectoryOptions]
    }
    
    @scala.inline
    implicit class DirectoryOptionsMutableBuilder[Self <: DirectoryOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMtime(value: Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
    }
  }
  
  trait DosDateTime extends StObject {
    
    var date: Double
    
    var time: Double
  }
  object DosDateTime {
    
    @scala.inline
    def apply(date: Double, time: Double): DosDateTime = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[DosDateTime]
    }
    
    @scala.inline
    implicit class DosDateTimeMutableBuilder[Self <: DosDateTime] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
  
  trait EndOptions extends StObject {
    
    var forceZip64Format: Boolean
  }
  object EndOptions {
    
    @scala.inline
    def apply(forceZip64Format: Boolean): EndOptions = {
      val __obj = js.Dynamic.literal(forceZip64Format = forceZip64Format.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndOptions]
    }
    
    @scala.inline
    implicit class EndOptionsMutableBuilder[Self <: EndOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForceZip64Format(value: Boolean): Self = StObject.set(x, "forceZip64Format", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var compress: Boolean
    
    var forceZip64Format: Boolean
    
    var mode: Double
    
    var mtime: Date
  }
  object Options {
    
    @scala.inline
    def apply(compress: Boolean, forceZip64Format: Boolean, mode: Double, mtime: Date): Options = {
      val __obj = js.Dynamic.literal(compress = compress.asInstanceOf[js.Any], forceZip64Format = forceZip64Format.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceZip64Format(value: Boolean): Self = StObject.set(x, "forceZip64Format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMtime(value: Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReadStreamOptions
    extends StObject
       with Options {
    
    var size: Double
  }
  object ReadStreamOptions {
    
    @scala.inline
    def apply(compress: Boolean, forceZip64Format: Boolean, mode: Double, mtime: Date, size: Double): ReadStreamOptions = {
      val __obj = js.Dynamic.literal(compress = compress.asInstanceOf[js.Any], forceZip64Format = forceZip64Format.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadStreamOptions]
    }
    
    @scala.inline
    implicit class ReadStreamOptionsMutableBuilder[Self <: ReadStreamOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
