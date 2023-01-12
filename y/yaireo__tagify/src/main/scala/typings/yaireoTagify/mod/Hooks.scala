package typings.yaireoTagify.mod

import typings.std.ClipboardEvent
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Promise-based hooks for async program flow scenarios. Allows to "hook"
  * (intervene) at certain points of the program, which were selected as a
  * suitable place to pause the program flow and wait for further
  * instructions on how / if to proceed.
  *
  * See also the `hooks` option of the settings that are passed to tagify.
  * @template T Type of the tag data. See the Tagify class for more details.
  */
/* Inlined parent std.Partial<@yaireo/tagify.@yaireo/tagify.HooksRuntime<T>> */
trait Hooks[T /* <: BaseTagData */] extends StObject {
  
  var beforePaste: js.UndefOr[
    js.Function2[
      /* event */ ClipboardEvent, 
      /* data */ BeforePasteData[T], 
      js.Promise[js.UndefOr[String]]
    ]
  ] = js.undefined
  
  var beforeRemoveTag: js.UndefOr[js.Function1[/* tags */ js.Array[T], js.Promise[Unit]]] = js.undefined
  
  var suggestionClick: js.UndefOr[
    js.Function2[
      /* event */ MouseEvent | KeyboardEvent, 
      /* data */ SuggestionClickData[T], 
      js.Promise[Unit]
    ]
  ] = js.undefined
}
object Hooks {
  
  inline def apply[T /* <: BaseTagData */](): Hooks[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hooks[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Hooks[?], T /* <: BaseTagData */] (val x: Self & Hooks[T]) extends AnyVal {
    
    inline def setBeforePaste(
      value: (/* event */ ClipboardEvent, /* data */ BeforePasteData[T]) => js.Promise[js.UndefOr[String]]
    ): Self = StObject.set(x, "beforePaste", js.Any.fromFunction2(value))
    
    inline def setBeforePasteUndefined: Self = StObject.set(x, "beforePaste", js.undefined)
    
    inline def setBeforeRemoveTag(value: /* tags */ js.Array[T] => js.Promise[Unit]): Self = StObject.set(x, "beforeRemoveTag", js.Any.fromFunction1(value))
    
    inline def setBeforeRemoveTagUndefined: Self = StObject.set(x, "beforeRemoveTag", js.undefined)
    
    inline def setSuggestionClick(
      value: (/* event */ MouseEvent | KeyboardEvent, /* data */ SuggestionClickData[T]) => js.Promise[Unit]
    ): Self = StObject.set(x, "suggestionClick", js.Any.fromFunction2(value))
    
    inline def setSuggestionClickUndefined: Self = StObject.set(x, "suggestionClick", js.undefined)
  }
}
