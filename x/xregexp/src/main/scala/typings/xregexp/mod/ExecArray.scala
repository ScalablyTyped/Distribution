package typings.xregexp.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExpExecArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an array of matched values.
  */
@js.native
trait ExecArray
  extends RegExpExecArray
     with /**
  * Named capture groups are accessible as properties when the `namespacing`
  * feature is not installed.
  */
/* propName */ StringDictionary[js.Any] {
  /**
    * This is only present if the the `namespacing` feature is installed
    * using the `XRegExp.install` method.
    */
  @JSName("groups")
  var groups_ExecArray: js.UndefOr[NamedGroupsArray] = js.native
}

