package typings.uiBox

import typings.std.CSSRule
import typings.std.CSSStyleSheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleSheetMod {
  
  @JSImport("ui-box/dist/src/utils/style-sheet", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with CustomStyleSheet {
    def this(options: Options) = this()
    
    /* CompleteClass */
    override def _insert(sheet: CSSStyleSheet, rule: String): Unit = js.native
    
    /* private */ /* CompleteClass */
    var ctr: js.Any = js.native
    
    /* CompleteClass */
    override def flush(): Unit = js.native
    
    /* CompleteClass */
    override def getSheet(): js.UndefOr[CSSStyleSheet] = js.native
    
    /* CompleteClass */
    override def inject(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var injected: js.Any = js.native
    
    /* CompleteClass */
    override def insert(rule: String): Double = js.native
    
    /* private */ /* CompleteClass */
    var isSpeedy: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var maxLength: js.Any = js.native
    
    /* CompleteClass */
    override def rules(): js.Array[CSSRule] = js.native
    
    /* private */ /* CompleteClass */
    var sheet: js.Any = js.native
    
    /* CompleteClass */
    override def speedy(bool: Boolean): Unit = js.native
    
    /* private */ /* CompleteClass */
    var tags: js.Any = js.native
  }
  
  trait CustomStyleSheet extends StObject {
    
    def _insert(sheet: CSSStyleSheet, rule: String): Unit
    
    /* private */ var ctr: js.Any
    
    def flush(): Unit
    
    def getSheet(): js.UndefOr[CSSStyleSheet]
    
    def inject(): Unit
    
    /* private */ var injected: js.Any
    
    def insert(rule: String): Double
    
    /* private */ var isSpeedy: js.Any
    
    /* private */ var maxLength: js.Any
    
    def rules(): js.Array[CSSRule]
    
    /* private */ var sheet: js.Any
    
    def speedy(bool: Boolean): Unit
    
    /* private */ var tags: js.Any
  }
  object CustomStyleSheet {
    
    inline def apply(
      _insert: (CSSStyleSheet, String) => Unit,
      ctr: js.Any,
      flush: () => Unit,
      getSheet: () => js.UndefOr[CSSStyleSheet],
      inject: () => Unit,
      injected: js.Any,
      insert: String => Double,
      isSpeedy: js.Any,
      maxLength: js.Any,
      rules: () => js.Array[CSSRule],
      sheet: js.Any,
      speedy: Boolean => Unit,
      tags: js.Any
    ): CustomStyleSheet = {
      val __obj = js.Dynamic.literal(_insert = js.Any.fromFunction2(_insert), ctr = ctr.asInstanceOf[js.Any], flush = js.Any.fromFunction0(flush), getSheet = js.Any.fromFunction0(getSheet), inject = js.Any.fromFunction0(inject), injected = injected.asInstanceOf[js.Any], insert = js.Any.fromFunction1(insert), isSpeedy = isSpeedy.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any], rules = js.Any.fromFunction0(rules), sheet = sheet.asInstanceOf[js.Any], speedy = js.Any.fromFunction1(speedy), tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomStyleSheet]
    }
    
    extension [Self <: CustomStyleSheet](x: Self) {
      
      inline def setCtr(value: js.Any): Self = StObject.set(x, "ctr", value.asInstanceOf[js.Any])
      
      inline def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
      
      inline def setGetSheet(value: () => js.UndefOr[CSSStyleSheet]): Self = StObject.set(x, "getSheet", js.Any.fromFunction0(value))
      
      inline def setInject(value: () => Unit): Self = StObject.set(x, "inject", js.Any.fromFunction0(value))
      
      inline def setInjected(value: js.Any): Self = StObject.set(x, "injected", value.asInstanceOf[js.Any])
      
      inline def setInsert(value: String => Double): Self = StObject.set(x, "insert", js.Any.fromFunction1(value))
      
      inline def setIsSpeedy(value: js.Any): Self = StObject.set(x, "isSpeedy", value.asInstanceOf[js.Any])
      
      inline def setMaxLength(value: js.Any): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setRules(value: () => js.Array[CSSRule]): Self = StObject.set(x, "rules", js.Any.fromFunction0(value))
      
      inline def setSheet(value: js.Any): Self = StObject.set(x, "sheet", value.asInstanceOf[js.Any])
      
      inline def setSpeedy(value: Boolean => Unit): Self = StObject.set(x, "speedy", js.Any.fromFunction1(value))
      
      inline def setTags(value: js.Any): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def set_insert(value: (CSSStyleSheet, String) => Unit): Self = StObject.set(x, "_insert", js.Any.fromFunction2(value))
    }
  }
  
  trait Options extends StObject {
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var speedy: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setSpeedy(value: Boolean): Self = StObject.set(x, "speedy", value.asInstanceOf[js.Any])
      
      inline def setSpeedyUndefined: Self = StObject.set(x, "speedy", js.undefined)
    }
  }
}
