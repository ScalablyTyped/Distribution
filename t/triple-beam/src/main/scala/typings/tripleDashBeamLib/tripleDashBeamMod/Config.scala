package typings
package tripleDashBeamLib.tripleDashBeamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  val colors: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  val levels: org.scalablytyped.runtime.StringDictionary[scala.Double]
}

object Config {
  @scala.inline
  def apply(
    colors: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    levels: org.scalablytyped.runtime.StringDictionary[scala.Double]
  ): Config = {
    val __obj = js.Dynamic.literal(colors = colors, levels = levels)
  
    __obj.asInstanceOf[Config]
  }
}

