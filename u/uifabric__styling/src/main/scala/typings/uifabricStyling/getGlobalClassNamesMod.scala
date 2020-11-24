package typings.uifabricStyling

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uifabric/styling/lib/styles/getGlobalClassNames", JSImport.Namespace)
@js.native
object getGlobalClassNamesMod extends js.Object {
  
  def getGlobalClassNames[T](classNames: GlobalClassNames[T], theme: ITheme): GlobalClassNames[T] = js.native
  def getGlobalClassNames[T](classNames: GlobalClassNames[T], theme: ITheme, disableGlobalClassNames: Boolean): GlobalClassNames[T] = js.native
  
  type GlobalClassNames[IStyles] = Record[/* keyof IStyles */ String, String]
}
