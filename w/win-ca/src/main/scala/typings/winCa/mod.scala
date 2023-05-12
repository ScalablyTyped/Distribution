package typings.winCa

import typings.node.bufferMod.global.Buffer
import typings.std.AsyncGenerator
import typings.std.Generator
import typings.winCa.anon.Optionsgeneratortrue
import typings.winCa.anon.Optionsgeneratortrueasync
import typings.winCa.winCaInts.`0`
import typings.winCa.winCaInts.`1`
import typings.winCa.winCaInts.`2`
import typings.winCa.winCaInts.`3`
import typings.winCa.winCaInts.`4`
import typings.winCa.winCaStrings.Plussign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(params: Optionsgeneratortrue): Generator[Certificate, Any, Any] = ^.asInstanceOf[js.Dynamic].apply(params.asInstanceOf[js.Any]).asInstanceOf[Generator[Certificate, Any, Any]]
  inline def apply(params: Optionsgeneratortrueasync): AsyncGenerator[Certificate, Any, Any] = ^.asInstanceOf[js.Dynamic].apply(params.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[Certificate, Any, Any]]
  inline def apply(params: Options): (AsyncGenerator[Certificate, Any, Any]) | (Generator[Certificate, Any, Any]) | Unit = ^.asInstanceOf[js.Dynamic].apply(params.asInstanceOf[js.Any]).asInstanceOf[(AsyncGenerator[Certificate, Any, Any]) | (Generator[Certificate, Any, Any]) | Unit]
  
  @JSImport("win-ca", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object der2 {
    
    /**
      * Converts certificate from DER to format specified in first parameter.
      *
      * @example <caption>This function is curried</caption>
      * import ca = require('win-ca')
      *
      * const toPEM = ca.der2(ca.der2.pem)
      * const pem = toPEM(der)
      */
    inline def apply(format: CertificateFormat): js.Function1[/* certificate */ String | Buffer, Certificate] = ^.asInstanceOf[js.Dynamic].apply(format.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* certificate */ String | Buffer, Certificate]]
    inline def apply(format: CertificateFormat, certificate: String): Certificate = (^.asInstanceOf[js.Dynamic].apply(format.asInstanceOf[js.Any], certificate.asInstanceOf[js.Any])).asInstanceOf[Certificate]
    inline def apply(format: CertificateFormat, certificate: Buffer): Certificate = (^.asInstanceOf[js.Dynamic].apply(format.asInstanceOf[js.Any], certificate.asInstanceOf[js.Any])).asInstanceOf[Certificate]
    
    @JSImport("win-ca", "der2")
    @js.native
    val ^ : js.Any = js.native
    
    /** ASN.1-parsed certificate */
    @JSImport("win-ca", "der2.asn1")
    @js.native
    val asn1: `3` = js.native
    
    /** DER-format (binary, Node's [Buffer](https://nodejs.org/api/buffer.html)) */
    @JSImport("win-ca", "der2.der")
    @js.native
    val der: `0` = js.native
    
    /** PEM-format (text, Base64-encoded) */
    @JSImport("win-ca", "der2.pem")
    @js.native
    val pem: `1` = js.native
    
    /** PEM-format plus some laconic header */
    @JSImport("win-ca", "der2.txt")
    @js.native
    val txt: `2` = js.native
    
    /** Certificate in `node-forge` format (RSA only!) */
    @JSImport("win-ca", "der2.x509")
    @js.native
    val x509: `4` = js.native
  }
  
  @JSImport("win-ca", "disabled")
  @js.native
  val disabled: Boolean = js.native
  
  @JSImport("win-ca", "electron")
  @js.native
  val electron: js.UndefOr[Boolean] = js.native
  
  /**
    * Applications that use `win-ca` are sometimes packed / bundled. In this case one should find appropriate
    * place for binary utility `roots.exe` (used in fallback mode, which is always the case with Electron apps)
    * and then make `win-ca` to find the binary.
    *
    * Function `.exe()` is intended to provide this functionality.
    *
    * You must call it **before** first invocation of library itself:
    * ```
    * import ca = require('win-ca/api')
    *
    * ca.exe('/full/path/to/roots.exe')
    * ca({fallback: true, inject: true})
    * ```
    *
    * `.exe()` with no parameters switches to default location (inside `lib` folder).
    * In any case it returns previous path to `roots.exe`:
    * ```
    * import ca = require('win-ca');
    *
    * console.log(ca.exe()) // Where is my root.exe?
    * ```
    */
  inline def exe(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("exe")().asInstanceOf[String]
  inline def exe(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("exe")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hash(): js.Function1[/* certificate */ String | Buffer, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("hash")().asInstanceOf[js.Function1[/* certificate */ String | Buffer, String]]
  inline def hash(version: `0` | `1`): js.Function1[/* certificate */ String | Buffer, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("hash")(version.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* certificate */ String | Buffer, String]]
  inline def hash(version: `0` | `1`, certificate: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(version.asInstanceOf[js.Any], certificate.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hash(version: `0` | `1`, certificate: Buffer): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(version.asInstanceOf[js.Any], certificate.asInstanceOf[js.Any])).asInstanceOf[String]
  /**
    * Gives certificate hash (aka X509_NAME_hash), ie 8-character hexadecimal string, derived
    * from certificate subject.
    *
    * @param version If version is `0`, an old algorithm is used (aka X509_NAME_hash_old, used
    * in OpenSSL v0.\*), else - the new one (X509_NAME_hash of OpenSSL v1.\*).
    *
    * @example <caption>This function is curried</caption>
    * import ca = require('win-ca')
    *
    * const hasher = ca.hash()
    * console.log(hasher(der))
    */
  inline def hash(version: Unit, certificate: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(version.asInstanceOf[js.Any], certificate.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hash(version: Unit, certificate: Buffer): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(version.asInstanceOf[js.Any], certificate.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Manages the way certificates are passed to other modules.
    *
    * This function is internally called by API when `inject` parameter used.
    *
    * Note, that this function should be called before first secure connection is established, since
    * every secure connection populates different caches, that are extremely hard to invalidate. Changing
    * injection mode in the middle of secure communication can lead to unpredictable results.
    *
    * @param mode The injection mode:
    * - `false`: no injection, built-in certificates are used
    * - `true`: put certificates to `https.globalAgent.options.ca` and use them *instead* of built-in ones
    * for `https` module
    * - `'+'`: new *experimental* mode: `tls.createSecureContext()` is patched and certificates are used
    * *along with* built-in ones. This mode should affect all secure connections, not just `https` module.
    *
    * @param certificates List of certificates to inject. If it is omitted, previous list is used
    * (only inject mode is changed).
    *
    * @example <caption>Simplest way to test new injection mode is:</caption>
    * import ca = require('win-ca') // Fetch certificates and start injecting (old way)
    *
    * ca.inject('+') // Switch to new injection mode
    */
  inline def inject(mode: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("inject")(mode.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def inject(mode: Boolean, certificates: js.Array[Certificate]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(mode.asInstanceOf[js.Any], certificates.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def inject(mode: Plussign): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("inject")(mode.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def inject(mode: Plussign, certificates: js.Array[Certificate]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(mode.asInstanceOf[js.Any], certificates.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("win-ca", "nApi")
  @js.native
  val nApi: Boolean = js.native
  
  type Certificate = Buffer | String | typings.nodeForge.mod.pki.Certificate
  
  /* Inlined {None (format : win-ca.win-ca.CertificateFormat): (certificate : string | node.buffer.<global>.Buffer): win-ca.win-ca.Certificate, None (format : win-ca.win-ca.CertificateFormat, certificate : string | node.buffer.<global>.Buffer): win-ca.win-ca.Certificate,  readonly der :0,  readonly pem :1,  readonly txt :2,  readonly asn1 :3,  readonly x509 :4}[keyof {None (format : win-ca.win-ca.CertificateFormat): (certificate : string | node.buffer.<global>.Buffer): win-ca.win-ca.Certificate, None (format : win-ca.win-ca.CertificateFormat, certificate : string | node.buffer.<global>.Buffer): win-ca.win-ca.Certificate,  readonly der :0,  readonly pem :1,  readonly txt :2,  readonly asn1 :3,  readonly x509 :4}] */
  /* Rewritten from type alias, can be one of: 
    - typings.winCa.winCaInts.`3`
    - typings.winCa.winCaInts.`2`
    - typings.winCa.winCaInts.`4`
    - typings.winCa.winCaInts.`0`
    - typings.winCa.winCaInts.`1`
  */
  trait CertificateFormat extends StObject
  object CertificateFormat {
    
    inline def `0`: typings.winCa.winCaInts.`0` = 0.asInstanceOf[typings.winCa.winCaInts.`0`]
    
    inline def `1`: typings.winCa.winCaInts.`1` = 1.asInstanceOf[typings.winCa.winCaInts.`1`]
    
    inline def `2`: typings.winCa.winCaInts.`2` = 2.asInstanceOf[typings.winCa.winCaInts.`2`]
    
    inline def `3`: typings.winCa.winCaInts.`3` = 3.asInstanceOf[typings.winCa.winCaInts.`3`]
    
    inline def `4`: typings.winCa.winCaInts.`4` = 4.asInstanceOf[typings.winCa.winCaInts.`4`]
  }
  
  trait Options extends StObject {
    
    /**
      * Makes the retrieval process asynchronous.
      *
      * If `true`, API call returns immediately, certificates will be fetched later and fed to `ondata`
      * callback. Finally `onend` callback will be called.
      *
      * @default false
      */
    var async: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates that N-API shouldn't be used even if it is available.
      *
      * Default value depends on Node.js version (4, 5 and 7 `{fallback: true}`; modern versions
      * `{fallback: false}`). It is also `true` if Electron is detected.
      *
      * Finally, if `win-ca` has been required as `win-ca/fallback`, default value for this flag
      * is also set to `true`.
      *
      * Note, that one can force N-API by setting `{fallback: false}`, but if Node.js cannot proceed,
      * exception will be thrown. It can be caught, but Node.js will nevertheless remain in unstable
      * state, so beware.
      */
    var fallback: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines representation of certificates to fetch.
      *
      * @default der2.der
      */
    var format: js.UndefOr[CertificateFormat] = js.undefined
    
    /**
      * Emulate an ES6 generator.
      *
      * If called with this flag, ES6 iterator object is immediately returned (regular or asynchronous -
      * according to `async` flag).
      *
      * Note, that if callbacks are set along with `generator` flag, they will be *also* fired.
      *
      * @default false
      *
      * @example
      * import ca = require('win-ca/api')
      *
      * // Iterate
      * for (const der of ca({generator: true})) {
      *   // Process(der)
      * }
      *
      * // Or thus (Node.js v>=6)
      * const list = [...ca({generator: true})]
      *
      * // Or even (Node.js v>=10)
      * for await(let der of ca({generator: true, async: true})) {
      *   // await Process(der)
      * }
      */
    var generator: js.UndefOr[Boolean] = js.undefined
    
    /**
      * How to install certificates.
      *
      * If set to `true`, certificated fetched will be also added to `https.globalAgent.options.ca`
      * (in PEM format, regardless of `format` parameter), so all subsequent calls to `https` client
      * methods (https.request, https.get etc.) will silently use them *instead* of built-in ones.
      *
      * If set to `'+'`, new *experimental* method is used instead: `tls.createSecureContext()` is
      * patched and fetched certificates are used *in addition* to built-in ones (and not only for
      * `https`, but for all secure connections).
      *
      * Injection mode can be later changed (or disabled) with the `inject()` helper function.
      *
      * @default false // just fetch from store, do not install
      */
    var inject: js.UndefOr[Boolean | Plussign] = js.undefined
    
    /**
      * Callback fired for each certificate found.
      *
      * Every certificate will be converted to `format` and passed as the first parameter.
      * As a syntactic sugar, an empty array can be passed instead of a function, it will be populated
      * with certificates.
      */
    var ondata: js.UndefOr[js.Array[Certificate] | (js.Function1[/* certificate */ Certificate, Unit])] = js.undefined
    
    /**
      * Callback fired at the end of retrieval.
      *
      * Useful for asynchronous invocations, but works in any case.
      */
    var onend: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Callback called at the end of saving (if `save` is truthy).
      *
      * Path to a folder is passed to callback, or no parameters if it has been impossible to save
      * certificates to disk.
      */
    var onsave: js.UndefOr[js.Function1[/* path */ js.UndefOr[String], Unit]] = js.undefined
    
    /**
      * How to save certificates to disk.
      *
      * If set to string, or array of strings, they will be treated as list of candidate folders
      * to save certificates to. First one that exists or can be (recursively) created will be used.
      *
      * If no valid folder path found, saving will be silently discarded.
      *
      * If `true` is used, a predefined list of folders will be tried:
      * - `pem` folder inside `win-ca` module itself
      * - `.local/win-ca/pem` folder inside user's profile
      *
      * Certificates will be stored into the folder in two formats:
      * - Each certificate as separate text file with special file name (mimics behavior of
      * [OpenSSL](https://www.openssl.org/)'s `c_rehash` utility) - suitable for `SSL_CERT_DIR`.
      * - All certificates in single `roots.pem` file - suitable for `SSL_CERT_FILE`.
      *
      * If `win-ca` is required not via `win-ca/api`, it calls itself with `{inject: true, save: true}`
      * and additionally sets `ca.path` field and `SSL_CERT_DIR` environment variable to the folder
      * with certificates saved.
      *
      * @default false // ie use *no* I/O at all
      */
    var save: js.UndefOr[Boolean | String | js.Array[String]] = js.undefined
    
    /**
      * Which Windows' store to use.
      *
      * Windows has a whole lot of Certificate stores (eg `Root`, `CA`, `My`, `TrustedPublisher` etc.).
      * One can list certificates from any of them (knowing its name) or several stores at once
      * (using array for `store` parameter).
      *
      * @default 'root' // ie Trusted Root Certification Authorities
      *
      * @example
      * import api = require('win-ca/api')
      *
      * const list: Certificate[] = []
      * api({store: ['root', 'ca'], ondata: list})
      */
    var store: js.UndefOr[js.Array[Store]] = js.undefined
    
    /**
      * Whether certificates list should be deduplicated. Use `{unique: false}` to see all certificates
      * in store.
      *
      * @default true // no duplicates returned
      */
    var unique: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setFallback(value: Boolean): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setFormat(value: CertificateFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setGenerator(value: Boolean): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
      
      inline def setGeneratorUndefined: Self = StObject.set(x, "generator", js.undefined)
      
      inline def setInject(value: Boolean | Plussign): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
      
      inline def setInjectUndefined: Self = StObject.set(x, "inject", js.undefined)
      
      inline def setOndata(value: js.Array[Certificate] | (js.Function1[/* certificate */ Certificate, Unit])): Self = StObject.set(x, "ondata", value.asInstanceOf[js.Any])
      
      inline def setOndataFunction1(value: /* certificate */ Certificate => Unit): Self = StObject.set(x, "ondata", js.Any.fromFunction1(value))
      
      inline def setOndataUndefined: Self = StObject.set(x, "ondata", js.undefined)
      
      inline def setOndataVarargs(value: Certificate*): Self = StObject.set(x, "ondata", js.Array(value*))
      
      inline def setOnend(value: () => Unit): Self = StObject.set(x, "onend", js.Any.fromFunction0(value))
      
      inline def setOnendUndefined: Self = StObject.set(x, "onend", js.undefined)
      
      inline def setOnsave(value: /* path */ js.UndefOr[String] => Unit): Self = StObject.set(x, "onsave", js.Any.fromFunction1(value))
      
      inline def setOnsaveUndefined: Self = StObject.set(x, "onsave", js.undefined)
      
      inline def setSave(value: Boolean | String | js.Array[String]): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
      
      inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
      
      inline def setSaveVarargs(value: String*): Self = StObject.set(x, "save", js.Array(value*))
      
      inline def setStore(value: js.Array[Store]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
      
      inline def setStoreVarargs(value: Store*): Self = StObject.set(x, "store", js.Array(value*))
      
      inline def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
      
      inline def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.winCa.winCaStrings.root
    - typings.winCa.winCaStrings.ca
    - typings.winCa.winCaStrings.my
    - typings.winCa.winCaStrings.trustedpublisher
  */
  trait Store extends StObject
  object Store {
    
    inline def ca: typings.winCa.winCaStrings.ca = "ca".asInstanceOf[typings.winCa.winCaStrings.ca]
    
    inline def my: typings.winCa.winCaStrings.my = "my".asInstanceOf[typings.winCa.winCaStrings.my]
    
    inline def root: typings.winCa.winCaStrings.root = "root".asInstanceOf[typings.winCa.winCaStrings.root]
    
    inline def trustedpublisher: typings.winCa.winCaStrings.trustedpublisher = "trustedpublisher".asInstanceOf[typings.winCa.winCaStrings.trustedpublisher]
  }
}
