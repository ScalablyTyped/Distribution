package typings.yeomanGenerator.mod

import org.scalablytyped.runtime.Instantiable0
import typings.std.BooleanConstructor
import typings.std.NumberConstructor
import typings.std.StringConstructor
import typings.std.global.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides settings for creating a new generator-option.
  */
@js.native
trait OptionConfig extends js.Object {
  
  /**
    * The option name alias (example `-h` and --help`).
    */
  var alias: js.UndefOr[String] = js.native
  
  /**
    * The default value.
    */
  var default: js.UndefOr[js.Any] = js.native
  
  /**
    * The description for the option.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * A value indicating whether the option should be hidden from the help output.
    */
  var hide: js.UndefOr[Boolean] = js.native
  
  /**
    * The storage to persist the option
    */
  var storage: js.UndefOr[typings.yeomanGenerator.storageMod.^] = js.native
  
  /**
    * The type of the option.
    */
  var `type`: (BooleanConstructor with Instantiable0[typings.std.global.Boolean]) | (StringConstructor with Instantiable0[typings.std.global.String]) | (NumberConstructor with Instantiable0[Number]) = js.native
}
object OptionConfig {
  
  @scala.inline
  def apply(
    `type`: (BooleanConstructor with Instantiable0[typings.std.global.Boolean]) | (StringConstructor with Instantiable0[typings.std.global.String]) | (NumberConstructor with Instantiable0[Number])
  ): OptionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionConfig]
  }
  
  @scala.inline
  implicit class OptionConfigOps[Self <: OptionConfig] (val x: Self) extends AnyVal {
    
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
    def setType(
      value: (BooleanConstructor with Instantiable0[typings.std.global.Boolean]) | (StringConstructor with Instantiable0[typings.std.global.String]) | (NumberConstructor with Instantiable0[Number])
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    
    @scala.inline
    def setDefault(value: js.Any): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setHide(value: Boolean): Self = this.set("hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    
    @scala.inline
    def setStorage(value: typings.yeomanGenerator.storageMod.^): Self = this.set("storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorage: Self = this.set("storage", js.undefined)
  }
}
