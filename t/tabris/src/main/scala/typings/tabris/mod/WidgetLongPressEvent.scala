package typings.tabris.mod

import typings.tabris.anon.X
import typings.tabris.tabrisStrings.cancel
import typings.tabris.tabrisStrings.end
import typings.tabris.tabrisStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WidgetLongPressEvent[Target] extends EventObject[Target] {
  
  val state: start | end | cancel = js.native
  
  val touches: js.Array[X] = js.native
}
