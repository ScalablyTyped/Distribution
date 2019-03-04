package typings
package winjsLib.WinJSNs.UINs.AnimationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion Functions
//#region Interfaces
trait IAnimationMethodResponse extends js.Object {
  def execute(): winjsLib.WinJSNs.Promise[_]
}

object IAnimationMethodResponse {
  @scala.inline
  def apply(execute: js.Function0[winjsLib.WinJSNs.Promise[_]]): IAnimationMethodResponse = {
    val __obj = js.Dynamic.literal(execute = execute)
  
    __obj.asInstanceOf[IAnimationMethodResponse]
  }
}

