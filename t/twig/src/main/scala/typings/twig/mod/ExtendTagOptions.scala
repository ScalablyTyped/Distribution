package typings.twig.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtendTagOptions extends StObject {
  
  /** Called on matched tokens when the template is loaded, once per template */
  var compile: js.UndefOr[js.Function1[/* token */ TagToken, TagToken]] = js.undefined
  
  /** Represents any expected following tags (e.g. "endtag") */
  var next: js.Array[String]
  
  var open: Boolean
  
  /** Runs when the template is rendered */
  var parse: js.UndefOr[
    js.Function3[/* token */ TagToken, /* context */ ParseContext, /* chain */ Boolean, TagParseOutput]
  ] = js.undefined
  
  /** Expression used to match the tag */
  var regex: js.RegExp
  
  /** A unique name for the tag (e.g. "tag") */
  var `type`: String
}
object ExtendTagOptions {
  
  inline def apply(next: js.Array[String], open: Boolean, regex: js.RegExp, `type`: String): ExtendTagOptions = {
    val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendTagOptions]
  }
  
  extension [Self <: ExtendTagOptions](x: Self) {
    
    inline def setCompile(value: /* token */ TagToken => TagToken): Self = StObject.set(x, "compile", js.Any.fromFunction1(value))
    
    inline def setCompileUndefined: Self = StObject.set(x, "compile", js.undefined)
    
    inline def setNext(value: js.Array[String]): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextVarargs(value: String*): Self = StObject.set(x, "next", js.Array(value*))
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setParse(value: (/* token */ TagToken, /* context */ ParseContext, /* chain */ Boolean) => TagParseOutput): Self = StObject.set(x, "parse", js.Any.fromFunction3(value))
    
    inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
    
    inline def setRegex(value: js.RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
