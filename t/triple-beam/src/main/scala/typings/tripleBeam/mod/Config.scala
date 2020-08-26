package typings.tripleBeam.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  val colors: StringDictionary[String] = js.native
  val levels: StringDictionary[Double] = js.native
}

object Config {
  @scala.inline
  def apply(colors: StringDictionary[String], levels: StringDictionary[Double]): Config = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColors(value: StringDictionary[String]): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def setLevels(value: StringDictionary[Double]): Self = this.set("levels", value.asInstanceOf[js.Any])
  }
  
}

