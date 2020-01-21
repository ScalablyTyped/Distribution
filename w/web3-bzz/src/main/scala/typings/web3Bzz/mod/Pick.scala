package typings.web3Bzz.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pick extends js.Object {
  def data(): js.Promise[_]
  def directory(): js.Promise[_]
  def file(): js.Promise[_]
}

object Pick {
  @scala.inline
  def apply(data: () => js.Promise[_], directory: () => js.Promise[_], file: () => js.Promise[_]): Pick = {
    val __obj = js.Dynamic.literal(data = js.Any.fromFunction0(data), directory = js.Any.fromFunction0(directory), file = js.Any.fromFunction0(file))
  
    __obj.asInstanceOf[Pick]
  }
}

