package typings.uifabricStyling

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getGlobalClassNamesMod {
  
  @JSImport("@uifabric/styling/lib/styles/getGlobalClassNames", "getGlobalClassNames")
  @js.native
  def getGlobalClassNames[T](classNames: GlobalClassNames[T], theme: ITheme): GlobalClassNames[T] = js.native
  @JSImport("@uifabric/styling/lib/styles/getGlobalClassNames", "getGlobalClassNames")
  @js.native
  def getGlobalClassNames[T](classNames: GlobalClassNames[T], theme: ITheme, disableGlobalClassNames: Boolean): GlobalClassNames[T] = js.native
  
  type GlobalClassNames[IStyles] = Record[/* keyof IStyles */ String, String]
}
