package typings.typeorm

import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object beforeInsertMod {
  
  @JSImport("typeorm/browser/decorator/listeners/BeforeInsert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def BeforeInsert(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("BeforeInsert")().asInstanceOf[PropertyDecorator]
}
