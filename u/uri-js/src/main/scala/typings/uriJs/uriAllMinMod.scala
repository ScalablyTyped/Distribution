package typings.uriJs

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uriAllMinMod {
  
  @JSImport("uri-js/dist/es5/uri.all.min", "equal")
  @js.native
  def equal(uriA: String, uriB: String): Boolean = js.native
  @JSImport("uri-js/dist/es5/uri.all.min", "equal")
  @js.native
  def equal(uriA: String, uriB: String, options: URIOptions): Boolean = js.native
  @JSImport("uri-js/dist/es5/uri.all.min", "equal")
  @js.native
  def equal(uriA: URIComponents, uriB: URIComponents): Boolean = js.native
  @JSImport("uri-js/dist/es5/uri.all.min", "equal")
  @js.native
  def equal(uriA: URIComponents, uriB: URIComponents, options: URIOptions): Boolean = js.native
  
  @JSImport("uri-js/dist/es5/uri.all.min", "escapeComponent")
  @js.native
  def escapeComponent(str: String): String = js.native
  @JSImport("uri-js/dist/es5/uri.all.min", "escapeComponent")
  @js.native
  def escapeComponent(str: String, options: URIOptions): String = js.native
  
  @JSImport("uri-js/dist/es5/uri.all.min", "normalize")
  @js.native
  def normalize(uri: String): String = js.native
  @JSImport("uri-js/dist/es5/uri.all.min", "normalize")
  @js.native
  def normalize(uri: String, options: URIOptions): String = js.native
  @JSImport("uri-js/dist/es5/uri.all.min", "normalize")
  @js.native
  def normalize(uri: URIComponents): URIComponents = js.native
  @JSImport("uri-js/dist/es5/uri.all.min", "normalize")
  @js.native
  def normalize(uri: URIComponents, options: URIOptions): URIComponents = js.native
  
  @JSImport("uri-js/dist/es5/uri.all.min", "parse")
  @js.native
  def parse(uriString: String): URIComponents = js.native
  @JSImport("uri-js/dist/es5/uri.all.min", "parse")
  @js.native
  def parse(uriString: String, options: URIOptions): URIComponents = js.native
  
  @JSImport("uri-js/dist/es5/uri.all.min", "pctDecChars")
  @js.native
  def pctDecChars(str: String): String = js.native
  
  @JSImport("uri-js/dist/es5/uri.all.min", "pctEncChar")
  @js.native
  def pctEncChar(chr: String): String = js.native
  
  @JSImport("uri-js/dist/es5/uri.all.min", "removeDotSegments")
  @js.native
  def removeDotSegments(input: String): String = js.native
  
  @JSImport("uri-js/dist/es5/uri.all.min", "resolve")
  @js.native
  def resolve(baseURI: String, relativeURI: String): String = js.native
  @JSImport("uri-js/dist/es5/uri.all.min", "resolve")
  @js.native
  def resolve(baseURI: String, relativeURI: String, options: URIOptions): String = js.native
  
  @JSImport("uri-js/dist/es5/uri.all.min", "resolveComponents")
  @js.native
  def resolveComponents(base: URIComponents, relative: URIComponents): URIComponents = js.native
  @JSImport("uri-js/dist/es5/uri.all.min", "resolveComponents")
  @js.native
  def resolveComponents(
    base: URIComponents,
    relative: URIComponents,
    options: js.UndefOr[scala.Nothing],
    skipNormalization: Boolean
  ): URIComponents = js.native
  @JSImport("uri-js/dist/es5/uri.all.min", "resolveComponents")
  @js.native
  def resolveComponents(base: URIComponents, relative: URIComponents, options: URIOptions): URIComponents = js.native
  @JSImport("uri-js/dist/es5/uri.all.min", "resolveComponents")
  @js.native
  def resolveComponents(base: URIComponents, relative: URIComponents, options: URIOptions, skipNormalization: Boolean): URIComponents = js.native
  
  @JSImport("uri-js/dist/es5/uri.all.min", "serialize")
  @js.native
  def serialize(components: URIComponents): String = js.native
  @JSImport("uri-js/dist/es5/uri.all.min", "serialize")
  @js.native
  def serialize(components: URIComponents, options: URIOptions): String = js.native
  
  @JSImport("uri-js/dist/es5/uri.all.min", "unescapeComponent")
  @js.native
  def unescapeComponent(str: String): String = js.native
  @JSImport("uri-js/dist/es5/uri.all.min", "unescapeComponent")
  @js.native
  def unescapeComponent(str: String, options: URIOptions): String = js.native
  
  @js.native
  trait URIComponents extends StObject {
    
    var error: js.UndefOr[String] = js.native
    
    var fragment: js.UndefOr[String] = js.native
    
    var host: js.UndefOr[String] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var port: js.UndefOr[Double | String] = js.native
    
    var query: js.UndefOr[String] = js.native
    
    var reference: js.UndefOr[String] = js.native
    
    var scheme: js.UndefOr[String] = js.native
    
    var userinfo: js.UndefOr[String] = js.native
  }
  object URIComponents {
    
    @scala.inline
    def apply(): URIComponents = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[URIComponents]
    }
    
    @scala.inline
    implicit class URIComponentsMutableBuilder[Self <: URIComponents] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFragmentUndefined: Self = StObject.set(x, "fragment", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPort(value: Double | String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setReference(value: String): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
      
      @scala.inline
      def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
      
      @scala.inline
      def setUserinfo(value: String): Self = StObject.set(x, "userinfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserinfoUndefined: Self = StObject.set(x, "userinfo", js.undefined)
    }
  }
  
  @js.native
  trait URIOptions extends StObject {
    
    var absolutePath: js.UndefOr[Boolean] = js.native
    
    var domainHost: js.UndefOr[Boolean] = js.native
    
    var iri: js.UndefOr[Boolean] = js.native
    
    var reference: js.UndefOr[String] = js.native
    
    var scheme: js.UndefOr[String] = js.native
    
    var tolerant: js.UndefOr[Boolean] = js.native
    
    var unicodeSupport: js.UndefOr[Boolean] = js.native
  }
  object URIOptions {
    
    @scala.inline
    def apply(): URIOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[URIOptions]
    }
    
    @scala.inline
    implicit class URIOptionsMutableBuilder[Self <: URIOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbsolutePath(value: Boolean): Self = StObject.set(x, "absolutePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbsolutePathUndefined: Self = StObject.set(x, "absolutePath", js.undefined)
      
      @scala.inline
      def setDomainHost(value: Boolean): Self = StObject.set(x, "domainHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainHostUndefined: Self = StObject.set(x, "domainHost", js.undefined)
      
      @scala.inline
      def setIri(value: Boolean): Self = StObject.set(x, "iri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIriUndefined: Self = StObject.set(x, "iri", js.undefined)
      
      @scala.inline
      def setReference(value: String): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
      
      @scala.inline
      def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
      
      @scala.inline
      def setTolerant(value: Boolean): Self = StObject.set(x, "tolerant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTolerantUndefined: Self = StObject.set(x, "tolerant", js.undefined)
      
      @scala.inline
      def setUnicodeSupport(value: Boolean): Self = StObject.set(x, "unicodeSupport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnicodeSupportUndefined: Self = StObject.set(x, "unicodeSupport", js.undefined)
    }
  }
  
  @js.native
  trait URIRegExps extends StObject {
    
    var ESCAPE: RegExp = js.native
    
    var IPV4ADDRESS: RegExp = js.native
    
    var IPV6ADDRESS: RegExp = js.native
    
    var NOT_FRAGMENT: RegExp = js.native
    
    var NOT_HOST: RegExp = js.native
    
    var NOT_PATH: RegExp = js.native
    
    var NOT_PATH_NOSCHEME: RegExp = js.native
    
    var NOT_QUERY: RegExp = js.native
    
    var NOT_SCHEME: RegExp = js.native
    
    var NOT_USERINFO: RegExp = js.native
    
    var OTHER_CHARS: RegExp = js.native
    
    var PCT_ENCODED: RegExp = js.native
    
    var UNRESERVED: RegExp = js.native
  }
  object URIRegExps {
    
    @scala.inline
    def apply(
      ESCAPE: RegExp,
      IPV4ADDRESS: RegExp,
      IPV6ADDRESS: RegExp,
      NOT_FRAGMENT: RegExp,
      NOT_HOST: RegExp,
      NOT_PATH: RegExp,
      NOT_PATH_NOSCHEME: RegExp,
      NOT_QUERY: RegExp,
      NOT_SCHEME: RegExp,
      NOT_USERINFO: RegExp,
      OTHER_CHARS: RegExp,
      PCT_ENCODED: RegExp,
      UNRESERVED: RegExp
    ): URIRegExps = {
      val __obj = js.Dynamic.literal(ESCAPE = ESCAPE.asInstanceOf[js.Any], IPV4ADDRESS = IPV4ADDRESS.asInstanceOf[js.Any], IPV6ADDRESS = IPV6ADDRESS.asInstanceOf[js.Any], NOT_FRAGMENT = NOT_FRAGMENT.asInstanceOf[js.Any], NOT_HOST = NOT_HOST.asInstanceOf[js.Any], NOT_PATH = NOT_PATH.asInstanceOf[js.Any], NOT_PATH_NOSCHEME = NOT_PATH_NOSCHEME.asInstanceOf[js.Any], NOT_QUERY = NOT_QUERY.asInstanceOf[js.Any], NOT_SCHEME = NOT_SCHEME.asInstanceOf[js.Any], NOT_USERINFO = NOT_USERINFO.asInstanceOf[js.Any], OTHER_CHARS = OTHER_CHARS.asInstanceOf[js.Any], PCT_ENCODED = PCT_ENCODED.asInstanceOf[js.Any], UNRESERVED = UNRESERVED.asInstanceOf[js.Any])
      __obj.asInstanceOf[URIRegExps]
    }
    
    @scala.inline
    implicit class URIRegExpsMutableBuilder[Self <: URIRegExps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setESCAPE(value: RegExp): Self = StObject.set(x, "ESCAPE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIPV4ADDRESS(value: RegExp): Self = StObject.set(x, "IPV4ADDRESS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIPV6ADDRESS(value: RegExp): Self = StObject.set(x, "IPV6ADDRESS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNOT_FRAGMENT(value: RegExp): Self = StObject.set(x, "NOT_FRAGMENT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNOT_HOST(value: RegExp): Self = StObject.set(x, "NOT_HOST", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNOT_PATH(value: RegExp): Self = StObject.set(x, "NOT_PATH", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNOT_PATH_NOSCHEME(value: RegExp): Self = StObject.set(x, "NOT_PATH_NOSCHEME", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNOT_QUERY(value: RegExp): Self = StObject.set(x, "NOT_QUERY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNOT_SCHEME(value: RegExp): Self = StObject.set(x, "NOT_SCHEME", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNOT_USERINFO(value: RegExp): Self = StObject.set(x, "NOT_USERINFO", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOTHER_CHARS(value: RegExp): Self = StObject.set(x, "OTHER_CHARS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPCT_ENCODED(value: RegExp): Self = StObject.set(x, "PCT_ENCODED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUNRESERVED(value: RegExp): Self = StObject.set(x, "UNRESERVED", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait URISchemeHandler[Components /* <: URIComponents */, Options /* <: URIOptions */, ParentComponents /* <: URIComponents */] extends StObject {
    
    var absolutePath: js.UndefOr[Boolean] = js.native
    
    var domainHost: js.UndefOr[Boolean] = js.native
    
    def parse(components: ParentComponents, options: Options): Components = js.native
    
    var scheme: String = js.native
    
    def serialize(components: Components, options: Options): ParentComponents = js.native
    
    var unicodeSupport: js.UndefOr[Boolean] = js.native
  }
  object URISchemeHandler {
    
    @scala.inline
    def apply[Components /* <: URIComponents */, Options /* <: URIOptions */, ParentComponents /* <: URIComponents */](
      parse: (ParentComponents, Options) => Components,
      scheme: String,
      serialize: (Components, Options) => ParentComponents
    ): URISchemeHandler[Components, Options, ParentComponents] = {
      val __obj = js.Dynamic.literal(parse = js.Any.fromFunction2(parse), scheme = scheme.asInstanceOf[js.Any], serialize = js.Any.fromFunction2(serialize))
      __obj.asInstanceOf[URISchemeHandler[Components, Options, ParentComponents]]
    }
    
    @scala.inline
    implicit class URISchemeHandlerMutableBuilder[Self <: URISchemeHandler[_, _, _], Components /* <: URIComponents */, Options /* <: URIOptions */, ParentComponents /* <: URIComponents */] (val x: Self with (URISchemeHandler[Components, Options, ParentComponents])) extends AnyVal {
      
      @scala.inline
      def setAbsolutePath(value: Boolean): Self = StObject.set(x, "absolutePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbsolutePathUndefined: Self = StObject.set(x, "absolutePath", js.undefined)
      
      @scala.inline
      def setDomainHost(value: Boolean): Self = StObject.set(x, "domainHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainHostUndefined: Self = StObject.set(x, "domainHost", js.undefined)
      
      @scala.inline
      def setParse(value: (ParentComponents, Options) => Components): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
      
      @scala.inline
      def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerialize(value: (Components, Options) => ParentComponents): Self = StObject.set(x, "serialize", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUnicodeSupport(value: Boolean): Self = StObject.set(x, "unicodeSupport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnicodeSupportUndefined: Self = StObject.set(x, "unicodeSupport", js.undefined)
    }
  }
}
