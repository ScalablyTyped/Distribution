package typings.tabris.global

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Headers
/**
  * Represents a set of HTTP headers as used by `fetch()`.
  */
@JSGlobal("Headers")
@js.native
/**
  * Represents a set of HTTP headers as used by `fetch()`.
  */
open class Headers ()
  extends StObject
     with typings.tabris.Headers {
  def this(headers: js.Array[js.Tuple2[String, String]]) = this()
  def this(headers: StringDictionary[String]) = this()
  def this(headers: typings.tabris.Headers) = this()
}
