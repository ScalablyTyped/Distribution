package typings.uriJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs5UriDotallDotminMod {
  
  @JSImport("uri-js/dist/es5/uri.all.min", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def equal(uriA: String, uriB: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(uriA.asInstanceOf[js.Any], uriB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equal(uriA: String, uriB: String, options: URIOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(uriA.asInstanceOf[js.Any], uriB.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equal(uriA: URIComponents, uriB: URIComponents): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(uriA.asInstanceOf[js.Any], uriB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equal(uriA: URIComponents, uriB: URIComponents, options: URIOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(uriA.asInstanceOf[js.Any], uriB.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def escapeComponent(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeComponent")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def escapeComponent(str: String, options: URIOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("escapeComponent")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def normalize(uri: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(uri.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def normalize(uri: String, options: URIOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def normalize(uri: URIComponents): URIComponents = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(uri.asInstanceOf[js.Any]).asInstanceOf[URIComponents]
  inline def normalize(uri: URIComponents, options: URIOptions): URIComponents = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[URIComponents]
  
  inline def parse(uriString: String): URIComponents = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(uriString.asInstanceOf[js.Any]).asInstanceOf[URIComponents]
  inline def parse(uriString: String, options: URIOptions): URIComponents = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(uriString.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[URIComponents]
  
  inline def pctDecChars(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pctDecChars")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def pctEncChar(chr: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pctEncChar")(chr.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def removeDotSegments(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeDotSegments")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def resolve(baseURI: String, relativeURI: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(baseURI.asInstanceOf[js.Any], relativeURI.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def resolve(baseURI: String, relativeURI: String, options: URIOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(baseURI.asInstanceOf[js.Any], relativeURI.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def resolveComponents(base: URIComponents, relative: URIComponents): URIComponents = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveComponents")(base.asInstanceOf[js.Any], relative.asInstanceOf[js.Any])).asInstanceOf[URIComponents]
  inline def resolveComponents(base: URIComponents, relative: URIComponents, options: Unit, skipNormalization: Boolean): URIComponents = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveComponents")(base.asInstanceOf[js.Any], relative.asInstanceOf[js.Any], options.asInstanceOf[js.Any], skipNormalization.asInstanceOf[js.Any])).asInstanceOf[URIComponents]
  inline def resolveComponents(base: URIComponents, relative: URIComponents, options: URIOptions): URIComponents = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveComponents")(base.asInstanceOf[js.Any], relative.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[URIComponents]
  inline def resolveComponents(base: URIComponents, relative: URIComponents, options: URIOptions, skipNormalization: Boolean): URIComponents = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveComponents")(base.asInstanceOf[js.Any], relative.asInstanceOf[js.Any], options.asInstanceOf[js.Any], skipNormalization.asInstanceOf[js.Any])).asInstanceOf[URIComponents]
  
  inline def serialize(components: URIComponents): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(components.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def serialize(components: URIComponents, options: URIOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(components.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def unescapeComponent(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescapeComponent")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def unescapeComponent(str: String, options: URIOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("unescapeComponent")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait URIComponents extends StObject {
    
    var error: js.UndefOr[String] = js.undefined
    
    var fragment: js.UndefOr[String] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double | String] = js.undefined
    
    var query: js.UndefOr[String] = js.undefined
    
    var reference: js.UndefOr[String] = js.undefined
    
    var scheme: js.UndefOr[String] = js.undefined
    
    var userinfo: js.UndefOr[String] = js.undefined
  }
  object URIComponents {
    
    inline def apply(): URIComponents = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[URIComponents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: URIComponents] (val x: Self) extends AnyVal {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      inline def setFragmentUndefined: Self = StObject.set(x, "fragment", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPort(value: Double | String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setReference(value: String): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
      
      inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
      
      inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
      
      inline def setUserinfo(value: String): Self = StObject.set(x, "userinfo", value.asInstanceOf[js.Any])
      
      inline def setUserinfoUndefined: Self = StObject.set(x, "userinfo", js.undefined)
    }
  }
  
  trait URIOptions extends StObject {
    
    var absolutePath: js.UndefOr[Boolean] = js.undefined
    
    var domainHost: js.UndefOr[Boolean] = js.undefined
    
    var iri: js.UndefOr[Boolean] = js.undefined
    
    var reference: js.UndefOr[String] = js.undefined
    
    var scheme: js.UndefOr[String] = js.undefined
    
    var tolerant: js.UndefOr[Boolean] = js.undefined
    
    var unicodeSupport: js.UndefOr[Boolean] = js.undefined
  }
  object URIOptions {
    
    inline def apply(): URIOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[URIOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: URIOptions] (val x: Self) extends AnyVal {
      
      inline def setAbsolutePath(value: Boolean): Self = StObject.set(x, "absolutePath", value.asInstanceOf[js.Any])
      
      inline def setAbsolutePathUndefined: Self = StObject.set(x, "absolutePath", js.undefined)
      
      inline def setDomainHost(value: Boolean): Self = StObject.set(x, "domainHost", value.asInstanceOf[js.Any])
      
      inline def setDomainHostUndefined: Self = StObject.set(x, "domainHost", js.undefined)
      
      inline def setIri(value: Boolean): Self = StObject.set(x, "iri", value.asInstanceOf[js.Any])
      
      inline def setIriUndefined: Self = StObject.set(x, "iri", js.undefined)
      
      inline def setReference(value: String): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
      
      inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
      
      inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
      
      inline def setTolerant(value: Boolean): Self = StObject.set(x, "tolerant", value.asInstanceOf[js.Any])
      
      inline def setTolerantUndefined: Self = StObject.set(x, "tolerant", js.undefined)
      
      inline def setUnicodeSupport(value: Boolean): Self = StObject.set(x, "unicodeSupport", value.asInstanceOf[js.Any])
      
      inline def setUnicodeSupportUndefined: Self = StObject.set(x, "unicodeSupport", js.undefined)
    }
  }
  
  trait URIRegExps extends StObject {
    
    var ESCAPE: js.RegExp
    
    var IPV4ADDRESS: js.RegExp
    
    var IPV6ADDRESS: js.RegExp
    
    var NOT_FRAGMENT: js.RegExp
    
    var NOT_HOST: js.RegExp
    
    var NOT_PATH: js.RegExp
    
    var NOT_PATH_NOSCHEME: js.RegExp
    
    var NOT_QUERY: js.RegExp
    
    var NOT_SCHEME: js.RegExp
    
    var NOT_USERINFO: js.RegExp
    
    var OTHER_CHARS: js.RegExp
    
    var PCT_ENCODED: js.RegExp
    
    var UNRESERVED: js.RegExp
  }
  object URIRegExps {
    
    inline def apply(
      ESCAPE: js.RegExp,
      IPV4ADDRESS: js.RegExp,
      IPV6ADDRESS: js.RegExp,
      NOT_FRAGMENT: js.RegExp,
      NOT_HOST: js.RegExp,
      NOT_PATH: js.RegExp,
      NOT_PATH_NOSCHEME: js.RegExp,
      NOT_QUERY: js.RegExp,
      NOT_SCHEME: js.RegExp,
      NOT_USERINFO: js.RegExp,
      OTHER_CHARS: js.RegExp,
      PCT_ENCODED: js.RegExp,
      UNRESERVED: js.RegExp
    ): URIRegExps = {
      val __obj = js.Dynamic.literal(ESCAPE = ESCAPE.asInstanceOf[js.Any], IPV4ADDRESS = IPV4ADDRESS.asInstanceOf[js.Any], IPV6ADDRESS = IPV6ADDRESS.asInstanceOf[js.Any], NOT_FRAGMENT = NOT_FRAGMENT.asInstanceOf[js.Any], NOT_HOST = NOT_HOST.asInstanceOf[js.Any], NOT_PATH = NOT_PATH.asInstanceOf[js.Any], NOT_PATH_NOSCHEME = NOT_PATH_NOSCHEME.asInstanceOf[js.Any], NOT_QUERY = NOT_QUERY.asInstanceOf[js.Any], NOT_SCHEME = NOT_SCHEME.asInstanceOf[js.Any], NOT_USERINFO = NOT_USERINFO.asInstanceOf[js.Any], OTHER_CHARS = OTHER_CHARS.asInstanceOf[js.Any], PCT_ENCODED = PCT_ENCODED.asInstanceOf[js.Any], UNRESERVED = UNRESERVED.asInstanceOf[js.Any])
      __obj.asInstanceOf[URIRegExps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: URIRegExps] (val x: Self) extends AnyVal {
      
      inline def setESCAPE(value: js.RegExp): Self = StObject.set(x, "ESCAPE", value.asInstanceOf[js.Any])
      
      inline def setIPV4ADDRESS(value: js.RegExp): Self = StObject.set(x, "IPV4ADDRESS", value.asInstanceOf[js.Any])
      
      inline def setIPV6ADDRESS(value: js.RegExp): Self = StObject.set(x, "IPV6ADDRESS", value.asInstanceOf[js.Any])
      
      inline def setNOT_FRAGMENT(value: js.RegExp): Self = StObject.set(x, "NOT_FRAGMENT", value.asInstanceOf[js.Any])
      
      inline def setNOT_HOST(value: js.RegExp): Self = StObject.set(x, "NOT_HOST", value.asInstanceOf[js.Any])
      
      inline def setNOT_PATH(value: js.RegExp): Self = StObject.set(x, "NOT_PATH", value.asInstanceOf[js.Any])
      
      inline def setNOT_PATH_NOSCHEME(value: js.RegExp): Self = StObject.set(x, "NOT_PATH_NOSCHEME", value.asInstanceOf[js.Any])
      
      inline def setNOT_QUERY(value: js.RegExp): Self = StObject.set(x, "NOT_QUERY", value.asInstanceOf[js.Any])
      
      inline def setNOT_SCHEME(value: js.RegExp): Self = StObject.set(x, "NOT_SCHEME", value.asInstanceOf[js.Any])
      
      inline def setNOT_USERINFO(value: js.RegExp): Self = StObject.set(x, "NOT_USERINFO", value.asInstanceOf[js.Any])
      
      inline def setOTHER_CHARS(value: js.RegExp): Self = StObject.set(x, "OTHER_CHARS", value.asInstanceOf[js.Any])
      
      inline def setPCT_ENCODED(value: js.RegExp): Self = StObject.set(x, "PCT_ENCODED", value.asInstanceOf[js.Any])
      
      inline def setUNRESERVED(value: js.RegExp): Self = StObject.set(x, "UNRESERVED", value.asInstanceOf[js.Any])
    }
  }
  
  trait URISchemeHandler[Components /* <: URIComponents */, Options /* <: URIOptions */, ParentComponents /* <: URIComponents */] extends StObject {
    
    var absolutePath: js.UndefOr[Boolean] = js.undefined
    
    var domainHost: js.UndefOr[Boolean] = js.undefined
    
    def parse(components: ParentComponents, options: Options): Components
    
    var scheme: String
    
    def serialize(components: Components, options: Options): ParentComponents
    
    var unicodeSupport: js.UndefOr[Boolean] = js.undefined
  }
  object URISchemeHandler {
    
    inline def apply[Components /* <: URIComponents */, Options /* <: URIOptions */, ParentComponents /* <: URIComponents */](
      parse: (ParentComponents, Options) => Components,
      scheme: String,
      serialize: (Components, Options) => ParentComponents
    ): URISchemeHandler[Components, Options, ParentComponents] = {
      val __obj = js.Dynamic.literal(parse = js.Any.fromFunction2(parse), scheme = scheme.asInstanceOf[js.Any], serialize = js.Any.fromFunction2(serialize))
      __obj.asInstanceOf[URISchemeHandler[Components, Options, ParentComponents]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: URISchemeHandler[?, ?, ?], Components /* <: URIComponents */, Options /* <: URIOptions */, ParentComponents /* <: URIComponents */] (val x: Self & (URISchemeHandler[Components, Options, ParentComponents])) extends AnyVal {
      
      inline def setAbsolutePath(value: Boolean): Self = StObject.set(x, "absolutePath", value.asInstanceOf[js.Any])
      
      inline def setAbsolutePathUndefined: Self = StObject.set(x, "absolutePath", js.undefined)
      
      inline def setDomainHost(value: Boolean): Self = StObject.set(x, "domainHost", value.asInstanceOf[js.Any])
      
      inline def setDomainHostUndefined: Self = StObject.set(x, "domainHost", js.undefined)
      
      inline def setParse(value: (ParentComponents, Options) => Components): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
      
      inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      inline def setSerialize(value: (Components, Options) => ParentComponents): Self = StObject.set(x, "serialize", js.Any.fromFunction2(value))
      
      inline def setUnicodeSupport(value: Boolean): Self = StObject.set(x, "unicodeSupport", value.asInstanceOf[js.Any])
      
      inline def setUnicodeSupportUndefined: Self = StObject.set(x, "unicodeSupport", js.undefined)
    }
  }
}
