package typings.validDataUrl

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("valid-data-url", JSImport.Namespace)
  @js.native
  def apply(candidate: String): Boolean = js.native
  
  @JSImport("valid-data-url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("valid-data-url", "regex")
  @js.native
  def regex: RegExp = js.native
  @scala.inline
  def regex_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("regex")(x.asInstanceOf[js.Any])
}
