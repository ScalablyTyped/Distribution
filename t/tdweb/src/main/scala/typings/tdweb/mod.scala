package typings.tdweb

import org.scalablytyped.runtime.StringDictionary
import typings.tdweb.tdwebStrings.asmjs
import typings.tdweb.tdwebStrings.auto
import typings.tdweb.tdwebStrings.debug
import typings.tdweb.tdwebStrings.error
import typings.tdweb.tdwebStrings.info
import typings.tdweb.tdwebStrings.log
import typings.tdweb.tdwebStrings.string
import typings.tdweb.tdwebStrings.warning
import typings.tdweb.tdwebStrings.wasm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * TDLib in a browser
    *
    * TDLib can be compiled to WebAssembly or asm.js using Emscripten compiler and used in a browser from JavaScript.
    * This is a convenient wrapper for TDLib in a browser which controls TDLib instance creation, handles interaction
    * with TDLib and manages a filesystem for persistent TDLib data.
    * TDLib instance is created in a Web Worker to run it in a separate thread.
    * TdClient just sends queries to the Web Worker and receives updates and results from it.
    *
    *
    * Differences from the TDLib JSON API:
    * 1. Added the update `updateFatalError error:string = Update;` which is sent whenever TDLib encounters a fatal error.
    * 2. Added the method `setJsLogVerbosityLevel new_verbosity_level:string = Ok;`,
    * which allows to change the verbosity level of tdweb logging.
    * 3. Added the possibility to use blobs as input files via the constructor `inputFileBlob data:<JavaScript blob> = InputFile;`.
    * 4. The class `filePart` contains data as a JavaScript blob instead of a base64-encoded string.
    * 5. The method `readFilePart` supports only `offset == count == 0`.
    * 6. The methods `getStorageStatistics`, `getStorageStatisticsFast`, `optimizeStorage`, `addProxy` and
    * `getFileDownloadedPrefixSize` are not supported.
    */
  @JSImport("tdweb", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with TdClient {
    /**
      * Create TdClient.
      */
    def this(options: TdOptions) = this()
    
    /**
      * Send a query to TDLib.
      * If the query contains the field '@extra', the same field will be added into the result.
      * @link https://github.com/tdlib/td/blob/master/td/generate/scheme/td_api.tl - td_api.tl scheme
      * @link https://core.telegram.org/tdlib/docs/td__api_8h.html - HTML documentation
      * @link https://core.telegram.org/tdlib/docs/classtd_1_1td__api_1_1_function.html - a list of all available TDLib methods
      * @link https://core.telegram.org/tdlib/docs/classtd_1_1td__api_1_1_object.html - a list of all available TDLib classes
      */
    /* CompleteClass */
    override def send(query: TdObject): js.Promise[TdError | TdObject] = js.native
  }
  
  /**
    * TDLib in a browser
    *
    * TDLib can be compiled to WebAssembly or asm.js using Emscripten compiler and used in a browser from JavaScript.
    * This is a convenient wrapper for TDLib in a browser which controls TDLib instance creation, handles interaction
    * with TDLib and manages a filesystem for persistent TDLib data.
    * TDLib instance is created in a Web Worker to run it in a separate thread.
    * TdClient just sends queries to the Web Worker and receives updates and results from it.
    *
    *
    * Differences from the TDLib JSON API:
    * 1. Added the update `updateFatalError error:string = Update;` which is sent whenever TDLib encounters a fatal error.
    * 2. Added the method `setJsLogVerbosityLevel new_verbosity_level:string = Ok;`,
    * which allows to change the verbosity level of tdweb logging.
    * 3. Added the possibility to use blobs as input files via the constructor `inputFileBlob data:<JavaScript blob> = InputFile;`.
    * 4. The class `filePart` contains data as a JavaScript blob instead of a base64-encoded string.
    * 5. The method `readFilePart` supports only `offset == count == 0`.
    * 6. The methods `getStorageStatistics`, `getStorageStatisticsFast`, `optimizeStorage`, `addProxy` and
    * `getFileDownloadedPrefixSize` are not supported.
    */
  trait TdClient extends StObject {
    
    /**
      * Send a query to TDLib.
      * If the query contains the field '@extra', the same field will be added into the result.
      * @link https://github.com/tdlib/td/blob/master/td/generate/scheme/td_api.tl - td_api.tl scheme
      * @link https://core.telegram.org/tdlib/docs/td__api_8h.html - HTML documentation
      * @link https://core.telegram.org/tdlib/docs/classtd_1_1td__api_1_1_function.html - a list of all available TDLib methods
      * @link https://core.telegram.org/tdlib/docs/classtd_1_1td__api_1_1_object.html - a list of all available TDLib classes
      */
    def send(query: TdObject): js.Promise[TdError | TdObject]
  }
  object TdClient {
    
    inline def apply(send: TdObject => js.Promise[TdError | TdObject]): TdClient = {
      val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send))
      __obj.asInstanceOf[TdClient]
    }
    
    extension [Self <: TdClient](x: Self) {
      
      inline def setSend(value: TdObject => js.Promise[TdError | TdObject]): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
    }
  }
  
  trait TdError extends StObject {
    
    var `@extra`: js.UndefOr[string] = js.undefined
    
    var `@type`: error
    
    /**
      * Error code; subject to future changes. If the error code is 406, the error message
      * must not be processed in any way and must not be displayed to the user
      */
    var code: Double
    
    /** Error message; subject to future changes */
    var message: String
  }
  object TdError {
    
    inline def apply(code: Double, message: String): TdError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("@type")("error")
      __obj.asInstanceOf[TdError]
    }
    
    extension [Self <: TdError](x: Self) {
      
      inline def `set@extra`(value: string): Self = StObject.set(x, "@extra", value.asInstanceOf[js.Any])
      
      inline def `set@extraUndefined`: Self = StObject.set(x, "@extra", js.undefined)
      
      inline def `set@type`(value: error): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait TdObject
    extends StObject
       with /* key */ StringDictionary[
          js.UndefOr[
            TdObject | (js.Array[Boolean | Double | String | TdObject]) | Double | String | Boolean
          ]
        ] {
    
    var `@extra`: js.UndefOr[String] = js.undefined
    
    var `@type`: String
  }
  object TdObject {
    
    inline def apply(`@type`: String): TdObject = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TdObject]
    }
    
    extension [Self <: TdObject](x: Self) {
      
      inline def `set@extra`(value: String): Self = StObject.set(x, "@extra", value.asInstanceOf[js.Any])
      
      inline def `set@extraUndefined`: Self = StObject.set(x, "@extra", js.undefined)
      
      inline def `set@type`(value: String): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
    }
  }
  
  trait TdOptions extends StObject {
    
    /**
      * Name of the TDLib instance. Currently only one instance of TdClient with a given name is allowed.
      * All but one instances with the same name will be automatically closed. Usually, the newest non-background instance is kept alive.
      * Files will be stored in an IndexedDb table with the same name.
      */
    var instanceName: js.UndefOr[String] = js.undefined
    
    /**
      * Pass true, if the instance is opened from the background.
      */
    var isBackground: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The initial verbosity level of the JavaScript part of the code (one of 'error', 'warning', 'info', 'log', 'debug').
      */
    var jsLogVerbosityLevel: js.UndefOr[error | warning | info | log | debug] = js.undefined
    
    /**
      * The initial verbosity level for the TDLib internal logging (0-1023).
      */
    var logVerbosityLevel: js.UndefOr[Double] = js.undefined
    
    /**
      * For debug only. The type of the TDLib build to use. 'asmjs' for asm.js and 'wasm' for WebAssembly.
      * If mode == 'auto' WebAbassembly will be used if supported by browser, asm.js otherwise.
      */
    var mode: js.UndefOr[auto | asmjs | wasm] = js.undefined
    
    /**
      * Callback for all incoming updates.
      */
    var onUpdate: js.UndefOr[js.Function1[/* update */ TdObject, Any]] = js.undefined
    
    /**
      * For debug only. PaPass false to use TDLib without database and secret chats.
      * It will significantly improve loading time, but some functionality will be unavailable.ss true
      * to open TDLib database in read-only mode
      */
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Pass false to use TDLib without database and secret chats. It will significantly improve loading time, but some functionality will be unavailable.
      */
    var useDatabase: js.UndefOr[Boolean] = js.undefined
  }
  object TdOptions {
    
    inline def apply(): TdOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TdOptions]
    }
    
    extension [Self <: TdOptions](x: Self) {
      
      inline def setInstanceName(value: String): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
      
      inline def setInstanceNameUndefined: Self = StObject.set(x, "instanceName", js.undefined)
      
      inline def setIsBackground(value: Boolean): Self = StObject.set(x, "isBackground", value.asInstanceOf[js.Any])
      
      inline def setIsBackgroundUndefined: Self = StObject.set(x, "isBackground", js.undefined)
      
      inline def setJsLogVerbosityLevel(value: error | warning | info | log | debug): Self = StObject.set(x, "jsLogVerbosityLevel", value.asInstanceOf[js.Any])
      
      inline def setJsLogVerbosityLevelUndefined: Self = StObject.set(x, "jsLogVerbosityLevel", js.undefined)
      
      inline def setLogVerbosityLevel(value: Double): Self = StObject.set(x, "logVerbosityLevel", value.asInstanceOf[js.Any])
      
      inline def setLogVerbosityLevelUndefined: Self = StObject.set(x, "logVerbosityLevel", js.undefined)
      
      inline def setMode(value: auto | asmjs | wasm): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOnUpdate(value: /* update */ TdObject => Any): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1(value))
      
      inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setUseDatabase(value: Boolean): Self = StObject.set(x, "useDatabase", value.asInstanceOf[js.Any])
      
      inline def setUseDatabaseUndefined: Self = StObject.set(x, "useDatabase", js.undefined)
    }
  }
}
