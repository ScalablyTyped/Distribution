package typings.webpackSubresourceIntegrity

import typings.webpack.mod.Compilation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsReporterMod {
  
  @JSImport("webpack-subresource-integrity/dist/cjs/reporter", "Reporter")
  @js.native
  open class Reporter protected () extends StObject {
    /**
      * @internal
      */
    def this(compilation: Compilation) = this()
    
    /**
      * @internal
      */
    /* private */ var compilation: Any = js.native
    
    /**
      * @internal
      */
    /* private */ var emitMessage: Any = js.native
    
    /**
      * @internal
      */
    /* private */ var emitMessageOnce: Any = js.native
    
    /**
      * @internal
      */
    /* private */ var emittedMessages: Any = js.native
    
    /**
      * @internal
      */
    def error(message: String): Unit = js.native
    
    def errorCrossOriginLoadingNotSet(): Unit = js.native
    
    def errorHashFuncsEmpty(): Unit = js.native
    
    def errorHashFuncsNonArray(hashFuncNames: Any): Unit = js.native
    
    def errorInvalidHashLoading(hashLoading: String, supportedHashLoadingOptions: js.Array[String]): Unit = js.native
    
    def errorNonStringHashFunc(hashFuncName: Any): Unit = js.native
    
    /**
      * @internal
      */
    def errorOnce(message: String): Unit = js.native
    
    def errorUnresolvedIntegrity(chunkFile: String): Unit = js.native
    
    def errorUnusableHashFunc(hashFuncName: String, error: Any): Unit = js.native
    
    def warnContentHash(): Unit = js.native
    
    def warnCrossOriginPolicy(): Unit = js.native
    
    def warnHotReloading(): Unit = js.native
    
    def warnNoAssetsFound(sourcePath: String, assetNames: js.Array[String]): Unit = js.native
    
    def warnNonWeb(): Unit = js.native
    
    /**
      * @internal
      */
    def warnOnce(message: String): Unit = js.native
    
    def warnStandardHashFuncs(): Unit = js.native
  }
}
