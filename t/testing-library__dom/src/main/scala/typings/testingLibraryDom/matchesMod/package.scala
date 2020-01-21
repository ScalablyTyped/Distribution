package typings.testingLibraryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object matchesMod {
  type Match = js.Function4[
    /* textToMatch */ java.lang.String, 
    /* node */ typings.std.HTMLElement | scala.Null, 
    /* matcher */ typings.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typings.testingLibraryDom.matchesMod.MatcherOptions], 
    scala.Boolean
  ]
  type Matcher = java.lang.String | typings.std.RegExp | typings.testingLibraryDom.matchesMod.MatcherFunction
  type MatcherFunction = js.Function2[/* content */ java.lang.String, /* element */ typings.std.HTMLElement, scala.Boolean]
  type NormalizerFn = js.Function1[/* text */ java.lang.String, java.lang.String]
}
