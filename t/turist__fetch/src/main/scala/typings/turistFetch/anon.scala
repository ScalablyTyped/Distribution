package typings.turistFetch

import org.scalablytyped.runtime.Instantiable0
import typings.node.NodeJS.ErrnoException
import typings.node.anon.Hostname
import typings.node.dnsMod.AnyRecord
import typings.node.dnsMod.CaaRecord
import typings.node.dnsMod.LookupAddress
import typings.node.dnsMod.LookupAllOptions
import typings.node.dnsMod.LookupOneOptions
import typings.node.dnsMod.LookupOptions
import typings.node.dnsMod.MxRecord
import typings.node.dnsMod.NaptrRecord
import typings.node.dnsMod.RecordWithTtl
import typings.node.dnsMod.ResolveOptions
import typings.node.dnsMod.ResolveWithTtlOptions
import typings.node.dnsMod.Resolver
import typings.node.dnsMod.SoaRecord
import typings.node.dnsMod.SrvRecord
import typings.turistFetch.turistFetchStrings.A
import typings.turistFetch.turistFetchStrings.AAAA
import typings.turistFetch.turistFetchStrings.ANY
import typings.turistFetch.turistFetchStrings.CAA
import typings.turistFetch.turistFetchStrings.CNAME
import typings.turistFetch.turistFetchStrings.MX
import typings.turistFetch.turistFetchStrings.NAPTR
import typings.turistFetch.turistFetchStrings.NS
import typings.turistFetch.turistFetchStrings.PTR
import typings.turistFetch.turistFetchStrings.SOA
import typings.turistFetch.turistFetchStrings.SRV
import typings.turistFetch.turistFetchStrings.TXT
import typings.turistFetch.turistFetchStrings.ipv4first
import typings.turistFetch.turistFetchStrings.verbatim
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Typeofdns extends StObject {
    
    val ADDRCONFIG: Double
    
    val ADDRGETNETWORKPARAMS: String
    
    val ALL: Double
    
    val BADFAMILY: String
    
    val BADFLAGS: String
    
    val BADHINTS: String
    
    val BADNAME: String
    
    val BADQUERY: String
    
    val BADRESP: String
    
    val BADSTR: String
    
    val CANCELLED: String
    
    val CONNREFUSED: String
    
    val DESTRUCTION: String
    
    val EOF: String
    
    val FILE: String
    
    val FORMERR: String
    
    val LOADIPHLPAPI: String
    
    val NODATA: String
    
    val NOMEM: String
    
    val NONAME: String
    
    val NOTFOUND: String
    
    val NOTIMP: String
    
    val NOTINITIALIZED: String
    
    val REFUSED: String
    
    var Resolver: Instantiable0[typings.node.dnsMod.Resolver]
    
    val SERVFAIL: String
    
    val TIMEOUT: String
    
    val V4MAPPED: Double
    
    def getServers(): js.Array[String]
    
    val lookup: Typeoflookup
    
    val lookupService: TypeoflookupService
    
    val promises: Typeofpromises
    
    val resolve: Typeofresolve
    
    val resolve4: Typeofresolve4
    
    val resolve6: Typeofresolve6
    
    val resolveAny: TypeofresolveAny
    
    val resolveCaa: TypeofresolveCaa
    
    val resolveCname: TypeofresolveCname
    
    val resolveMx: TypeofresolveMx
    
    val resolveNaptr: TypeofresolveNaptr
    
    val resolveNs: TypeofresolveNs
    
    val resolvePtr: TypeofresolvePtr
    
    val resolveSoa: TypeofresolveSoa
    
    val resolveSrv: TypeofresolveSrv
    
    val resolveTxt: TypeofresolveTxt
    
    def reverse(
      ip: String,
      callback: js.Function2[/* err */ ErrnoException | Null, /* hostnames */ js.Array[String], Unit]
    ): Unit
    
    def setDefaultResultOrder(order: ipv4first | verbatim): Unit
    
    def setServers(servers: js.Array[String]): Unit
  }
  object Typeofdns {
    
    inline def apply(
      ADDRCONFIG: Double,
      ADDRGETNETWORKPARAMS: String,
      ALL: Double,
      BADFAMILY: String,
      BADFLAGS: String,
      BADHINTS: String,
      BADNAME: String,
      BADQUERY: String,
      BADRESP: String,
      BADSTR: String,
      CANCELLED: String,
      CONNREFUSED: String,
      DESTRUCTION: String,
      EOF: String,
      FILE: String,
      FORMERR: String,
      LOADIPHLPAPI: String,
      NODATA: String,
      NOMEM: String,
      NONAME: String,
      NOTFOUND: String,
      NOTIMP: String,
      NOTINITIALIZED: String,
      REFUSED: String,
      Resolver: Instantiable0[Resolver],
      SERVFAIL: String,
      TIMEOUT: String,
      V4MAPPED: Double,
      getServers: () => js.Array[String],
      lookup: Typeoflookup,
      lookupService: TypeoflookupService,
      promises: Typeofpromises,
      resolve: Typeofresolve,
      resolve4: Typeofresolve4,
      resolve6: Typeofresolve6,
      resolveAny: TypeofresolveAny,
      resolveCaa: TypeofresolveCaa,
      resolveCname: TypeofresolveCname,
      resolveMx: TypeofresolveMx,
      resolveNaptr: TypeofresolveNaptr,
      resolveNs: TypeofresolveNs,
      resolvePtr: TypeofresolvePtr,
      resolveSoa: TypeofresolveSoa,
      resolveSrv: TypeofresolveSrv,
      resolveTxt: TypeofresolveTxt,
      reverse: (String, js.Function2[/* err */ ErrnoException | Null, /* hostnames */ js.Array[String], Unit]) => Unit,
      setDefaultResultOrder: ipv4first | verbatim => Unit,
      setServers: js.Array[String] => Unit
    ): Typeofdns = {
      val __obj = js.Dynamic.literal(ADDRCONFIG = ADDRCONFIG.asInstanceOf[js.Any], ADDRGETNETWORKPARAMS = ADDRGETNETWORKPARAMS.asInstanceOf[js.Any], ALL = ALL.asInstanceOf[js.Any], BADFAMILY = BADFAMILY.asInstanceOf[js.Any], BADFLAGS = BADFLAGS.asInstanceOf[js.Any], BADHINTS = BADHINTS.asInstanceOf[js.Any], BADNAME = BADNAME.asInstanceOf[js.Any], BADQUERY = BADQUERY.asInstanceOf[js.Any], BADRESP = BADRESP.asInstanceOf[js.Any], BADSTR = BADSTR.asInstanceOf[js.Any], CANCELLED = CANCELLED.asInstanceOf[js.Any], CONNREFUSED = CONNREFUSED.asInstanceOf[js.Any], DESTRUCTION = DESTRUCTION.asInstanceOf[js.Any], EOF = EOF.asInstanceOf[js.Any], FILE = FILE.asInstanceOf[js.Any], FORMERR = FORMERR.asInstanceOf[js.Any], LOADIPHLPAPI = LOADIPHLPAPI.asInstanceOf[js.Any], NODATA = NODATA.asInstanceOf[js.Any], NOMEM = NOMEM.asInstanceOf[js.Any], NONAME = NONAME.asInstanceOf[js.Any], NOTFOUND = NOTFOUND.asInstanceOf[js.Any], NOTIMP = NOTIMP.asInstanceOf[js.Any], NOTINITIALIZED = NOTINITIALIZED.asInstanceOf[js.Any], REFUSED = REFUSED.asInstanceOf[js.Any], Resolver = Resolver.asInstanceOf[js.Any], SERVFAIL = SERVFAIL.asInstanceOf[js.Any], TIMEOUT = TIMEOUT.asInstanceOf[js.Any], V4MAPPED = V4MAPPED.asInstanceOf[js.Any], getServers = js.Any.fromFunction0(getServers), lookup = lookup.asInstanceOf[js.Any], lookupService = lookupService.asInstanceOf[js.Any], promises = promises.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any], resolve4 = resolve4.asInstanceOf[js.Any], resolve6 = resolve6.asInstanceOf[js.Any], resolveAny = resolveAny.asInstanceOf[js.Any], resolveCaa = resolveCaa.asInstanceOf[js.Any], resolveCname = resolveCname.asInstanceOf[js.Any], resolveMx = resolveMx.asInstanceOf[js.Any], resolveNaptr = resolveNaptr.asInstanceOf[js.Any], resolveNs = resolveNs.asInstanceOf[js.Any], resolvePtr = resolvePtr.asInstanceOf[js.Any], resolveSoa = resolveSoa.asInstanceOf[js.Any], resolveSrv = resolveSrv.asInstanceOf[js.Any], resolveTxt = resolveTxt.asInstanceOf[js.Any], reverse = js.Any.fromFunction2(reverse), setDefaultResultOrder = js.Any.fromFunction1(setDefaultResultOrder), setServers = js.Any.fromFunction1(setServers))
      __obj.asInstanceOf[Typeofdns]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Typeofdns] (val x: Self) extends AnyVal {
      
      inline def setADDRCONFIG(value: Double): Self = StObject.set(x, "ADDRCONFIG", value.asInstanceOf[js.Any])
      
      inline def setADDRGETNETWORKPARAMS(value: String): Self = StObject.set(x, "ADDRGETNETWORKPARAMS", value.asInstanceOf[js.Any])
      
      inline def setALL(value: Double): Self = StObject.set(x, "ALL", value.asInstanceOf[js.Any])
      
      inline def setBADFAMILY(value: String): Self = StObject.set(x, "BADFAMILY", value.asInstanceOf[js.Any])
      
      inline def setBADFLAGS(value: String): Self = StObject.set(x, "BADFLAGS", value.asInstanceOf[js.Any])
      
      inline def setBADHINTS(value: String): Self = StObject.set(x, "BADHINTS", value.asInstanceOf[js.Any])
      
      inline def setBADNAME(value: String): Self = StObject.set(x, "BADNAME", value.asInstanceOf[js.Any])
      
      inline def setBADQUERY(value: String): Self = StObject.set(x, "BADQUERY", value.asInstanceOf[js.Any])
      
      inline def setBADRESP(value: String): Self = StObject.set(x, "BADRESP", value.asInstanceOf[js.Any])
      
      inline def setBADSTR(value: String): Self = StObject.set(x, "BADSTR", value.asInstanceOf[js.Any])
      
      inline def setCANCELLED(value: String): Self = StObject.set(x, "CANCELLED", value.asInstanceOf[js.Any])
      
      inline def setCONNREFUSED(value: String): Self = StObject.set(x, "CONNREFUSED", value.asInstanceOf[js.Any])
      
      inline def setDESTRUCTION(value: String): Self = StObject.set(x, "DESTRUCTION", value.asInstanceOf[js.Any])
      
      inline def setEOF(value: String): Self = StObject.set(x, "EOF", value.asInstanceOf[js.Any])
      
      inline def setFILE(value: String): Self = StObject.set(x, "FILE", value.asInstanceOf[js.Any])
      
      inline def setFORMERR(value: String): Self = StObject.set(x, "FORMERR", value.asInstanceOf[js.Any])
      
      inline def setGetServers(value: () => js.Array[String]): Self = StObject.set(x, "getServers", js.Any.fromFunction0(value))
      
      inline def setLOADIPHLPAPI(value: String): Self = StObject.set(x, "LOADIPHLPAPI", value.asInstanceOf[js.Any])
      
      inline def setLookup(value: Typeoflookup): Self = StObject.set(x, "lookup", value.asInstanceOf[js.Any])
      
      inline def setLookupService(value: TypeoflookupService): Self = StObject.set(x, "lookupService", value.asInstanceOf[js.Any])
      
      inline def setNODATA(value: String): Self = StObject.set(x, "NODATA", value.asInstanceOf[js.Any])
      
      inline def setNOMEM(value: String): Self = StObject.set(x, "NOMEM", value.asInstanceOf[js.Any])
      
      inline def setNONAME(value: String): Self = StObject.set(x, "NONAME", value.asInstanceOf[js.Any])
      
      inline def setNOTFOUND(value: String): Self = StObject.set(x, "NOTFOUND", value.asInstanceOf[js.Any])
      
      inline def setNOTIMP(value: String): Self = StObject.set(x, "NOTIMP", value.asInstanceOf[js.Any])
      
      inline def setNOTINITIALIZED(value: String): Self = StObject.set(x, "NOTINITIALIZED", value.asInstanceOf[js.Any])
      
      inline def setPromises(value: Typeofpromises): Self = StObject.set(x, "promises", value.asInstanceOf[js.Any])
      
      inline def setREFUSED(value: String): Self = StObject.set(x, "REFUSED", value.asInstanceOf[js.Any])
      
      inline def setResolve(value: Typeofresolve): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      inline def setResolve4(value: Typeofresolve4): Self = StObject.set(x, "resolve4", value.asInstanceOf[js.Any])
      
      inline def setResolve6(value: Typeofresolve6): Self = StObject.set(x, "resolve6", value.asInstanceOf[js.Any])
      
      inline def setResolveAny(value: TypeofresolveAny): Self = StObject.set(x, "resolveAny", value.asInstanceOf[js.Any])
      
      inline def setResolveCaa(value: TypeofresolveCaa): Self = StObject.set(x, "resolveCaa", value.asInstanceOf[js.Any])
      
      inline def setResolveCname(value: TypeofresolveCname): Self = StObject.set(x, "resolveCname", value.asInstanceOf[js.Any])
      
      inline def setResolveMx(value: TypeofresolveMx): Self = StObject.set(x, "resolveMx", value.asInstanceOf[js.Any])
      
      inline def setResolveNaptr(value: TypeofresolveNaptr): Self = StObject.set(x, "resolveNaptr", value.asInstanceOf[js.Any])
      
      inline def setResolveNs(value: TypeofresolveNs): Self = StObject.set(x, "resolveNs", value.asInstanceOf[js.Any])
      
      inline def setResolvePtr(value: TypeofresolvePtr): Self = StObject.set(x, "resolvePtr", value.asInstanceOf[js.Any])
      
      inline def setResolveSoa(value: TypeofresolveSoa): Self = StObject.set(x, "resolveSoa", value.asInstanceOf[js.Any])
      
      inline def setResolveSrv(value: TypeofresolveSrv): Self = StObject.set(x, "resolveSrv", value.asInstanceOf[js.Any])
      
      inline def setResolveTxt(value: TypeofresolveTxt): Self = StObject.set(x, "resolveTxt", value.asInstanceOf[js.Any])
      
      inline def setResolver(value: Instantiable0[Resolver]): Self = StObject.set(x, "Resolver", value.asInstanceOf[js.Any])
      
      inline def setReverse(
        value: (String, js.Function2[/* err */ ErrnoException | Null, /* hostnames */ js.Array[String], Unit]) => Unit
      ): Self = StObject.set(x, "reverse", js.Any.fromFunction2(value))
      
      inline def setSERVFAIL(value: String): Self = StObject.set(x, "SERVFAIL", value.asInstanceOf[js.Any])
      
      inline def setSetDefaultResultOrder(value: ipv4first | verbatim => Unit): Self = StObject.set(x, "setDefaultResultOrder", js.Any.fromFunction1(value))
      
      inline def setSetServers(value: js.Array[String] => Unit): Self = StObject.set(x, "setServers", js.Any.fromFunction1(value))
      
      inline def setTIMEOUT(value: String): Self = StObject.set(x, "TIMEOUT", value.asInstanceOf[js.Any])
      
      inline def setV4MAPPED(value: Double): Self = StObject.set(x, "V4MAPPED", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Typeoflookup extends StObject {
    
    def apply(
      hostname: String,
      callback: js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      family: Double,
      callback: js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      options: LookupAllOptions,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[LookupAddress], Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      options: LookupOneOptions,
      callback: js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      options: LookupOptions,
      callback: js.Function3[
          /* err */ ErrnoException | Null, 
          /* address */ String | js.Array[LookupAddress], 
          /* family */ Double, 
          Unit
        ]
    ): Unit = js.native
  }
  
  @js.native
  trait TypeoflookupService extends StObject {
    
    def apply(
      address: String,
      port: Double,
      callback: js.Function3[/* err */ ErrnoException | Null, /* hostname */ String, /* service */ String, Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait Typeofpromises extends StObject {
    
    var Resolver: Instantiable0[typings.node.dnsMod.promises.Resolver] = js.native
    
    /**
      * Returns an array of IP address strings, formatted according to [RFC 5952](https://tools.ietf.org/html/rfc5952#section-6),
      * that are currently configured for DNS resolution. A string will include a port
      * section if a custom port is used.
      *
      * ```js
      * [
      *   '4.4.4.4',
      *   '2001:4860:4860::8888',
      *   '4.4.4.4:1053',
      *   '[2001:4860:4860::8888]:1053',
      * ]
      * ```
      * @since v10.6.0
      */
    def getServers(): js.Array[String] = js.native
    
    def lookup(hostname: String): js.Promise[LookupAddress] = js.native
    /**
      * Resolves a host name (e.g. `'nodejs.org'`) into the first found A (IPv4) or
      * AAAA (IPv6) record. All `option` properties are optional. If `options` is an
      * integer, then it must be `4` or `6` – if `options` is not provided, then IPv4
      * and IPv6 addresses are both returned if found.
      *
      * With the `all` option set to `true`, the `Promise` is resolved with `addresses`being an array of objects with the properties `address` and `family`.
      *
      * On error, the `Promise` is rejected with an `Error` object, where `err.code`is the error code.
      * Keep in mind that `err.code` will be set to `'ENOTFOUND'` not only when
      * the host name does not exist but also when the lookup fails in other ways
      * such as no available file descriptors.
      *
      * `dnsPromises.lookup()` does not necessarily have anything to do with the DNS
      * protocol. The implementation uses an operating system facility that can
      * associate names with addresses, and vice versa. This implementation can have
      * subtle but important consequences on the behavior of any Node.js program. Please
      * take some time to consult the `Implementation considerations section` before
      * using `dnsPromises.lookup()`.
      *
      * Example usage:
      *
      * ```js
      * const dns = require('dns');
      * const dnsPromises = dns.promises;
      * const options = {
      *   family: 6,
      *   hints: dns.ADDRCONFIG | dns.V4MAPPED,
      * };
      *
      * dnsPromises.lookup('example.com', options).then((result) => {
      *   console.log('address: %j family: IPv%s', result.address, result.family);
      *   // address: "2606:2800:220:1:248:1893:25c8:1946" family: IPv6
      * });
      *
      * // When options.all is true, the result will be an Array.
      * options.all = true;
      * dnsPromises.lookup('example.com', options).then((result) => {
      *   console.log('addresses: %j', result);
      *   // addresses: [{"address":"2606:2800:220:1:248:1893:25c8:1946","family":6}]
      * });
      * ```
      * @since v10.6.0
      */
    def lookup(hostname: String, family: Double): js.Promise[LookupAddress] = js.native
    def lookup(hostname: String, options: LookupAllOptions): js.Promise[js.Array[LookupAddress]] = js.native
    def lookup(hostname: String, options: LookupOneOptions): js.Promise[LookupAddress] = js.native
    def lookup(hostname: String, options: LookupOptions): js.Promise[LookupAddress | js.Array[LookupAddress]] = js.native
    
    /**
      * Resolves the given `address` and `port` into a host name and service using
      * the operating system's underlying `getnameinfo` implementation.
      *
      * If `address` is not a valid IP address, a `TypeError` will be thrown.
      * The `port` will be coerced to a number. If it is not a legal port, a `TypeError`will be thrown.
      *
      * On error, the `Promise` is rejected with an `Error` object, where `err.code`is the error code.
      *
      * ```js
      * const dnsPromises = require('dns').promises;
      * dnsPromises.lookupService('127.0.0.1', 22).then((result) => {
      *   console.log(result.hostname, result.service);
      *   // Prints: localhost ssh
      * });
      * ```
      * @since v10.6.0
      */
    def lookupService(address: String, port: Double): js.Promise[Hostname] = js.native
    
    /**
      * Uses the DNS protocol to resolve a host name (e.g. `'nodejs.org'`) into an array
      * of the resource records. When successful, the `Promise` is resolved with an
      * array of resource records. The type and structure of individual results vary
      * based on `rrtype`:
      *
      * <omitted>
      *
      * On error, the `Promise` is rejected with an `Error` object, where `err.code`is one of the `DNS error codes`.
      * @since v10.6.0
      * @param hostname Host name to resolve.
      * @param [rrtype='A'] Resource record type.
      */
    def resolve(hostname: String): js.Promise[js.Array[String]] = js.native
    def resolve(hostname: String, rrtype: String): js.Promise[
        (js.Array[AnyRecord | js.Array[String] | MxRecord | NaptrRecord | SrvRecord | String]) | SoaRecord
      ] = js.native
    
    /**
      * Uses the DNS protocol to resolve IPv4 addresses (`A` records) for the`hostname`. On success, the `Promise` is resolved with an array of IPv4
      * addresses (e.g. `['74.125.79.104', '74.125.79.105', '74.125.79.106']`).
      * @since v10.6.0
      * @param hostname Host name to resolve.
      */
    def resolve4(hostname: String): js.Promise[js.Array[String]] = js.native
    def resolve4(hostname: String, options: ResolveOptions): js.Promise[js.Array[RecordWithTtl | String]] = js.native
    def resolve4(hostname: String, options: ResolveWithTtlOptions): js.Promise[js.Array[RecordWithTtl]] = js.native
    
    /**
      * Uses the DNS protocol to resolve IPv6 addresses (`AAAA` records) for the`hostname`. On success, the `Promise` is resolved with an array of IPv6
      * addresses.
      * @since v10.6.0
      * @param hostname Host name to resolve.
      */
    def resolve6(hostname: String): js.Promise[js.Array[String]] = js.native
    def resolve6(hostname: String, options: ResolveOptions): js.Promise[js.Array[RecordWithTtl | String]] = js.native
    def resolve6(hostname: String, options: ResolveWithTtlOptions): js.Promise[js.Array[RecordWithTtl]] = js.native
    
    /**
      * Uses the DNS protocol to resolve all records (also known as `ANY` or `*` query).
      * On success, the `Promise` is resolved with an array containing various types of
      * records. Each object has a property `type` that indicates the type of the
      * current record. And depending on the `type`, additional properties will be
      * present on the object:
      *
      * <omitted>
      *
      * Here is an example of the result object:
      *
      * ```js
      * [ { type: 'A', address: '127.0.0.1', ttl: 299 },
      *   { type: 'CNAME', value: 'example.com' },
      *   { type: 'MX', exchange: 'alt4.aspmx.l.example.com', priority: 50 },
      *   { type: 'NS', value: 'ns1.example.com' },
      *   { type: 'TXT', entries: [ 'v=spf1 include:_spf.example.com ~all' ] },
      *   { type: 'SOA',
      *     nsname: 'ns1.example.com',
      *     hostmaster: 'admin.example.com',
      *     serial: 156696742,
      *     refresh: 900,
      *     retry: 900,
      *     expire: 1800,
      *     minttl: 60 } ]
      * ```
      * @since v10.6.0
      */
    def resolveAny(hostname: String): js.Promise[js.Array[AnyRecord]] = js.native
    
    /**
      * Uses the DNS protocol to resolve `CAA` records for the `hostname`. On success,
      * the `Promise` is resolved with an array of objects containing available
      * certification authority authorization records available for the `hostname`(e.g. `[{critical: 0, iodef: 'mailto:pki@example.com'},{critical: 128, issue: 'pki.example.com'}]`).
      * @since v15.0.0, v14.17.0
      */
    def resolveCaa(hostname: String): js.Promise[js.Array[CaaRecord]] = js.native
    
    /**
      * Uses the DNS protocol to resolve `CNAME` records for the `hostname`. On success,
      * the `Promise` is resolved with an array of canonical name records available for
      * the `hostname` (e.g. `['bar.example.com']`).
      * @since v10.6.0
      */
    def resolveCname(hostname: String): js.Promise[js.Array[String]] = js.native
    
    /**
      * Uses the DNS protocol to resolve mail exchange records (`MX` records) for the`hostname`. On success, the `Promise` is resolved with an array of objects
      * containing both a `priority` and `exchange` property (e.g.`[{priority: 10, exchange: 'mx.example.com'}, ...]`).
      * @since v10.6.0
      */
    def resolveMx(hostname: String): js.Promise[js.Array[MxRecord]] = js.native
    
    /**
      * Uses the DNS protocol to resolve regular expression based records (`NAPTR`records) for the `hostname`. On success, the `Promise` is resolved with an array
      * of objects with the following properties:
      *
      * * `flags`
      * * `service`
      * * `regexp`
      * * `replacement`
      * * `order`
      * * `preference`
      *
      * ```js
      * {
      *   flags: 's',
      *   service: 'SIP+D2U',
      *   regexp: '',
      *   replacement: '_sip._udp.example.com',
      *   order: 30,
      *   preference: 100
      * }
      * ```
      * @since v10.6.0
      */
    def resolveNaptr(hostname: String): js.Promise[js.Array[NaptrRecord]] = js.native
    
    /**
      * Uses the DNS protocol to resolve name server records (`NS` records) for the`hostname`. On success, the `Promise` is resolved with an array of name server
      * records available for `hostname` (e.g.`['ns1.example.com', 'ns2.example.com']`).
      * @since v10.6.0
      */
    def resolveNs(hostname: String): js.Promise[js.Array[String]] = js.native
    
    /**
      * Uses the DNS protocol to resolve pointer records (`PTR` records) for the`hostname`. On success, the `Promise` is resolved with an array of strings
      * containing the reply records.
      * @since v10.6.0
      */
    def resolvePtr(hostname: String): js.Promise[js.Array[String]] = js.native
    
    /**
      * Uses the DNS protocol to resolve a start of authority record (`SOA` record) for
      * the `hostname`. On success, the `Promise` is resolved with an object with the
      * following properties:
      *
      * * `nsname`
      * * `hostmaster`
      * * `serial`
      * * `refresh`
      * * `retry`
      * * `expire`
      * * `minttl`
      *
      * ```js
      * {
      *   nsname: 'ns.example.com',
      *   hostmaster: 'root.example.com',
      *   serial: 2013101809,
      *   refresh: 10000,
      *   retry: 2400,
      *   expire: 604800,
      *   minttl: 3600
      * }
      * ```
      * @since v10.6.0
      */
    def resolveSoa(hostname: String): js.Promise[SoaRecord] = js.native
    
    /**
      * Uses the DNS protocol to resolve service records (`SRV` records) for the`hostname`. On success, the `Promise` is resolved with an array of objects with
      * the following properties:
      *
      * * `priority`
      * * `weight`
      * * `port`
      * * `name`
      *
      * ```js
      * {
      *   priority: 10,
      *   weight: 5,
      *   port: 21223,
      *   name: 'service.example.com'
      * }
      * ```
      * @since v10.6.0
      */
    def resolveSrv(hostname: String): js.Promise[js.Array[SrvRecord]] = js.native
    
    /**
      * Uses the DNS protocol to resolve text queries (`TXT` records) for the`hostname`. On success, the `Promise` is resolved with a two-dimensional array
      * of the text records available for `hostname` (e.g.`[ ['v=spf1 ip4:0.0.0.0 ', '~all' ] ]`). Each sub-array contains TXT chunks of
      * one record. Depending on the use case, these could be either joined together or
      * treated separately.
      * @since v10.6.0
      */
    def resolveTxt(hostname: String): js.Promise[js.Array[js.Array[String]]] = js.native
    
    @JSName("resolve")
    def resolve_A(hostname: String, rrtype: A): js.Promise[js.Array[String]] = js.native
    @JSName("resolve")
    def resolve_AAAA(hostname: String, rrtype: AAAA): js.Promise[js.Array[String]] = js.native
    @JSName("resolve")
    def resolve_ANY(hostname: String, rrtype: ANY): js.Promise[js.Array[AnyRecord]] = js.native
    @JSName("resolve")
    def resolve_CAA(hostname: String, rrtype: CAA): js.Promise[js.Array[CaaRecord]] = js.native
    @JSName("resolve")
    def resolve_CNAME(hostname: String, rrtype: CNAME): js.Promise[js.Array[String]] = js.native
    @JSName("resolve")
    def resolve_MX(hostname: String, rrtype: MX): js.Promise[js.Array[MxRecord]] = js.native
    @JSName("resolve")
    def resolve_NAPTR(hostname: String, rrtype: NAPTR): js.Promise[js.Array[NaptrRecord]] = js.native
    @JSName("resolve")
    def resolve_NS(hostname: String, rrtype: NS): js.Promise[js.Array[String]] = js.native
    @JSName("resolve")
    def resolve_PTR(hostname: String, rrtype: PTR): js.Promise[js.Array[String]] = js.native
    @JSName("resolve")
    def resolve_SOA(hostname: String, rrtype: SOA): js.Promise[SoaRecord] = js.native
    @JSName("resolve")
    def resolve_SRV(hostname: String, rrtype: SRV): js.Promise[js.Array[SrvRecord]] = js.native
    @JSName("resolve")
    def resolve_TXT(hostname: String, rrtype: TXT): js.Promise[js.Array[js.Array[String]]] = js.native
    
    /**
      * Performs a reverse DNS query that resolves an IPv4 or IPv6 address to an
      * array of host names.
      *
      * On error, the `Promise` is rejected with an `Error` object, where `err.code`is one of the `DNS error codes`.
      * @since v10.6.0
      */
    def reverse(ip: String): js.Promise[js.Array[String]] = js.native
    
    /**
      * Set the default value of `verbatim` in `dns.lookup()` and `dnsPromises.lookup()`. The value could be:
      *
      * * `ipv4first`: sets default `verbatim` `false`.
      * * `verbatim`: sets default `verbatim` `true`.
      *
      * The default is `ipv4first` and `dnsPromises.setDefaultResultOrder()` have
      * higher priority than `--dns-result-order`. When using `worker threads`,`dnsPromises.setDefaultResultOrder()` from the main thread won't affect the
      * default dns orders in workers.
      * @since v16.4.0, v14.18.0
      * @param order must be `'ipv4first'` or `'verbatim'`.
      */
    def setDefaultResultOrder(order: ipv4first | verbatim): Unit = js.native
    
    /**
      * Sets the IP address and port of servers to be used when performing DNS
      * resolution. The `servers` argument is an array of [RFC 5952](https://tools.ietf.org/html/rfc5952#section-6) formatted
      * addresses. If the port is the IANA default DNS port (53) it can be omitted.
      *
      * ```js
      * dnsPromises.setServers([
      *   '4.4.4.4',
      *   '[2001:4860:4860::8888]',
      *   '4.4.4.4:1053',
      *   '[2001:4860:4860::8888]:1053',
      * ]);
      * ```
      *
      * An error will be thrown if an invalid address is provided.
      *
      * The `dnsPromises.setServers()` method must not be called while a DNS query is in
      * progress.
      *
      * This method works much like [resolve.conf](https://man7.org/linux/man-pages/man5/resolv.conf.5.html).
      * That is, if attempting to resolve with the first server provided results in a`NOTFOUND` error, the `resolve()` method will _not_ attempt to resolve with
      * subsequent servers provided. Fallback DNS servers will only be used if the
      * earlier ones time out or result in some other error.
      * @since v10.6.0
      * @param servers array of `RFC 5952` formatted addresses
      */
    def setServers(servers: js.Array[String]): Unit = js.native
  }
  
  @js.native
  trait Typeofresolve extends StObject {
    
    def apply(
      hostname: String,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      rrtype: String,
      callback: js.Function2[
          /* err */ ErrnoException | Null, 
          /* addresses */ (js.Array[AnyRecord | js.Array[String] | MxRecord | NaptrRecord | SrvRecord | String]) | SoaRecord, 
          Unit
        ]
    ): Unit = js.native
    def apply(
      hostname: String,
      rrtype: AAAA,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      rrtype: ANY,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[AnyRecord], Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      rrtype: A,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      rrtype: CNAME,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      rrtype: MX,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[MxRecord], Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      rrtype: NAPTR,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[NaptrRecord], Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      rrtype: NS,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      rrtype: PTR,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      rrtype: SOA,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ SoaRecord, Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      rrtype: SRV,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[SrvRecord], Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      rrtype: TXT,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[js.Array[String]], Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait Typeofresolve4 extends StObject {
    
    def apply(
      hostname: String,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      options: ResolveOptions,
      callback: js.Function2[
          /* err */ ErrnoException | Null, 
          /* addresses */ js.Array[RecordWithTtl | String], 
          Unit
        ]
    ): Unit = js.native
    def apply(
      hostname: String,
      options: ResolveWithTtlOptions,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[RecordWithTtl], Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait Typeofresolve6 extends StObject {
    
    def apply(
      hostname: String,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
    ): Unit = js.native
    def apply(
      hostname: String,
      options: ResolveOptions,
      callback: js.Function2[
          /* err */ ErrnoException | Null, 
          /* addresses */ js.Array[RecordWithTtl | String], 
          Unit
        ]
    ): Unit = js.native
    def apply(
      hostname: String,
      options: ResolveWithTtlOptions,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[RecordWithTtl], Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait TypeofresolveAny extends StObject {
    
    def apply(
      hostname: String,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[AnyRecord], Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait TypeofresolveCaa extends StObject {
    
    def apply(
      hostname: String,
      callback: js.Function2[/* err */ ErrnoException | Null, /* records */ js.Array[CaaRecord], Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait TypeofresolveCname extends StObject {
    
    def apply(
      hostname: String,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait TypeofresolveMx extends StObject {
    
    def apply(
      hostname: String,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[MxRecord], Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait TypeofresolveNaptr extends StObject {
    
    def apply(
      hostname: String,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[NaptrRecord], Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait TypeofresolveNs extends StObject {
    
    def apply(
      hostname: String,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait TypeofresolvePtr extends StObject {
    
    def apply(
      hostname: String,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[String], Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait TypeofresolveSoa extends StObject {
    
    def apply(
      hostname: String,
      callback: js.Function2[/* err */ ErrnoException | Null, /* address */ SoaRecord, Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait TypeofresolveSrv extends StObject {
    
    def apply(
      hostname: String,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[SrvRecord], Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait TypeofresolveTxt extends StObject {
    
    def apply(
      hostname: String,
      callback: js.Function2[/* err */ ErrnoException | Null, /* addresses */ js.Array[js.Array[String]], Unit]
    ): Unit = js.native
  }
}
