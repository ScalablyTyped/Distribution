package typings.toVfile

import typings.node.urlMod.URL_
import typings.toVfile.anon.Encoding
import typings.toVfile.anon.Flag
import typings.vfile.mod.VFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("to-vfile/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def read(description: Compatible): js.Promise[VFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(description.asInstanceOf[js.Any]).asInstanceOf[js.Promise[VFile]]
  inline def read(description: Compatible, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(description.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def read(description: Compatible, options: ReadOptions): js.Promise[VFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(description.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[VFile]]
  inline def read(description: Compatible, options: ReadOptions, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(description.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def readSync(description: Compatible): VFile = ^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(description.asInstanceOf[js.Any]).asInstanceOf[VFile]
  inline def readSync(description: Compatible, options: ReadOptions): VFile = (^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(description.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[VFile]
  
  inline def toVFile(): VFile = ^.asInstanceOf[js.Dynamic].applyDynamic("toVFile")().asInstanceOf[VFile]
  inline def toVFile(options: Compatible): VFile = ^.asInstanceOf[js.Dynamic].applyDynamic("toVFile")(options.asInstanceOf[js.Any]).asInstanceOf[VFile]
  
  inline def write(description: Compatible): js.Promise[VFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(description.asInstanceOf[js.Any]).asInstanceOf[js.Promise[VFile]]
  inline def write(description: Compatible, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(description.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def write(description: Compatible, options: WriteOptions): js.Promise[VFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(description.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[VFile]]
  inline def write(description: Compatible, options: WriteOptions, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(description.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeSync(description: Compatible): VFile = ^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(description.asInstanceOf[js.Any]).asInstanceOf[VFile]
  inline def writeSync(description: Compatible, options: WriteOptions): VFile = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(description.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[VFile]
  
  type BufferEncoding = typings.vfile.libMod.BufferEncoding
  
  type Callback = js.Function2[
    /* error */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
    /* file */ VFile | Null, 
    Any
  ]
  
  type Compatible = Path | Options | VFile
  
  type Mode = Double | String
  
  type Options = typings.vfile.libMod.Options
  
  type Path = URL_ | Value
  
  type ReadOptions = BufferEncoding | Encoding
  
  type Value = typings.vfile.mod.Value
  
  type WriteOptions = BufferEncoding | Flag
}
