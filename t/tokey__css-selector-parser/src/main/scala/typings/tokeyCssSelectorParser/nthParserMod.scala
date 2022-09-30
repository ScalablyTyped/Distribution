package typings.tokeyCssSelectorParser

import typings.tokeyCore.mod.Seeker
import typings.tokeyCssSelectorParser.astTypesMod.Nth
import typings.tokeyCssSelectorParser.tokenizerMod.CSSSelectorToken
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nthParserMod {
  
  @JSImport("@tokey/css-selector-parser/dist/nth-parser", "NthParser")
  @js.native
  open class NthParser protected () extends StObject {
    def this(selectorNode: Nth, s: Seeker[CSSSelectorToken]) = this()
    
    /* private */ var ast: Any = js.native
    
    /**
      * first token can only be (minus contained in text):
      * step: `5n`/`+5n`/`-5n`
      * step & offset: `5n`/`5n-5
      */
    /* private */ var breakFirstChunk: Any = js.native
    
    def handleToken(token: CSSSelectorToken): Boolean = js.native
    
    /* private */ var pushDash: Any = js.native
    
    /* private */ var pushOf: Any = js.native
    
    /* private */ var pushOffset: Any = js.native
    
    /* private */ var pushStep: Any = js.native
    
    /* private */ var s: Any = js.native
    
    /* private */ var selectorNode: Any = js.native
    
    /* private */ var standaloneDash: Any = js.native
    
    var state: step | (/* template literal string: dash */ String) = js.native
  }
  /* static members */
  object NthParser {
    
    @JSImport("@tokey/css-selector-parser/dist/nth-parser", "NthParser")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isNthPseudoClass(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNthPseudoClass")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * check for valid start of nth expression
      * and returns 2 groups:
      * 1. An: optional minus or plus, 0 or more digits, `n`/`N` character
      * 2. anything after that
      */
    @JSImport("@tokey/css-selector-parser/dist/nth-parser", "NthParser.nthStartExp")
    @js.native
    def nthStartExp: js.RegExp = js.native
    inline def nthStartExp_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nthStartExp")(x.asInstanceOf[js.Any])
    
    /**
      * check (case insensitive) and returns 2 groups:
      * 1. plus/minus sign (invalid step value)
      * 2. odd/even string
      * [
      *  `+`|`-`|undefined,
      *  `odd`|`even`
      * ]
      */
    @JSImport("@tokey/css-selector-parser/dist/nth-parser", "NthParser.oddEvenStep")
    @js.native
    def oddEvenStep: js.RegExp = js.native
    inline def oddEvenStep_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("oddEvenStep")(x.asInstanceOf[js.Any])
    
    /**
      * check for valid offset
      * starts with optional minus or plus,
      * ends with 1 or more digits
      */
    @JSImport("@tokey/css-selector-parser/dist/nth-parser", "NthParser.validOffset")
    @js.native
    def validOffset: js.RegExp = js.native
    inline def validOffset_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validOffset")(x.asInstanceOf[js.Any])
    
    /**
      * check for valid step
      * starts with optional minus or plus,
      * ends with 0 or more digits following a `n`/`N` character
      */
    @JSImport("@tokey/css-selector-parser/dist/nth-parser", "NthParser.validStep")
    @js.native
    def validStep: js.RegExp = js.native
    inline def validStep_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validStep")(x.asInstanceOf[js.Any])
  }
}
