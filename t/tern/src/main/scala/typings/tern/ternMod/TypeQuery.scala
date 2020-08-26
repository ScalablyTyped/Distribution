package typings.tern.ternMod

import typings.tern.ternStrings.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeQuery
  extends BaseQueryWithFile
     with Query {
  /**
    * Determines how deep the type string must be expanded.
    * Nested objects will only display property types up to this depth,
    * and be represented by their type name or a representation showing
    * only property names below it. Default `0`
    */
  var depth: js.UndefOr[Double] = js.native
  /** Specify the location of the expression. */
  var end: Double | Position = js.native
  /**
    * Set to `true` when you are interested in a function type.
    * This will cause function types to win when something has multiple types.
    * Default `false`
    */
  var preferFunction: js.UndefOr[Boolean] = js.native
  /** Specify the location of the expression. */
  var start: js.UndefOr[Double | Position] = js.native
  /** Query the type of something. */
  @JSName("type")
  var type_TypeQuery: `type` = js.native
}

object TypeQuery {
  @scala.inline
  def apply(end: Double | Position, file: String, `type`: `type`): TypeQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeQuery]
  }
  @scala.inline
  implicit class TypeQueryOps[Self <: TypeQuery] (val x: Self) extends AnyVal {
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
    def setEnd(value: Double | Position): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: `type`): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    @scala.inline
    def setPreferFunction(value: Boolean): Self = this.set("preferFunction", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferFunction: Self = this.set("preferFunction", js.undefined)
    @scala.inline
    def setStart(value: Double | Position): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

