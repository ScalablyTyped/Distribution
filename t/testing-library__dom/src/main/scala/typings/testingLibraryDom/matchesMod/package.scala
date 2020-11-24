package typings.testingLibraryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object matchesMod {
  
  type ByRoleMatcher = typings.ariaQuery.mod.ARIARole | typings.testingLibraryDom.matchesMod.MatcherFunction | js.Object
  
  type Match = js.Function4[
    /* textToMatch */ java.lang.String, 
    /* node */ typings.std.HTMLElement | scala.Null, 
    /* matcher */ typings.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typings.testingLibraryDom.matchesMod.MatcherOptions], 
    scala.Boolean
  ]
  
  type Matcher = typings.testingLibraryDom.matchesMod.MatcherFunction | js.Object
  
  type MatcherFunction = js.Function2[/* content */ java.lang.String, /* element */ typings.std.HTMLElement, scala.Boolean]
  
  type NormalizerFn = js.Function1[/* text */ java.lang.String, java.lang.String]
}
