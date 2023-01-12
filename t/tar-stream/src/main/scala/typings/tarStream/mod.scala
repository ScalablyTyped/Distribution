package typings.tarStream

import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.streamMod.PassThrough
import typings.node.streamMod.Readable
import typings.node.streamMod.ReadableOptions
import typings.node.streamMod.Writable
import typings.node.streamMod.WritableOptions
import typings.tarStream.tarStreamStrings.`block-device`
import typings.tarStream.tarStreamStrings.`character-device`
import typings.tarStream.tarStreamStrings.`contiguous-file`
import typings.tarStream.tarStreamStrings.`gnu-long-link-path`
import typings.tarStream.tarStreamStrings.`gnu-long-path`
import typings.tarStream.tarStreamStrings.`pax-global-header`
import typings.tarStream.tarStreamStrings.`pax-header`
import typings.tarStream.tarStreamStrings.directory
import typings.tarStream.tarStreamStrings.entry
import typings.tarStream.tarStreamStrings.fifo
import typings.tarStream.tarStreamStrings.file
import typings.tarStream.tarStreamStrings.link
import typings.tarStream.tarStreamStrings.symlink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tar-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extract(): Extract_ = ^.asInstanceOf[js.Dynamic].applyDynamic("extract")().asInstanceOf[Extract_]
  inline def extract(opts: ExtractOptions): Extract_ = ^.asInstanceOf[js.Dynamic].applyDynamic("extract")(opts.asInstanceOf[js.Any]).asInstanceOf[Extract_]
  
  inline def pack(): Pack_ = ^.asInstanceOf[js.Dynamic].applyDynamic("pack")().asInstanceOf[Pack_]
  inline def pack(opts: ReadableOptions): Pack_ = ^.asInstanceOf[js.Dynamic].applyDynamic("pack")(opts.asInstanceOf[js.Any]).asInstanceOf[Pack_]
  
  type Callback = js.Function1[/* err */ js.UndefOr[js.Error | Null], Any]
  
  trait ExtractOptions
    extends StObject
       with WritableOptions {
    
    /**
      * Whether or not to attempt to extract a file that does not have an
      * officially supported format in the `magic` header, such as `ustar`.
      */
    var allowUnknownFormat: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The encoding of the file name header.
      */
    var filenameEncoding: js.UndefOr[BufferEncoding] = js.undefined
  }
  object ExtractOptions {
    
    inline def apply(): ExtractOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtractOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExtractOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowUnknownFormat(value: Boolean): Self = StObject.set(x, "allowUnknownFormat", value.asInstanceOf[js.Any])
      
      inline def setAllowUnknownFormatUndefined: Self = StObject.set(x, "allowUnknownFormat", js.undefined)
      
      inline def setFilenameEncoding(value: BufferEncoding): Self = StObject.set(x, "filenameEncoding", value.asInstanceOf[js.Any])
      
      inline def setFilenameEncodingUndefined: Self = StObject.set(x, "filenameEncoding", js.undefined)
    }
  }
  
  @js.native
  trait Extract_ extends Writable {
    
    @JSName("on")
    def on_entry(
      event: entry,
      listener: js.Function3[
          /* headers */ Headers, 
          /* stream */ PassThrough, 
          /* next */ js.Function1[/* error */ js.UndefOr[Any], Unit], 
          Unit
        ]
    ): this.type = js.native
  }
  
  trait Headers extends StObject {
    
    var devmajor: js.UndefOr[Double] = js.undefined
    
    var devminor: js.UndefOr[Double] = js.undefined
    
    var gid: js.UndefOr[Double] = js.undefined
    
    var gname: js.UndefOr[String] = js.undefined
    
    var linkname: js.UndefOr[String | Null] = js.undefined
    
    var mode: js.UndefOr[Double] = js.undefined
    
    var mtime: js.UndefOr[js.Date] = js.undefined
    
    var name: String
    
    var size: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[
        file | link | symlink | `character-device` | `block-device` | directory | fifo | `contiguous-file` | `pax-header` | `pax-global-header` | `gnu-long-link-path` | `gnu-long-path` | Null
      ] = js.undefined
    
    var uid: js.UndefOr[Double] = js.undefined
    
    var uname: js.UndefOr[String] = js.undefined
  }
  object Headers {
    
    inline def apply(name: String): Headers = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Headers]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Headers] (val x: Self) extends AnyVal {
      
      inline def setDevmajor(value: Double): Self = StObject.set(x, "devmajor", value.asInstanceOf[js.Any])
      
      inline def setDevmajorUndefined: Self = StObject.set(x, "devmajor", js.undefined)
      
      inline def setDevminor(value: Double): Self = StObject.set(x, "devminor", value.asInstanceOf[js.Any])
      
      inline def setDevminorUndefined: Self = StObject.set(x, "devminor", js.undefined)
      
      inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
      
      inline def setGname(value: String): Self = StObject.set(x, "gname", value.asInstanceOf[js.Any])
      
      inline def setGnameUndefined: Self = StObject.set(x, "gname", js.undefined)
      
      inline def setLinkname(value: String): Self = StObject.set(x, "linkname", value.asInstanceOf[js.Any])
      
      inline def setLinknameNull: Self = StObject.set(x, "linkname", null)
      
      inline def setLinknameUndefined: Self = StObject.set(x, "linkname", js.undefined)
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMtime(value: js.Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setType(
        value: file | link | symlink | `character-device` | `block-device` | directory | fifo | `contiguous-file` | `pax-header` | `pax-global-header` | `gnu-long-link-path` | `gnu-long-path`
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeNull: Self = StObject.set(x, "type", null)
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
      
      inline def setUname(value: String): Self = StObject.set(x, "uname", value.asInstanceOf[js.Any])
      
      inline def setUnameUndefined: Self = StObject.set(x, "uname", js.undefined)
    }
  }
  
  @js.native
  trait Pack_ extends Readable {
    
    /**
      * To create a pack stream use tar.pack() and call pack.entry(header, [callback]) to add tar entries.
      */
    def entry(headers: Headers): Writable = js.native
    def entry(headers: Headers, buffer: String): Writable = js.native
    def entry(headers: Headers, buffer: String, callback: Callback): Writable = js.native
    def entry(headers: Headers, buffer: Unit, callback: Callback): Writable = js.native
    def entry(headers: Headers, buffer: Buffer): Writable = js.native
    def entry(headers: Headers, buffer: Buffer, callback: Callback): Writable = js.native
    def entry(headers: Headers, callback: Callback): Writable = js.native
  }
}
