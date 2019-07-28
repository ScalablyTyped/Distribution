package typings.tripleDashBeam.tripleDashBeamMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  val colors: StringDictionary[String]
  val levels: StringDictionary[Double]
}

object Config {
  @scala.inline
  def apply(colors: StringDictionary[String], levels: StringDictionary[Double]): Config = {
    val __obj = js.Dynamic.literal(colors = colors, levels = levels)
  
    __obj.asInstanceOf[Config]
  }
}

