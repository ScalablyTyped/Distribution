package typings.write

import typings.node.Buffer
import typings.node.fsMod.WriteFileOptions
import typings.node.fsMod.WriteStream
import typings.std.Error
import typings.std.Extract
import typings.std.Omit
import typings.std.Record
import typings.std.Uint8Array
import typings.write.anon.OmitMakeDirectoryOptionsr
import typings.write.writeStrings.encoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(filepath: String, data: String): js.Promise[Result[String]] = (^.asInstanceOf[js.Dynamic].apply(filepath.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result[String]]]
  inline def apply(filepath: String, data: String, callback: Callback[String]): Unit = (^.asInstanceOf[js.Dynamic].apply(filepath.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(filepath: String, data: String, options: Options): js.Promise[Result[String]] = (^.asInstanceOf[js.Dynamic].apply(filepath.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result[String]]]
  inline def apply(filepath: String, data: String, options: Options, callback: Callback[String]): Unit = (^.asInstanceOf[js.Dynamic].apply(filepath.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(filepath: String, data: Buffer): js.Promise[Result[Buffer]] = (^.asInstanceOf[js.Dynamic].apply(filepath.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result[Buffer]]]
  inline def apply(filepath: String, data: Buffer, callback: Callback[Buffer]): Unit = (^.asInstanceOf[js.Dynamic].apply(filepath.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(filepath: String, data: Buffer, options: Options): js.Promise[Result[Buffer]] = (^.asInstanceOf[js.Dynamic].apply(filepath.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result[Buffer]]]
  inline def apply(filepath: String, data: Buffer, options: Options, callback: Callback[Buffer]): Unit = (^.asInstanceOf[js.Dynamic].apply(filepath.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(filepath: String, data: Uint8Array): js.Promise[Result[Uint8Array]] = (^.asInstanceOf[js.Dynamic].apply(filepath.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result[Uint8Array]]]
  inline def apply(filepath: String, data: Uint8Array, callback: Callback[Uint8Array]): Unit = (^.asInstanceOf[js.Dynamic].apply(filepath.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(filepath: String, data: Uint8Array, options: Options): js.Promise[Result[Uint8Array]] = (^.asInstanceOf[js.Dynamic].apply(filepath.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Result[Uint8Array]]]
  inline def apply(filepath: String, data: Uint8Array, options: Options, callback: Callback[Uint8Array]): Unit = (^.asInstanceOf[js.Dynamic].apply(filepath.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("write", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stream(filepath: String): WriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("stream")(filepath.asInstanceOf[js.Any]).asInstanceOf[WriteStream]
  inline def stream(filepath: String, options: StreamOptions): WriteStream = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(filepath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WriteStream]
  
  inline def sync(filepath: String, data: String): Result[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(filepath.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Result[String]]
  inline def sync(filepath: String, data: String, options: Options): Result[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(filepath.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Result[String]]
  inline def sync(filepath: String, data: Buffer): Result[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(filepath.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Result[Buffer]]
  inline def sync(filepath: String, data: Buffer, options: Options): Result[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(filepath.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Result[Buffer]]
  inline def sync(filepath: String, data: Uint8Array): Result[Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(filepath.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Result[Uint8Array]]
  inline def sync(filepath: String, data: Uint8Array, options: Options): Result[Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(filepath.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Result[Uint8Array]]
  
  type Callback[T /* <: Data */] = js.Function2[/* err */ Error | Null, /* result */ js.UndefOr[Result[T]], js.Any]
  
  trait CommonOptions extends StObject {
    
    var increment: js.UndefOr[Boolean] = js.undefined
    
    var newline: js.UndefOr[Boolean] = js.undefined
    
    var overwrite: js.UndefOr[Boolean] = js.undefined
  }
  object CommonOptions {
    
    inline def apply(): CommonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonOptions]
    }
    
    extension [Self <: CommonOptions](x: Self) {
      
      inline def setIncrement(value: Boolean): Self = StObject.set(x, "increment", value.asInstanceOf[js.Any])
      
      inline def setIncrementUndefined: Self = StObject.set(x, "increment", js.undefined)
      
      inline def setNewline(value: Boolean): Self = StObject.set(x, "newline", value.asInstanceOf[js.Any])
      
      inline def setNewlineUndefined: Self = StObject.set(x, "newline", js.undefined)
      
      inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
    }
  }
  
  type CreateWriteStreamOptions = Extract[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<write.anon.FnCall>[1] */ js.Any, 
    Record[String, js.Any]
  ]
  
  type Data = String | Buffer | Uint8Array
  
  type Options = (Omit[WriteFileOptions, encoding]) & OmitMakeDirectoryOptionsr & CommonOptions
  
  trait Result[T /* <: Data */] extends StObject {
    
    var data: T
    
    var path: String
  }
  object Result {
    
    inline def apply[T /* <: Data */](data: T, path: String): Result[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result[T]]
    }
    
    extension [Self <: Result[?], T /* <: Data */](x: Self & Result[T]) {
      
      inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  type StreamOptions = (Omit[CreateWriteStreamOptions, encoding]) & OmitMakeDirectoryOptionsr & CommonOptions
}
