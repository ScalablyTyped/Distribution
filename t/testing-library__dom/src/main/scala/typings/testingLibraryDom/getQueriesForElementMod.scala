package typings.testingLibraryDom

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.std.HTMLElement
import typings.testingLibraryDom.anon.FindAllByAltText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getQueriesForElementMod {
  
  @JSImport("@testing-library/dom/types/get-queries-for-element", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getQueriesForElement[QueriesToBind /* <: Queries */, // Extra type parameter required for reassignment.
  T /* <: QueriesToBind */](element: HTMLElement): BoundFunctions[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getQueriesForElement")(element.asInstanceOf[js.Any]).asInstanceOf[BoundFunctions[T]]
  inline def getQueriesForElement[QueriesToBind /* <: Queries */, // Extra type parameter required for reassignment.
  T /* <: QueriesToBind */](element: HTMLElement, queriesToBind: T): BoundFunctions[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getQueriesForElement")(element.asInstanceOf[js.Any], queriesToBind.asInstanceOf[js.Any])).asInstanceOf[BoundFunctions[T]]
  
  type BoundFunction[T] = js.Function1[/* args */ Any, Any]
  
  type BoundFunctions[Q] = (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof Q ]: @testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<Q[P]>}
    */ typings.testingLibraryDom.testingLibraryDomStrings.BoundFunctions & TopLevel[Q]) | (FindAllByAltText & typings.testingLibraryDom.testingLibraryDomStrings.BoundFunctions & TopLevel[Q])
  
  type Queries = StringDictionary[Query]
  
  @js.native
  trait Query extends StObject {
    
    def apply(container: HTMLElement, args: Any*): js.Error | HTMLElement | js.Array[HTMLElement] | (js.Promise[js.Array[HTMLElement] | HTMLElement]) | Null = js.native
  }
}
