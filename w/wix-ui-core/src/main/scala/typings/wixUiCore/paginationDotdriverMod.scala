package typings.wixUiCore

import typings.wixUiCore.anon.ChangeInput
import typings.wixUiCore.anon.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationDotdriverMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/pagination/Pagination.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def paginationDriverFactory(hasRootSimulate: Element): ChangeInput = ^.asInstanceOf[js.Dynamic].applyDynamic("paginationDriverFactory")(hasRootSimulate.asInstanceOf[js.Any]).asInstanceOf[ChangeInput]
  
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
