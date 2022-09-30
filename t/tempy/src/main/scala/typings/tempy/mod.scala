package typings.tempy

import typings.node.bufferMod.global.Buffer
import typings.std.ReadableStream
import typings.tempy.anon.Extension
import typings.tempy.anon.Name
import typings.typeFest.mergeExclusiveMod.MergeExclusive
import typings.typeFest.typedArrayMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tempy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tempy", "rootTemporaryDirectory")
  @js.native
  val rootTemporaryDirectory: String = js.native
  
  inline def temporaryDirectory(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("temporaryDirectory")().asInstanceOf[String]
  inline def temporaryDirectory(options: DirectoryOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("temporaryDirectory")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def temporaryDirectoryTask[ReturnValueType](callback: TaskCallback[ReturnValueType]): js.Promise[ReturnValueType] = ^.asInstanceOf[js.Dynamic].applyDynamic("temporaryDirectoryTask")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReturnValueType]]
  inline def temporaryDirectoryTask[ReturnValueType](callback: TaskCallback[ReturnValueType], options: DirectoryOptions): js.Promise[ReturnValueType] = (^.asInstanceOf[js.Dynamic].applyDynamic("temporaryDirectoryTask")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnValueType]]
  
  inline def temporaryFile(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("temporaryFile")().asInstanceOf[String]
  inline def temporaryFile(options: FileOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("temporaryFile")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def temporaryFileTask[ReturnValueType](callback: TaskCallback[ReturnValueType]): js.Promise[ReturnValueType] = ^.asInstanceOf[js.Dynamic].applyDynamic("temporaryFileTask")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReturnValueType]]
  inline def temporaryFileTask[ReturnValueType](callback: TaskCallback[ReturnValueType], options: FileOptions): js.Promise[ReturnValueType] = (^.asInstanceOf[js.Dynamic].applyDynamic("temporaryFileTask")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnValueType]]
  
  inline def temporaryWrite(fileContent: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("temporaryWrite")(fileContent.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def temporaryWrite(fileContent: String, options: FileOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("temporaryWrite")(fileContent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def temporaryWrite(fileContent: js.typedarray.DataView): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("temporaryWrite")(fileContent.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def temporaryWrite(fileContent: js.typedarray.DataView, options: FileOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("temporaryWrite")(fileContent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def temporaryWrite(fileContent: Buffer): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("temporaryWrite")(fileContent.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def temporaryWrite(fileContent: Buffer, options: FileOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("temporaryWrite")(fileContent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def temporaryWrite(fileContent: ReadableStream[Any]): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("temporaryWrite")(fileContent.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def temporaryWrite(fileContent: ReadableStream[Any], options: FileOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("temporaryWrite")(fileContent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def temporaryWrite(fileContent: TypedArray): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("temporaryWrite")(fileContent.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def temporaryWrite(fileContent: TypedArray, options: FileOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("temporaryWrite")(fileContent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def temporaryWriteSync(fileContent: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("temporaryWriteSync")(fileContent.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def temporaryWriteSync(fileContent: String, options: FileOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("temporaryWriteSync")(fileContent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def temporaryWriteSync(fileContent: js.typedarray.DataView): String = ^.asInstanceOf[js.Dynamic].applyDynamic("temporaryWriteSync")(fileContent.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def temporaryWriteSync(fileContent: js.typedarray.DataView, options: FileOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("temporaryWriteSync")(fileContent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def temporaryWriteSync(fileContent: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("temporaryWriteSync")(fileContent.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def temporaryWriteSync(fileContent: Buffer, options: FileOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("temporaryWriteSync")(fileContent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def temporaryWriteSync(fileContent: TypedArray): String = ^.asInstanceOf[js.Dynamic].applyDynamic("temporaryWriteSync")(fileContent.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def temporaryWriteSync(fileContent: TypedArray, options: FileOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("temporaryWriteSync")(fileContent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def temporaryWriteTask[ReturnValueType](fileContent: String, callback: TaskCallback[ReturnValueType]): js.Promise[ReturnValueType] = (^.asInstanceOf[js.Dynamic].applyDynamic("temporaryWriteTask")(fileContent.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnValueType]]
  inline def temporaryWriteTask[ReturnValueType](fileContent: String, callback: TaskCallback[ReturnValueType], options: FileOptions): js.Promise[ReturnValueType] = (^.asInstanceOf[js.Dynamic].applyDynamic("temporaryWriteTask")(fileContent.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnValueType]]
  inline def temporaryWriteTask[ReturnValueType](fileContent: js.typedarray.DataView, callback: TaskCallback[ReturnValueType]): js.Promise[ReturnValueType] = (^.asInstanceOf[js.Dynamic].applyDynamic("temporaryWriteTask")(fileContent.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnValueType]]
  inline def temporaryWriteTask[ReturnValueType](fileContent: js.typedarray.DataView, callback: TaskCallback[ReturnValueType], options: FileOptions): js.Promise[ReturnValueType] = (^.asInstanceOf[js.Dynamic].applyDynamic("temporaryWriteTask")(fileContent.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnValueType]]
  inline def temporaryWriteTask[ReturnValueType](fileContent: Buffer, callback: TaskCallback[ReturnValueType]): js.Promise[ReturnValueType] = (^.asInstanceOf[js.Dynamic].applyDynamic("temporaryWriteTask")(fileContent.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnValueType]]
  inline def temporaryWriteTask[ReturnValueType](fileContent: Buffer, callback: TaskCallback[ReturnValueType], options: FileOptions): js.Promise[ReturnValueType] = (^.asInstanceOf[js.Dynamic].applyDynamic("temporaryWriteTask")(fileContent.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnValueType]]
  inline def temporaryWriteTask[ReturnValueType](fileContent: ReadableStream[Any], callback: TaskCallback[ReturnValueType]): js.Promise[ReturnValueType] = (^.asInstanceOf[js.Dynamic].applyDynamic("temporaryWriteTask")(fileContent.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnValueType]]
  inline def temporaryWriteTask[ReturnValueType](fileContent: ReadableStream[Any], callback: TaskCallback[ReturnValueType], options: FileOptions): js.Promise[ReturnValueType] = (^.asInstanceOf[js.Dynamic].applyDynamic("temporaryWriteTask")(fileContent.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnValueType]]
  inline def temporaryWriteTask[ReturnValueType](fileContent: TypedArray, callback: TaskCallback[ReturnValueType]): js.Promise[ReturnValueType] = (^.asInstanceOf[js.Dynamic].applyDynamic("temporaryWriteTask")(fileContent.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnValueType]]
  inline def temporaryWriteTask[ReturnValueType](fileContent: TypedArray, callback: TaskCallback[ReturnValueType], options: FileOptions): js.Promise[ReturnValueType] = (^.asInstanceOf[js.Dynamic].applyDynamic("temporaryWriteTask")(fileContent.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnValueType]]
  
  trait DirectoryOptions extends StObject {
    
    /**
    	Directory prefix.
    	_You usually won't need this option. Specify it only when actually needed._
    	Useful for testing by making it easier to identify cache directories that are created.
    	*/
    val prefix: js.UndefOr[String] = js.undefined
  }
  object DirectoryOptions {
    
    inline def apply(): DirectoryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirectoryOptions]
    }
    
    extension [Self <: DirectoryOptions](x: Self) {
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
  
  type FileOptions = MergeExclusive[Extension, Name]
  
  type TaskCallback[ReturnValueType] = js.Function1[/* temporaryPath */ String, js.Promise[ReturnValueType] | ReturnValueType]
}
