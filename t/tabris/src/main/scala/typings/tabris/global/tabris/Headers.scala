package typings.tabris.global.tabris

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Headers
/**
  * Represents a set of HTTP headers as used by `fetch()`.
  */
/* was `typeof Headers` */
@JSGlobal("tabris.Headers")
@js.native
class Headers ()
  extends typings.tabris.mod.Headers {
  def this(headers: js.Array[js.Tuple2[String, String]]) = this()
  def this(headers: StringDictionary[String]) = this()
  def this(headers: typings.tabris.Headers) = this()
}
