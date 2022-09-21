package typings.testingLibraryDom

import typings.testingLibraryDom.anon.Debug
import typings.testingLibraryDom.anon.Typeofqueries
import typings.testingLibraryDom.getQueriesForElementMod.BoundFunctions
import typings.testingLibraryDom.getQueriesForElementMod.Queries
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object screenMod {
  
  @JSImport("@testing-library/dom/types/screen", "screen")
  @js.native
  val screen: Screen_[Typeofqueries] = js.native
  
  type Screen_[Q /* <: Queries */] = BoundFunctions[Q] & Debug
}
