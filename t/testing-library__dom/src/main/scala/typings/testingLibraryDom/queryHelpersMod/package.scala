package typings.testingLibraryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object queryHelpersMod {
  type AllByAttribute = js.Function4[
    /* attribute */ java.lang.String, 
    /* container */ typings.std.HTMLElement, 
    /* id */ typings.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typings.testingLibraryDom.matchesMod.MatcherOptions], 
    js.Array[typings.std.HTMLElement]
  ]
  type BuiltQueryMethods[Arguments /* <: js.Array[_] */] = js.Tuple5[
    typings.testingLibraryDom.queryHelpersMod.QueryBy[Arguments], 
    typings.testingLibraryDom.queryHelpersMod.GetAllBy[Arguments], 
    typings.testingLibraryDom.queryHelpersMod.GetBy[Arguments], 
    typings.testingLibraryDom.queryHelpersMod.FindAllBy[Arguments], 
    typings.testingLibraryDom.queryHelpersMod.FindBy[Arguments]
  ]
  type FindAllBy[Arguments /* <: js.Array[_] */] = typings.testingLibraryDom.queryHelpersMod.QueryMethod[
    js.Tuple3[
      /* import warning: importer.ImportType#apply Failed type conversion: Arguments[0] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: Arguments[1] */ js.Any, 
      typings.testingLibraryDom.waitForMod.waitForOptions
    ], 
    js.Promise[js.Array[typings.std.HTMLElement]]
  ]
  type FindBy[Arguments /* <: js.Array[_] */] = typings.testingLibraryDom.queryHelpersMod.QueryMethod[
    js.Tuple3[
      /* import warning: importer.ImportType#apply Failed type conversion: Arguments[0] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: Arguments[1] */ js.Any, 
      typings.testingLibraryDom.waitForMod.waitForOptions
    ], 
    js.Promise[typings.std.HTMLElement]
  ]
  type GetAllBy[Arguments /* <: js.Array[_] */] = typings.testingLibraryDom.queryHelpersMod.QueryMethod[Arguments, js.Array[typings.std.HTMLElement]]
  type GetBy[Arguments /* <: js.Array[_] */] = typings.testingLibraryDom.queryHelpersMod.QueryMethod[Arguments, typings.std.HTMLElement]
  type QueryBy[Arguments /* <: js.Array[_] */] = typings.testingLibraryDom.queryHelpersMod.QueryMethod[Arguments, typings.std.HTMLElement | scala.Null]
  type QueryByAttribute_ = js.Function4[
    /* attribute */ java.lang.String, 
    /* container */ typings.std.HTMLElement, 
    /* id */ typings.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typings.testingLibraryDom.matchesMod.MatcherOptions], 
    typings.std.HTMLElement | scala.Null
  ]
  type QueryMethod[Arguments /* <: js.Array[_] */, Return] = js.Function2[/* container */ typings.std.HTMLElement, /* args */ Arguments, Return]
}
