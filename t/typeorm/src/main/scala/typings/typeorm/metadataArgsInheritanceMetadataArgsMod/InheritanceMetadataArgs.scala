package typings.typeorm.metadataArgsInheritanceMetadataArgsMod

import typings.typeorm.optionsColumnOptionsMod.ColumnOptions
import typings.typeorm.typeormStrings.STI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InheritanceMetadataArgs extends js.Object {
  
  /**
    * Column used as inheritance discriminator column.
    */
  val column: js.UndefOr[ColumnOptions] = js.native
  
  /**
    * Inheritance pattern.
    */
  val pattern: STI = js.native
  
  /**
    * Class to which inheritance is applied.
    */
  val target: js.UndefOr[js.Function | String] = js.native
}
object InheritanceMetadataArgs {
  
  @scala.inline
  def apply(pattern: STI): InheritanceMetadataArgs = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[InheritanceMetadataArgs]
  }
  
  @scala.inline
  implicit class InheritanceMetadataArgsOps[Self <: InheritanceMetadataArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPattern(value: STI): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn(value: ColumnOptions): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    
    @scala.inline
    def setTarget(value: js.Function | String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
