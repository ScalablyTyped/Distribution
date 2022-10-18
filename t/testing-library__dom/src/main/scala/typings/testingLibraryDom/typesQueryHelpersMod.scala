package typings.testingLibraryDom

import typings.std.Element
import typings.std.HTMLElement
import typings.testingLibraryDom.typesMatchesMod.Matcher
import typings.testingLibraryDom.typesMatchesMod.MatcherOptions
import typings.testingLibraryDom.typesWaitForMod.waitForOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesQueryHelpersMod {
  
  @JSImport("@testing-library/dom/types/query-helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildQueries[Arguments /* <: js.Array[Any] */](
    queryAllBy: GetAllBy[Arguments],
    getMultipleError: GetErrorFunction[Arguments],
    getMissingError: GetErrorFunction[Arguments]
  ): BuiltQueryMethods[Arguments] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildQueries")(queryAllBy.asInstanceOf[js.Any], getMultipleError.asInstanceOf[js.Any], getMissingError.asInstanceOf[js.Any])).asInstanceOf[BuiltQueryMethods[Arguments]]
  
  inline def getElementError(message: String, container: HTMLElement): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementError")(message.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[js.Error]
  inline def getElementError(message: Null, container: HTMLElement): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementError")(message.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[js.Error]
  
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
  
  type BuiltQueryMethods[Arguments /* <: js.Array[Any] */] = js.Tuple5[
    QueryBy[Arguments], 
    GetAllBy[Arguments], 
    GetBy[Arguments], 
    FindAllBy[Arguments], 
    FindBy[Arguments]
  ]
  
  type FindAllBy[Arguments /* <: js.Array[Any] */] = QueryMethod[
    js.Tuple3[
      /* import warning: importer.ImportType#apply Failed type conversion: Arguments[0] */ js.Any, 
      js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: Arguments[1] */ js.Any
      ], 
      js.UndefOr[waitForOptions]
    ], 
    js.Promise[js.Array[HTMLElement]]
  ]
  
  type FindBy[Arguments /* <: js.Array[Any] */] = QueryMethod[
    js.Tuple3[
      /* import warning: importer.ImportType#apply Failed type conversion: Arguments[0] */ js.Any, 
      js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: Arguments[1] */ js.Any
      ], 
      js.UndefOr[waitForOptions]
    ], 
    js.Promise[HTMLElement]
  ]
  
  type GetAllBy[Arguments /* <: js.Array[Any] */] = QueryMethod[Arguments, js.Array[HTMLElement]]
  
  type GetBy[Arguments /* <: js.Array[Any] */] = QueryMethod[Arguments, HTMLElement]
  
  type GetErrorFunction[Arguments /* <: js.Array[Any] */] = js.Function2[/* c */ Element | Null, /* args */ Arguments, String]
  
  type QueryBy[Arguments /* <: js.Array[Any] */] = QueryMethod[Arguments, HTMLElement | Null]
  
  type QueryByAttribute_ = js.Function4[
    /* attribute */ String, 
    /* container */ HTMLElement, 
    /* id */ Matcher, 
    /* options */ js.UndefOr[MatcherOptions], 
    HTMLElement | Null
  ]
  
  type QueryMethod[Arguments /* <: js.Array[Any] */, Return] = js.Function2[/* container */ HTMLElement, /* args */ Arguments, Return]
  
  trait SelectorMatcherOptions
    extends StObject
       with MatcherOptions {
    
    var ignore: js.UndefOr[Boolean | String] = js.undefined
    
    var selector: js.UndefOr[String] = js.undefined
  }
  object SelectorMatcherOptions {
    
    inline def apply(): SelectorMatcherOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectorMatcherOptions]
    }
    
    extension [Self <: SelectorMatcherOptions](x: Self) {
      
      inline def setIgnore(value: Boolean | String): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    }
  }
  
  trait WithSuggest extends StObject {
    
    var suggest: js.UndefOr[Boolean] = js.undefined
  }
  object WithSuggest {
    
    inline def apply(): WithSuggest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithSuggest]
    }
    
    extension [Self <: WithSuggest](x: Self) {
      
      inline def setSuggest(value: Boolean): Self = StObject.set(x, "suggest", value.asInstanceOf[js.Any])
      
      inline def setSuggestUndefined: Self = StObject.set(x, "suggest", js.undefined)
    }
  }
}
