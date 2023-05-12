package typings.winCa

import typings.node.bufferMod.global.Buffer
import typings.std.AsyncGenerator
import typings.std.Generator
import typings.winCa.anon.Optionsgeneratortrue
import typings.winCa.anon.Optionsgeneratortrueasync
import typings.winCa.mod.Certificate
import typings.winCa.mod.CertificateFormat
import typings.winCa.mod.Options
import typings.winCa.winCaInts.`0`
import typings.winCa.winCaInts.`1`
import typings.winCa.winCaInts.`2`
import typings.winCa.winCaInts.`3`
import typings.winCa.winCaInts.`4`
import typings.winCa.winCaStrings.Plussign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fallbackMod {
  
  inline def apply(params: Optionsgeneratortrue): Generator[Certificate, Any, Any] = ^.asInstanceOf[js.Dynamic].apply(params.asInstanceOf[js.Any]).asInstanceOf[Generator[Certificate, Any, Any]]
  inline def apply(params: Optionsgeneratortrueasync): AsyncGenerator[Certificate, Any, Any] = ^.asInstanceOf[js.Dynamic].apply(params.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[Certificate, Any, Any]]
  inline def apply(params: Options): (AsyncGenerator[Certificate, Any, Any]) | (Generator[Certificate, Any, Any]) | Unit = ^.asInstanceOf[js.Dynamic].apply(params.asInstanceOf[js.Any]).asInstanceOf[(AsyncGenerator[Certificate, Any, Any]) | (Generator[Certificate, Any, Any]) | Unit]
  
  @JSImport("win-ca/fallback", JSImport.Namespace)
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
    
    @JSImport("win-ca/fallback", "der2")
    @js.native
    val ^ : js.Any = js.native
    
    /** ASN.1-parsed certificate */
    @JSImport("win-ca/fallback", "der2.asn1")
    @js.native
    val asn1: `3` = js.native
    
    /** DER-format (binary, Node's [Buffer](https://nodejs.org/api/buffer.html)) */
    @JSImport("win-ca/fallback", "der2.der")
    @js.native
    val der: `0` = js.native
    
    /** PEM-format (text, Base64-encoded) */
    @JSImport("win-ca/fallback", "der2.pem")
    @js.native
    val pem: `1` = js.native
    
    /** PEM-format plus some laconic header */
    @JSImport("win-ca/fallback", "der2.txt")
    @js.native
    val txt: `2` = js.native
    
    /** Certificate in `node-forge` format (RSA only!) */
    @JSImport("win-ca/fallback", "der2.x509")
    @js.native
    val x509: `4` = js.native
  }
  
  @JSImport("win-ca/fallback", "disabled")
  @js.native
  val disabled: Boolean = js.native
  
  @JSImport("win-ca/fallback", "electron")
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
  
  @JSImport("win-ca/fallback", "nApi")
  @js.native
  val nApi: Boolean = js.native
}
