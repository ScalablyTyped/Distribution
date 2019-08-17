package typings.atTestingDashLibraryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object matchesMod {
  import typings.std.HTMLElement
  import typings.std.RegExp

  type Match = js.Function4[
    /* textToMatch */ String, 
    /* node */ HTMLElement | Null, 
    /* matcher */ Matcher, 
    /* options */ js.UndefOr[MatcherOptions], 
    Boolean
  ]
  type Matcher = String | RegExp | MatcherFunction
  type MatcherFunction = js.Function2[/* content */ String, /* element */ HTMLElement, Boolean]
  type NormalizerFn = js.Function1[/* text */ String, String]
}
