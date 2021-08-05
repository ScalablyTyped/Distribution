package typings.summernote.mod.global.Summernote

import typings.jquery.JQuery.Node
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HintOptions extends StObject {
  
  var content: js.UndefOr[js.Function1[/* item */ String, htmlElement | Node]] = js.undefined
  
  var `match`: RegExp
  
  var mentions: js.UndefOr[js.Array[String]] = js.undefined
  
  def search(keyword: String, callback: js.Function1[/* plausibleItems */ js.Array[String], Unit]): Unit
  
  var template: js.UndefOr[js.Function1[/* item */ String, htmlElement]] = js.undefined
  
  var words: js.UndefOr[js.Array[String]] = js.undefined
}
object HintOptions {
  
  inline def apply(
    `match`: RegExp,
    search: (String, js.Function1[/* plausibleItems */ js.Array[String], Unit]) => Unit
  ): HintOptions = {
    val __obj = js.Dynamic.literal(search = js.Any.fromFunction2(search))
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HintOptions]
  }
  
  extension [Self <: HintOptions](x: Self) {
    
    inline def setContent(value: /* item */ String => htmlElement | Node): Self = StObject.set(x, "content", js.Any.fromFunction1(value))
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setMatch(value: RegExp): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMentions(value: js.Array[String]): Self = StObject.set(x, "mentions", value.asInstanceOf[js.Any])
    
    inline def setMentionsUndefined: Self = StObject.set(x, "mentions", js.undefined)
    
    inline def setMentionsVarargs(value: String*): Self = StObject.set(x, "mentions", js.Array(value :_*))
    
    inline def setSearch(value: (String, js.Function1[/* plausibleItems */ js.Array[String], Unit]) => Unit): Self = StObject.set(x, "search", js.Any.fromFunction2(value))
    
    inline def setTemplate(value: /* item */ String => htmlElement): Self = StObject.set(x, "template", js.Any.fromFunction1(value))
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setWords(value: js.Array[String]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
    
    inline def setWordsUndefined: Self = StObject.set(x, "words", js.undefined)
    
    inline def setWordsVarargs(value: String*): Self = StObject.set(x, "words", js.Array(value :_*))
  }
}
