package typings.yeomanGenerator.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.std.ArrayConstructor
import typings.std.NumberConstructor
import typings.std.ObjectConstructor
import typings.std.StringConstructor
import typings.std.global.Array
import typings.std.global.Number
import typings.std.global.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for creating a new argument.
  */
@js.native
trait ArgumentConfig extends js.Object {
  
  /**
    * The default value of the argument.
    */
  var default: js.UndefOr[js.Any] = js.native
  
  /**
    * Description for the argument.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * A value indicating whether the argument is optional.
    */
  var optional: js.UndefOr[Boolean] = js.native
  
  /**
    * A value indicating whether the argument is required.
    */
  var required: js.UndefOr[Boolean] = js.native
  
  /**
    * The type of the argument.
    */
  var `type`: js.UndefOr[
    (StringConstructor with Instantiable0[typings.std.global.String]) | (NumberConstructor with Instantiable0[Number]) | (ArrayConstructor with (Instantiable1[/* arrayLength */ Double, Array[js.Object]])) | (ObjectConstructor with Instantiable0[Object])
  ] = js.native
}
object ArgumentConfig {
  
  @scala.inline
  def apply(): ArgumentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArgumentConfig]
  }
  
  @scala.inline
  implicit class ArgumentConfigOps[Self <: ArgumentConfig] (val x: Self) extends AnyVal {
    
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
    def setDefault(value: js.Any): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setOptional(value: Boolean): Self = this.set("optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptional: Self = this.set("optional", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setType(
      value: (StringConstructor with Instantiable0[typings.std.global.String]) | (NumberConstructor with Instantiable0[Number]) | (ArrayConstructor with (Instantiable1[/* arrayLength */ Double, Array[js.Object]])) | (ObjectConstructor with Instantiable0[Object])
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
