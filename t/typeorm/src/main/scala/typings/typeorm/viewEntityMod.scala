package typings.typeorm

import typings.std.ClassDecorator
import typings.typeorm.viewEntityOptionsMod.ViewEntityOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewEntityMod {
  
  @JSImport("typeorm/browser/decorator/entity-view/ViewEntity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def ViewEntity(): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ViewEntity")().asInstanceOf[ClassDecorator]
  @scala.inline
  def ViewEntity(name: String): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ViewEntity")(name.asInstanceOf[js.Any]).asInstanceOf[ClassDecorator]
  @scala.inline
  def ViewEntity(name: String, options: ViewEntityOptions): ClassDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ViewEntity")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ClassDecorator]
  @scala.inline
  def ViewEntity(name: Unit, options: ViewEntityOptions): ClassDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ViewEntity")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ClassDecorator]
  @scala.inline
  def ViewEntity(options: ViewEntityOptions): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ViewEntity")(options.asInstanceOf[js.Any]).asInstanceOf[ClassDecorator]
}
