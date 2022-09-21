package typings.whatwgMimetype

import typings.std.IterableIterator
import typings.std.Map
import typings.whatwgMimetype.anon.ProhibitParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * This class will parse [MIME types](https://mimesniff.spec.whatwg.org/#understanding-mime-types) into a
    * structured format, which can then be manipulated and serialized.
    *
    * @example
    * import MIMEType = require("whatwg-mimetype");
    *
    * const mimeType = new MIMEType(`Text/HTML;Charset="utf-8"`);
    *
    * console.assert(mimeType.toString() === "text/html;charset=utf-8");
    *
    * console.assert(mimeType.type === "text");
    * console.assert(mimeType.subtype === "html");
    * console.assert(mimeType.essence === "text/html");
    * console.assert(mimeType.parameters.get("charset") === "utf-8");
    *
    * mimeType.parameters.set("charset", "windows-1252");
    * console.assert(mimeType.parameters.get("charset") === "windows-1252");
    * console.assert(mimeType.toString() === "text/html;charset=windows-1252");
    *
    * console.assert(mimeType.isHTML() === true);
    * console.assert(mimeType.isXML() === false);
    */
  @JSImport("whatwg-mimetype", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with MIMEType {
    /**
      * Attempts to parse the input into a MIME type; if parsing fails, an `Error` will be thrown.
      */
    def this(s: String) = this()
  }
  @JSImport("whatwg-mimetype", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * As an alternative to the constructor, you can use `MIMEType.parse(string)`. The only difference
    * is that `parse()` will return `null` on failed parsing, whereas the constructor will throw.
    * It thus makes the most sense to use the constructor in cases where unparseable MIME types would
    * be exceptional, and use `parse()` when dealing with input from some unconstrained source.
    */
  /* static member */
  inline def parse(s: String): MIMEType | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(s.asInstanceOf[js.Any]).asInstanceOf[MIMEType | Null]
  
  /**
    * This class will parse [MIME types](https://mimesniff.spec.whatwg.org/#understanding-mime-types) into a
    * structured format, which can then be manipulated and serialized.
    *
    * @example
    * import MIMEType = require("whatwg-mimetype");
    *
    * const mimeType = new MIMEType(`Text/HTML;Charset="utf-8"`);
    *
    * console.assert(mimeType.toString() === "text/html;charset=utf-8");
    *
    * console.assert(mimeType.type === "text");
    * console.assert(mimeType.subtype === "html");
    * console.assert(mimeType.essence === "text/html");
    * console.assert(mimeType.parameters.get("charset") === "utf-8");
    *
    * mimeType.parameters.set("charset", "windows-1252");
    * console.assert(mimeType.parameters.get("charset") === "windows-1252");
    * console.assert(mimeType.toString() === "text/html;charset=windows-1252");
    *
    * console.assert(mimeType.isHTML() === true);
    * console.assert(mimeType.isXML() === false);
    */
  @js.native
  trait MIMEType extends StObject {
    
    /**
      * the MIME type's [essence](https://mimesniff.spec.whatwg.org/#mime-type-essence), e.g. `"text/html"`
      */
    val essence: String = js.native
    
    /**
      * @returns `true` if this instance represents [a HTML MIME type](https://mimesniff.spec.whatwg.org/#html-mime-type)
      */
    def isHTML(): Boolean = js.native
    
    /**
      * @returns `true` if this instance represents
      * [a JavaScript MIME type](https://html.spec.whatwg.org/multipage/scripting.html#javascript-mime-type).
      *
      * @param opts.prohibitParameters can be set to `true` to disallow any parameters, i.e. to test if the
      * MIME type's serialization is a
      * [JavaScript MIME type essence match](https://mimesniff.spec.whatwg.org/#javascript-mime-type-essence-match).
      */
    def isJavaScript(): Boolean = js.native
    def isJavaScript(opts: ProhibitParameters): Boolean = js.native
    
    /**
      * @returns `true` if this instance represents [an XML MIME type](https://mimesniff.spec.whatwg.org/#xml-mime-type)
      */
    def isXML(): Boolean = js.native
    
    /**
      * an instance of `MIMETypeParameters`, containing this MIME type's
      * [parameters](https://mimesniff.spec.whatwg.org/#mime-type-parameters)
      */
    val parameters: MIMETypeParameters = js.native
    
    /**
      * the MIME type's [subtype](https://mimesniff.spec.whatwg.org/#mime-type-subtype), e.g. `"html"`
      */
    var subtype: String = js.native
    
    /**
      * the MIME type's [type](https://mimesniff.spec.whatwg.org/#mime-type-type), e.g. `"text"`
      */
    var `type`: String = js.native
  }
  
  /**
    * The `MIMETypeParameters` class, instances of which are returned by `mimeType.parameters`, has equivalent
    * surface API to a [JavaScript `Map`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Map).
    *
    * However, `MIMETypeParameters` methods will always interpret their arguments as appropriate for MIME types,
    * so e.g. parameter names will be lowercased, and attempting to set invalid characters will throw.
    *
    * @example
    * import MIMEType = require("whatwg-mimetype");
    * const mimeType = new MIMEType(`x/x;a=b;c=D;E="F"`);
    *
    * // Logs:
    * // a b
    * // c D
    * // e F
    * for (const [name, value] of mimeType.parameters) {
    *   console.log(name, value);
    * }
    *
    * console.assert(mimeType.parameters.has("a"));
    * console.assert(mimeType.parameters.has("A"));
    * console.assert(mimeType.parameters.get("A") === "b");
    *
    * mimeType.parameters.set("Q", "X");
    * console.assert(mimeType.parameters.get("q") === "X");
    * console.assert(mimeType.toString() === "x/x;a=b;c=d;e=F;q=X");
    *
    * // Throws:
    * mimeType.parameters.set("@", "x");
    */
  @js.native
  trait MIMETypeParameters extends StObject {
    
    def clear(): Unit = js.native
    
    def delete(key: String): Boolean = js.native
    
    def entries(): IterableIterator[js.Tuple2[String, String]] = js.native
    
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* key */ String, /* map */ Map[String, String], Unit]
    ): Unit = js.native
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* key */ String, /* map */ Map[String, String], Unit],
      thisArg: Any
    ): Unit = js.native
    
    def get(key: String): js.UndefOr[String] = js.native
    
    def has(key: String): Boolean = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[js.Tuple2[String, String]]] = js.native
    
    def keys(): IterableIterator[String] = js.native
    
    def set(key: String, value: String): this.type = js.native
    
    val size: Double = js.native
    
    def values(): IterableIterator[String] = js.native
  }
}
