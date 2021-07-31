package typings.typeorm

import typings.std.ClassDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object childEntityMod {
  
  @JSImport("typeorm/browser/decorator/entity/ChildEntity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def ChildEntity(): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ChildEntity")().asInstanceOf[ClassDecorator]
  @scala.inline
  def ChildEntity(discriminatorValue: js.Any): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ChildEntity")(discriminatorValue.asInstanceOf[js.Any]).asInstanceOf[ClassDecorator]
}
