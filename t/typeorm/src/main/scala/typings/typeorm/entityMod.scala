package typings.typeorm

import typings.std.ClassDecorator
import typings.typeorm.entityOptionsMod.EntityOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/decorator/entity/Entity", JSImport.Namespace)
@js.native
object entityMod extends js.Object {
  
  def Entity(): ClassDecorator = js.native
  def Entity(name: js.UndefOr[scala.Nothing], options: EntityOptions): ClassDecorator = js.native
  def Entity(name: String): ClassDecorator = js.native
  def Entity(name: String, options: EntityOptions): ClassDecorator = js.native
  def Entity(options: EntityOptions): ClassDecorator = js.native
}
