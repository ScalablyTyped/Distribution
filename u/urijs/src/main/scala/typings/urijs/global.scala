package typings.urijs

import typings.urijs.anon.Hostname
import typings.urijs.anon.Password
import typings.urijs.anon.Port
import typings.urijs.mod.Parts
import typings.urijs.mod.QueryDataMap
import typings.urijs.mod.URIOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object URI {
    
    inline def apply(): typings.urijs.mod.URI = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.urijs.mod.URI]
    inline def apply(value: String): typings.urijs.mod.URI = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[typings.urijs.mod.URI]
    inline def apply(value: typings.urijs.mod.HTMLElement): typings.urijs.mod.URI = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[typings.urijs.mod.URI]
    inline def apply(value: URIOptions): typings.urijs.mod.URI = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[typings.urijs.mod.URI]
    
    @JSGlobal("URI")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("URI")
    @js.native
    class Class ()
      extends StObject
         with typings.urijs.mod.URI {
      def this(value: String) = this()
      def this(value: typings.urijs.mod.HTMLElement) = this()
      def this(value: URIOptions) = this()
    }
    
    inline def addQuery(data: js.Object, prop: String, value: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("addQuery")(data.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def addQuery(data: js.Object, qryObj: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("addQuery")(data.asInstanceOf[js.Any], qryObj.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    
    inline def build(parts: URIOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("build")(parts.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def buildAuthority(parts: Hostname): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildAuthority")(parts.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def buildHost(parts: Port): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildHost")(parts.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def buildQuery(qry: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildQuery")(qry.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def buildQuery(qry: js.Object, duplicates: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildQuery")(qry.asInstanceOf[js.Any], duplicates.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def buildUserinfo(parts: Password): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildUserinfo")(parts.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def commonPath(path1: String, path2: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("commonPath")(path1.asInstanceOf[js.Any], path2.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def decode(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def decodeQuery(qry: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeQuery")(qry.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSGlobal("URI.duplicateQueryParameters")
    @js.native
    def duplicateQueryParameters: Boolean = js.native
    inline def duplicateQueryParameters_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("duplicateQueryParameters")(x.asInstanceOf[js.Any])
    
    inline def encode(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def encodeQuery(qry: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeQuery")(qry.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def encodeReserved(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeReserved")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSGlobal("URI.escapeQuerySpace")
    @js.native
    def escapeQuerySpace: Boolean = js.native
    inline def escapeQuerySpace_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("escapeQuerySpace")(x.asInstanceOf[js.Any])
    
    /**
      * @description Wrapper for `URITemplate#expand`. Only present after
      *              importing `urijs/src/URITemplate` explicitly.
      */
    @JSGlobal("URI.expand")
    @js.native
    def expand: js.UndefOr[js.Function2[/* template */ String, /* vals */ js.Object, String]] = js.native
    inline def expand_=(x: js.UndefOr[js.Function2[/* template */ String, /* vals */ js.Object, String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expand")(x.asInstanceOf[js.Any])
    
    inline def iso8859(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("iso8859")().asInstanceOf[Unit]
    
    inline def joinPaths(paths: (String | typings.urijs.mod.URI)*): typings.urijs.mod.URI = ^.asInstanceOf[js.Dynamic].applyDynamic("joinPaths")(paths.asInstanceOf[js.Any]).asInstanceOf[typings.urijs.mod.URI]
    
    inline def parse(url: String): Parts = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(url.asInstanceOf[js.Any]).asInstanceOf[Parts]
    
    inline def parseAuthority(url: String, parts: Hostname): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAuthority")(url.asInstanceOf[js.Any], parts.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def parseHost(url: String, parts: Port): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHost")(url.asInstanceOf[js.Any], parts.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def parseQuery(url: String): QueryDataMap = ^.asInstanceOf[js.Dynamic].applyDynamic("parseQuery")(url.asInstanceOf[js.Any]).asInstanceOf[QueryDataMap]
    
    inline def parseUserinfo(url: String, parts: Password): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parseUserinfo")(url.asInstanceOf[js.Any], parts.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSGlobal("URI.preventInvalidHostname")
    @js.native
    def preventInvalidHostname: Boolean = js.native
    inline def preventInvalidHostname_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preventInvalidHostname")(x.asInstanceOf[js.Any])
    
    inline def removeQuery(data: js.Object, prop: String, value: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("removeQuery")(data.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def removeQuery(data: js.Object, props: js.Array[String]): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("removeQuery")(data.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def removeQuery(data: js.Object, props: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("removeQuery")(data.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    
    inline def unicode(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unicode")().asInstanceOf[Unit]
    
    inline def withinString(source: String, func: js.Function1[/* url */ String, String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("withinString")(source.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
