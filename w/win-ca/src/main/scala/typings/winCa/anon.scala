package typings.winCa

import typings.winCa.mod.Certificate
import typings.winCa.mod.CertificateFormat
import typings.winCa.mod.Store
import typings.winCa.winCaStrings.Plussign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined win-ca.win-ca.Options & {  generator :true} */
  trait Optionsgeneratortrue extends StObject {
    
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
  object Optionsgeneratortrue {
    
    inline def apply(): Optionsgeneratortrue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Optionsgeneratortrue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Optionsgeneratortrue] (val x: Self) extends AnyVal {
      
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
  
  /* Inlined win-ca.win-ca.Options & {  generator :true,   async :true} */
  trait Optionsgeneratortrueasync extends StObject {
    
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
  object Optionsgeneratortrueasync {
    
    inline def apply(): Optionsgeneratortrueasync = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Optionsgeneratortrueasync]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Optionsgeneratortrueasync] (val x: Self) extends AnyVal {
      
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
}
