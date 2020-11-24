package typings.toJsonSchema.anon

import typings.toJsonSchema.toJsonSchemaStrings.all
import typings.toJsonSchema.toJsonSchemaStrings.first
import typings.toJsonSchema.toJsonSchemaStrings.tuple
import typings.toJsonSchema.toJsonSchemaStrings.uniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mode extends js.Object {
  
  /**
    * * `all` option causes parser to go through all array items, finding
    *   the most compatible yet most descriptive schema possible. If
    *   multiple types are found, the type is omitted so it can be
    *   validated.
    * * `first` option takes only first item in the array into account. If
    *   performance is a concern, you may consider this option.
    * * `uniform` option requires all items in array to have same structure
    *   (to convert to the same schema). If not, error is thrown.
    * * `tuple` option generates a
    *   [tuple array](https://json-schema.org/understanding-json-schema/reference/array.html#tuple-validation)
    *   (array of objects) from arrays.
    *
    * @default 'all'
    */
  var mode: js.UndefOr[all | first | uniform | tuple] = js.native
}
object Mode {
  
  @scala.inline
  def apply(): Mode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mode]
  }
  
  @scala.inline
  implicit class ModeOps[Self <: Mode] (val x: Self) extends AnyVal {
    
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
    def setMode(value: all | first | uniform | tuple): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
}
