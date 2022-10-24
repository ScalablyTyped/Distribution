package typings.wixStyleReact

import typings.wixStyleReact.anon.BlurInput
import typings.wixStyleReact.anon.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPaginationPaginationCorePaginationCoreDotdriverMod {
  
  @JSImport("wix-style-react/dist/types/Pagination/PaginationCore/PaginationCore.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def paginationCoreDriverFactory(param0: Element): BlurInput = ^.asInstanceOf[js.Dynamic].applyDynamic("paginationCoreDriverFactory")(param0.asInstanceOf[js.Any]).asInstanceOf[BlurInput]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.first
    - typings.wixStyleReact.wixStyleReactStrings.previous
    - typings.wixStyleReact.wixStyleReactStrings.next
    - typings.wixStyleReact.wixStyleReactStrings.last
  */
  trait NavButtonName extends StObject
  object NavButtonName {
    
    inline def first: typings.wixStyleReact.wixStyleReactStrings.first = "first".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.first]
    
    inline def last: typings.wixStyleReact.wixStyleReactStrings.last = "last".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.last]
    
    inline def next: typings.wixStyleReact.wixStyleReactStrings.next = "next".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.next]
    
    inline def previous: typings.wixStyleReact.wixStyleReactStrings.previous = "previous".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.previous]
  }
}
