package typings.typeorm

import typings.std.ClassDecorator
import typings.typeorm.optionsViewEntityOptionsMod.ViewEntityOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/decorator/entity-view/ViewEntity", JSImport.Namespace)
@js.native
object entityViewViewEntityMod extends js.Object {
  
  def ViewEntity(): ClassDecorator = js.native
  def ViewEntity(name: js.UndefOr[scala.Nothing], options: ViewEntityOptions): ClassDecorator = js.native
  def ViewEntity(name: String): ClassDecorator = js.native
  def ViewEntity(name: String, options: ViewEntityOptions): ClassDecorator = js.native
  def ViewEntity(options: ViewEntityOptions): ClassDecorator = js.native
}
