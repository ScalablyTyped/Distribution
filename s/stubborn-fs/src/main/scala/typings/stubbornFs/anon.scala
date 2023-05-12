package typings.stubbornFs

import typings.node.NodeJS.ArrayBufferView
import typings.node.anon.EncodingFlag
import typings.node.anon.Flag
import typings.node.anon.MakeDirectoryOptionsrecur
import typings.node.anon.MakeDirectoryOptionsrecurMode
import typings.node.anon.ObjectEncodingOptionsflagEncoding
import typings.node.anon.StatSyncOptionsbigintbool
import typings.node.anon.StatSyncOptionsbigintfals
import typings.node.anon.StatSyncOptionsbigintfalsBigint
import typings.node.anon.StatSyncOptionsbiginttrue
import typings.node.anon.StatSyncOptionsbiginttrueBigint
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.fsMod.BigIntStats
import typings.node.fsMod.BufferEncodingOption
import typings.node.fsMod.EncodingOption
import typings.node.fsMod.MakeDirectoryOptions
import typings.node.fsMod.Mode
import typings.node.fsMod.NoParamCallback
import typings.node.fsMod.OpenMode
import typings.node.fsMod.PathLike
import typings.node.fsMod.PathOrFileDescriptor
import typings.node.fsMod.StatSyncFn
import typings.node.fsMod.StatSyncOptions
import typings.node.fsMod.Stats
import typings.node.fsMod.WriteFileOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Chmod extends StObject {
    
    var chmod: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.chmod.__promisify__ */ Any
    
    def chmodSync(path: PathLike, mode: Mode): Unit
    @JSName("chmodSync")
    var chmodSync_Original: js.Function2[/* path */ PathLike, /* mode */ Mode, Unit]
    
    var chown: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.chown.__promisify__ */ Any
    
    def chownSync(path: PathLike, uid: Double, gid: Double): Unit
    @JSName("chownSync")
    var chownSync_Original: js.Function3[/* path */ PathLike, /* uid */ Double, /* gid */ Double, Unit]
    
    var close: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.close.__promisify__ */ Any
    
    def closeSync(fd: Double): Unit
    @JSName("closeSync")
    var closeSync_Original: js.Function1[/* fd */ Double, Unit]
    
    def existsSync(path: PathLike): Boolean
    @JSName("existsSync")
    var existsSync_Original: js.Function1[/* path */ PathLike, Boolean]
    
    var fsync: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.fsync.__promisify__ */ Any
    
    var fsyncSync: Typeoffsync
    
    var mkdir: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.mkdir.__promisify__ */ Any
    
    def mkdirSync(path: PathLike): js.UndefOr[String]
    def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecur): js.UndefOr[String]
    def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecurMode): Unit
    def mkdirSync(path: PathLike, options: MakeDirectoryOptions): js.UndefOr[String]
    def mkdirSync(path: PathLike, options: Mode): js.UndefOr[String]
    @JSName("mkdirSync")
    var mkdirSync_Original: FnCall
    @JSName("mkdirSync")
    def mkdirSync_Unit(path: PathLike): Unit
    @JSName("mkdirSync")
    def mkdirSync_Unit(path: PathLike, options: Mode): Unit
    
    var realpath: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.realpath.__promisify__ */ Any
    
    var realpathSync: TypeofrealpathSync
    
    var stat: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.stat.__promisify__ */ Any
    
    def statSync(path: PathLike): js.UndefOr[Stats]
    def statSync(path: PathLike, options: Unit): Stats
    def statSync(path: PathLike, options: StatSyncOptionsbigintbool): Stats | BigIntStats
    def statSync(path: PathLike, options: StatSyncOptionsbigintfals): js.UndefOr[Stats]
    def statSync(path: PathLike, options: StatSyncOptionsbigintfalsBigint): Stats
    def statSync(path: PathLike, options: StatSyncOptionsbiginttrue): js.UndefOr[BigIntStats]
    def statSync(path: PathLike, options: StatSyncOptionsbiginttrueBigint): BigIntStats
    def statSync(path: PathLike, options: StatSyncOptions): js.UndefOr[Stats | BigIntStats]
    @JSName("statSync")
    var statSync_Original: StatSyncFn
    @JSName("statSync")
    def statSync_Stats(path: PathLike): Stats
    
    var unlink: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.unlink.__promisify__ */ Any
    
    def unlinkSync(path: PathLike): Unit
    @JSName("unlinkSync")
    var unlinkSync_Original: js.Function1[/* path */ PathLike, Unit]
  }
  object Chmod {
    
    inline def apply(
      chmod: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.chmod.__promisify__ */ Any,
      chmodSync: (/* path */ PathLike, /* mode */ Mode) => Unit,
      chown: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.chown.__promisify__ */ Any,
      chownSync: (/* path */ PathLike, /* uid */ Double, /* gid */ Double) => Unit,
      close: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.close.__promisify__ */ Any,
      closeSync: /* fd */ Double => Unit,
      existsSync: /* path */ PathLike => Boolean,
      fsync: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.fsync.__promisify__ */ Any,
      fsyncSync: Typeoffsync,
      mkdir: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.mkdir.__promisify__ */ Any,
      mkdirSync: FnCall,
      realpath: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.realpath.__promisify__ */ Any,
      realpathSync: TypeofrealpathSync,
      stat: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.stat.__promisify__ */ Any,
      statSync: StatSyncFn,
      unlink: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.unlink.__promisify__ */ Any,
      unlinkSync: /* path */ PathLike => Unit
    ): Chmod = {
      val __obj = js.Dynamic.literal(chmod = chmod.asInstanceOf[js.Any], chmodSync = js.Any.fromFunction2(chmodSync), chown = chown.asInstanceOf[js.Any], chownSync = js.Any.fromFunction3(chownSync), close = close.asInstanceOf[js.Any], closeSync = js.Any.fromFunction1(closeSync), existsSync = js.Any.fromFunction1(existsSync), fsync = fsync.asInstanceOf[js.Any], fsyncSync = fsyncSync.asInstanceOf[js.Any], mkdir = mkdir.asInstanceOf[js.Any], mkdirSync = mkdirSync.asInstanceOf[js.Any], realpath = realpath.asInstanceOf[js.Any], realpathSync = realpathSync.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any], statSync = statSync.asInstanceOf[js.Any], unlink = unlink.asInstanceOf[js.Any], unlinkSync = js.Any.fromFunction1(unlinkSync))
      __obj.asInstanceOf[Chmod]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Chmod] (val x: Self) extends AnyVal {
      
      inline def setChmod(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.chmod.__promisify__ */ Any
      ): Self = StObject.set(x, "chmod", value.asInstanceOf[js.Any])
      
      inline def setChmodSync(value: (/* path */ PathLike, /* mode */ Mode) => Unit): Self = StObject.set(x, "chmodSync", js.Any.fromFunction2(value))
      
      inline def setChown(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.chown.__promisify__ */ Any
      ): Self = StObject.set(x, "chown", value.asInstanceOf[js.Any])
      
      inline def setChownSync(value: (/* path */ PathLike, /* uid */ Double, /* gid */ Double) => Unit): Self = StObject.set(x, "chownSync", js.Any.fromFunction3(value))
      
      inline def setClose(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.close.__promisify__ */ Any
      ): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseSync(value: /* fd */ Double => Unit): Self = StObject.set(x, "closeSync", js.Any.fromFunction1(value))
      
      inline def setExistsSync(value: /* path */ PathLike => Boolean): Self = StObject.set(x, "existsSync", js.Any.fromFunction1(value))
      
      inline def setFsync(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.fsync.__promisify__ */ Any
      ): Self = StObject.set(x, "fsync", value.asInstanceOf[js.Any])
      
      inline def setFsyncSync(value: Typeoffsync): Self = StObject.set(x, "fsyncSync", value.asInstanceOf[js.Any])
      
      inline def setMkdir(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.mkdir.__promisify__ */ Any
      ): Self = StObject.set(x, "mkdir", value.asInstanceOf[js.Any])
      
      inline def setMkdirSync(value: FnCall): Self = StObject.set(x, "mkdirSync", value.asInstanceOf[js.Any])
      
      inline def setRealpath(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.realpath.__promisify__ */ Any
      ): Self = StObject.set(x, "realpath", value.asInstanceOf[js.Any])
      
      inline def setRealpathSync(value: TypeofrealpathSync): Self = StObject.set(x, "realpathSync", value.asInstanceOf[js.Any])
      
      inline def setStat(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.stat.__promisify__ */ Any
      ): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
      
      inline def setStatSync(value: StatSyncFn): Self = StObject.set(x, "statSync", value.asInstanceOf[js.Any])
      
      inline def setUnlink(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.unlink.__promisify__ */ Any
      ): Self = StObject.set(x, "unlink", value.asInstanceOf[js.Any])
      
      inline def setUnlinkSync(value: /* path */ PathLike => Unit): Self = StObject.set(x, "unlinkSync", js.Any.fromFunction1(value))
    }
  }
  
  trait Close extends StObject {
    
    def close(timeout: Double): Any
    
    def closeSync(timeout: Double): js.Function1[/* fd */ Double, Unit]
    
    def fsync(timeout: Double): Any
    
    def fsyncSync(timeout: Double): js.Function1[/* fd */ Double, Unit]
    
    def open(timeout: Double): Any
    
    def openSync(timeout: Double): FnCallPathFlagsMode
    
    def readFile(timeout: Double): Any
    
    def readFileSync(timeout: Double): FnCallPathOptions
    
    def rename(timeout: Double): Any
    
    def renameSync(timeout: Double): js.Function2[/* oldPath */ PathLike, /* newPath */ PathLike, Unit]
    
    def stat(timeout: Double): Any
    
    def statSync(timeout: Double): StatSyncFn
    
    def write(timeout: Double): Any
    
    def writeFile(timeout: Double): Any
    
    def writeFileSync(timeout: Double): FnCallFileDataOptions
    
    def writeSync(timeout: Double): FnCallFdBufferOffsetLengthPosition
  }
  object Close {
    
    inline def apply(
      close: Double => Any,
      closeSync: Double => js.Function1[/* fd */ Double, Unit],
      fsync: Double => Any,
      fsyncSync: Double => js.Function1[/* fd */ Double, Unit],
      open: Double => Any,
      openSync: Double => FnCallPathFlagsMode,
      readFile: Double => Any,
      readFileSync: Double => FnCallPathOptions,
      rename: Double => Any,
      renameSync: Double => js.Function2[/* oldPath */ PathLike, /* newPath */ PathLike, Unit],
      stat: Double => Any,
      statSync: Double => StatSyncFn,
      write: Double => Any,
      writeFile: Double => Any,
      writeFileSync: Double => FnCallFileDataOptions,
      writeSync: Double => FnCallFdBufferOffsetLengthPosition
    ): Close = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close), closeSync = js.Any.fromFunction1(closeSync), fsync = js.Any.fromFunction1(fsync), fsyncSync = js.Any.fromFunction1(fsyncSync), open = js.Any.fromFunction1(open), openSync = js.Any.fromFunction1(openSync), readFile = js.Any.fromFunction1(readFile), readFileSync = js.Any.fromFunction1(readFileSync), rename = js.Any.fromFunction1(rename), renameSync = js.Any.fromFunction1(renameSync), stat = js.Any.fromFunction1(stat), statSync = js.Any.fromFunction1(statSync), write = js.Any.fromFunction1(write), writeFile = js.Any.fromFunction1(writeFile), writeFileSync = js.Any.fromFunction1(writeFileSync), writeSync = js.Any.fromFunction1(writeSync))
      __obj.asInstanceOf[Close]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Close] (val x: Self) extends AnyVal {
      
      inline def setClose(value: Double => Any): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      inline def setCloseSync(value: Double => js.Function1[/* fd */ Double, Unit]): Self = StObject.set(x, "closeSync", js.Any.fromFunction1(value))
      
      inline def setFsync(value: Double => Any): Self = StObject.set(x, "fsync", js.Any.fromFunction1(value))
      
      inline def setFsyncSync(value: Double => js.Function1[/* fd */ Double, Unit]): Self = StObject.set(x, "fsyncSync", js.Any.fromFunction1(value))
      
      inline def setOpen(value: Double => Any): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
      
      inline def setOpenSync(value: Double => FnCallPathFlagsMode): Self = StObject.set(x, "openSync", js.Any.fromFunction1(value))
      
      inline def setReadFile(value: Double => Any): Self = StObject.set(x, "readFile", js.Any.fromFunction1(value))
      
      inline def setReadFileSync(value: Double => FnCallPathOptions): Self = StObject.set(x, "readFileSync", js.Any.fromFunction1(value))
      
      inline def setRename(value: Double => Any): Self = StObject.set(x, "rename", js.Any.fromFunction1(value))
      
      inline def setRenameSync(value: Double => js.Function2[/* oldPath */ PathLike, /* newPath */ PathLike, Unit]): Self = StObject.set(x, "renameSync", js.Any.fromFunction1(value))
      
      inline def setStat(value: Double => Any): Self = StObject.set(x, "stat", js.Any.fromFunction1(value))
      
      inline def setStatSync(value: Double => StatSyncFn): Self = StObject.set(x, "statSync", js.Any.fromFunction1(value))
      
      inline def setWrite(value: Double => Any): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
      
      inline def setWriteFile(value: Double => Any): Self = StObject.set(x, "writeFile", js.Any.fromFunction1(value))
      
      inline def setWriteFileSync(value: Double => FnCallFileDataOptions): Self = StObject.set(x, "writeFileSync", js.Any.fromFunction1(value))
      
      inline def setWriteSync(value: Double => FnCallFdBufferOffsetLengthPosition): Self = StObject.set(x, "writeSync", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(path: PathLike): js.UndefOr[String] = js.native
    def apply(path: PathLike, options: MakeDirectoryOptionsrecur): js.UndefOr[String] = js.native
    def apply(path: PathLike, options: MakeDirectoryOptionsrecurMode): Unit = js.native
    def apply(path: PathLike, options: MakeDirectoryOptions): js.UndefOr[String] = js.native
    def apply(path: PathLike, options: Mode): js.UndefOr[String] = js.native
  }
  
  @js.native
  trait FnCallFdBufferOffsetLengthPosition extends StObject {
    
    def apply(fd: Double, buffer: ArrayBufferView): Double = js.native
    def apply(fd: Double, buffer: ArrayBufferView, offset: Double): Double = js.native
    def apply(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double): Double = js.native
    def apply(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double, position: Double): Double = js.native
    def apply(fd: Double, buffer: ArrayBufferView, offset: Double, length: Null, position: Double): Double = js.native
    def apply(fd: Double, buffer: ArrayBufferView, offset: Double, length: Unit, position: Double): Double = js.native
    def apply(fd: Double, buffer: ArrayBufferView, offset: Null, length: Double): Double = js.native
    def apply(fd: Double, buffer: ArrayBufferView, offset: Null, length: Double, position: Double): Double = js.native
    def apply(fd: Double, buffer: ArrayBufferView, offset: Null, length: Null, position: Double): Double = js.native
    def apply(fd: Double, buffer: ArrayBufferView, offset: Null, length: Unit, position: Double): Double = js.native
    def apply(fd: Double, buffer: ArrayBufferView, offset: Unit, length: Double): Double = js.native
    def apply(fd: Double, buffer: ArrayBufferView, offset: Unit, length: Double, position: Double): Double = js.native
    def apply(fd: Double, buffer: ArrayBufferView, offset: Unit, length: Null, position: Double): Double = js.native
    def apply(fd: Double, buffer: ArrayBufferView, offset: Unit, length: Unit, position: Double): Double = js.native
    def apply(fd: Double, string: String): Double = js.native
    def apply(fd: Double, string: String, position: Double): Double = js.native
    def apply(fd: Double, string: String, position: Double, encoding: BufferEncoding): Double = js.native
    def apply(fd: Double, string: String, position: Null, encoding: BufferEncoding): Double = js.native
    def apply(fd: Double, string: String, position: Unit, encoding: BufferEncoding): Double = js.native
  }
  
  @js.native
  trait FnCallFileDataOptions extends StObject {
    
    def apply(file: PathOrFileDescriptor, data: String): Unit = js.native
    def apply(file: PathOrFileDescriptor, data: String, options: WriteFileOptions): Unit = js.native
    def apply(file: PathOrFileDescriptor, data: ArrayBufferView): Unit = js.native
    def apply(file: PathOrFileDescriptor, data: ArrayBufferView, options: WriteFileOptions): Unit = js.native
  }
  
  @js.native
  trait FnCallPathFlagsMode extends StObject {
    
    def apply(path: PathLike, flags: OpenMode): Double = js.native
    def apply(path: PathLike, flags: OpenMode, mode: Mode): Double = js.native
  }
  
  @js.native
  trait FnCallPathOptions extends StObject {
    
    def apply(path: PathOrFileDescriptor): String | Buffer = js.native
    def apply(path: PathOrFileDescriptor, options: EncodingFlag): String = js.native
    def apply(path: PathOrFileDescriptor, options: Flag): Buffer = js.native
    def apply(path: PathOrFileDescriptor, options: ObjectEncodingOptionsflagEncoding): String | Buffer = js.native
    def apply(path: PathOrFileDescriptor, options: BufferEncoding): String = js.native
  }
  
  @js.native
  trait Typeoffsync extends StObject {
    
    def apply(fd: Double, callback: NoParamCallback): Unit = js.native
  }
  
  @js.native
  trait TypeofrealpathSync extends StObject {
    
    def apply(path: PathLike): String = js.native
    def apply(path: PathLike, options: BufferEncodingOption): Buffer = js.native
    def apply(path: PathLike, options: EncodingOption): String = js.native
    
    def native(path: PathLike): String = js.native
    def native(path: PathLike, options: BufferEncodingOption): Buffer = js.native
    def native(path: PathLike, options: EncodingOption): String = js.native
    @JSName("native")
    def native_Union(path: PathLike): String | Buffer = js.native
    @JSName("native")
    def native_Union(path: PathLike, options: EncodingOption): String | Buffer = js.native
  }
}
