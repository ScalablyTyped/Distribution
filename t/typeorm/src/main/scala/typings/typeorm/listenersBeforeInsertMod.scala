package typings.typeorm

import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listenersBeforeInsertMod {
  
  @JSImport("typeorm/decorator/listeners/BeforeInsert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def BeforeInsert(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("BeforeInsert")().asInstanceOf[PropertyDecorator]
}
