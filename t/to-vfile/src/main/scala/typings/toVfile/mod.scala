package typings.toVfile

import typings.vfile.mod.VFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("to-vfile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def read(description: typings.toVfile.libMod.Compatible): js.Promise[VFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(description.asInstanceOf[js.Any]).asInstanceOf[js.Promise[VFile]]
  inline def read(description: typings.toVfile.libMod.Compatible, callback: typings.toVfile.libMod.Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(description.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def read(description: typings.toVfile.libMod.Compatible, options: typings.toVfile.libMod.ReadOptions): js.Promise[VFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(description.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[VFile]]
  inline def read(
    description: typings.toVfile.libMod.Compatible,
    options: typings.toVfile.libMod.ReadOptions,
    callback: typings.toVfile.libMod.Callback
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(description.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def readSync(description: typings.toVfile.libMod.Compatible): VFile = ^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(description.asInstanceOf[js.Any]).asInstanceOf[VFile]
  inline def readSync(description: typings.toVfile.libMod.Compatible, options: typings.toVfile.libMod.ReadOptions): VFile = (^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(description.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[VFile]
  
  inline def toVFile(): VFile = ^.asInstanceOf[js.Dynamic].applyDynamic("toVFile")().asInstanceOf[VFile]
  inline def toVFile(options: typings.toVfile.libMod.Compatible): VFile = ^.asInstanceOf[js.Dynamic].applyDynamic("toVFile")(options.asInstanceOf[js.Any]).asInstanceOf[VFile]
  
  inline def write(description: typings.toVfile.libMod.Compatible): js.Promise[VFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(description.asInstanceOf[js.Any]).asInstanceOf[js.Promise[VFile]]
  inline def write(description: typings.toVfile.libMod.Compatible, callback: typings.toVfile.libMod.Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(description.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def write(description: typings.toVfile.libMod.Compatible, options: typings.toVfile.libMod.WriteOptions): js.Promise[VFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(description.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[VFile]]
  inline def write(
    description: typings.toVfile.libMod.Compatible,
    options: typings.toVfile.libMod.WriteOptions,
    callback: typings.toVfile.libMod.Callback
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(description.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeSync(description: typings.toVfile.libMod.Compatible): VFile = ^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(description.asInstanceOf[js.Any]).asInstanceOf[VFile]
  inline def writeSync(description: typings.toVfile.libMod.Compatible, options: typings.toVfile.libMod.WriteOptions): VFile = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(description.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[VFile]
  
  type BufferEncoding = typings.toVfile.libMod.BufferEncoding
  
  type Callback = typings.toVfile.libMod.Callback
  
  type Compatible = typings.toVfile.libMod.Compatible
  
  type Mode = typings.toVfile.libMod.Mode
  
  type ReadOptions = typings.toVfile.libMod.ReadOptions
  
  type WriteOptions = typings.toVfile.libMod.WriteOptions
}
