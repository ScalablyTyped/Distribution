package typings.typeorm

import typings.std.PropertyDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object afterLoadMod {
  
  @JSImport("typeorm/browser/decorator/listeners/AfterLoad", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def AfterLoad(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("AfterLoad")().asInstanceOf[PropertyDecorator]
}
