package typings.webpackDevMiddleware

import typings.node.NodeJS.ErrnoException
import typings.node.anon.EncodingFlag
import typings.node.anon.Flag
import typings.node.anon.ObjectEncodingOptionsflagEncoding
import typings.node.anon.StatOptionsbigintfalseund
import typings.node.anon.StatOptionsbiginttrue
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.fsMod.BigIntStats
import typings.node.fsMod.PathLike
import typings.node.fsMod.PathOrFileDescriptor
import typings.node.fsMod.ReadStream
import typings.node.fsMod.ReadStreamOptions
import typings.node.fsMod.StatOptions
import typings.node.fsMod.StatSyncFn
import typings.node.fsMod.Stats
import typings.node.httpMod.IncomingMessage
import typings.webpack.mod.WebpackLogger
import typings.webpackDevMiddleware.mod.Context
import typings.webpackDevMiddleware.mod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CreateReadStream extends StObject {
    
    var createReadStream: js.UndefOr[FnCall] = js.undefined
    
    var lstat: js.UndefOr[Typeoflstat] = js.undefined
    
    var readFileSync: js.UndefOr[FnCallPathOptions] = js.undefined
    
    var statSync: js.UndefOr[StatSyncFn] = js.undefined
  }
  object CreateReadStream {
    
    inline def apply(): CreateReadStream = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateReadStream]
    }
    
    extension [Self <: CreateReadStream](x: Self) {
      
      inline def setCreateReadStream(value: FnCall): Self = StObject.set(x, "createReadStream", value.asInstanceOf[js.Any])
      
      inline def setCreateReadStreamUndefined: Self = StObject.set(x, "createReadStream", js.undefined)
      
      inline def setLstat(value: Typeoflstat): Self = StObject.set(x, "lstat", value.asInstanceOf[js.Any])
      
      inline def setLstatUndefined: Self = StObject.set(x, "lstat", js.undefined)
      
      inline def setReadFileSync(value: FnCallPathOptions): Self = StObject.set(x, "readFileSync", value.asInstanceOf[js.Any])
      
      inline def setReadFileSyncUndefined: Self = StObject.set(x, "readFileSync", js.undefined)
      
      inline def setStatSync(value: StatSyncFn): Self = StObject.set(x, "statSync", value.asInstanceOf[js.Any])
      
      inline def setStatSyncUndefined: Self = StObject.set(x, "statSync", js.undefined)
    }
  }
  
  trait DevMiddleware extends StObject {
    
    var devMiddleware: js.UndefOr[Context[IncomingMessage, ServerResponse]] = js.undefined
  }
  object DevMiddleware {
    
    inline def apply(): DevMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DevMiddleware]
    }
    
    extension [Self <: DevMiddleware](x: Self) {
      
      inline def setDevMiddleware(value: Context[IncomingMessage, ServerResponse]): Self = StObject.set(x, "devMiddleware", value.asInstanceOf[js.Any])
      
      inline def setDevMiddlewareUndefined: Self = StObject.set(x, "devMiddleware", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(path: PathLike): ReadStream = js.native
    def apply(path: PathLike, options: BufferEncoding): ReadStream = js.native
    def apply(path: PathLike, options: ReadStreamOptions): ReadStream = js.native
  }
  
  @js.native
  trait FnCallName extends StObject {
    
    def apply(name: String): WebpackLogger = js.native
    def apply(name: js.Function0[String]): WebpackLogger = js.native
  }
  
  @js.native
  trait FnCallPathOptions extends StObject {
    
    def apply(path: PathOrFileDescriptor): String | Buffer = js.native
    def apply(path: PathOrFileDescriptor, options: EncodingFlag): String = js.native
    def apply(path: PathOrFileDescriptor, options: Flag): Buffer = js.native
    def apply(path: PathOrFileDescriptor, options: ObjectEncodingOptionsflagEncoding): String | Buffer = js.native
    def apply(path: PathOrFileDescriptor, options: BufferEncoding): String = js.native
  }
  
  trait Key extends StObject {
    
    var key: String
    
    var value: Double | String
  }
  object Key {
    
    inline def apply(key: String, value: Double | String): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait OutputPath extends StObject {
    
    var outputPath: String
    
    var publicPath: String
  }
  object OutputPath {
    
    inline def apply(outputPath: String, publicPath: String): OutputPath = {
      val __obj = js.Dynamic.literal(outputPath = outputPath.asInstanceOf[js.Any], publicPath = publicPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutputPath]
    }
    
    extension [Self <: OutputPath](x: Self) {
      
      inline def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
      
      inline def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Typeoflstat extends StObject {
    
    def apply(path: PathLike, callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit]): Unit = js.native
    def apply(
      path: PathLike,
      options: Unit,
      callback: js.Function2[ErrnoException | Null, BigIntStats | (/* stats */ Stats), Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: StatOptionsbigintfalseund,
      callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: StatOptionsbiginttrue,
      callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ BigIntStats, Unit]
    ): Unit = js.native
    def apply(
      path: PathLike,
      options: StatOptions,
      callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats | BigIntStats, Unit]
    ): Unit = js.native
  }
  
  trait Webpack extends StObject {
    
    var webpack: js.UndefOr[DevMiddleware] = js.undefined
  }
  object Webpack {
    
    inline def apply(): Webpack = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Webpack]
    }
    
    extension [Self <: Webpack](x: Self) {
      
      inline def setWebpack(value: DevMiddleware): Self = StObject.set(x, "webpack", value.asInstanceOf[js.Any])
      
      inline def setWebpackUndefined: Self = StObject.set(x, "webpack", js.undefined)
    }
  }
}
