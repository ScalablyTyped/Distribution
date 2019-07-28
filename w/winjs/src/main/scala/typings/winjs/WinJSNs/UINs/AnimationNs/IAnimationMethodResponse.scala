package typings.winjs.WinJSNs.UINs.AnimationNs

import typings.winjs.WinJSNs.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion Functions
//#region Interfaces
trait IAnimationMethodResponse extends js.Object {
  def execute(): Promise[_]
}

object IAnimationMethodResponse {
  @scala.inline
  def apply(execute: () => Promise[_]): IAnimationMethodResponse = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute))
  
    __obj.asInstanceOf[IAnimationMethodResponse]
  }
}

