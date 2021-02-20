package typings.styleValueTypes

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("style-value-types/lib/utils", "clamp")
  @js.native
  def clamp(min: Double, max: Double): js.Function1[/* v */ Double, Double] = js.native
  
  @JSImport("style-value-types/lib/utils", "colorRegex")
  @js.native
  val colorRegex: RegExp = js.native
  
  @JSImport("style-value-types/lib/utils", "floatRegex")
  @js.native
  val floatRegex: RegExp = js.native
  
  @JSImport("style-value-types/lib/utils", "sanitize")
  @js.native
  def sanitize(v: Double): Double = js.native
  
  @JSImport("style-value-types/lib/utils", "singleColorRegex")
  @js.native
  val singleColorRegex: RegExp = js.native
}
