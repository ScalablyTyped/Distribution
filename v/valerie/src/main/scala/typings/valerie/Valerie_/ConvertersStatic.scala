package typings.valerie.Valerie_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Contains converters, always singletons.
trait ConvertersStatic extends js.Object {
  //TODO: other converters to be added
  var passThrough: IConverter
}

object ConvertersStatic {
  @scala.inline
  def apply(passThrough: IConverter): ConvertersStatic = {
    val __obj = js.Dynamic.literal(passThrough = passThrough.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConvertersStatic]
  }
}

