package typings.tap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mocha extends js.Object {
  
  def describe(): Unit = js.native
  def describe(name: js.UndefOr[scala.Nothing], fn: js.Function1[/* a */ js.Any, _]): Unit = js.native
  def describe(name: String): Unit = js.native
  def describe(name: String, fn: js.Function1[/* a */ js.Any, _]): Unit = js.native
  
  def global(): Unit = js.native
  
  def it(): Unit = js.native
  def it(name: js.UndefOr[scala.Nothing], fn: js.Function1[/* a */ js.Any, _]): Unit = js.native
  def it(name: String): Unit = js.native
  def it(name: String, fn: js.Function1[/* a */ js.Any, _]): Unit = js.native
}
