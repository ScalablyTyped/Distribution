package typings.testingLibraryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object queriesMod {
  type AllByBoundAttribute = js.Function3[
    /* container */ typings.std.HTMLElement, 
    /* id */ typings.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typings.testingLibraryDom.matchesMod.MatcherOptions], 
    js.Array[typings.std.HTMLElement]
  ]
  type AllByRole = js.Function3[
    /* container */ typings.std.HTMLElement, 
    /* role */ typings.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typings.testingLibraryDom.queriesMod.ByRoleOptions], 
    js.Array[typings.std.HTMLElement]
  ]
  type AllByText = js.Function3[
    /* container */ typings.std.HTMLElement, 
    /* id */ typings.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typings.testingLibraryDom.queryHelpersMod.SelectorMatcherOptions], 
    js.Array[typings.std.HTMLElement]
  ]
  type FindAllByBoundAttribute = js.Function4[
    /* container */ typings.std.HTMLElement, 
    /* id */ typings.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typings.testingLibraryDom.matchesMod.MatcherOptions], 
    /* waitForElementOptions */ js.UndefOr[typings.testingLibraryDom.waitForMod.waitForOptions], 
    js.Promise[js.Array[typings.std.HTMLElement]]
  ]
  type FindAllByRole_ = js.Function4[
    /* container */ typings.std.HTMLElement, 
    /* role */ typings.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typings.testingLibraryDom.queriesMod.ByRoleOptions], 
    /* waitForElementOptions */ js.UndefOr[typings.testingLibraryDom.waitForMod.waitForOptions], 
    js.Promise[js.Array[typings.std.HTMLElement]]
  ]
  type FindAllByText_ = js.Function4[
    /* container */ typings.std.HTMLElement, 
    /* id */ typings.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typings.testingLibraryDom.queryHelpersMod.SelectorMatcherOptions], 
    /* waitForElementOptions */ js.UndefOr[typings.testingLibraryDom.waitForMod.waitForOptions], 
    js.Promise[js.Array[typings.std.HTMLElement]]
  ]
  type FindByBoundAttribute = js.Function4[
    /* container */ typings.std.HTMLElement, 
    /* id */ typings.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typings.testingLibraryDom.matchesMod.MatcherOptions], 
    /* waitForElementOptions */ js.UndefOr[typings.testingLibraryDom.waitForMod.waitForOptions], 
    js.Promise[typings.std.HTMLElement]
  ]
  type FindByRole_ = js.Function4[
    /* container */ typings.std.HTMLElement, 
    /* role */ typings.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typings.testingLibraryDom.queriesMod.ByRoleOptions], 
    /* waitForElementOptions */ js.UndefOr[typings.testingLibraryDom.waitForMod.waitForOptions], 
    js.Promise[typings.std.HTMLElement]
  ]
  type FindByText_ = js.Function4[
    /* container */ typings.std.HTMLElement, 
    /* id */ typings.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typings.testingLibraryDom.queryHelpersMod.SelectorMatcherOptions], 
    /* waitForElementOptions */ js.UndefOr[typings.testingLibraryDom.waitForMod.waitForOptions], 
    js.Promise[typings.std.HTMLElement]
  ]
  type GetByBoundAttribute = js.Function3[
    /* container */ typings.std.HTMLElement, 
    /* id */ typings.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typings.testingLibraryDom.matchesMod.MatcherOptions], 
    typings.std.HTMLElement
  ]
  type GetByRole_ = js.Function3[
    /* container */ typings.std.HTMLElement, 
    /* role */ typings.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typings.testingLibraryDom.queriesMod.ByRoleOptions], 
    typings.std.HTMLElement
  ]
  type GetByText_ = js.Function3[
    /* container */ typings.std.HTMLElement, 
    /* id */ typings.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typings.testingLibraryDom.queryHelpersMod.SelectorMatcherOptions], 
    typings.std.HTMLElement
  ]
  type QueryByBoundAttribute = js.Function3[
    /* container */ typings.std.HTMLElement, 
    /* id */ typings.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typings.testingLibraryDom.matchesMod.MatcherOptions], 
    typings.std.HTMLElement | scala.Null
  ]
  type QueryByRole_ = js.Function3[
    /* container */ typings.std.HTMLElement, 
    /* role */ typings.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typings.testingLibraryDom.queriesMod.ByRoleOptions], 
    typings.std.HTMLElement | scala.Null
  ]
  type QueryByText_ = js.Function3[
    /* container */ typings.std.HTMLElement, 
    /* id */ typings.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typings.testingLibraryDom.queryHelpersMod.SelectorMatcherOptions], 
    typings.std.HTMLElement | scala.Null
  ]
}
