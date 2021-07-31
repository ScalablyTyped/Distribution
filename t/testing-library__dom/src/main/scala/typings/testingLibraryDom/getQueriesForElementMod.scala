package typings.testingLibraryDom

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.std.Error
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getQueriesForElementMod {
  
  @JSImport("@testing-library/dom/types/get-queries-for-element", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getQueriesForElement[T /* <: Queries */](element: HTMLElement): BoundFunctions[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getQueriesForElement")(element.asInstanceOf[js.Any]).asInstanceOf[BoundFunctions[T]]
  @scala.inline
  def getQueriesForElement[T /* <: Queries */](element: HTMLElement, queriesToBind: T): BoundFunctions[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getQueriesForElement")(element.asInstanceOf[js.Any], queriesToBind.asInstanceOf[js.Any])).asInstanceOf[BoundFunctions[T]]
  
  type BoundFunction[T] = (js.Function2[/* text */ js.Any, js.UndefOr[js.Any], js.Any]) | (js.Function3[
    /* text */ js.Any, 
    /* options */ js.UndefOr[js.Any], 
    /* waitForElementOptions */ js.UndefOr[js.Any], 
    js.Any
  ])
  
  type BoundFunctions[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: @testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<T[P]>}
    */ typings.testingLibraryDom.testingLibraryDomStrings.BoundFunctions & TopLevel[T]
  
  type Queries = StringDictionary[Query]
  
  @js.native
  trait Query extends StObject {
    
    def apply(container: HTMLElement, args: js.Any*): Error | (js.Promise[js.Array[HTMLElement] | HTMLElement]) | js.Array[HTMLElement] | HTMLElement | Null = js.native
  }
}
