package typings.trimblemapsTrimblemapsJs.mod

import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.stylechange_
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.stylechanging_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapStyleChangeEvent extends MapEvent[Unit] {
  
  var previousStyleName: js.UndefOr[String] = js.native
  
  var styleName: String = js.native
  
  @JSName("type")
  var type_MapStyleChangeEvent: stylechanging_ | stylechange_ = js.native
}
