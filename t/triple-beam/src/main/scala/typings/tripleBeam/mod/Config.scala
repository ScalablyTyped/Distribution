package typings.tripleBeam.mod

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
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

