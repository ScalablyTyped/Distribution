package typings.stylus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEot extends js.Object {
  @JSName(".eot")
  var Doteot: String
  @JSName(".gif")
  var Dotgif: String
  @JSName(".jpeg")
  var Dotjpeg: String
  @JSName(".jpg")
  var Dotjpg: String
  @JSName(".png")
  var Dotpng: String
  @JSName(".svg")
  var Dotsvg: String
  @JSName(".ttf")
  var Dotttf: String
  @JSName(".woff")
  var Dotwoff: String
}

object AnonEot {
  @scala.inline
  def apply(
    Doteot: String,
    Dotgif: String,
    Dotjpeg: String,
    Dotjpg: String,
    Dotpng: String,
    Dotsvg: String,
    Dotttf: String,
    Dotwoff: String
  ): AnonEot = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(".eot")(Doteot.asInstanceOf[js.Any])
    __obj.updateDynamic(".gif")(Dotgif.asInstanceOf[js.Any])
    __obj.updateDynamic(".jpeg")(Dotjpeg.asInstanceOf[js.Any])
    __obj.updateDynamic(".jpg")(Dotjpg.asInstanceOf[js.Any])
    __obj.updateDynamic(".png")(Dotpng.asInstanceOf[js.Any])
    __obj.updateDynamic(".svg")(Dotsvg.asInstanceOf[js.Any])
    __obj.updateDynamic(".ttf")(Dotttf.asInstanceOf[js.Any])
    __obj.updateDynamic(".woff")(Dotwoff.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEot]
  }
}

