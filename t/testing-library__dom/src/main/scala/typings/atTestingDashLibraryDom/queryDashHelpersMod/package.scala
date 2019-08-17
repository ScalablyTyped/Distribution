package typings.atTestingDashLibraryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object queryDashHelpersMod {
  import typings.atTestingDashLibraryDom.matchesMod.Matcher
  import typings.atTestingDashLibraryDom.matchesMod.MatcherOptions
  import typings.std.HTMLElement

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
  type FindAllBy[Arguments /* <: js.Array[_] */] = QueryMethod[Arguments, js.Promise[js.Array[HTMLElement]]]
  type FindBy[Arguments /* <: js.Array[_] */] = QueryMethod[Arguments, js.Promise[HTMLElement]]
  type GetAllBy[Arguments /* <: js.Array[_] */] = QueryMethod[Arguments, js.Array[HTMLElement]]
  type GetBy[Arguments /* <: js.Array[_] */] = QueryMethod[Arguments, HTMLElement]
  type QueryBy[Arguments /* <: js.Array[_] */] = QueryMethod[Arguments, HTMLElement | Null]
  type QueryByAttribute = js.Function4[
    /* attribute */ String, 
    /* container */ HTMLElement, 
    /* id */ Matcher, 
    /* options */ js.UndefOr[MatcherOptions], 
    HTMLElement | Null
  ]
  type QueryMethod[Arguments /* <: js.Array[_] */, Return] = js.Function2[/* container */ HTMLElement, /* args */ Arguments, Return]
}
