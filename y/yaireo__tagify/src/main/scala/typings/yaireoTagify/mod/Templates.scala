package typings.yaireoTagify.mod

import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import typings.yaireoTagify.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Render functions for the template feature that can be configured via the
  * `templates` option of the settings that are passed to tagify.
  * @template T Type of the tag data. See the Tagify class for more details.
  */
/* Inlined parent std.Partial<@yaireo/tagify.@yaireo/tagify.TemplatesRuntime<T>> */
trait Templates[T /* <: BaseTagData */] extends StObject {
  
  var dropdown: js.UndefOr[
    js.ThisFunction1[/* this */ Tagify[T], /* settings */ TagifyRuntimeSettings[T], String]
  ] = js.undefined
  
  var dropdownContent: js.UndefOr[js.ThisFunction1[/* this */ Tagify[T], /* htmlContent */ String, String]] = js.undefined
  
  var dropdownFooter: js.UndefOr[js.ThisFunction1[/* this */ Tagify[T], /* suggestions */ js.Array[T], String]] = js.undefined
  
  var dropdownHeader: js.UndefOr[js.ThisFunction1[/* this */ Tagify[T], /* suggestions */ js.Array[T], String]] = js.undefined
  
  var dropdownItem: js.UndefOr[js.ThisFunction1[/* this */ Tagify[T], /* item */ T, String]] = js.undefined
  
  var dropdownItemNoMatch: js.UndefOr[(js.ThisFunction1[/* this */ Tagify[T], /* data */ Value, String]) | Null] = js.undefined
  
  var tag: js.UndefOr[
    js.ThisFunction2[/* this */ Tagify[T], /* tagData */ T, /* tagify */ Tagify[T], String]
  ] = js.undefined
  
  var wrapper: js.UndefOr[
    js.ThisFunction2[
      /* this */ Tagify[T], 
      /* input */ HTMLInputElement | HTMLTextAreaElement, 
      /* settings */ TagifyRuntimeSettings[T], 
      String
    ]
  ] = js.undefined
}
object Templates {
  
  inline def apply[T /* <: BaseTagData */](): Templates[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Templates[T]]
  }
  
  extension [Self <: Templates[?], T /* <: BaseTagData */](x: Self & Templates[T]) {
    
    inline def setDropdown(value: js.ThisFunction1[/* this */ Tagify[T], /* settings */ TagifyRuntimeSettings[T], String]): Self = StObject.set(x, "dropdown", value.asInstanceOf[js.Any])
    
    inline def setDropdownContent(value: js.ThisFunction1[/* this */ Tagify[T], /* htmlContent */ String, String]): Self = StObject.set(x, "dropdownContent", value.asInstanceOf[js.Any])
    
    inline def setDropdownContentUndefined: Self = StObject.set(x, "dropdownContent", js.undefined)
    
    inline def setDropdownFooter(value: js.ThisFunction1[/* this */ Tagify[T], /* suggestions */ js.Array[T], String]): Self = StObject.set(x, "dropdownFooter", value.asInstanceOf[js.Any])
    
    inline def setDropdownFooterUndefined: Self = StObject.set(x, "dropdownFooter", js.undefined)
    
    inline def setDropdownHeader(value: js.ThisFunction1[/* this */ Tagify[T], /* suggestions */ js.Array[T], String]): Self = StObject.set(x, "dropdownHeader", value.asInstanceOf[js.Any])
    
    inline def setDropdownHeaderUndefined: Self = StObject.set(x, "dropdownHeader", js.undefined)
    
    inline def setDropdownItem(value: js.ThisFunction1[/* this */ Tagify[T], /* item */ T, String]): Self = StObject.set(x, "dropdownItem", value.asInstanceOf[js.Any])
    
    inline def setDropdownItemNoMatch(value: js.ThisFunction1[/* this */ Tagify[T], /* data */ Value, String]): Self = StObject.set(x, "dropdownItemNoMatch", value.asInstanceOf[js.Any])
    
    inline def setDropdownItemNoMatchNull: Self = StObject.set(x, "dropdownItemNoMatch", null)
    
    inline def setDropdownItemNoMatchUndefined: Self = StObject.set(x, "dropdownItemNoMatch", js.undefined)
    
    inline def setDropdownItemUndefined: Self = StObject.set(x, "dropdownItem", js.undefined)
    
    inline def setDropdownUndefined: Self = StObject.set(x, "dropdown", js.undefined)
    
    inline def setTag(value: js.ThisFunction2[/* this */ Tagify[T], /* tagData */ T, /* tagify */ Tagify[T], String]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    inline def setWrapper(
      value: js.ThisFunction2[
          /* this */ Tagify[T], 
          /* input */ HTMLInputElement | HTMLTextAreaElement, 
          /* settings */ TagifyRuntimeSettings[T], 
          String
        ]
    ): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
    
    inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
  }
}
