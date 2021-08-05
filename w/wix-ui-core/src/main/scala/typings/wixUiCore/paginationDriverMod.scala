package typings.wixUiCore

import typings.wixUiCore.anon.BlurInput
import typings.wixUiCore.anon.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationDriverMod {
  
  @JSImport("wix-ui-core/dist/src/components/pagination/Pagination.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def paginationDriverFactory(hasRootSimulate: Element): BlurInput = ^.asInstanceOf[js.Dynamic].applyDynamic("paginationDriverFactory")(hasRootSimulate.asInstanceOf[js.Any]).asInstanceOf[BlurInput]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixUiCore.wixUiCoreStrings.first
    - typings.wixUiCore.wixUiCoreStrings.previous
    - typings.wixUiCore.wixUiCoreStrings.next
    - typings.wixUiCore.wixUiCoreStrings.last
  */
  trait NavButtonName extends StObject
  object NavButtonName {
    
    inline def first: typings.wixUiCore.wixUiCoreStrings.first = "first".asInstanceOf[typings.wixUiCore.wixUiCoreStrings.first]
    
    inline def last: typings.wixUiCore.wixUiCoreStrings.last = "last".asInstanceOf[typings.wixUiCore.wixUiCoreStrings.last]
    
    inline def next: typings.wixUiCore.wixUiCoreStrings.next = "next".asInstanceOf[typings.wixUiCore.wixUiCoreStrings.next]
    
    inline def previous: typings.wixUiCore.wixUiCoreStrings.previous = "previous".asInstanceOf[typings.wixUiCore.wixUiCoreStrings.previous]
  }
}
