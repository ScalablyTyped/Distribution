package typings.testingLibraryDom

import typings.std.Error
import typings.std.HTMLElement
import typings.testingLibraryDom.matchesMod.Matcher
import typings.testingLibraryDom.matchesMod.MatcherOptions
import typings.testingLibraryDom.waitForMod.waitForOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryHelpersMod {
  
  @JSImport("@testing-library/dom/types/query-helpers", "buildQueries")
  @js.native
  def buildQueries[Arguments /* <: js.Array[_] */](
    queryByAll: GetAllBy[Arguments],
    getMultipleError: js.Function2[/* container */ HTMLElement, /* args */ Arguments, String],
    getMissingError: js.Function2[/* container */ HTMLElement, /* args */ Arguments, String]
  ): BuiltQueryMethods[Arguments] = js.native
  
  @JSImport("@testing-library/dom/types/query-helpers", "getElementError")
  @js.native
  def getElementError(message: String, container: HTMLElement): Error = js.native
  
  @JSImport("@testing-library/dom/types/query-helpers", "queryAllByAttribute")
  @js.native
  val queryAllByAttribute: AllByAttribute = js.native
  
  @JSImport("@testing-library/dom/types/query-helpers", "queryByAttribute")
  @js.native
  val queryByAttribute: QueryByAttribute_ = js.native
  
  type AllByAttribute = js.Function4[
    /* attribute */ String, 
    /* container */ HTMLElement, 
    /* id */ Matcher, 
    /* options */ js.UndefOr[MatcherOptions], 
    js.Array[HTMLElement]
  ]
  
  type BuiltQueryMethods[Arguments /* <: js.Array[_] */] = js.Tuple5[
    QueryBy[Arguments], 
    GetAllBy[Arguments], 
    GetBy[Arguments], 
    FindAllBy[Arguments], 
    FindBy[Arguments]
  ]
  
  type FindAllBy[Arguments /* <: js.Array[_] */] = QueryMethod[
    js.Tuple3[
      /* import warning: importer.ImportType#apply Failed type conversion: Arguments[0] */ js.Any, 
      js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: Arguments[1] */ js.Any
      ], 
      js.UndefOr[waitForOptions]
    ], 
    js.Promise[js.Array[HTMLElement]]
  ]
  
  type FindBy[Arguments /* <: js.Array[_] */] = QueryMethod[
    js.Tuple3[
      /* import warning: importer.ImportType#apply Failed type conversion: Arguments[0] */ js.Any, 
      js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: Arguments[1] */ js.Any
      ], 
      js.UndefOr[waitForOptions]
    ], 
    js.Promise[HTMLElement]
  ]
  
  type GetAllBy[Arguments /* <: js.Array[_] */] = QueryMethod[Arguments, js.Array[HTMLElement]]
  
  type GetBy[Arguments /* <: js.Array[_] */] = QueryMethod[Arguments, HTMLElement]
  
  type QueryBy[Arguments /* <: js.Array[_] */] = QueryMethod[Arguments, HTMLElement | Null]
  
  type QueryByAttribute_ = js.Function4[
    /* attribute */ String, 
    /* container */ HTMLElement, 
    /* id */ Matcher, 
    /* options */ js.UndefOr[MatcherOptions], 
    HTMLElement | Null
  ]
  
  type QueryMethod[Arguments /* <: js.Array[_] */, Return] = js.Function2[/* container */ HTMLElement, /* args */ Arguments, Return]
  
  @js.native
  trait SelectorMatcherOptions extends MatcherOptions {
    
    var selector: js.UndefOr[String] = js.native
  }
  object SelectorMatcherOptions {
    
    @scala.inline
    def apply(): SelectorMatcherOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectorMatcherOptions]
    }
    
    @scala.inline
    implicit class SelectorMatcherOptionsMutableBuilder[Self <: SelectorMatcherOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    }
  }
}
