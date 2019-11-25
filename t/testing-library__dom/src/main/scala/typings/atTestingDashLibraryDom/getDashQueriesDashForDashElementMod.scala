package typings.atTestingDashLibraryDom

import org.scalablytyped.runtime.StringDictionary
import typings.atTestingDashLibraryDom.getDashQueriesDashForDashElementMod.BoundFunctions
import typings.atTestingDashLibraryDom.getDashQueriesDashForDashElementMod.Queries
import typings.atTestingDashLibraryDom.getDashQueriesDashForDashElementMod.Query
import typings.std.Error
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@testing-library/dom/get-queries-for-element", JSImport.Namespace)
@js.native
object getDashQueriesDashForDashElementMod extends js.Object {
  def getQueriesForElement[T /* <: Queries */](element: HTMLElement): BoundFunctions[T] = js.native
  def getQueriesForElement[T /* <: Queries */](element: HTMLElement, queriesToBind: T): BoundFunctions[T] = js.native
  type BoundFunction[T] = js.Function2[/* text */ js.Any, js.UndefOr[js.Any], js.Any]
  type BoundFunctions[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: @testing-library/dom.@testing-library/dom/get-queries-for-element.BoundFunction<T[P]>}
    */ typings.atTestingDashLibraryDom.atTestingDashLibraryDomStrings.BoundFunctions with T
  type Queries = StringDictionary[Query]
  type Query = js.Function2[
    /* container */ HTMLElement, 
    /* repeated */ js.Any, 
    Error | (js.Promise[js.Array[HTMLElement] | HTMLElement]) | js.Array[HTMLElement] | HTMLElement | Null
  ]
}

