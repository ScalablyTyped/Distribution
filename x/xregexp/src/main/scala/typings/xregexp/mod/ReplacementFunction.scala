package typings.xregexp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *   Replacement functions are invoked with three or more arguments:
  *     - {string} args[0] - The matched substring (corresponds to `$&` above). If the `namespacing` feature
  *       is off, named backreferences are accessible as properties of this argument.
  *     - {string} args[1..n] - One argument for each backreference (corresponding to `$1`, `$2`, etc. above).
  *       If the regex has no capturing groups, no arguments appear in this position.
  *     - {number} args[n+1] - The zero-based index of the match within the entire search string.
  *     - {string} args[n+2] - The total string being searched.
  *     - {XRegExp.NamedGroups} args[n+3] - If the the search pattern is a regex with named capturing groups, the last
  *       argument is the groups object. Its keys are the backreference names and its values are the
  *       backreference values. If the `namespacing` feature is off, this argument is not present.
  */
@js.native
trait ReplacementFunction extends StObject {
  
  def apply(substring: MatchSubString, args: (String | Double | NamedGroupsArray)*): String = js.native
}
