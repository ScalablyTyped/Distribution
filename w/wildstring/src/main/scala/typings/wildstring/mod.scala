package typings.wildstring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  @scala.inline
  def `match`(pattern: String, string: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(pattern.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def replace(pattern: String, strings: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(pattern.asInstanceOf[js.Any], strings.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def replace(pattern: String, strings: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(pattern.asInstanceOf[js.Any], strings.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("wildstring", "wildcard")
  @js.native
  def wildcard: String = js.native
  @scala.inline
  def wildcard_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wildcard")(x.asInstanceOf[js.Any])
}
