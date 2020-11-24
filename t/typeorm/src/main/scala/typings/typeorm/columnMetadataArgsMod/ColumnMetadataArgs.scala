package typings.typeorm.columnMetadataArgsMod

import typings.typeorm.columnModeMod.ColumnMode
import typings.typeorm.columnOptionsMod.ColumnOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnMetadataArgs extends js.Object {
  
  /**
    * Column mode in which column will work.
    *
    * todo: find name better then "mode".
    */
  val mode: ColumnMode = js.native
  
  /**
    * Extra column options.
    */
  val options: ColumnOptions = js.native
  
  /**
    * Class's property name to which column is applied.
    */
  val propertyName: String = js.native
  
  /**
    * Class to which column is applied.
    */
  val target: js.Function | String = js.native
}
object ColumnMetadataArgs {
  
  @scala.inline
  def apply(mode: ColumnMode, options: ColumnOptions, propertyName: String, target: js.Function | String): ColumnMetadataArgs = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnMetadataArgs]
  }
  
  @scala.inline
  implicit class ColumnMetadataArgsOps[Self <: ColumnMetadataArgs] (val x: Self) extends AnyVal {
    
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
    def setMode(value: ColumnMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: ColumnOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyName(value: String): Self = this.set("propertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: js.Function | String): Self = this.set("target", value.asInstanceOf[js.Any])
  }
}
