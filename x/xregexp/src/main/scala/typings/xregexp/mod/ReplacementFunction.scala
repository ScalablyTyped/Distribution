package typings.xregexp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *   Replacement functions are invoked with three or more arguments:
  *     - {string}        substring  - The matched substring (corresponds to `$&` above). Named backreferences are accessible as
  *       properties of this first argument if the `namespacing` feature is off.
  *     - {string}        args[1..n] - arguments, one for each backreference (corresponding to `$1`, `$2`, etc. above).
  *     - {number}        args[n+1]  - The zero-based index of the match within the total search string.
  *     - {string}        args[n+2]  - The total string being searched.
  *     - {XRegExp.NamedGroups} args[n+3]  - If the `namespacing` feature is turned on, the last parameter is the groups object. If the
  *       `namespacing` feature is off, then this argument is not present.
  */
@js.native
trait ReplacementFunction extends StObject {
  
  def apply(substring: MatchSubString, args: (String | Double | NamedGroupsArray)*): String = js.native
}
