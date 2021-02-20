package typings.wildstring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wildstring", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wildstring", "caseSensitive")
  @js.native
  def caseSensitive: Boolean = js.native
  @scala.inline
  def caseSensitive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(x.asInstanceOf[js.Any])
  
  @JSImport("wildstring", "replace")
  @js.native
  def replace(pattern: String, strings: String): String = js.native
  @JSImport("wildstring", "replace")
  @js.native
  def replace(pattern: String, strings: js.Array[String]): String = js.native
  
  @JSImport("wildstring", "wildcard")
  @js.native
  def wildcard: String = js.native
  @scala.inline
  def wildcard_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wildcard")(x.asInstanceOf[js.Any])
  
  @JSImport("wildstring", "match")
  @js.native
  def `match`(pattern: String, string: String): Boolean = js.native
}
