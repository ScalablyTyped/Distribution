package typings
package yaysonLib.yaysonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Yayson extends js.Object {
  var Adapter: yaysonLib.yaysonMod.Adapter
  var Presenter: yaysonLib.TypeofClassPresenter
  var Store: org.scalablytyped.runtime.Instantiable0[Store]
}

object Yayson {
  @scala.inline
  def apply(
    Adapter: Adapter,
    Presenter: yaysonLib.TypeofClassPresenter,
    Store: org.scalablytyped.runtime.Instantiable0[Store]
  ): Yayson = {
    val __obj = js.Dynamic.literal(Adapter = Adapter, Presenter = Presenter, Store = Store)
  
    __obj.asInstanceOf[Yayson]
  }
}

