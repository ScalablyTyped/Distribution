package typings.winrt.Windows.ApplicationModel.Resources

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceLoader extends IResourceLoader

object ResourceLoader {
  @scala.inline
  def apply(getString: String => String): ResourceLoader = {
    val __obj = js.Dynamic.literal(getString = js.Any.fromFunction1(getString))
    __obj.asInstanceOf[ResourceLoader]
  }
}

