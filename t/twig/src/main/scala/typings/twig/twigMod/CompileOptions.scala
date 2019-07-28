package typings.twig.twigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompileOptions extends js.Object {
  var filename: String
  var settings: js.Any
}

object CompileOptions {
  @scala.inline
  def apply(filename: String, settings: js.Any): CompileOptions = {
    val __obj = js.Dynamic.literal(filename = filename, settings = settings)
  
    __obj.asInstanceOf[CompileOptions]
  }
}

