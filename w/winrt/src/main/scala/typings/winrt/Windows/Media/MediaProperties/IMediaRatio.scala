package typings.winrt.Windows.Media.MediaProperties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMediaRatio extends js.Object {
  var denominator: Double
  var numerator: Double
}

object IMediaRatio {
  @scala.inline
  def apply(denominator: Double, numerator: Double): IMediaRatio = {
    val __obj = js.Dynamic.literal(denominator = denominator, numerator = numerator)
  
    __obj.asInstanceOf[IMediaRatio]
  }
}

